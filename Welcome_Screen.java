package first_project_java;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
//import java.util.Collections;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
 public class Welcome_Screen
 {
	 static String DIRECTORY;
	 static File java_project;
	 static String n;
	 static String filename;
	 
	    public static void main(String[] args)
   {
		// TODO Auto-generated method stub
		 System.out.println("*************   Welocome To My Application  *************       ");
		  MainMenu();
   }

         public static void MainMenu() 
      {
		
	    System.out.println(" 1. View All Files");
		 System.out.println(" 2. Create a new File");
		  System.out.println(" 3. Search File");
		   System.out.println(" 4. Delete File");
		    System.out.println(" 5. Exit");
		     menu();
	   }

          public static void menu()
       {
		  // TODO Auto-generated method stub
		   Scanner scan = new Scanner(System.in);
		    System.out.println("Please enter your choice : ");
		     int choice = scan.nextInt();
		      switch(choice)
		       {
		        case 1:
			            viewFiles();
			             goback();
			              break;
		         case 2: 
			              createNew();
			               goback();
			                break;
		           case 3: 
			               searchFile();
			                goback();
			                 break;
		             case 4: 
		                    deleteFile();
		                     goback();
		                      break;
		               case 5:  
			                  exit();
			                   goback();
			                    break;
		           
		                default :
			                       System.out.println("please enter a only 1,2,3 or 4");
			                        goback();
	            }
	     }

	           static void goback() 
	        {
		        // TODO Auto-generated method stub
			     System.out.println("Do you want to conytinue Press - yes and for exit press - No" );
			      Scanner sc = new Scanner(System.in);
			       n = sc.next();
         		    if(n.equalsIgnoreCase("yes"))
			         {
				       MainMenu();
			         }
			          if(n.equalsIgnoreCase("No"))
			           {
				        exit();
			           }
			            else 
			                {
				              System.out.println("please enter a valid input 0 or 1 ! ");
				               goback();
			                }
		
	        }

	          static void exit()
	        {
		        // TODO Auto-generated method stub
		         System.exit(0);
	        }

	           static void deleteFile()
	         {
		         Scanner spfile = new Scanner(System.in);
	              System.out.println("Enter a file name (without .txt (a.txt) put only a) : ");
	               String Newfilename = spfile.next();
		            File f= new File("D:\\\\java_project\\\\"+Newfilename+".txt ");           //file to be delete  
		             if(f.delete())                      //returns Boolean value  
		              {  
		               System.out.println(f.getName() + " deleted");   //getting and printing the file name  
		              }  
		               else  
		                  {   
		                   System.out.println("failed");  
		                  } 
	        }

	          static void searchFile( ) 
	       {
		        // TODO Auto-generated method stub
		
		          File directoryPath = new File("D:\\java_project");
	               File filesList[] = directoryPath.listFiles();
		            Scanner file = new Scanner(System.in);
                     System.out.println("Enter a  file name");
                      String newfilename = file.next();
		               File f = new File( "D:\\java_project\\"+file+".txt");
	                    boolean fileound=false;
		                 for(File file1:filesList)
		                 {
		               	   File tempFile = new File("D:\\java_project\\"+newfilename+".txt");
			                 boolean exists = tempFile.exists();
			
		                	  if(exists)
		                       	{
				                  fileound = true;
				
			                    }
			                      else {
			                           }
		                }
		                             if(fileound)
		                              {
			                            System.out.println("File found");	
		                              }
		                              else
		                                  {
			                                System.out.println("File not found");
		                                  }
		
	        }

	               static void createNew() 
	          {      
	            	   // TODO Auto-generated method stub
                        boolean flag = false;
                         Scanner file = new Scanner(System.in);
                          System.out.println("Enter a new file name");
                           String newfilename = file.next();
                            File createfile = new File("D:\\java_project\\"+newfilename+".txt");
                             try
		                       {
		                        flag = createfile.createNewFile();
		                         System.out.println("flag value" + flag);
		                          if(!flag)
		                           {
		    	                     System.out.println("Same file name already exisy" + createfile.getPath());
		                           }            
		                            else 
		                               {
		    	                        System.out.println("file is created sucessfully" + createfile.getPath() + " created ");
		                               }
		                       } 
		                               catch (IOException ioe) 
		                                     {
		                                       System.out.println("Error while Creating File in Java" + ioe);
		                                     }
		 
		 	 }

	                 static void viewFiles()
	             {
		              // TODO Auto-generated method stub
		               File directoryPath = new File("D:\\java_project");
	                    File filesList[] = directoryPath.listFiles();
                         System.out.println("List of files and directories in the specified directory:");
	                      for(File file : filesList) 
	                       {
	                            System.out.println("File name: "+file.getName());
	                             System.out.println("File path: "+file.getAbsolutePath());
	                              System.out.println("Size :"+file.getTotalSpace());
	                               System.out.println("last time file is modified :"+new Date(file.lastModified()));
                                    System.out.println(" ");
	                       }
                  }
	       }
	

	

