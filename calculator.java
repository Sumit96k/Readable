import java.awt.*;
import java.applet.*;
/*<applet code="calculator.class"width="600"height="600"></applet>*/
public class calculator extends Applet
{
public void paint(Graphics g)
{
//To draw//
g.fillRect(200,200,310,300);
g.setColor(Color.white);
g.fillRect(205,206,300,58);
g.setColor(Color.black);
g.fillRect(210,210,290,50);
g.setColor(Color.white);
g.drawLine(200,270,510,270);
g.drawLine(200,320,510,320);
g.drawLine(250,320,250,500);
g.drawLine(380,320,380,500);
g.setColor(Color.blue);
g.fillRect(210,280,30,25);
g.fillRect(250,280,30,25);
g.fillRect(290,280,30,25);
g.fillRect(330,280,30,25);
g.setColor(Color.red);
g.fillRect(390,280,90,30);
g.setColor(Color.white);
g.fillRect(210,330,30,20);
g.drawRect(260,330,30,35);
g.drawRect(300,330,30,35);
g.drawRect(340,330,30,35);
g.drawRect(390,330,30,30);
g.drawRect(430,330,30,30);
g.setColor(Color.green);
g.fillRect(470,330,30,30);
g.setColor(Color.white);
g.fillRect(210,360,30,20);
g.drawRect(260,370,30,35);
g.drawRect(300,370,30,35);
g.drawRect(340,370,30,35);
g.drawRect(390,370,30,30);
g.drawRect(430,370,30,30);
g.drawRect(470,370,30,30);
g.setColor(Color.white);
g.fillRect(210,390,30,20);
g.drawRect(260,410,30,35);
g.drawRect(300,410,30,35);
g.drawRect(340,410,30,35);
g.drawRect(390,410,30,70);
g.drawRect(430,410,30,30);
g.drawRect(470,410,30,30);
g.fillRect(210,420,30,20);
g.fillRect(210,450,30,40);
g.drawRect(260,450,30,35);
g.drawRect(300,450,30,35);
g.drawRect(340,450,30,35);
g.drawRect(430,450,30,30);
g.drawRect(470,450,30,30);
g.drawString("1",265,435);
g.drawString("2",305,435);
g.drawString("3",345,435);
g.drawString("4",265,390);
g.drawString("5",305,390);
g.drawString("6",350,390);
g.drawString("7",265,350);
g.drawString("8",310,350);
g.drawString("9",350,350);
g.drawString("0",265,470);
g.drawString("00",305,470);
g.drawString(".",350,460);
g.drawString("/",400,350);
g.drawString("^",440,350);
g.setColor(Color.black);
g.drawString("ON",475,350);
g.setColor(Color.white);
g.drawString("*",400,390);
g.drawString("%",440,390);
g.drawString("MRC",475,390);
g.drawString("+",400,430);
g.drawString("-",440,430);
g.drawString("M-",475,430);
g.drawString("=",440,470);
g.drawString("M+",475,470);
g.setColor(Color.white);
g.drawString("C<-",215,295);
g.drawString("C->",255,295);
g.drawString("CRT",295,295);
g.drawString("AR",335,295);
g.drawString("SOLAR CELL",400,300);
g.setColor(Color.black);
g.drawString(">",220,345);
g.drawString("GT",215,375);
g.drawString("MU",215,405);
g.drawString("+/-",215,435);
g.drawString("CE",215,465);
}

} 

 
 