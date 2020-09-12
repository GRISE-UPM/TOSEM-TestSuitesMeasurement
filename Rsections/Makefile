# Key variables to define

RDIR = .

# Create list of R source files
RSOURCE = $(wildcard $(RDIR)/*.Rnw)

# Files to indicate when the RSOURCE file was run
OUT_FILES = $(RSOURCE:.Rnw=.Rnw.Rout)

all: $(OUT_FILES)

# Run the RSOURCE files

$(RDIR)/%.Rnw.Rout: $(RDIR)/%.Rnw
	@echo Sweaving $<
	R CMD Sweave $< 2>$<.Rout

# Clean

clean:	
	@rm -fv $(OUT_FILES)
	@rm -fv *.tex


