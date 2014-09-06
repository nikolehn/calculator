package edu.uned.nikole;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nikole
 */
@XmlRootElement
public class Operation {

    private String name;
    private List<Double> operands;
    private Double result;

    public Operation() {
        this.name = "unset";
        this.operands = new ArrayList();
        this.result = 0.0d;
    }

    public Operation(String name, List<Double> operands, Double result) {
        this.name = name;
        this.operands = new ArrayList<>(operands);
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getOperands() {
        return operands;
    }

    public void setOperands(List<Double> operands) {
        this.operands = operands;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
