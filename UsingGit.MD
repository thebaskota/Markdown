<!-- this will contain the git commands -->
# Getting started with Git

## GIT:

* Version Control Sytem
* Distributed (Not Centralized)
* Who made what changes, when (co-ordination between developers)
* Revert back
* Local and remote repos

## Concepts: 

* Tracks code's history
* Takes snapshot of your files, each time you commit
* Each snapshot can be visited
* Stage before you commit

---

# Basic commands: 

```bash

git init # initializes local git repo
git add <file> # add file(s) to index
git status # check status of working tree
git commit # commit changes to index

```

## Remote Repos commands: 

```bash

git push # push to remote repo
git pull # pull latest from remote repo
git clone # clone repository into a new directory

```
---
# Workshop:
## Goto project folder and open git bash and code there

``` bash

touch index.html # create index.html
touch app.js

#initialize git

git init

#adding name and email to git

git config --global user.name "Shubham"
git config --global user.email "abc@gmail.com"

#adding to staging area

git add index.html

#check staging area

git status

#removing from staging area

git rm --cached index.html

#variants

git add *.html # add all .html files to staging area 
git add . # all files to staging area

```
### Commiting:
```bash
git commit
```

Vim editor opens. 
Go in insert mode by pressing i.
Writesomething: like this
#means comment, so write:
initial commit #for first commit


Exit the vim editor by pressing: Esc to get out of insert mode. then :wq 

**Alternatively:**
``` bash
git commit -m "Changed index.html"
```
# gitignore for ignoring files
```bash
touch .gitignore
touch log.txt

```
* to ignore the folder or files just include them in gitignore *
Open gitignore and type the names
```
log.txt
/dir2
```

**Now log.txt ad dir2 will be ignored and wont be committed**

## Branches

```bash
git branch login  #creates a branch named login
git checkout login  #works on new branch now in editor and bash
git commit -m "Branch modified"

git checkout master
git status #changes made to login branch is not vsible from master
git merger login #merge master and branch login
```
---
## remote Repositories:
*Sign-in to Github
*Create anew repo
*copy ```git remote add origin '[link]' ``` and paste in bash. this adds remote repository
```bash
git remote #lists all the remote repository
origin

git push -u origin master
```
*sign in form appears , log in and reload the github page. Files will be added
* after this you can just follow simple steps:

```bash
touch readme.md
git add .
git push #no need for -u, origin and no need to log in again
```

### Cloning
Click on *Clone or download* dropdown in github and copy the link provided.

In new folder open bash and type the following :

```bash
git clone [paste the link provided]
```

### Pull

If someone else made the changes to your repo and you want to import the changed files, use pull

In original folder type:
```bash
git pull
already upto date # if no changes is found this message is recieved
```





