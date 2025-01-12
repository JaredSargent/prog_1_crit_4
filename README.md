Pseudocode: Looping Construct with Floating Point Numbers
Start
Declare variables:
total (set to 0)
maximum (set to the smallest possible value)
minimum (set to the largest possible value)
number (to store user input)
Display a message: "Enter 5 floating-point numbers:"
For i from 1 to 5 do:
Prompt the user: "Enter number i: "
Validate input to ensure it's a floating-point number:
While input is invalid:
Display an error message: "Invalid input. Please enter a valid floating-point number."
Ask for input again.
Read the input and store it in number.
Add number to total.
Compare number with maximum:
If number > maximum, update maximum to number.
Compare number with minimum:
If number < minimum, update minimum to number.
End For
Calculate the average: average = total / 5.
Calculate the interest: interest = total * 0.2.
Display the results:
"Total: total"
"Average: average"
"Maximum: maximum"
"Minimum: minimum"
"Interest on total at 20%: interest"
End
