import sys
from PySide.QtGui import QApplication
from PySide.QtCore import QUrl
from PySide.QtWebKit import QWebView

app = QApplication(sys.argv)
b = QWebView()
b.load(QUrl("https://www.youtube.com/watch?v=rPCzao7H6n8"))
b.show()
app.exec_()