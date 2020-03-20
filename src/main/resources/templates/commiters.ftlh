<#import "parts/common.ftlh" as c>
<@c.page>
    List of committers
    <div class="list-group">
        <#list commiters as commiter>
            <div class="d-flex w-100 justify-content-between list-group-item ">
                <div class="row">
                    <#if commiter.getCommitterDTO()?? && commiter.getCommitterDTO().getAvatarUrl()??>
                        <img src="${commiter.getCommitterDTO().getAvatarUrl()}" class="img-thumbnail rounded float-left"
                             style="width: 100px;height: 100px">
                    <#else >
                        <img src="/img/avatar.jpg" class="img-thumbnail rounded float-left"
                             style="width: 100px;height: 100px">
                    </#if>
                </div>
                <div class="col-md-11 card-body">
                    <#if commiter.getCommitterDTO()??>
                        <h5 class="mb-1">${commiter.getCommitterDTO().getLogin()}</h5>
                        <small>${commiter.getCommitDTO().getCommitterDTO().getEmail()}</small>
                    <#else >
                        <h5 class="mb-1">${commiter.getCommitDTO().getCommitterDTO().getName()}</h5>
                        <small>${commiter.getCommitDTO().getCommitterDTO().getEmail()}</small>
                    </#if>
                </div>
            </div>
        </#list>
    </div>

</@c.page>