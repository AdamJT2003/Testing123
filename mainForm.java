public class mainForm {
    <?xml version="1.0" encoding="UTF-8"?>
<form xmlns="http://www.intellij.com/uidesigner/form/" version="1" bind-to-class="BlackjackGUI">
  <grid id="27dc6" binding="Background" layout-manager="CardLayout" hgap="0" vgap="0">
    <constraints>
      <xy x="20" y="20" width="1305" height="440"/>
    </constraints>
    <properties>
      <autoscrolls value="false"/>
      <background color="-16777216"/>
      <foreground color="-16317782"/>
      <minimumSize width="351" height="400"/>
      <preferredSize width="750" height="750"/>
    </properties>
    <border type="none"/>
    <children>
      <grid id="1af35" binding="Welcome" layout-manager="GridBagLayout">
        <constraints>
          <card name="Card1"/>
        </constraints>
        <properties>
          <background color="-16777216"/>
          <maximumSize width="60" height="30"/>
          <preferredSize width="750" height="750"/>
        </properties>
        <border type="none"/>
        <children>
          <component id="6d186" class="javax.swing.JTextPane" binding="textPane4" default-binding="true">
            <constraints>
              <grid row="2" column="1" row-span="1" col-span="1" vsize-policy="6" hsize-policy="6" anchor="0" fill="3" indent="0" use-parent-layout="false">
                <preferred-size width="150" height="50"/>
              </grid>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-16777216"/>
            </properties>
          </component>
          <component id="d9d34" class="javax.swing.JButton" binding="continueBtnWelcome">
            <constraints>
              <grid row="3" column="0" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <text value="Continue"/>
            </properties>
          </component>
          <component id="6adca" class="javax.swing.JTextArea" binding="welcomeTxt">
            <constraints>
              <grid row="1" column="0" row-span="1" col-span="1" vsize-policy="6" hsize-policy="6" anchor="0" fill="3" indent="0" use-parent-layout="false">
                <preferred-size width="150" height="50"/>
              </grid>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-16777216"/>
              <foreground color="-4499542"/>
              <preferredSize width="350" height="350"/>
              <selectedTextColor color="-1"/>
              <text value="Rules:&#10;• You must be over 18 to play.&#10;&#10;Aim:&#10;• Finish with a total of 21 or just under.&#10;• If they are closer to 21 than you are then you lose. &#10;• If your total goes over 21 then you have lost.&#10;• If the total is closer to 21 than the dealers &#10;  then you win.&#10;• If the dealers total goes over 21 then you have won.&#10;&#10;How to play:&#10;• Get your two random numbers.&#10;• Decide on if you want to hit and add a new &#10;  random number to your total.&#10;• Stand which will mean your current total is &#10;  your final total. &#10;• You will then see the dealers total.&#10;• You will see the outcome and will have either &#10;  won, drawn or lost the round."/>
            </properties>
          </component>
          <component id="c7a48" class="javax.swing.JTextPane" binding="blackjackTitleTxtArea">
            <constraints>
              <grid row="0" column="0" row-span="1" col-span="1" vsize-policy="6" hsize-policy="6" anchor="0" fill="3" indent="0" use-parent-layout="false">
                <preferred-size width="150" height="50"/>
              </grid>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-16777216"/>
              <font size="20" style="1"/>
              <foreground color="-1"/>
              <text value="Blackjack"/>
            </properties>
          </component>
        </children>
      </grid>
      <grid id="9a0de" binding="Age" layout-manager="GridBagLayout">
        <constraints>
          <card name="Card3"/>
        </constraints>
        <properties>
          <background color="-16777216"/>
        </properties>
        <border type="none"/>
        <children>
          <component id="91611" class="javax.swing.JLabel" binding="ageLbl">
            <constraints>
              <grid row="0" column="0" row-span="1" col-span="1" vsize-policy="0" hsize-policy="0" anchor="8" fill="0" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <foreground color="-4499542"/>
              <preferredSize width="110" height="16"/>
              <text value="What is your age?"/>
            </properties>
          </component>
          <component id="82013" class="javax.swing.JTextField" binding="ageTxtField">
            <constraints>
              <grid row="0" column="1" row-span="1" col-span="1" vsize-policy="0" hsize-policy="6" anchor="8" fill="1" indent="0" use-parent-layout="false">
                <preferred-size width="150" height="-1"/>
              </grid>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <preferredSize width="110" height="30"/>
            </properties>
          </component>
          <component id="2b9b6" class="javax.swing.JButton" binding="nextBtnAge">
            <constraints>
              <grid row="2" column="0" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <preferredSize width="110" height="30"/>
              <text value="Next"/>
            </properties>
          </component>
          <component id="46b50" class="javax.swing.JButton" binding="backBtnAge">
            <constraints>
              <grid row="2" column="1" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <label value="Back"/>
              <preferredSize width="110" height="30"/>
              <text value="Back"/>
            </properties>
          </component>
          <component id="6cf47" class="javax.swing.JTextPane" binding="textPane5" default-binding="true">
            <constraints>
              <grid row="1" column="0" row-span="1" col-span="1" vsize-policy="6" hsize-policy="6" anchor="0" fill="3" indent="0" use-parent-layout="false">
                <preferred-size width="150" height="50"/>
              </grid>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-16777216"/>
            </properties>
          </component>
        </children>
      </grid>
      <grid id="839eb" binding="eligibleAge" layout-manager="GridBagLayout">
        <constraints>
          <card name="Card2"/>
        </constraints>
        <properties>
          <background color="-16777216"/>
          <preferredSize width="193" height="102"/>
        </properties>
        <border type="none"/>
        <children>
          <component id="3b40a" class="javax.swing.JTextPane" binding="textPane1" default-binding="true">
            <constraints>
              <grid row="1" column="2" row-span="1" col-span="1" vsize-policy="6" hsize-policy="6" anchor="0" fill="3" indent="0" use-parent-layout="false">
                <preferred-size width="150" height="50"/>
              </grid>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-16777216"/>
            </properties>
          </component>
          <component id="e1a6b" class="javax.swing.JTextPane" binding="textPane2" default-binding="true">
            <constraints>
              <grid row="1" column="0" row-span="1" col-span="1" vsize-policy="6" hsize-policy="6" anchor="0" fill="3" indent="0" use-parent-layout="false">
                <preferred-size width="150" height="50"/>
              </grid>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-16777216"/>
            </properties>
          </component>
          <component id="a6ca9" class="javax.swing.JTextPane" binding="eligibleAgeTextPane">
            <constraints>
              <grid row="0" column="0" row-span="1" col-span="3" vsize-policy="6" hsize-policy="6" anchor="0" fill="3" indent="0" use-parent-layout="false">
                <preferred-size width="150" height="50"/>
              </grid>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-16777216"/>
              <foreground color="-4499542"/>
              <preferredSize width="200" height="50"/>
              <text value="Hello, you are above the age of 18 meaning you are eligible to play Blackjack."/>
            </properties>
          </component>
          <component id="73308" class="javax.swing.JButton" binding="backBtnEligible">
            <constraints>
              <grid row="2" column="2" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <label value="Back"/>
              <preferredSize width="110" height="30"/>
              <text value="Back"/>
            </properties>
          </component>
          <component id="ee0f6" class="javax.swing.JButton" binding="nextBtnEligible">
            <constraints>
              <grid row="2" column="1" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <label value="Next"/>
              <preferredSize width="110" height="30"/>
              <text value="Next"/>
            </properties>
          </component>
        </children>
      </grid>
      <grid id="644a6" binding="Name" layout-manager="GridBagLayout">
        <constraints>
          <card name="Card5"/>
        </constraints>
        <properties>
          <background color="-16777216"/>
          <foreground color="-4499542"/>
        </properties>
        <border type="none"/>
        <children>
          <component id="66b1b" class="javax.swing.JTextPane" binding="nameTxtPane">
            <constraints>
              <grid row="0" column="1" row-span="1" col-span="1" vsize-policy="6" hsize-policy="6" anchor="0" fill="3" indent="0" use-parent-layout="false">
                <preferred-size width="150" height="50"/>
              </grid>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-16777216"/>
              <foreground color="-4499542"/>
              <preferredSize width="110" height="35"/>
              <text value="What is your name?"/>
            </properties>
          </component>
          <component id="5d256" class="javax.swing.JButton" binding="nextBtnName">
            <constraints>
              <grid row="2" column="1" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <label value="Next"/>
              <preferredSize width="110" height="30"/>
              <text value="Next"/>
            </properties>
          </component>
          <component id="2e4a3" class="javax.swing.JTextField" binding="nameTxtField">
            <constraints>
              <grid row="0" column="2" row-span="1" col-span="1" vsize-policy="0" hsize-policy="6" anchor="8" fill="1" indent="0" use-parent-layout="false">
                <preferred-size width="150" height="-1"/>
              </grid>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <foreground color="-4499542"/>
              <preferredSize width="110" height="30"/>
            </properties>
          </component>
          <component id="f925" class="javax.swing.JTextPane" binding="textPane6" default-binding="true">
            <constraints>
              <grid row="1" column="1" row-span="1" col-span="1" vsize-policy="6" hsize-policy="6" anchor="0" fill="3" indent="0" use-parent-layout="false">
                <preferred-size width="150" height="50"/>
              </grid>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-16777216"/>
            </properties>
          </component>
          <component id="f4257" class="javax.swing.JButton" binding="backBtnName">
            <constraints>
              <grid row="2" column="2" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <label value="Back"/>
              <preferredSize width="110" height="30"/>
              <text value="Back"/>
            </properties>
          </component>
        </children>
      </grid>
      <grid id="36a74" binding="welcomeName" layout-manager="GridBagLayout">
        <constraints>
          <card name="Card6"/>
        </constraints>
        <properties>
          <background color="-16777216"/>
          <foreground color="-4499542"/>
          <preferredSize width="220" height="100"/>
        </properties>
        <border type="none"/>
        <children>
          <component id="59421" class="javax.swing.JTextPane" binding="welcomeNameTxtPane">
            <constraints>
              <grid row="0" column="0" row-span="1" col-span="2" vsize-policy="6" hsize-policy="6" anchor="0" fill="3" indent="0" use-parent-layout="false">
                <preferred-size width="150" height="50"/>
              </grid>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-16777216"/>
              <font style="1"/>
              <foreground color="-4499542"/>
              <preferredSize width="220" height="100"/>
            </properties>
          </component>
          <component id="6a3c7" class="javax.swing.JButton" binding="playBtnWelcName">
            <constraints>
              <grid row="1" column="0" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <label value="Play"/>
              <preferredSize width="110" height="30"/>
              <text value="Play"/>
            </properties>
          </component>
          <component id="b30a0" class="javax.swing.JButton" binding="backBtnWelcName">
            <constraints>
              <grid row="1" column="1" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <label value="Back"/>
              <preferredSize width="110" height="30"/>
              <text value="Back"/>
            </properties>
          </component>
        </children>
      </grid>
      <grid id="e1eb6" binding="Blackjack" layout-manager="GridBagLayout">
        <constraints>
          <card name="Card7"/>
        </constraints>
        <properties>
          <background color="-16777216"/>
          <preferredSize width="440" height="700"/>
        </properties>
        <border type="none"/>
        <children>
          <component id="fad4c" class="javax.swing.JTextArea" binding="blackjackTxtArea">
            <constraints>
              <grid row="0" column="0" row-span="8" col-span="1" vsize-policy="6" hsize-policy="6" anchor="0" fill="3" indent="0" use-parent-layout="false">
                <preferred-size width="150" height="50"/>
              </grid>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-1"/>
              <foreground color="-16777216"/>
              <preferredSize width="320" height="380"/>
            </properties>
          </component>
          <component id="630e3" class="javax.swing.JTextPane" binding="textPane7" default-binding="true">
            <constraints>
              <grid row="0" column="1" row-span="8" col-span="1" vsize-policy="6" hsize-policy="6" anchor="0" fill="3" indent="0" use-parent-layout="false">
                <preferred-size width="150" height="50"/>
              </grid>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-16777216"/>
              <preferredSize width="30" height="22"/>
            </properties>
          </component>
          <component id="73560" class="javax.swing.JTextArea" binding="recordTxtArea">
            <constraints>
              <grid row="7" column="2" row-span="1" col-span="1" vsize-policy="6" hsize-policy="6" anchor="0" fill="3" indent="0" use-parent-layout="false">
                <preferred-size width="150" height="50"/>
              </grid>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-16777216"/>
              <foreground color="-4499542"/>
              <preferredSize width="1" height="80"/>
            </properties>
          </component>
          <component id="c3aee" class="javax.swing.JButton" binding="exitBtn">
            <constraints>
              <grid row="6" column="2" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <label value="Exit"/>
              <preferredSize width="110" height="30"/>
              <text value="Exit"/>
            </properties>
          </component>
          <component id="63f7c" class="javax.swing.JButton" binding="backBtnBlackjack">
            <constraints>
              <grid row="5" column="2" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <label value="Back"/>
              <text value="Back"/>
            </properties>
          </component>
          <component id="eeb48" class="javax.swing.JButton" binding="clearGameBtn">
            <constraints>
              <grid row="4" column="2" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <text value="Clear Game"/>
            </properties>
          </component>
          <component id="6b76" class="javax.swing.JButton" binding="clearRecordBtn">
            <constraints>
              <grid row="3" column="2" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <label value="Clear record"/>
              <preferredSize width="110" height="30"/>
              <text value="Clear record"/>
            </properties>
          </component>
          <component id="7b55a" class="javax.swing.JButton" binding="standBtn">
            <constraints>
              <grid row="2" column="2" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <label value="Stand"/>
              <preferredSize width="110" height="30"/>
              <text value="Stand"/>
            </properties>
          </component>
          <component id="c0148" class="javax.swing.JButton" binding="hitBtn">
            <constraints>
              <grid row="1" column="2" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <label value="Hit"/>
              <preferredSize width="110" height="30"/>
              <text value="Hit"/>
            </properties>
          </component>
          <component id="9f3e5" class="javax.swing.JButton" binding="startBtn">
            <constraints>
              <grid row="0" column="2" row-span="1" col-span="1" vsize-policy="0" hsize-policy="3" anchor="0" fill="1" indent="0" use-parent-layout="false"/>
              <gridbag weightx="0.0" weighty="0.0"/>
            </constraints>
            <properties>
              <background color="-13224412"/>
              <foreground color="-4499542"/>
              <horizontalAlignment value="0"/>
              <label value="Start"/>
              <maximumSize width="110" height="30"/>
              <preferredSize width="110" height="30"/>
              <text value="Start"/>
            </properties>
          </component>
        </children>
      </grid>
    </children>
  </grid>
</form>

}
