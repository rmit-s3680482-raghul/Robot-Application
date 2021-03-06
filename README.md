����������������		Robot-Application

##�Woven�graduate�coding�test

Your�task�is�to�write�a�CLI�application�to�parse�commands�and�display�the�result.

Suppose�you�have�a�robot�that�can�receive�commands�in�order�to�move�it.�These�commands�will�tell�the�robot�to�go�forwards�or�backwards,�and�turn�left�or�right.�These�commands�will�be�in�the�format�<command><number>.�For�example�'L1'�means�'turn�left�by�90�degrees�once'.�'B2'�would�mean�go�backwards�2�units.

###�Available�commands:

-�`F`�-�move�forward�1�unit
-�`B`�-�move�backward�1�unit
-�`R`�-�turn�right�90�degrees
-�`L`�-�turn�left�90�degrees

###�Your�task

Write�a�program�that�receives�a�string�of�commands�and�will�output�the�robot's�distance�from�it's�starting�point.�This�distance�will�be�the�minimum�amount�of�units�the�robot�will�need�to�traverse�in�order�to�get�back�to�it's�starting�point.�Remember,�the�robot�can�only�turn�90�degrees�at�a�time,�so�it�cannot�go�directly�back�home,�it�must�go�in�north,�south,�east,�west�directions.

Inputs:�-�a�string�of�comma-separated�commands�eg�`F1,R1,B2,L1,B3`
Output:�-�the�minimum�amount�of�distance�to�get�back�to�the�starting�point�(`4`�in�this�case)

The�specifics�and�implementation�of�this�code�is�completely�up�to�you!�The�input�could�be�a�string,�a�filename�with�the�commands�as�contents�or�anything�else.

###�What�we�are�looking�for:

-�We�are�a�Ruby�house,�however�feel�free�to�pick�the�language�you�feel�you�are�strongest�in.
-�Code�that�is�well�thought�out�and�tested
-�Clean�and�readable�code
-�Extensibility�should�be�considered
-�A�git�commit-history�would�be�preferred,�with�small�changes�committed�often�so�we�can�see�your�approach

Please�include�a�readme�with�any�additional�information�you�would�like�to�include,�including�instructions�on�how�to�test�and�execute�your�code.�You�may�wish�to�use�it�to�explain�any�design�decisions.

Despite�this�being�a�small�command�line�app,�please�approach�this�as�you�would�a�production�problem�using�whatever�approach�to�coding�and�testing�you�feel�appropriate.

Instruction�to�run�the�Robot�Application.

1.�Download�the�Robot�Application�from�git�hub�using�URL�:�https://github.com/rmit-s3680482-raghul/Robot-Application.git.
2.�Import�the�java�application�in�Eclipse�or�relevant�IDE�in�your�system.
3.�There�are�three�class,�Robot�class�has�the�main�method�to�start�the�application,�RobotController�has�construction�for�the�Application�which�is�used�for�extensibility.�It�initializes�the�coordinates,�direction�and�minimal�distance�to�reach�the�initial�position�and�RobotTest�class�used�for�Junit�test�for�the�Robot�Application.
4.�In�Command�line�comments:�run�command�javac�\*.java�to�compile�the�Robot�Application.�Run�command�java�Robot�to�run�the�application.
5.�Run�the�Robot�class,�initial�it�has�two�commands,��S��for�start�the�Application�and��E��for�stop�the�program.�The�user�can�able�to�provide�the�valid�string,�it�provides�minimal�distance�for�reaching�initial�position,�present�robot�coordinates�and�direction.�Suppose�the�user�provides�invalid�commands,�It�shows�appropriate�error�message�to�the�user�in�console.
6.�Run�RobotTest�class�for�regressive�test�for�robot�Application.�It�has�predefined�initial�value�in�the�RobotTest�class,�we�can�add�some�more�test�in�the�same�class�for�the�future�enhancement.


