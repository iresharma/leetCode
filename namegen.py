from sys import argv
import pyperclip

# print(argv[1].replace(' ', '-').replace('.', '') + '.py')
s = pyperclip.paste()
link = f"https://leetcode.com/problems/{s.replace(' ', '-').replace('.', '')}/"

with open(s.replace(' ', '-').replace('.', '') + '.py', 'w') as code:
    code.write(
        f'# Author: @Iresharma\n# {link}\n\n"""\n"""'
    )