# ConsultAPI

This application shows how to query an API that is structured as an array of objects (JSON).

So far only the logic has been developed to consume the API, map the data, and bring it into the view without it being displayed in the view. The MVVM architecture has been used in conjunction with Retrofit and Gson.

For this example, I have consumed the API from [thedogapi.com](http://thedogapi.com) in its free version, which has [documentation](http://docs.thedogapi.com/) to guide us. I have protected the `apiKey` in the **local.properties** file, for which I will explain later how to configure it so that it can be used in this repository without it being see affected the variable.

## Protecting apiKey
1. Open the local.properties file found in Gradle Script
2. Add the apiKey variable and give it your own API KEY.






