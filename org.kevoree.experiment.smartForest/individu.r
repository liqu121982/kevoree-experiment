z <- matrix(c(10,
333,
266,
166,
170,
233,
70,
233,
303,
100,
303,
205,
300,
10,
140,
170,
400,
70,
200,
233,
233,
203,
205,
106,
170,
266,
200,
70,
400,
140,
200,
70,
133,
170,
233,
103,
303,
200,
203,
500,
266,
266,
300,
136,
433,
333,
200,
233,
200,
203,
100,
10,
205,
200,
450,
270,
200,
133,
233,
233,
300,
170,
100,
166,
133,
166,
10,
173,
73,
300,
200,
100,
200,
233,
400,
266,
400,
100,
100,
266,
170,
236,
73,
55,
333,
300,
366,
233,
166,
266,
203,
40,
173,
173,
106,
136,
133,
333,
70,
140,
40,
236,
170,
236,
70,
73,
236,
106,
170,
170,
366,
270,
333,
10,
10,
266,
303,
40,
303,
300,
266,
173,
433,
10,
73,
73,
173,
266,
266,
73,
450,
10,
170,
336,
136,
200,
233,
400,
133,
133,
200,
270,
236,
303,
236,
203,
100,
233,
300,
70,
333,
233,
100,
100,
100,
233,
300,
173,
366,
136,
200,
300,
100,
166,
366,
133,
270,
366,
133,
136,
366,
203,
140,
236,
203,
70,
203,
136,
70,
133,
300,
233,
203,
170,
100,
100,
236,
170,
106,
200,
233,
100,
100,
203,
166,
270,
236,
133,
233,
70,
233,
173,
270,
103,
133,
300,
170,
136,
203,
10,
10,
366,
166,
166,
203,
200,
203,
333,
203,
100,
150,
333,
170,
366,
10),nrow=15.0,ncol=15.0, byrow=TRUE,dimnames = NULL)
x <- seq(0,14.0,by=1)
y <- seq(0,14.0,by=1)
persp(x,y,z,theta=15,phi=45)
