<nav class=" navbar-expand-lg  navbar navbar-dark bg-primary">
    <div class="container">
        <div class="row">
            <div class="col-sm-3">
                <a class="navbar-brand" href="/">Github View</a>
            </div>
            <div class="col-sm-9">
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <form method="get" action="/repoList" class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" id="filter" name="filter"
                           placeholder="Search repository" value="${filter!}" aria-label="Search">
                    <button class="btn btn-outline-primary bg-light my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </div>
    </div>
</nav>