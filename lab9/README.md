### chain of responsibility

  Functional/Lambda approach can eliminate additional implementation of handler by using anonymous class,
  but it is not flexible that another class can use it. In Lambda approach, it is possible to add enchaned feature such as
  callback function when the handler want to pass the parameter back to the caller. For example, if it is a download handler, 
  whenever the download is completed, the image is passed back to the caller and do some preprocoessing and post postpreocessing.

