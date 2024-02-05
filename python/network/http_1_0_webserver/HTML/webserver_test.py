import socket

# 허용된 파일 목록
ALLOWED_FILES = ['index.html', 'style.css', 'script.js']

def read_file(path):
    try:
        with open(path, 'rb') as file:
            return file.read()
    except FileNotFoundError:
        return None

def handle_request(request):
    print("<<< " + request.replace('\r\n', '\n<<< ') + '\n')  # 요청 출력

    headers = request.split('\n')
    first_line = headers[0].split()
    method = first_line[0]
    path = first_line[1]

    if path == '/':
        path = '/index.html'

    if path[1:] not in ALLOWED_FILES:
        response = "HTTP/1.0 403 Forbidden\r\n\r\n"
        print_response(response)
        return response, b''

    if method not in ['GET', 'HEAD']:
        response = "HTTP/1.0 405 Method Not Allowed\r\n\r\n"
        print_response(response)
        return response, b''

    body = read_file(path[1:])

    if body is None:
        response = "HTTP/1.0 404 Not Found\r\n\r\n"
        print_response(response)
        return response, b''

    response_line = "HTTP/1.0 200 OK\r\n"
    content_length = f"Content-Length: {len(body)}\r\n"

    if method == 'HEAD':
        body = b''

    headers = (response_line +
               #"Content-Type: text/\r\n" +
               content_length + "\r\n")

    print_response(headers + "\n" + (body.decode() if body else ''))
    return headers, body

def print_response(response):
    print(">>> " + response.replace('\r\n', '\n>>> ') + '\n')

def run_server(host, port):
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
        s.bind((host, port))
        s.listen()

        while True:
            conn, addr = s.accept()
            with conn:
                request = conn.recv(1024).decode()
                headers, body = handle_request(request)
                conn.sendall(headers.encode() + body)

if __name__ == "__main__":
    run_server('127.0.0.1', 8080)