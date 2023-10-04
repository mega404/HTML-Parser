# HTML-Parser
## Objective
The HyperText Markup Language, or HTML is the standard markup language for documents
designed to be displayed in a web browser. HTML provides a means to create structured
documents by denoting structural semantics for text such as headings, paragraphs, lists, links,
quotes and other items. HTML elements are delineated by tags, written using angle brackets.
Tags such as <img /> directly introduce content into the page. Other tags such as <p> surround
and provide information about document text and may include other tags as sub-elements.
Browsers do not display the HTML tags, but use them to interpret the content of the page.
In this lab, We implemented a simple grammar for a declarative language that
defines the web page instead of the HTML with a tool named JavaCC.


## Example
People with no technical background may find learning HTML a difficult thing, so you will make
their life easier by designing a language that describes the web page (WHAT the user needs?)
instead of telling the browser (HOW to render the page?).
For example, the user will write something like the following

```
ADD IMAGE WITH SOURCE "https://www.w3schools.com/html/pic_trulli.jpg"
ADD HEADING WITH TEXT "Hello World"
ADD PARAGRAPH WITH TEXT "Welcome" AND WITH FONT "Arial" AND WITH COLOR "Red"
ADD LINK WITH TEXT "Search" AND WITH LINK "http://google.com"
ADD LINK WITH TEXT "Email" AND WITH LINK "http://gmail.com" WITH COLOR "Green"
ADD PARAGRAPH WITH WITH FONT "Arial" AND TEXT "Good bye"
```
Which will generate the following HTML
```
<img src="https://www.w3schools.com/html/pic_trulli.jpg" />
<h1>Hello World</h1>
<p style="color:Red;font-family:Arial;">Welcome</p>
<a href="http://google.com">Search</a>
<a href="http://gmail.com" style="color:Green;">Email</a>
<p style="font-family:Arial;">Good bye</p>
```

## Grammar
You can start by the following grammar for this descriptive language
```
create → "ADD" element
element → img | header | para | url
img → "IMAGE" "WITH" "SOURCE" quote sentence quote
header → "HEADING" decorated_text
para → "PARAGRAPH" decorated_text
url → "LINK" decorated_url
decorated_text → decorated_text "AND" decorated_text | text | color | font
text → "WITH" "TEXT" quote sentence quote
color → "WITH" "COLOR" quote sentence quote
font → "WITH" "FONT" quote sentence quote
sentence → sentence alphanumeric | ϵ
quote → "“"
alphanumeric → "0"-"9" | "a"-"z" | "A"-"Z" | "/" | ":" | "."
```
Note, the definition for decorated_url is left as an exercise to you. It must support the options
of decorated_text besides defining "WITH LINK"

## Notes
1. You need to change the path in the project to the path your current directory
2. Unit Testing:
  - Test Cases 1 ~ 5:
    These tests compare the generated html from the program with
    expected html of a given input.
    They produce the html file “output.html” which can be opened by
    the browser.
  - Test Cases 6 ~ 15:
    These tests examine the sanity of the validation process.
3. Assumption:
    The program terminates if given “E” as input.

## Deliverables
- A grammar file with JavaCC JJ format
- A generated parser that parse the language above
- 10 JUnit Tests that verify your Parser is validating different set of expressions
- 5 JUnit Tests that verify your Parser is generating the expected HTML for a different set
  of expressions

## Team
- Karim Alaa MoheyElDin
- Yosef Ashraf Yosef 
- Mahmoud Ebrahim
