import java.util.*;

public class Syntax2 {
    public static void main(String[] args) {
        String[] lines = {"[{[[{(((<[{{((()<>)(<><>))[{{}{}}((){})]}[<<()[]>[{}()]>[{<>{}}<()()>]]}{{[[{}<>]({}{})]<[{}", "<[({(([<[[<([[(){}]<()()>])>[[(({})[<>()])]]]<[(({()[]})[{<>{}>(<>{})])<({<>()}[<>{}])(({}<>){()<>", "([{[([(((<<<{({}())<()[]>}<[[]()]{<>{}})>[{[[][]]{<><>}}]>>)[[[{{({}<>)([]<>)}}({(()[])<()[]>})](<[[()()]<{}", "(<([<<({<[[[([[]{})<()[]>)(<[]()>[{}<>])]<[{[]{}}<()[]>]<[<><>]>>]<{[({})[<>{}]]<[()[]](()<>)>}{((()", "{<({{<{<[<({([()<>]{<>[]})<<{}<>>>}((([]{})((){}))[[(){}](<>[])]))>][[<(<{()()>{{}[]}><{{}()}(()<>)>)", "{<([<<[<(<{<<(()[])[{}[]]>>(<{()[]}>({<>()}<[]()>))}>)>[{{{({<[]><(){}>]({{}[]}<{}<>>))<{<(){}><[]{}>}({<>{}}", "{[[([{<<{{(({{<>{}]<{}{}>}[<{}<>><()()>]))({({{}[]}<<>[]>)(<<>>{[][]})})}<[(({[]{}}[{}{}])<(<>())<(){", "[<(<[{[<{{[<[{{}}([][])]{({}{})(<>{}]}>{<(<>[])({}())>({[]<>}{[]()})}](<{[{}]<()[]>}<([][]){{}()}>>)}<<(<[()(", "<([[<{<{<[{[[{()}<[]>]]<(<[]()>)>}([([{}[]]<[]<>>)(<[][]><()<>))]{<<()[]>((){})>([{}<>]([]{}))})]{", "(<({[<((([<[{([]())<<><>>)](<{[]}[{}()]>[[{}<>]((){})])>{{{{{}<>}([][])}}}]{[(((<><>)<()()>)[([]<>", "<(([<(<{({{{<[()[]]<[]()>)[(<>)<<>>]}[[<(){}>[{}<>]]<[<>()]([]<>)>]}[<[{{}<>}([]{})]{[{}()]}>]})}>(({(", "<<(([[{{<[<[([()[]]<()[]>)<([][]){{}<>}>]<{[()[]]({}[])}<(<>[])>>>({<<[]()>{{}})}([<{}[]>[[]()]]))", "{{{<<[<[<<[<{(()[])[[]{}]}[[[]()]{{}<>}]>[{(<>)[<>()]}]]>(<{[[()<>]<{}[]>]({{}}[(){}])}{<<[]>(", "<([<<[{<[[{([([][])[{}()]][(<><>)[{}<>]])[(({}{}){{}<>})]}((({[][]}<()<>>)(({}{})[()<>])))][(<(({}<", "{[<{[([[{[{[<{()<>}<<>[]>>{{<>()}[<><>]}]}]([{([[][]](()()))<{[]<>}[()<>]>}{<<<>{}>{[]<>}>}))}([(<(((){}){(", "({<{[{[[{({<<(()<>){<>()}>(<()>{{}()})>({[[]()][{}]}{{<>{}]{{}[]}})})}]<{{[{[<<>[]>][(<>())<<>()>]}<{<{", "([(([[[{<({{{[()()]{<>{}}}}<[[[]<>][{}{}]]({()()}{()()})>}({[[(){}][[]{}]]{({}[])[{}()]}}{{[<><>]}", "((<[<{(({(<<[{()()>]<(<>)<[]<>>>><{<{}[]>([]())}{{[]()}<{}<>>}>>)}))}[{(<({{{([][])[(){}]}}<<<{}<>>{{}[]}>(<{", "{<[[([<([<{([([]{}){{}<>}]([[]{}]({}())))[[<{}[]>{{}<>)]{({}[])[[]]}]}(([[[]{}][<>[]]](({}[]){{}{}}))", "[<<[<[({<{([<<<>{}>(()[])><({}[])[{}<>]>]<[<[][]>{()[]}}<[{}()]>>)<<<(()[])>>>}{<{<<{}()>[[]()]>{[<>(", "<(<(<[({{<<[[{()<>}[{}<>]][[[]()](()<>)]]{[<()>([]<>)]<[{}{}]<{}{}>>}>([[(()()){(){}}]]<[<[][]>{[]", "<[{[{{{{<({[[({}{})][<{}{}>{[]{}}]]{[[()()]{<>[]}]<[<><>]<<><>>>}})>{({(<<()()>(<>{})>{(()[", "<[(([(<<(<{<(<{}<>>{{}{}})[[[][]]([]())]>{{<()>[<>{}]}({<><>}({}()))}}>[([{(<><>)[()()]}[[{}[", "<((<[{([{[([({{}<>}<[][]>)[<[]<>>(<>{})]])(({[{}[]][<><>]}[{()[]}<{}{}>]))]<<{(<[][]>[<>]][{()(", "((<[<<({{((<[(<>())[[]{}]]{{[][]}<<>>}>({<[]()>[[]{}]}[({}[])(()())])){({(<>[])[{}()]}[[{}{}>]){{[()<>]{", "{<<{{(({(<({({{}{}}<()<>>)}([[()[]]]))>)})[{([<<<<[]<>>>({()<>})>[[[{}<>]][(<><>)(<>[])]]>])}[(<<<{(", "{<[<{[<(([{[<<{}()>([]())>[{<>}{{}[]}]]}][{<[([]{})<()<>>]{{[]()>[{}[]]}>[<<<>()>[<>()]>{([]<>){[]()}}]}[", "<{{<{[<<[<<<(<{}[]><()[]>)<[()()]{()[]}>>{<<<>{}>{<>[]}>[<()()>{[]{}}]}><<{{[]{}}{{}{}}}>>>[{{{([]{})<{}[]>}}", "(<{(([[{[[[(<[{}()]<{}[]>>{<<>>({}{})})]]]{{{{(<[]>(())){<()[]>({}[])}}[[<(){}>[[]<>]]([{}{}]<[]{}>)]}}[<<{<[", "{{((({{[((((<<<>()><[]<>>>[[[]<>]<()()>])({(<>{})}[[{}<>]<{}[]>]))[<(([]())[{}<>])[<[]{}>({}<>)]>])[<[<", "{{((<([(([([([[]<>][{}<>])(([]()))])]<(((<[][]>{[]()})([{}{}]{<>()})))>))])[([{{[[[<[]{}>[<><>]]<[[]()]>]<(", "<(<[[((<[[{(<{[]{}}><[{}{}][{}[]]>)[<{[]()}[[]{})><[()<>]<{}()>>]}<[<{{}[]}{<>()}>{{<><>}{{}{}}", "{{[[<(<[<(<{[{[]}[{}<>]][((){})[()()]]}<([<>{}]{[]{}}){({}{})[<>]}>>{{{{<>[]}(())}{<{}{}><(){}>}}}", "(<<(([<[{<<[<(()[])>[{{}}([]<>)]][((()<>)<()<>>)<(<>){<>{}}>]>(<{[<>{}]<{}<>>}>)>}(([<<{<>[]}<<", "{[[{{([({<{{({{}()}<()[]>)[(<>{}){[]{}}]}}<(<{<><>}({}<>)><[{}()]<<>[]>>)>>{{<(<<>[]><{}[]>)>}[[<[[]", "[([{<<({<{<[<[[][]][{}{}]>({<><>})]<({<>{}})>><<<<<>[]>(()<>)>({()[]})>>}<([{<{}<>>{{}<>}}([<><>]{", "{[{({(([<[((<{[]()}{{}()}>{<()[]>[<>{}]})([[()[]]][{()()}([]{})])){(<{[]{}}[{}()]>[{<>[]}{{}()}]", "[{[{({[{{<(<<([]<>)[()[]]><<[]{}><<>{}>>>[([<>[]](()<>)}([{}{}](<>[]))])>[<(<[{}[]]><<<><>>[[]()]>)[{[()(", "[{<[<[[{{<{{((<>{})<[]{}>)(<<>[]>({}[]))}[<([]())<<><>>><<()<>>({}())>]}{<{[<>{}]}{([][]){[][]}}>({<[]{}>", "({<((<([{{[[(([])[[]])[[<>{}][[]]]][[[[][]}{{}<>}]([{}{}][()<>])]]{[<[[][]]({}())>{[{}<>][<><>]}]}}}", "{<<{({[[({{{<(<>())(<>{})>(({}[])(<>{}))}<<{[]{}}<[]>>>}{{(<<>{}><{}{}>)(<()()><[]()>)}{[({}", "<[{{([<[{[((<[(){}][<>[]]>(<{}()>[<>[]]})[[(<>){<>()}]])<(([[][]]<<>{}>)){<[<><>][<>[]]><({}())", "([(([((<<<{([{[]{}}])<[{()()}(()[])]{[()<>][<><>]}>>><{{[(()())<{}<>>]}(([[][]](<>[])))}((([", "[<(({{{(<({[[[()[]][()[]]]{[<><>]{[]<>}}>[([()()]([][]))[[{}{}]{[]{}}]]}{[[[<>][{}[]]]][{[<>()][()<", "[<[<<(([{{<<[((){})[<>{}]]{<[]()>}><{(()[])}((()[])[(){}])>>}}(({{[({}[])<()[]>]{[[][]]}}{(<<><>>)([(){}", "[{[[<(({{({[{<()<>>((){})}(({}{}))](<[()<>]({}{})><<<>{}>(<>())>)}{[<<<>()>{<><>}><(()[])<{}[]>>]))}<{[(", "<([[{{(([<<<<({}())([][])>[[[]{}]{[]<>}]>[{{()[]}<()[]>)[{{}[]}<[][]>]]>{<<[(){}](<>[])>[[{}[]]]>(", "[[[[({[{<{(<{[[]<>]<(){}>}([(){}>[{}{}])>[{[{}()]{(){}}}])}>}]<[<(<{[[[]()]<{}<>>](<[]><(){", "{(<[({{<<(<{{{{}{}}}<{<><>}<{}{}>>}<[<{}{}><()[]>]([{}[]]{<><>})>>)>>{[[([{<<><>>{()()}}<<<", "<[({<([{[{[({<{}{}><{}[]>})([<()()>{<><>}]([()[]]{{}[]})>]({<{()()}<[]()>>[{[]()}({}())]})", "<(([{(<([([([(()())[(){}]](<[]{}>[<><>]))(({()<>}<<>()>)(<{}[]>({}[])))][{[[[][]]](<<><>>)}", "<{{(<{<[{((((({})({}<>))(({}())(<>[]))){{{[][]}[(){}]}<({}<>)<{}<>>>})){<({[{}()]<[]<>>}((()[])(<>{", "{({({{{<((<{<{()[]}({}[])>{<{}<>>(()[])}}{([<>][[][]])}>)({({[<>()]<<>{}>}<[<>]([]{})>){([[]{", "{[<((({<([<({[<>](<>)}((<>[]))){[[()()][<>]](([]){{}{}})}>])(<[[[[{}()]][({}<>){<><>}]]{<[", "[<<<[(<<{({{<<()<>>({}{})><[<>[]]({}{})>}<{[(){}][(){}>}[[<>{}]{<>()}]>})[{[[[{}]<[]<>>][{(){}}]]<{[(", "[{((<[{<({[{<[[]<>][{}[]]>}[(([][])<<>()>){<{}{}>[{}()]}]][[{{()[]}<[]{}>}(({}<>)<{}[]>)]{<<[]<>><()()>}}]})>", "{[{{(<[{{{({{<{}{}><()>}[{[]()}{[]<>}]})}}[<{<[<{}()>[()[]]]<{{}<>}{[]}>>{(<{}{}><()()>)}}{{({[]()})([", "{<{{({([[<(<[<[]{}>{{}()}]<({}{}){(){}}>><([()()]<(){}>){([]())(()[])}>){([([]<>)]<{<><>}[()<>]>){{<[]<>>[(", "<[([(([[<[<[[<<>[]>[[]<>]]]<({[]<>}{<>{}})<[(){}]<[]<>>>>>[(<([]())>)[{[(){}](<>{})}<<[]<>>{<", "{<[(<<[{<(<<{({}{})[(){}]}{[{}[]]{[]()}}>{<<<>{}>{[]{}}>}>[<(<{}<>>){<(){}><{}<>>}>(<{<><>}{{}{}}><((){})", "([(<[(({{({[<([][])[(){}]>{[[]()]}]<[{[][]}{{}[]}](<[]<>>{{}{}])>})}}({[([{(()())[[][]]}<((){})", "{[<[(<<{([({{<{}[]>(<>)}<(<>())<<><>>>}{(([]<>){<>()})})((({<>}<<>[]>)[([]()){{}()}]){<{<>()}>})](<<<[{}[", "<((<[{[[[<<(<{()[]}(()[])>((<><>)[{}{}])){(<<>()>{[][]})[<[]{}><()[]>]}>[{<<()[]>([][])><{[]{}}", "[{{({[<<{[<<{(()()){{}{}}}<[{}[]]{[]{}}>>>({({(){}}[<><>])({{}{}}<{}()>)}[{({}<>)<{}()>}])](([({()", "<(({([<[{(([(({}[])([]()))<<()<>>{[]<>})]<<<[][]>>(<{}<>><[]<>>)>){<[{<>}[<>[]]]{<{}<>>{[]<>}}>[<[<>[]][<>", "([{<<[[[[([[<[[]]{<>[]}>{(()[])<(){}>}]<[<()[]>(<>())]({[]()}[[]()])>]<{<{()<>}<()[]>><<<>>{{}{}}>}>)", "({{<<({(([<{(([][])[()[]])}[[[()<>](())])><[([{}()][{}<>])<[[]{}](()<>)>]>]{(<<((){})<(){}>>({", "[(<([(<{{<[[[{{}<>}{<>{}}]({()<>}<()[]>)]{[<<>[]>[{}<>]]<[{}[]](()[])>}]>}<{<<{{{}[]}((){})}>}}<{<[{()()}[<", "{<<[({[{{{[[{(()())({})}][<<<>{}>([]())>]][(([{}()]{()[]}))<({<>[]}[{}()])>]}[<(<<<><>>[[]{}]>)<<", "<{{{(([[[(([<(()())({}<>)>({[]{}}{(){}})]({{()}<[]()>}([[]{}]{()[]})))({{{()[]}<[]<>>}<[<>()]<<>[]}>}[{<[][]>", "[(<{<(([([<<<{[]()}<{}>>)<<{<>{}}{[]}>{<<>()>{{}<>}}>>][{<{[{}[]]}(<<>()>)>[{(<><>)({}<>)}<", "[[<<<[({[[<<((<><>){<><>})[(<><>)[<>()]]>{<[{}]>}>]]}<{<([<{<>{}}<<>()>>({[]<>}{()()})]({<{}{}>{(){}}}>)>[[(<", "{({[([{[[([<((()[])(()[]))<<{}()>{()()}>>({({}[])}[[<>()}<{}[]>])]<([{()<>}{<>()}]([()](<>{})))<<((", "<[((([<[<({{(<<>()>[<>[]])(([]()){[]<>))}(({()[]}<(){}>)[[[]()]<<><>>])}{[{{{}<>}[<>{}]}][(([]<>)((){}))]}", "((<<[[[{((<<([[]<>][<>{}])[{<>{}}(()[])]>([{(){}}{{}<>}][({}{})([]())])>)<[{{{(){}}<[]{}>}(<[]<>>({}<>))", "[[[{({{[[<[<<<<><>>[[]<>]>[<[]<>><<>()>]>({{<>{}}})]{(<<<>{}>{{}{}}><(()[])[{}{}]>)}><<[{[()[]]{", "{[[{([[<<[[[{[()[]]{<>()}}({<><>})]{((<>[])[<>()])}]<(([[][]]<()[]>)){<({}<>)(<>{}}>{(<>{})(<><>)}}>]{([{[<><", "[([[<[<({[{(([()()]{{}[]})[([]())(()())])[{{[]()}[<>{}]}({{}[]}[<>()])]}]<([<({}[]){[]()}>(<()()>[()<>])][(", "<(<({{<(([[([[<>()]((){})]{(<>){<>[]}})[((<><>)({}{}))]]([<[{}[]]{[]<>}]][{<(){}><[]<>>}<[{}[", "{[[({<[[{[({<([][]){<>()}>}(<(()()){()<>}>{<<>{}>}))<{<<()[]><{}<>>><({}<>)({}())>}((({}{})", "(<(<({<<(<{[[<<>[]>({}{})][<[]()>{()()}]]}({{{<>[]}[<>{}]}({(){}}<()[]>)}}>)>{{{[({[[]()][[]{}]}(<<>[]>)){", "({{{<(({[{{{{[{}<>][()<>]}<{()<>}>}[[({}())<[]()>][[<>[]]({}())]]}[[([{}()]({}{}))<([]())>]<{<{}[]>", "[{([({<{(<[({{()()}(()<>)}(({}<>)<[]{}>)){([[][]]<(){}>)}]<<<<<>()><{}<>>>[((){})[[]{}]]><{<[]{}>>>>>)[(", "{[(<({[<{<{{<{<>()}({}[])>(<{}[]>[<>()])}[[<[]<>>({})]{<<>{}><()[]>}]}>}[{{<{([]())[()()]}([[][]][", "{[{{{{<<<{<(([[][]]){{[]{}}({}{})})[([()()]{[]()}){([]{})<{}[]>}]>[<(<[][]>{[]<>})[{{}()}(<>(", "<[({{([[([{({{{}{}}<{}[]>}([(){}][<>{}]))}<{<[<>[]][[]<>]>[([][])]}([(<>{})[[][]]])>][{[{([]{})[[]<", "<{{{<(([({{({<{}<>>[()()]}(([]){{}}))}}[(({{[]()}<{}<>>}[{[][]}<[]{}>])[<[()()](()())><(()){<>{}}>])[{<{[]<>}", "{(<[{{[((<[[[[()()]([][])]([<>{}][<>()])]]>))<{(<<<([]{}){(){}}><<{}>{[][]}>>>{{(<<>>[(){}])<[<>()]{", "{[{({{(<{({<({<>}<[][]>)([[]{}]{[][]})>[{(()())(()<>)}]][<[<()[]><{}{}>]({<>[]}<{}[]>)>[{<{}{}>[{}{", "[{<{<({<<{[<((()<>)[{}()]){(<><>)<()<>>}>{(([]<>)[[]<>])<{()}[<><>]>}]}({[{{{}<>}({}())>(<{}<>>{{}()})][<", "((<[{[[<[<(([(()[])<[]{}>](({}<>){<>[]}))<((()[])({}())){{()[]}[()<>]}>)[[((<>[])[<>()])[{{}<>}[{}{}]]]]><", "[{<({{(([([[<<()()><<><>>>[<()[]>([]<>)]]{[{()<>}]((()[]){{}{}})}])[({[([]<>)][[<>[]]<{}{}>]}{[[[]", "(<{(([{{<[([[<()<>>(<>)]<([])[(){}]>]){{[<[]<>>{{}{}}]}({[{}]}[{()[]}{{}<>}])}]>{<<{{<(){}>({}{}", "({{(<{{[[<{<[{{}{}}{<>[]}][(<>{}>(()<>)]>}[{<{{}<>}><{()<>}<[]()>>}]>({[{{{}{}}<{}{}>}(((){})[[]<>])]({<[][]>"};
        List<Long> completionScores = new ArrayList<>();
        for (String line: lines) {
            int brCount = 0;
            int sqCount = 0;
            int cuCount = 0;
            int anCount = 0;
            ArrayDeque<Integer> brStarts = new ArrayDeque<>();
            ArrayDeque<Integer> sqStarts = new ArrayDeque<>();
            ArrayDeque<Integer> cuStarts = new ArrayDeque<>();
            ArrayDeque<Integer> anStarts = new ArrayDeque<>();
            String completionStr = "";

            boolean invalid = false;
            innerLoop:
            for (int index = 0; index < line.length(); index++) {
                char ch = line.charAt(index);
                switch (ch) {
                    case '(':
                        completionStr = ")" + completionStr;
                        brStarts.push(index);
                        brCount++;
                        break;
                    case '[':
                        completionStr = "]" + completionStr;
                        sqStarts.push(index);
                        sqCount++;
                        break;
                    case '{':
                        completionStr = "}" + completionStr;
                        cuStarts.push(index);
                        cuCount++;
                        break;
                    case '<':
                        completionStr = ">" + completionStr;
                        anStarts.push(index);
                        anCount++;
                        break;
                    case ')':
                        brCount--;
                        int brStart = brStarts.pop();
                        if (brCount < 0 || sqStarts.peek() != null && sqStarts.peek() > brStart || cuStarts.peek() != null && cuStarts.peek() > brStart || anStarts.peek() != null && anStarts.peek() > brStart) {
                            invalid = true;
                            break innerLoop;
                        }
                        completionStr = completionStr.substring(1);
                        break;
                    case ']':
                        sqCount--;
                        int sqStart = sqStarts.pop();
                        if (sqCount < 0 || brStarts.peek() != null && brStarts.peek() > sqStart || cuStarts.peek() != null && cuStarts.peek() > sqStart || anStarts.peek() != null && anStarts.peek() > sqStart) {
                            invalid = true;
                            break innerLoop;
                        }
                        completionStr = completionStr.substring(1);
                        break;
                    case '}':
                        cuCount--;
                        int cuStart = cuStarts.pop();
                        if (cuCount < 0 || brStarts.peek() != null && brStarts.peek() > cuStart || sqStarts.peek() != null && sqStarts.peek() > cuStart || anStarts.peek() != null && anStarts.peek() > cuStart) {
                            invalid = true;
                            break innerLoop;
                        }
                        completionStr = completionStr.substring(1);
                        break;
                    case '>':
                        anCount--;
                        int anStart = anStarts.pop();
                        if (anCount < 0 || brStarts.peek() != null && brStarts.peek() > anStart || sqStarts.peek() != null && sqStarts.peek() > anStart || cuStarts.peek() != null && cuStarts.peek() > anStart) {
                            invalid = true;
                            break innerLoop;
                        }
                        completionStr = completionStr.substring(1);
                        break;
                }
            }

            // Incomplete
            /*
            ): 1 point.
            ]: 2 points.
            }: 3 points.
            >: 4 points.
             */
            if (!invalid) {
                long total = 0;
                for (char ch : completionStr.toCharArray()) {
                    total = total * 5 + (ch == ')' ? 1 : ch == ']' ? 2 : ch == '}' ? 3 : ch == '>' ? 4 : 0);
                }

                completionScores.add(total);
            }
        }

        Collections.sort(completionScores);
        System.out.println("Answer: " + completionScores.get(completionScores.size() / 2));
    }
}
