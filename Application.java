
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import static java.lang.System.exit;
import java.util.*;
import javax.sound.sampled.*;

public final class Application {

    // start button
    private JButton start;
    // other buttons
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn10;
    private JButton btn11;
    private JButton btn12;
    //dialg modal
    private JDialog dialog;
    // block #
    private int block;
    // number of errors
    private int errors;
    // what button should be clicked
    private int selected;
    // which trail
    private int trial;
    // time when start button clicks
    private long startTime;
    // time when target button is clicked
    private long endTime;
    // user name
    private final String user;

    // Contructor
    // username should be passed as the parameter
    Application(String user) {

        // set user
        this.user = user;

        // intial values
        block = 1;
        trial = 1;
        errors = 0;
        selected = -1;

        // initate the GUI
        init();

        // hide 10 buttons
        btn3.setVisible(false);
        btn4.setVisible(false);
        btn5.setVisible(false);
        btn6.setVisible(false);
        btn7.setVisible(false);
        btn8.setVisible(false);
        btn9.setVisible(false);
        btn10.setVisible(false);
        btn11.setVisible(false);
        btn12.setVisible(false);

    }

    // to initalize components
    void init() {

        // create a jframe 
        JFrame frame = new JFrame();
        // set Title
        frame.setTitle("Button Clicker");
        // set size
        frame.setSize(514, 537);
        // set loaction of screen
        frame.setLocation(500, 200);
        // close on close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // look and feel
        JFrame.setDefaultLookAndFeelDecorated(true);

        // start button
        start = new JButton("Start");
        // set bounds
        start.setBounds(200, 225, 100, 50);
        // set back ground color
        start.setBackground(Color.decode("#C70039"));
        // set action listner
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startActionPerformed(e);
            }
        });
        // add to the frame
        frame.add(start);

        // button 1
        btn1 = new JButton("");
        // set bounds
        btn1.setBounds(50, 50, 100, 100);
        // set background color
        btn1.setBackground(Color.white);
        // set action listner
        btn1.addActionListener(new ActionListener() {
            @Override
            /// when someone clicks on the button
            // btn1ActionPerformed() method will be executed
            public void actionPerformed(ActionEvent e) {
                btn1ActionPerformed(e);
            }
        });
        // add to the frame
        frame.add(btn1);

        // button 9
        btn9 = new JButton("");
        // set bounds
        btn9.setBounds(0, 150, 100, 100);
        // set background color
        btn9.setBackground(Color.white);
        // set action listner
        btn9.addActionListener(new ActionListener() {
            @Override
            /// when someone clicks on the button
            // btn9ActionPerformed() method will be executed
            public void actionPerformed(ActionEvent e) {
                btn9ActionPerformed(e);
            }
        });
        // add to the frame
        frame.add(btn9);

        // button 2
        btn2 = new JButton("");
        // set bounds
        btn2.setBounds(350, 350, 100, 100);
        // set background color
        btn2.setBackground(Color.white);
        // set action listner
        btn2.addActionListener(new ActionListener() {
            @Override
            /// when someone clicks on the button
            // btn2ActionPerformed() method will be executed
            public void actionPerformed(ActionEvent e) {
                btn2ActionPerformed(e);
            }
        });
        // add to the frame
        frame.add(btn2);

        // button 10
        btn10 = new JButton("");
        // set bounds
        btn10.setBounds(400, 150, 100, 100);
        // set background color
        btn10.setBackground(Color.white);
        // set action listner
        btn10.addActionListener(new ActionListener() {
            @Override
            /// when someone clicks on the button
            // btn10ActionPerformed() method will be executed
            public void actionPerformed(ActionEvent e) {
                btn10ActionPerformed(e);
            }
        });
        // add to the frame
        frame.add(btn10);

        // button 3
        btn3 = new JButton("");
        // set bounds
        btn3.setBounds(150, 0, 100, 100);
        // set background color
        btn3.setBackground(Color.white);
        // set action listner
        btn3.addActionListener(new ActionListener() {
            @Override
            /// when someone clicks on the button
            // btn3ActionPerformed() method will be executed
            public void actionPerformed(ActionEvent e) {
                btn3ActionPerformed(e);
            }
        });
        // add to the frame
        frame.add(btn3);

        // button 11
        btn11 = new JButton("");
        // set bounds
        btn11.setBounds(250, 0, 100, 100);
        // set background color
        btn11.setBackground(Color.white);
        // set action listner
        btn11.addActionListener(new ActionListener() {
            @Override
            /// when someone clicks on the button
            // btn11ActionPerformed() method will be executed
            public void actionPerformed(ActionEvent e) {
                btn11ActionPerformed(e);
            }
        });
        // add to the frame
        frame.add(btn11);

        // button 4
        btn4 = new JButton("");
        // set bounds
        btn4.setBounds(150, 400, 100, 100);
        // set background color
        btn4.setBackground(Color.white);
        // set action listner
        btn4.addActionListener(new ActionListener() {
            @Override
            /// when someone clicks on the button
            // btn4ActionPerformed() method will be executed
            public void actionPerformed(ActionEvent e) {
                btn4ActionPerformed(e);
            }
        });
        // add to the frame
        frame.add(btn4);

        // button 12
        btn12 = new JButton("");
        // set bounds
        btn12.setBounds(250, 400, 100, 100);
        // set background color
        btn12.setBackground(Color.white);
        // set action listner
        btn12.addActionListener(new ActionListener() {
            @Override
            /// when someone clicks on the button
            // btn12ActionPerformed() method will be executed
            public void actionPerformed(ActionEvent e) {
                btn12ActionPerformed(e);
            }
        });
        // add to the frame
        frame.add(btn12);

        // button 5
        btn5 = new JButton("");
        // set bounds
        btn5.setBounds(0, 250, 100, 100);
        // set background color
        btn5.setBackground(Color.white);
        // set action listner
        btn5.addActionListener(new ActionListener() {
            @Override
            /// when someone clicks on the button
            // btn5ActionPerformed() method will be executed
            public void actionPerformed(ActionEvent e) {
                btn5ActionPerformed(e);
            }
        });
        // add to the frame
        frame.add(btn5);

        // button 6
        btn6 = new JButton("");
        // set bounds
        btn6.setBounds(350, 50, 100, 100);
        // set background color
        btn6.setBackground(Color.white);
        // set action listner
        btn6.addActionListener(new ActionListener() {
            @Override
            /// when someone clicks on the button
            // btn6ActionPerformed() method will be executed
            public void actionPerformed(ActionEvent e) {
                btn6ActionPerformed(e);
            }
        });
        // add to the frame
        frame.add(btn6);

        // button 7
        btn7 = new JButton("");
        // set bounds
        btn7.setBounds(50, 350, 100, 100);
        // set background color
        btn7.setBackground(Color.white);
        // set action listner
        btn7.addActionListener(new ActionListener() {
            @Override
            /// when someone clicks on the button
            // btn7ActionPerformed() method will be executed
            public void actionPerformed(ActionEvent e) {
                btn7ActionPerformed(e);
            }
        });
        // add to the frame
        frame.add(btn7);

        // button 8
        btn8 = new JButton("");
        // set bounds
        btn8.setBounds(400, 250, 100, 100);
        // set background color
        btn8.setBackground(Color.white);
        // set action listner
        btn8.addActionListener(new ActionListener() {
            @Override
            /// when someone clicks on the button
            // btn8ActionPerformed() method will be executed
            public void actionPerformed(ActionEvent e) {
                btn8ActionPerformed(e);
            }
        });
        // add to the frame
        frame.add(btn8);

        /*create a dialog*/
        dialog = new JDialog(frame, Dialog.ModalityType.DOCUMENT_MODAL);
        // set title
        dialog.setTitle("Block Is Completed");
        // set deafaul close operation (nothing)
        dialog.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // close program on close button click
        dialog.addWindowListener(new WindowAdapter() {
            @Override
            // when user tries to close the dialog box
            // whole program will be exited
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
        // set bounds
        dialog.setBounds(650, 400, 300, 150);
        // container
        Container dialogContainer = dialog.getContentPane();
        // set boarderlayout
        dialogContainer.setLayout(new BorderLayout());
        /*design dialog*/
        // create a new table
        JLabel tempLabel = new JLabel("Click To Conitinue");
        // add to center
        dialogContainer.add(tempLabel, BorderLayout.CENTER);
        // create new jpanel
        JPanel panel1 = new JPanel();
        // set layout
        panel1.setLayout(new FlowLayout());
        // create the continue button
        JButton okButton = new JButton("Continue");
        // add event listener
        okButton.addActionListener(new ActionListener() {
            @Override
            // wehne someone clicks on the continue button 
            // dialog will be hidden
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        });
        // add continue button
        panel1.add(okButton);
        // add to container
        dialogContainer.add(panel1, BorderLayout.SOUTH);

        // set null as the frame layout
        frame.setLayout(null);
        // show the JFrame
        frame.setVisible(true);

    }

    // method which runs on start button click
    void start() {

        // set start time
        startTime = System.nanoTime();
        Random rand = new Random();
        int random = 0;

        // set all buttons white
        btn1.setBackground(Color.white);
        btn2.setBackground(Color.white);
        btn3.setBackground(Color.white);
        btn4.setBackground(Color.white);
        btn5.setBackground(Color.white);
        btn6.setBackground(Color.white);
        btn7.setBackground(Color.white);
        btn8.setBackground(Color.white);
        btn9.setBackground(Color.white);
        btn10.setBackground(Color.white);
        btn11.setBackground(Color.white);
        btn12.setBackground(Color.white);

        switch (block) {
            // if the block is 1
            case 1: {
                // generate a random number
                // between 0 - 1
                random = rand.nextInt(2);
                break;
            }
            // if the block is 2
            case 2: {
                // generate a random number
                // between 0 - 3
                random = rand.nextInt(4);
                break;
            }
            // if the block is 3
            case 3: {
                // generate a random number
                // between 0 - 7
                random = rand.nextInt(8);
                break;
            }
            // if the block is 4
            case 4: {
                // generate a random number
                // between 0 - 12
                random = rand.nextInt(12);
                break;
            }
        }

        selected = random + 1; // set button

        // if random =0 
        if (random == 0) {
            // set button 1 bg = blue
            btn1.setBackground(Color.blue);
            // if random =1 
        } else if (random == 1) {
            // set button 2 bg = blue
            btn2.setBackground(Color.blue);
            // if random =2 
        } else if (random == 2) {
            // set button 3 bg = blue
            btn3.setBackground(Color.blue);
            // if random =3 
        } else if (random == 3) {
            // set button 4 bg = blue
            btn4.setBackground(Color.blue);
            // if random =4 
        } else if (random == 4) {
            // set button 5 bg = blue
            btn5.setBackground(Color.blue);
            // if random =5 
        } else if (random == 5) {
            // set button 6 bg = blue
            btn6.setBackground(Color.blue);
            // if random =6 
        } else if (random == 6) {
            // set button 7 bg = blue
            btn7.setBackground(Color.blue);
            // if random =7   
        } else if (random == 7) {
            // set button 8 bg = blue
            btn8.setBackground(Color.blue);
        }
    }

    // once an user clicks on the start button this methos will be trigered
    public void startActionPerformed(ActionEvent e) {
        start();
    }

    // once an user clicks on the button 1 this methos will be trigered
    public void btn1ActionPerformed(ActionEvent e) {

        // set end time
        endTime = System.nanoTime();
        switch (selected) {
            // if selected == -1
            // no highlighted buttons
            case -1:
                // ignore the click
                return;
            // correct click
            case 1:
                // play mucis
                playMusic();
                // move to the next trail
                nextTrail();
                break;
            // wrong button click
            default:
                // increase errors
                errors++;
                break;
        }
    }

    // once an user clicks on the button 1 this methos will be trigered
    public void btn2ActionPerformed(ActionEvent e) {

        // set end time
        endTime = System.nanoTime();
        switch (selected) {
            // if selected == -1
            // no highlighted buttons
            case -1:
                // ignore the click
                return;
            // correct click
            case 2:
                // play mucis
                playMusic();
                // move to the next trail
                nextTrail();
                break;
            // wrong button click
            default:
                // increase errors
                errors++;
                break;
        }
    }

    // once an user clicks on the button 2 this methos will be trigered
    public void btn3ActionPerformed(ActionEvent e) {

        // set end time
        endTime = System.nanoTime();
        switch (selected) {
            // if selected == -1
            // no highlighted buttons
            case -1:
                // ignore the click
                return;
            // correct click
            case 3:
                // play mucis
                playMusic();
                // move to the next trail
                nextTrail();
                break;
            // wrong button click
            default:
                // increase errors
                errors++;
                break;
        }
    }

    // once an user clicks on the button 3 this methos will be trigered
    public void btn4ActionPerformed(ActionEvent e) {

        // set end time
        endTime = System.nanoTime();
        switch (selected) {
            // if selected == -1
            // no highlighted buttons
            case -1:
                // ignore the click
                return;
            // correct click
            case 4:
                // play mucis
                playMusic();
                // move to the next trail
                nextTrail();
                break;
            // wrong button click
            default:
                // increase errors
                errors++;
                break;
        }
    }

    // once an user clicks on the button 4 this methos will be trigered
    public void btn5ActionPerformed(ActionEvent e) {

        // set end time
        endTime = System.nanoTime();
        switch (selected) {
            // if selected == -1
            // no highlighted buttons
            case -1:
                // ignore the click
                return;
            // correct click
            case 5:
                // play mucis
                playMusic();
                // move to the next trail
                nextTrail();
                break;
            // wrong button click
            default:
                // increase errors
                errors++;
                break;
        }
    }

    // once an user clicks on the button 5 this methos will be trigered
    public void btn6ActionPerformed(ActionEvent e) {

        // set end time
        endTime = System.nanoTime();
        switch (selected) {
            // if selected == -1
            // no highlighted buttons
            case -1:
                // ignore the click
                return;
            // correct click
            case 6:
                // play mucis
                playMusic();
                // move to the next trail
                nextTrail();
                break;
            // wrong button click
            default:
                // increase errors
                errors++;
                break;
        }
    }

    // once an user clicks on the button 6 this methos will be trigered
    public void btn7ActionPerformed(ActionEvent e) {

        // set end time
        endTime = System.nanoTime();
        switch (selected) {
            // if selected == -1
            // no highlighted buttons
            case -1:
                // ignore the click
                return;
            // correct click
            case 7:
                // play mucis
                playMusic();
                // move to the next trail
                nextTrail();
                break;
            // wrong button click
            default:
                // increase errors
                errors++;
                break;
        }
    }

    // once an user clicks on the button 7 this methos will be trigered
    public void btn8ActionPerformed(ActionEvent e) {

        // set end time
        endTime = System.nanoTime();
        switch (selected) {
            // if selected == -1
            // no highlighted buttons
            case -1:
                // ignore the click
                return;
            // correct click
            case 8:
                // play mucis
                playMusic();
                // move to the next trail
                nextTrail();
                break;
            // wrong button click
            default:
                // increase errors
                errors++;
                break;
        }
    }

    // once an user clicks on the button 9 this methos will be trigered
    public void btn9ActionPerformed(ActionEvent e) {

        // set end time
        endTime = System.nanoTime();
        switch (selected) {
            // if selected == -1
            // no highlighted buttons
            case -1:
                // ignore the click
                return;
            // correct click
            case 9:
                // play mucis
                playMusic();
                // move to the next trail
                nextTrail();
                break;
            // wrong button click
            default:
                // increase errors
                errors++;
                break;
        }
    }

    // once an user clicks on the button 10 this methos will be trigered
    public void btn10ActionPerformed(ActionEvent e) {

        // set end time
        endTime = System.nanoTime();
        switch (selected) {
            // if selected == -1
            // no highlighted buttons
            case -1:
                // ignore the click
                return;
            // correct click
            case 10:
                // play mucis
                playMusic();
                // move to the next trail
                nextTrail();
                break;
            // wrong button click
            default:
                // increase errors
                errors++;
                break;
        }
    }

    // once an user clicks on the button 1 this methos will be trigered
    public void btn11ActionPerformed(ActionEvent e) {

        // set end time
        endTime = System.nanoTime();
        switch (selected) {
            // if selected == -1
            // no highlighted buttons
            case -1:
                // ignore the click
                return;
            // correct click
            case 11:
                // play mucis
                playMusic();
                // move to the next trail
                nextTrail();
                break;
            // wrong button click
            default:
                // increase errors
                errors++;
                break;
        }
    }

    // once an user clicks on the button 1 this methos will be trigered
    public void btn12ActionPerformed(ActionEvent e) {

        // set end time
        endTime = System.nanoTime();
        switch (selected) {
            // if selected == -1
            // no highlighted buttons
            case -1:
                // ignore the click
                return;
            // correct click
            case 12:
                // play mucis
                playMusic();
                // move to the next trail
                nextTrail();
                break;
            // wrong button click
            default:
                // increase errors
                errors++;
                break;
        }
    }

    // this method loads the tone file
    // and plays it
    private void playMusic() {
        try {
            // file path
            File musicPath = new File("tone.wav");
            // craete an audio stream with it
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            // create a clip
            Clip clip = AudioSystem.getClip();
            // open audio
            clip.open(audioInput);
            // start the music
            clip.start();
        } catch (HeadlessException | IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            // if there is an exception
            e.printStackTrace();
        }

    }

    // this method is used to move to the enxt trail
    private void nextTrail() {
        // find reaction time
        double time = (double) (endTime - startTime);
        // time in milli seconds
        double time_mills = time / 1000000.0;
        // print <user> <block> <trail> <time> <erros> 
        System.out.printf("%s#\t%d#\t%d#\t%.2f\t%d\n", user, block, trial, time_mills, errors);

        // set all buttons white
        btn1.setBackground(Color.white);
        btn2.setBackground(Color.white);
        btn3.setBackground(Color.white);
        btn4.setBackground(Color.white);
        btn5.setBackground(Color.white);
        btn6.setBackground(Color.white);
        btn7.setBackground(Color.white);
        btn8.setBackground(Color.white);
        btn9.setBackground(Color.white);
        btn10.setBackground(Color.white);
        btn11.setBackground(Color.white);
        btn12.setBackground(Color.white);

        // selected
        selected = -1;
        // errors = 0
        errors = 0;

        // if this is 21th trial
        // move to next block
        if (trial == 20) {
            // next block
            block++;
            // first trail
            trial = 1;

            switch (block) {

                // if the block is first
                case 1: {
                    // show dialog
                    dialog.setVisible(true);
                    // set visible the 1st button
                    btn1.setVisible(true);
                    // set visible the 2nd button
                    btn2.setVisible(true);

                    break;
                }

                // if the block is second
                case 2: {

                    // show dialog
                    dialog.setVisible(true);
                    // set visible the 3rd button
                    btn3.setVisible(true);
                    // set visible the 4th button
                    btn4.setVisible(true);

                    break;
                }

                // if the block is third
                case 3: {
                    // show dialog
                    dialog.setVisible(true);
                    // set visible the 5th button
                    btn5.setVisible(true);
                    // set visible the 6th button
                    btn6.setVisible(true);
                    // set visible the 7th button
                    btn7.setVisible(true);
                    // set visible the 8th button
                    btn8.setVisible(true);

                    break;
                }
                case 4: {
                    // show dialog
                    dialog.setVisible(true);
                    // set visible the 5th button
                    btn9.setVisible(true);
                    // set visible the 6th button
                    btn10.setVisible(true);
                    // set visible the 7th button
                    btn11.setVisible(true);
                    // set visible the 8th button
                    btn12.setVisible(true);
                }
                case 5: {
                    try {
                        // wait 1 second before exiting
                        Thread.sleep(1000);
                        // exit program
                        exit(0);

                    } catch (InterruptedException ex) {
                        // print exception
                        ex.printStackTrace();
                    }
                }
            }
        } else {
            // next trail
            trial++;
        }
    }

    public static void main(String[] args) {
        // Sccanner object to get user's input
        Scanner sc = new Scanner(System.in);
        // ask user to enter the user name
        System.out.print("Enter the user name >> ");
        // scan user input
        String user = sc.nextLine();
        // new line
        System.out.println("\n");
        // start the application
        Application app = new Application(user);
    }
}
