package FactoryDemoApi;

public class DemoFactory {

    public Data getApi(String apiName) {
        if (apiName.equals("Api1"))
            return new DataApi1Impl();

        else if (apiName.equals("Api2"))
            return new DataApi2Impl();

        return null;
    }

}
