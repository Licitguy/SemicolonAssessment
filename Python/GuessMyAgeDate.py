birth_month = "December"
birth_year = 1995
guessed = False

while not guessed:
    guess = input("Guess the date of my birth between 1 and 31: ")
    if guess == "":
        print("Please enter a valid guess.")
    elif not guess.isdigit() or int(guess) < 1 or int(guess) > 31:
        print("Invalid input. Please enter a number between 1 and 31.")
    elif int(guess) != 12:
        print("Incorrect guess.")
    else:
        print("Correct guess!")
        guessed = True
