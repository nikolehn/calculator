package edu.uned.nikole;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author nikole
 */
@Path("calc")
public class CalcResource {

    static double memory = 0.0d;

    /*
     ******************
     * BASIC OPS
     ******************
     */
    @GET
    @Path("add/{op1}/{op2}")
    @Produces({MediaType.APPLICATION_JSON})
    public Operation add(
            @PathParam("op1") Double op1,
            @PathParam("op2") Double op2
    ) {
        List<Double> operands = new ArrayList<>();
        operands.add(op1);
        operands.add(op2);

        Operation op = new Operation();
        op.setName("add");
        op.setOperands(operands);
        op.setResult(op1 + op2);
        return op;
    }

    @GET
    @Path("subtract/{op1}/{op2}")
    @Produces({MediaType.APPLICATION_JSON})
    public Operation subtract(
            @PathParam("op1") Double op1,
            @PathParam("op2") Double op2
    ) {
        List<Double> operands = new ArrayList<>();
        operands.add(op1);
        operands.add(op2);

        Operation op = new Operation();
        op.setName("subtract");
        op.setOperands(operands);
        op.setResult(op1 - op2);
        return op;
    }

    @GET
    @Path("multiply/{op1}/{op2}")
    @Produces({MediaType.APPLICATION_JSON})
    public Operation multiply(
            @PathParam("op1") Double op1,
            @PathParam("op2") Double op2
    ) {
        List<Double> operands = new ArrayList<>();
        operands.add(op1);
        operands.add(op2);

        Operation op = new Operation();
        op.setName("multiply");
        op.setOperands(operands);
        op.setResult(op1 * op2);
        return op;
    }

    @GET
    @Path("divide/{op1}/{op2}")
    @Produces({MediaType.APPLICATION_JSON})
    public Operation divide(
            @PathParam("op1") Double op1,
            @PathParam("op2") Double op2
    ) {
        List<Double> operands = new ArrayList<>();
        operands.add(op1);
        operands.add(op2);

        Operation op = new Operation();
        op.setName("divide");
        op.setOperands(operands);
        op.setResult(op1 / op2);
        return op;
    }

    /*
     ******************
     * ADVANCED OPS
     ******************
     */
    @GET
    @Path("sqrt/{op1}")
    @Produces({MediaType.APPLICATION_JSON})
    public Operation sqrt(
            @PathParam("op1") Double op1
    ) {
        List<Double> operands = new ArrayList<>();
        operands.add(op1);

        Operation op = new Operation();
        op.setName("sqrt");
        op.setOperands(operands);
        op.setResult(Math.sqrt(op1));
        return op;
    }

    @GET
    @Path("pow/{op1}/{op2}")
    @Produces({MediaType.APPLICATION_JSON})
    public Operation pow(
            @PathParam("op1") Double op1,
            @PathParam("op2") Double op2
    ) {
        List<Double> operands = new ArrayList<>();
        operands.add(op1);
        operands.add(op2);

        Operation op = new Operation();
        op.setName("pow");
        op.setOperands(operands);
        op.setResult(Math.pow(op1, op2));
        return op;
    }

    /*
     ******************
     * TRIGONOMETRY
     ******************
     */
    @GET
    @Path("sin/{op1}")
    @Produces({MediaType.APPLICATION_JSON})
    public Operation sin(
            @PathParam("op1") Double op1
    ) {
        List<Double> operands = new ArrayList<>();
        operands.add(op1);

        Operation op = new Operation();
        op.setName("sin");
        op.setOperands(operands);
        op.setResult(Math.sin(op1));
        return op;
    }

    @GET
    @Path("cos/{op1}")
    @Produces({MediaType.APPLICATION_JSON})
    public Operation cos(
            @PathParam("op1") Double op1
    ) {
        List<Double> operands = new ArrayList<>();
        operands.add(op1);

        Operation op = new Operation();
        op.setName("cos");
        op.setOperands(operands);
        op.setResult(Math.cos(op1));
        return op;
    }

    @GET
    @Path("tan/{op1}")
    @Produces({MediaType.APPLICATION_JSON})
    public Operation tan(
            @PathParam("op1") Double op1
    ) {
        List<Double> operands = new ArrayList<>();
        operands.add(op1);

        Operation op = new Operation();
        op.setName("tan");
        op.setOperands(operands);
        op.setResult(Math.tan(op1));
        return op;
    }

    /*
     ******************
     * EXPONENTIATION
     ******************
     */
    @GET
    @Path("log/{op1}")
    @Produces({MediaType.APPLICATION_JSON})
    public Operation log(
            @PathParam("op1") Double op1
    ) {
        List<Double> operands = new ArrayList<>();
        operands.add(op1);

        Operation op = new Operation();
        op.setName("log");
        op.setOperands(operands);
        op.setResult(Math.log(op1));
        return op;
    }

    @GET
    @Path("exp/{op1}")
    @Produces({MediaType.APPLICATION_JSON})
    public Operation exp(
            @PathParam("op1") Double op1
    ) {
        List<Double> operands = new ArrayList<>();
        operands.add(op1);

        Operation op = new Operation();
        op.setName("exp");
        op.setOperands(operands);
        op.setResult(Math.exp(op1));
        return op;
    }

    /*
     ******************
     * MEMORY
     ******************
     */
    @GET
    @Path("mread")
    @Produces({MediaType.APPLICATION_JSON})
    public Operation mread() {
        Operation op = new Operation();
        op.setName("mread");
        op.setResult(CalcResource.memory);
        return op;
    }

    @GET
    @Path("madd/{op1}")
    @Produces({MediaType.APPLICATION_JSON})
    public Operation madd(
            @PathParam("op1") Double op1
    ) {
        List<Double> operands = new ArrayList<>();
        operands.add(op1);

        Operation op = new Operation();
        op.setName("madd");
        op.setOperands(operands);
        CalcResource.memory += op1;
        op.setResult(CalcResource.memory);
        return op;
    }

    @GET
    @Path("msubtract/{op1}")
    @Produces({MediaType.APPLICATION_JSON})
    public Operation msubtract(
            @PathParam("op1") Double op1
    ) {
        List<Double> operands = new ArrayList<>();
        operands.add(op1);

        Operation op = new Operation();
        op.setName("msubtract");
        op.setOperands(operands);
        CalcResource.memory -= op1;
        op.setResult(CalcResource.memory);
        return op;
    }

    @GET
    @Path("mclear")
    @Produces({MediaType.APPLICATION_JSON})
    public Operation mclear() {
        Operation op = new Operation();
        op.setName("mclear");
        CalcResource.memory = 0.0d;
        op.setResult(CalcResource.memory);
        return op;
    }
}
