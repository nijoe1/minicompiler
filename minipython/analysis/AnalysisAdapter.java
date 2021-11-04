/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.analysis;

import java.util.*;
import minipython.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable in;
    private Hashtable out;

    public Object getIn(Node node)
    {
        if(in == null)
        {
            return null;
        }

        return in.get(node);
    }

    public void setIn(Node node, Object in)
    {
        if(this.in == null)
        {
            this.in = new Hashtable(1);
        }

        if(in != null)
        {
            this.in.put(node, in);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(out == null)
        {
            return null;
        }

        return out.get(node);
    }

    public void setOut(Node node, Object out)
    {
        if(this.out == null)
        {
            this.out = new Hashtable(1);
        }

        if(out != null)
        {
            this.out.put(node, out);
        }
        else
        {
            this.out.remove(node);
        }
    }
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAProgramme(AProgramme node)
    {
        defaultCase(node);
    }

    public void caseAStatCommands(AStatCommands node)
    {
        defaultCase(node);
    }

    public void caseAExprCommands(AExprCommands node)
    {
        defaultCase(node);
    }

    public void caseAIfStatement(AIfStatement node)
    {
        defaultCase(node);
    }

    public void caseAAssignStatement(AAssignStatement node)
    {
        defaultCase(node);
    }

    public void caseAPrintStatement(APrintStatement node)
    {
        defaultCase(node);
    }

    public void caseATrueComparison(ATrueComparison node)
    {
        defaultCase(node);
    }

    public void caseAFalseComparison(AFalseComparison node)
    {
        defaultCase(node);
    }

    public void caseALesscComparison(ALesscComparison node)
    {
        defaultCase(node);
    }

    public void caseAGreatcComparison(AGreatcComparison node)
    {
        defaultCase(node);
    }

    public void caseAMultiplicationExpression(AMultiplicationExpression node)
    {
        defaultCase(node);
    }

    public void caseAAdditionExpression(AAdditionExpression node)
    {
        defaultCase(node);
    }

    public void caseASubtractionExpression(ASubtractionExpression node)
    {
        defaultCase(node);
    }

    public void caseASomethingMultiplication(ASomethingMultiplication node)
    {
        defaultCase(node);
    }

    public void caseAMultiplicationMultiplication(AMultiplicationMultiplication node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierSomething(AIdentifierSomething node)
    {
        defaultCase(node);
    }

    public void caseANumbSomething(ANumbSomething node)
    {
        defaultCase(node);
    }

    public void caseAParSomething(AParSomething node)
    {
        defaultCase(node);
    }

    public void caseTTab(TTab node)
    {
        defaultCase(node);
    }

    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    public void caseTEq(TEq node)
    {
        defaultCase(node);
    }

    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    public void caseTPrint(TPrint node)
    {
        defaultCase(node);
    }

    public void caseTLess(TLess node)
    {
        defaultCase(node);
    }

    public void caseTGreat(TGreat node)
    {
        defaultCase(node);
    }

    public void caseTTrue(TTrue node)
    {
        defaultCase(node);
    }

    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    public void caseTFalse(TFalse node)
    {
        defaultCase(node);
    }

    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    public void caseTQuote(TQuote node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseTLineComment(TLineComment node)
    {
        defaultCase(node);
    }

    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(Node node)
    {
    }
}
