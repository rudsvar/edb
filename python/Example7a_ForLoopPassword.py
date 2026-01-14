secret = "swordfish"
for _ in range(3):
    attempt = input("Password: ")
    if attempt == secret:
        print("Access granted")
        break
    else:
        print("Wrong password")
else:
    print("Too many attempts")
