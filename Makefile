# Create the document

NAME = paper

all:	Rsections-sweave
	pdflatex $(NAME)
	-bibtex $(NAME)
	pdflatex $(NAME)
	pdflatex $(NAME)

r:	R

R:	Rsections-sweave


# Sweave the .Rnw documents

Rsections-sweave:
	cd Rsections && $(MAKE)


# Clean

clean:	Rsections-clean
	@rm -f *.log
	@rm -f *.aux
	@rm -f *.out
	@rm -f *.exa
	@rm -f *.dvi
	@rm -f *.ps
	@rm -f *.bbl
	@rm -f *.blg
	@rm -f *.pdf

# Clean the .Rnw.Rout documents

Rsections-clean:
	cd Rsections && $(MAKE) clean