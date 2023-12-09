fn add<T: std::ops::Add<Output = T>>(i: T, j: T) -> T {
    i + j
}

fn main() {
    let a = 10;
    let b = 20;
    let res = add(a, b);

    println!("{}", res);
}
