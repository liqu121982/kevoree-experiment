z <- matrix(c(10,
65,
40,
500,
266,
23,
130,
275,
133,
250,
30,
65,
266,
275,
50,
10,
255,
300,
10,
23,
23,
250,
100,
10,
75,
170,
50,
65,
20,
275,
130,
50,
180,
180,
250,
0,
75,
250,
55,
250,
183,
75,
343,
130,
216,
266,
500,
100,
500,
275,
100,
30,
416,
55,
175,
100,
55,
10,
30,
140,
500,
50,
375,
30,
30,
186,
140,
265,
65,
0,
10,
283,
253,
186,
100,
130,
250,
265,
250,
60,
50,
500,
55,
150,
275,
60,
500,
130,
100,
30,
300,
100,
10,
0,
266,
40,
186,
30,
140,
180,
20,
140,
203,
500,
250,
53,
40,
30,
75,
50,
0,
255,
20,
250,
186,
266,
110,
60,
300,
30,
40,
100,
350,
100,
130,
250,
30,
375,
375,
30,
50,
100,
275,
30,
100,
23,
96,
65,
100,
50,
30,
50,
75,
30,
75,
120,
50,
10,
0,
75,
50,
250,
0,
275,
40,
300,
300,
100,
500,
30,
40,
500,
10,
250,
116,
186,
275,
75,
50,
0,
30,
110,
210,
65,
36,
0,
83,
100,
200,
50,
30,
255,
10,
10,
250,
10,
250,
250,
65,
30,
30,
55,
55,
250,
50,
250,
300,
336,
0,
180,
216,
30,
36,
150,
30,
100,
40,
175,
65,
100,
283,
366,
0,
140,
10,
30,
120,
300,
255,
30,
40,
30,
55,
233,
130,
500,
265,
103,
375,
46,
40,
30,
50,
265,
150,
130,
180,
500,
275,
30,
0,
65,
170,
0,
265,
75,
500,
30,
100,
103,
300,
100,
83,
50,
46,
46,
250,
0,
193,
133,
10,
275,
46,
300,
130,
55,
30,
275,
0,
500,
30,
200,
40,
255,
250,
100,
30,
500,
100,
375,
100,
10,
46,
275,
40,
275,
500,
10,
0,
96,
140,
210,
255,
216,
20,
60,
180,
200,
275,
150,
275,
336,
150,
250,
300,
100,
500,
175,
375,
500,
100,
20,
10,
250,
0,
70,
100,
50,
10,
250,
30,
266,
283,
20,
100,
20,
210,
70,
10,
250,
250,
30,
55,
216,
250,
53,
10,
40,
0,
300,
200,
130,
36,
30,
120,
60,
253,
500,
76,
250,
130,
30,
275,
266,
130,
10,
50,
300,
130,
130,
10,
203,
30,
10,
30,
75,
75,
250,
130,
253,
375,
30,
10,
130,
10,
175,
40,
175,
70,
130,
10,
103,
30,
193,
250,
96,
250,
30,
500,
30,
343,
150,
46,
176,
300,
175,
50,
375,
103,
55),nrow=20.0,ncol=20.0, byrow=TRUE,dimnames = NULL)
x <- seq(0,19.0,by=1)
y <- seq(0,19.0,by=1)
persp(x,y,z,theta=15,phi=35)
