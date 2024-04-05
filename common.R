#library(MethComp)
library(lme4)
library(texreg)
library(Hmisc)
library(xtable)
library(broom)
library(emmeans)

knitr::opts_chunk$set(echo = FALSE, 
                      cache = FALSE,
                      message = FALSE,
                      warning = FALSE,
                      collapse = TRUE,
                      comment = "#>",
                      fig.path = "figures/fig-",
                      fig.retina = 2, # Control using dpi
                      fig.width = 6,  # generated images
                      #fig.pos = "t",  # pdf mode
                      fig.align = "center",
                      #dpi = if (knitr::is_latex_output()) 72 else 300, 
                      out.width = "50%")

#expdata <- read.xlsx("data/Datos_Sintactica_PE_AdHoc_Fernando_NOPARALELO_1.4(corregido BSK).xls", 1)
expdata <- read.csv("data/Datos_Sintactica_PE_AdHoc_Fernando_NOPARALELO_1.4(corregido BSK).csv")
expdata$Group <- rep("", nrow(expdata)) 
expdata[expdata$Session == 1 & expdata$Task == "BSK", ]$Group <- "$BSK \\rightarrow MR$"
expdata[expdata$Session == 1 & expdata$Task == "MR", ]$Group <- "$MR \\rightarrow BSK$"
expdata[expdata$Session == 2 & expdata$Task == "BSK", ]$Group <- "$MR \\rightarrow BSK$"
expdata[expdata$Session == 2 & expdata$Task == "MR", ]$Group <- "$BSK \\rightarrow MR$"
expdata$Program  <- do.call(paste0, expdata[c(2, 3)])
expdata <- expdata[order(expdata$Instrument, expdata$Program),]
expdata$Program <- as.factor(expdata$Program)
expdata$Instrument <- factor(expdata$Instrument, c("EP", "AH"))
