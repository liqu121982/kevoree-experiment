library(plotrix)
percentageFailure <- c(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 73, 75, 77, 79, 81, 81, 83, 85, 87, 87, 87, 89, 89, 89, 89)
avgTimestamps <- c(672, 796, 845, 680, 821, 857, 727, 579, 670, 809, 576, 856, 673, 547, 648, 523, 698, 918, 729, 660, 884, 610, 565, 561, 601, 812, 260, 435, 542, 523, 232, 458, 691, 500, 400, 239, 0, 127, 250, 178, 90, 0, 70, 40, 50, 0, 0, 0, 0, 0, 0, 0)

plot(percentageFailure, type="h",title("Percentage failure"),xlab="",ylab="Node link failure percentage")
par(new=TRUE,mar=c(5, 4, 4, 8) + 0.1)
plot(avgTimestamps,axes=FALSE,ylab="" ,xlab="",col="red", type="l")
Axis(side=4,col="red",col.axis="red")
mtext("propagation delay", side=4, line=2, col="red")
title("Node link failure impact experiment")