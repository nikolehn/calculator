package edu.uned.nikole;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nikole
 */
@XmlRootElement
public class OperationList {

    private List<String> operations;

    public OperationList() {
        this.operations = new ArrayList<>();
    }

    public void add(String op) {
        this.operations.add(op);
    }

    public List<String> getOperations() {
        return operations;
    }

    public void setOperations(List<String> operations) {
        this.operations = operations;
    }
}
