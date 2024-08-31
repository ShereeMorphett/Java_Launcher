# Makefile for compiling the Java Simulator

# Define the source directory and output directory
SRC_DIR = src
BIN_DIR = bin
PACKAGE = ro/academyplus/avaj/simulator
SOURCE = $(SRC_DIR)/$(PACKAGE)/Simulator.java
JAVAC = javac
JFLAGS = -d $(BIN_DIR)
DEFAULT_FILE = scenario.txt

# Default target
all: make

# Rule to compile the Java source files
make:
	@mkdir -p $(BIN_DIR)
	$(JAVAC) $(JFLAGS) $(SOURCE)

# Rule to clean the bin directory
clean:
	rm -rf $(BIN_DIR)

# Rule to run the Java application
# Usage: make run FILE=<path-to-file>
run:
	@java -cp $(BIN_DIR) ro.academyplus.avaj.simulator.Simulator $(FILE)

# Define a default value for FILE if not set
FILE ?= $(DEFAULT_FILE)

.PHONY: all compile clean
