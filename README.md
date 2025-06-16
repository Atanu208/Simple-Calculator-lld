🧮 Problem Statement: "Simple Calculator"

Objective:
Build a console-based calculator that can perform basic operations like ADD, SUB, MUL, and DIV on two integers.

📥 Input Format:
You will receive input in this format:
<OPERATION> <NUMBER1> <NUMBER2>
For example: ADD 10 5

📤 Output Format:
Print the result of the operation.
For example: 15

✅ Supported Operations:
ADD – addition

SUB – subtraction

MUL – multiplication

DIV – integer division (assume second number is never zero)

✨ Sample Input and Output:
vbnet
Copy
Edit
Input:  ADD 10 5  
Output: 15

Input:  SUB 10 5  
Output: 5

Input:  MUL 4 3  
Output: 12

Input:  DIV 10 2  
Output: 5
👨‍💻 Constraints:
All numbers are integers.

No need for floating point support.

No need for user interaction loop (just one line input/output for now).

🔁 Optional Enhancements (after basic version works):
Keep running until user enters EXIT.

Handle invalid commands gracefully.
