library(broom)
df <- read.delim("~/Downloads/data.txt", sep = " ")
df <- data.frame(df[1], stack(df[2:3]))

first <- 10 + rnorm(20)
second <- 10 + rnorm(20)

df$Subject <- as.factor(df$Subject)

df[df$ind == "First", ]$values <- first
df[df$ind == "Second", ]$values <- second

lm <- aov(values ~ Subject, data = df)
anova(lm)
sqrt(tidy(lm)$meansq[2])

###########

means <- c()
vars <- c()
for (i in as.numeric(unique(df$Subject)))
  means <- c(means, sum(df[df$Subject == i, ]$values)/2)

for (i in as.numeric(unique(df$Subject)))
  vars <- c(vars, 
              (df[df$Subject == i, ]$values[1] - means[i])^2 + 
              (df[df$Subject == i, ]$values[2] - means[i])^2 
            )

sqrt(sum(vars)/20)
sqrt(sum(vars)/19)


diffs <- c()
dmeans <- c()
dvars <- c()
for (i in as.numeric(unique(df$Subject)))
  diffs <- c(diffs, df[df$Subject == i, ]$values[1] - df[df$Subject == i, ]$values[2])
sd(diffs)
sd(diffs)/sqrt(2)

dmeans <- mean(diffs)
  
for (i in as.numeric(unique(df$Subject)))
    dvars <- c(dvars, 
              (diffs[i] - dmeans)^2)
    )






