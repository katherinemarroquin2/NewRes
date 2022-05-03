import java.util.Scanner;

public class Area {

        public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);
                
                // reading shape 
                System.out.println("C - Circle");
                System.out.println("S - Square");
                System.out.println("R - Rectangle");
                System.out.print("Enter your option : ");
                char type = sc.next().charAt(0);
                
                double area = -1;
                double radius, side, height, width;
                
                // switching to case as per input
                switch(type) {
                
 				case 'C':
         			// reading radius and calculating area
                                System.out.print("Enter radius : ");
                                radius = sc.nextDouble();
                                area = Math.PI * radius * radius;
                                break;
                                
                        case 'S':
                                // reading side and calculating area
                                System.out.print("Enter side : ");
                                side = sc.nextDouble();
                                area = side * side;
                                break;     
                                
                                
                                
                                
                        case 'R':
                                // reading height and width and calculating area
                                System.out.print("Enter height : ");
                                height = sc.nextDouble();
                                System.out.print("Enter width  : ");
                                width = sc.nextDouble();
                                area = height * width;
                                break;
                                
                        default:
                                System.out.println("Invalid Choice");
                                
                }
                
                if(area != -1) {
                        System.out.println("Area : " + area);
                }
                
                sc.close();
