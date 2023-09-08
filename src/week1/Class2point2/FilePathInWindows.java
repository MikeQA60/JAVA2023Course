package week1.Class2point2;

/*
Facts about a file path in Windows:


Facts:

A file path is the address of a file on a computer's file system.

In Windows, file paths use the backslash (\) character as the separator between folders and subdirectories.

The root directory in Windows is represented by a drive letter, such as C:\.

Windows supports long file names, but has a limit of 260 characters for the total file path length.

Example:

C:\Users\UserName\Documents\Important Files\Financial Report 2022.xlsx

In this file path:

The root directory is represented by the C:\ drive.

The file is located in the Financial Report 2022.xlsx folder under the Important Files folder, which is under the Documents folder, which is under the UserName folder, which is under the Users folder.

Write a program that prints out the following file path:

Expected Output:

C:\Users\superstar\Documents\SDET\JavaCertification.pdf
 */
public class FilePathInWindows {

    public static void main(String[] args) {
        System.out.println("C:\\Users\\superstar\\Documents\\SDET\\JavaCertification.pdf\n");
    }
}
