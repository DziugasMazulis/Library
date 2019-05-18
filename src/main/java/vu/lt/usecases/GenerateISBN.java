package vu.lt.usecases;

import vu.lt.services.ISBNGenerator;

import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@SessionScoped
@Named
public class GenerateISBN implements Serializable {
    @Inject
    ISBNGenerator isbnGenerator;

    private Future<Integer> isbnGenerationTask = null;

    public String generateISBN() {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        isbnGenerationTask = isbnGenerator.generateISBN();
        return  "/bookDetails.xhtml?faces-redirect=true&bookId=" + requestParameters.get("bookId");
    }

    public boolean isISBNGenerationRunning(){
        return isbnGenerationTask != null && !isbnGenerationTask.isDone();
    }

    public String getISBNGenerationStatus() throws ExecutionException, InterruptedException{
        if(isbnGenerationTask == null){
            return null;
        } else if (isISBNGenerationRunning()){
            return "Task in progress, please wait";
        }
        return "ISBN: " + isbnGenerationTask.get();
    }
}
