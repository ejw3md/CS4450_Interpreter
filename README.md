# CS4450_Interpreter
CS4450 Python Interpreter Final Project

### Project Explanation

### Group Members

### Interpreter Requirements

### How to Use/Run
**Initial Setup**
1. Download and install the Java SE Development Kit if not already installed: https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
2. Download and install IntelliJ if not already installed: https://www.jetbrains.com/idea/download/
3. Download the ANTLR tool jar (Direct Download): https://www.antlr.org/download/antlr-4.9-complete.jar
4. Download ZIP of code from repository and unzip.
5. Open IntelliJ

**Setting Up Project**
1. Create a new project. Ensure Java is selected on the left. Where it says "Project JDK", make sure JDK version 1.8 is selected that you downloaded earlier. You may need to search for where it was installed.
2. Click next through remaining prompts, name project whatever you'd like, and create project.
3. Navigate to IntelliJ Preferences/Settings > Plugins.
4. Search for and install the ANTLR v4 Plugin. Close out of plugins panel.
5. Open windows explorer/finder window and navigate to where your project folder is saved.
6. Open a second windows explorer/finder window and navigate to where the unzipped repo code is.
7. Move the g.g4 file and src folder from the unzipped repository into the project folder. Overwrite everything when prompted.
8. Close the windows explorer/finder windows and go back to IntelliJ.
9. You'll notice the files you copied over likely did not update. Right click the name of your project and select "Reload from Disk"
10. Once the files appear, if the g.g4 file has a red ANTLR logo next to it, you've done everything right so far.
11. Right click the g.g4 file and select "Configure ANTLR"
12. Click the text input next to "Output directory where all output is generated" and input "src". Close ANTLR configurer.
13. At the top of IntelliJ, navigate to File > Project Structure > Modules > Dependencies
14. Click the + sign at the bottom of the panel and click "Jars or Directories". A file explorer will open.
15. Navigate to the ANTLR tool jar you downloaded previously, and select it.
16. Click "Apply" then "Okay" to close out of the panel.

**Running the Test Code**
1. The Python test code will already be input but if changes need to be made, expand the src folder in IntelliJ, open the python_test_code.py file and make changes.
2. Right click the g.g4 file, click "Generate ANTLR Recognizer"
3. Run code by right clicking the "Launch" file, and clicking "Run 'Launch.main()'"
4. If changes are made to the test Python code, simply make the changes, save the file, then repeat step 24.
