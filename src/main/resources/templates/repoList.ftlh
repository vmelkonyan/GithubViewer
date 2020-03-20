<#import "parts/common.ftlh" as c>
<#import "parts/page.ftlh" as p>
<@c.page>
    <@p.pager url filter page />
    <div class="list-group">
        <#list page.content as repo>
            <div class="list-group-item ">
                <a href="/itemClicl?createDate=${repo.getCreatedAt()}&updateDate=${repo.getUpdatedAt()}&description=${repo.getDescription()}&owner=${repo.getOwnerDTO().getLogin()}"
                   class="list-group-item-action">
                    <div class="d-flex w-100 justify-content-between">
                        <h5 class="mb-1">${repo.getName()}</h5>
                    </div>
                    <#if repo.getDescription()??>
                        <#if repo.getDescription()?length &lt; 200>
                            <p class="mb-1">${repo.getDescription()}</p>
                        <#else>
                            <p class="mb-1">${repo.getDescription()?substring(0,200)}...</p>
                        </#if>
                    <#else >
                        <p class="mb-1">Empty message</p>
                    </#if>
                </a>
                <div class="mt-3 mb-3 d-flex w-100 justify-content-between">
                    <a href="/commiters?fullName=${repo.getFullName()}&defaultBranch=${repo.getDefaultBranch()}">List of
                        Commiters</a>
                    <a href="/commits?fullName=${repo.getFullName()}&defaultBranch=${repo.getDefaultBranch()}">Commits</a>
                    <a href="/issues?fullName=${repo.getFullName()}">Issues timeline</a>
                </div>
            </div>
        <#else >
            No data with this repository name
        </#list>
    </div>
    <@p.pager url filter page />

</@c.page>