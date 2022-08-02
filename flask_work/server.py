from flask import Flask,render_template

app = Flask(__name__)

@app.route("/")
def index():
    return render_template("index.html")

@app.route("/KNeighbors")
def test():
    return render_template("KNeighbors.html")

if __name__=='__main__':
    app.run(debug=True)