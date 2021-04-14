/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 05 14:44:09 GMT 2021
 */

package comp5111.assignment.cut;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import comp5111.assignment.cut.ToolBox;
import java.nio.CharBuffer;
import java.util.Locale;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ToolBox_ESTest {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("d\"VF}ed&<x@6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '[';
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "8Fho?(%VzP~q", charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'l';
      charArray0[1] = 'l';
      int int0 = ToolBox.StringTools.indexOfAny("/JMhlkT{8xIWL%6 Pf", charArray0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) "8Fho?(%VzP~q", (CharSequence) "_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'R';
      boolean boolean0 = ToolBox.StringTools.containsNone(" ", charArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      char[] charArray0 = new char[4];
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) "bIEPSL", charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, 0, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = charBuffer0.append(',');
      charBuffer1.get();
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, 0, 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "=f[ b\":~6@M");
      boolean boolean0 = ToolBox.StringTools.contains(charBuffer0, 88);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      // Undeclared exception!
      try { 
        ToolBox.LocaleTools.toLocale("K,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: K,
         //
         verifyException("comp5111.assignment.cut.ToolBox$LocaleTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      int int0 = ToolBox.ArrayTools.getLength((Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      int int0 = ToolBox.StringTools.length("");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isEmpty("\r");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(582);
      int int0 = ToolBox.CharSequenceTools.indexOf(charBuffer0, (-2037), 659);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      boolean boolean0 = ToolBox.ArrayTools.isEmpty((char[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(188);
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) charBuffer0, (CharSequence) charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase((String) null, (String) null, false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("78_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable(".3");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("/JMhlkT{8xIWL%6 Pf");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("\r\r");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("-2 )qHiwKn");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable(" ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isMixedCase("v!J");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2897);
      boolean boolean0 = ToolBox.StringTools.isMixedCase(charBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isMixedCase("BBV");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isMixedCase("\r");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isMixedCase("?:'FBAw qdqJL");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isMixedCase("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = 'H';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = charBuffer0.append(',');
      boolean boolean0 = ToolBox.StringTools.isAllUpperCase(charBuffer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isAllUpperCase("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isAllUpperCase(" ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isAllLowerCase("z");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isAllLowerCase("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isNumeric("3");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isNumeric("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      CharSequence[] charSequenceArray0 = new CharSequence[3];
      charSequenceArray0[0] = (CharSequence) "MCr]S.]f.7offp<I`.";
      charSequenceArray0[1] = (CharSequence) " ";
      charSequenceArray0[2] = (CharSequence) "\n";
      int int0 = ToolBox.StringTools.indexOfDifference(charSequenceArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "/JMhlkT{8xIWL%6 Pf";
      stringArray0[1] = "/JMhlkT{8xIWL%6 Pf";
      stringArray0[2] = "/JMhlkT{8xIWL%6 Pf";
      stringArray0[3] = "/JMhlkT{8xIWL%6 Pf";
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("/JMhlkT{8xIWL%6 Pf", string0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "%ZJfb", (CharSequence) "_");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "Ir", (CharSequence) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) null, (CharSequence) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) charBuffer0, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      char[] charArray0 = new char[3];
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "", charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = ToolBox.StringTools.indexOfAny(charBuffer0, charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = 'W';
      int int0 = ToolBox.StringTools.indexOfAny("/JMhlkT{8xIWL%6 Pf", charArray0);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.append(',');
      int int0 = ToolBox.StringTools.indexOfAny(charBuffer0, charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'l';
      int int0 = ToolBox.StringTools.indexOfAny("/JMhlkT{8xIWL%6 Pf", charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      int int0 = ToolBox.StringTools.indexOfAny(" ", (char[]) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      char[] charArray0 = new char[9];
      int int0 = ToolBox.StringTools.indexOfAny((CharSequence) null, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      String string0 = ToolBox.StringTools.getIfEmpty((String) null, (Supplier<String>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      String string0 = ToolBox.StringTools.getIfEmpty("", supplier0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      String string0 = ToolBox.StringTools.getIfEmpty(" ", supplier0);
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "!C(mj@zeC.`O-QE62";
      stringArray0[1] = "\n";
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("!", string0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "comp5111.assignment.cut.ToolBox$CharTools";
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("comp5111.assignment.cut.ToolBox$CharTools", string0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      String string0 = ToolBox.StringTools.getCommonPrefix((String[]) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.get(charArray0);
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) "", (CharSequence) charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) " ", (CharSequence) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) null, (CharSequence) ":#p;gw3NVyP");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) "", (CharSequence) "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) "", (CharSequence) "?:'FBAw qdqJL??:'FBAw qdqJL:?:'FBAw qdqJL'?:'FBAw qdqJLF?:'FBAw qdqJLB?:'FBAw qdqJLA?:'FBAw qdqJLw?:'FBAw qdqJL ?:'FBAw qdqJLq?:'FBAw qdqJLd?:'FBAw qdqJLq?:'FBAw qdqJLJ?:'FBAw qdqJLL?:'FBAw qdqJL");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = ToolBox.StringTools.containsNone(charBuffer0, charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.containsNone("", (char[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      char[] charArray0 = new char[3];
      boolean boolean0 = ToolBox.StringTools.containsNone((CharSequence) null, charArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) null, (CharSequence) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) "\r", (CharSequence) " ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) null, (char[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.contains((CharSequence) null, (-309));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase((String) null, "VD9TPD0j~y", true);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase((String) null, "", false);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase("", "", true);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      int int0 = ToolBox.StringTools.compare("F=4oQ\"Sv", (String) null, false);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      int int0 = ToolBox.StringTools.compare((String) null, "z#q/Vd41(X4Ex;", true);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceFirst((String) null, ":#p;gw3NVyP", (String) null);
      int int0 = ToolBox.StringTools.compare(string0, ":#p;gw3NVyP", false);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      int int0 = ToolBox.StringTools.compare("", "", false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      int int0 = ToolBox.StringTools.compare("", "c", true);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      char[] charArray0 = ToolBox.CharSequenceTools.toCharArray((CharSequence) null);
      assertArrayEquals(new char[] {}, charArray0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replacePattern("", "-2 )qHiwKn", (String) null);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replacePattern("", (String) null, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replacePattern("\n", "\r", "");
      assertEquals("\n", string0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replacePattern((String) null, (String) null, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceFirst("", "", (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceFirst("", (String) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceFirst("\r", "", "\r");
      assertEquals("\r\r", string0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("Ir");
      String string0 = ToolBox.RegExTools.replaceFirst("Ir", pattern0, (String) null);
      assertEquals("Ir", string0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceFirst("=|e`y(%=hr6D$", (Pattern) null, "=|e`y(%=hr6D$");
      assertEquals("=|e`y(%=hr6D$", string0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("V*=N}~M");
      String string0 = ToolBox.RegExTools.replaceFirst("Invalid locale format: ", pattern0, " ");
      assertEquals("Invalid locale format: ", string0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("");
      String string0 = ToolBox.RegExTools.replaceFirst((String) null, pattern0, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceAll("", "", (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceAll("", (String) null, "=-m.ynA*cn}iq");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceAll("=|e`y(%=hr6D$", " ", "Invalid locale format: ");
      assertEquals("=|e`y(%=hr6D$", string0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceAll((String) null, "comp5111.assignment.cut.ToolBox$StringTools", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("", 201);
      String string0 = ToolBox.RegExTools.replaceAll("", pattern0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceAll("Invalid locale format: ", (Pattern) null, "5?(gS=CoTJCG");
      assertEquals("Invalid locale format: ", string0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("");
      String string0 = ToolBox.RegExTools.replaceAll("&r=*", pattern0, "&r=*");
      assertEquals("&r=*&&r=*r&r=*=&r=**&r=*", string0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("", 3);
      String string0 = ToolBox.RegExTools.replaceAll((String) null, pattern0, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, charBuffer0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "Gu7J]q");
      int int0 = ToolBox.CharSequenceTools.lastIndexOf("", charBuffer0, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, charBuffer0, (-637));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, charBuffer0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceFirst((String) null, ":#p;gw3NVyP", (String) null);
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(string0, ":#p;gw3NVyP", 57);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      int int0 = ToolBox.CharSequenceTools.lastIndexOf("", "", 102);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      int int0 = ToolBox.CharSequenceTools.lastIndexOf("", (CharSequence) null, 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'Q';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, 0, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.append(',');
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, 0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(" ", 2817, (byte)114);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      boolean boolean0 = ToolBox.CharSequenceTools.regionMatches("", true, 5, charBuffer0, (-3895), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2897);
      boolean boolean0 = ToolBox.CharSequenceTools.regionMatches(charBuffer0, true, (-663), charBuffer0, 3405, 3405);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = ToolBox.CharSequenceTools.regionMatches("Sa", false, 45, charBuffer0, 0, (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      boolean boolean0 = ToolBox.CharSequenceTools.regionMatches("", true, 47, "\n", 0, (-2));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = ToolBox.CharSequenceTools.regionMatches(charBuffer0, true, 'u', charBuffer0, 'u', 'n');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) "\r", (CharSequence) "\r");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) "?:'FBAw qdqJL", (CharSequence) "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      char[] charArray1 = ToolBox.CharSequenceTools.toCharArray(charBuffer0);
      assertEquals(2, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      int int0 = ToolBox.CharSequenceTools.indexOf("", "\n", (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "\r");
      int int0 = ToolBox.CharSequenceTools.indexOf(charBuffer0, "\r", (-992));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      char[] charArray0 = new char[5];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 3);
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) charBuffer0, (CharSequence) charBuffer0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "comp5111.assignment.cut.ToolBox$CharTools", (CharSequence) "comp5111.assignment.cut.ToolBox$CharTools");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      boolean boolean0 = ToolBox.ArrayTools.isEmpty((short[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      short[] shortArray0 = new short[2];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(shortArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      boolean boolean0 = ToolBox.ArrayTools.isEmpty((Object[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      String[] stringArray0 = new String[4];
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      long[] longArray0 = new long[0];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(longArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      long[] longArray0 = new long[2];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(longArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      boolean boolean0 = ToolBox.ArrayTools.isEmpty((int[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      int[] intArray0 = new int[7];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      boolean boolean0 = ToolBox.ArrayTools.isEmpty((float[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      float[] floatArray0 = new float[4];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      boolean boolean0 = ToolBox.ArrayTools.isEmpty((byte[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      boolean boolean0 = ToolBox.ArrayTools.isEmpty((boolean[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      // Undeclared exception!
      try { 
        ToolBox.LocaleTools.toLocale("_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: _
         //
         verifyException("comp5111.assignment.cut.ToolBox$LocaleTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      Locale locale0 = ToolBox.LocaleTools.toLocale("");
      assertEquals("", locale0.getVariant());
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Locale locale0 = ToolBox.LocaleTools.toLocale(stringArray0[0]);
      assertNull(locale0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      // Undeclared exception!
      try { 
        ToolBox.LocaleTools.toLocale("*S)8cc[_{qA_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: *S)8cc[_{qA_
         //
         verifyException("comp5111.assignment.cut.ToolBox$LocaleTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      // Undeclared exception!
      try { 
        ToolBox.LocaleTools.toLocale("r<y21_c^n\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: r<y21_c^n\"
         //
         verifyException("comp5111.assignment.cut.ToolBox$LocaleTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      ToolBox.ArrayTools toolBox_ArrayTools0 = new ToolBox.ArrayTools();
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "\r", toolBox_ArrayTools0.EMPTY_CHAR_ARRAY);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      ToolBox.CharTools toolBox_CharTools0 = new ToolBox.CharTools();
      assertEquals('\r', ToolBox.CharTools.CR);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      ToolBox.CharSequenceTools toolBox_CharSequenceTools0 = new ToolBox.CharSequenceTools();
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      ToolBox.LocaleTools toolBox_LocaleTools0 = new ToolBox.LocaleTools();
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      ToolBox.RegExTools toolBox_RegExTools0 = new ToolBox.RegExTools();
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      ToolBox.StringTools toolBox_StringTools0 = new ToolBox.StringTools();
      assertEquals((-1), ToolBox.StringTools.INDEX_NOT_FOUND);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      ToolBox toolBox0 = new ToolBox();
  }
}
