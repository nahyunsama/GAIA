import random
def main():
    rps_random=random.randrange(1,4)
    rps=["Rock","Paper","Scissors"]
    emermy_rps=rps[rps_random-1]
    emermy_rps_int=rps_random
    #print(emermy_rps)
    
    print("please select your Rock, Scissors, Paper")
    print("1: Rock")
    print("2: Paper")
    print("3: Scissors")
    
    user_rps_string=input("please enter your number ")
    user_rps_int=int(user_rps_string)
    
    print("emermy RPS is " + emermy_rps)
    print("your RPS is " + rps[user_rps_int-1])
    
    if ((emermy_rps_int - user_rps_int) == -1 or (emermy_rps_int - user_rps_int) == 2):
        print("User Win!")
    elif ((emermy_rps_int - user_rps_int) == 1 or (emermy_rps_int - user_rps_int) == -2):
        print("Emermy Win!")
    elif (emermy_rps_int == user_rps_int):
        print("Draw!")
    else:
        print("Sorry, Call the nahyun")




if __name__ == "__main__":
    main()
