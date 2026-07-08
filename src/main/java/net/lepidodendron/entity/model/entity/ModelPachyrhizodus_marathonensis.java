package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPachyrhizodus_marathonensis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyend;
    private final AdvancedModelRenderer tailbase;
    private final AdvancedModelRenderer tailend;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer tailendbellyslope;
    private final AdvancedModelRenderer tailenddorsalslope;
    private final AdvancedModelRenderer tailbasebellyslope;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer tailbasedorsalslope;
    private final AdvancedModelRenderer dorsalfin3;
    private final AdvancedModelRenderer bodyenddorsalslope;
    private final AdvancedModelRenderer dorsalfin2;
    private final AdvancedModelRenderer bodyendbellyslope;
    private final AdvancedModelRenderer leftpelvicfin;
    private final AdvancedModelRenderer rightpelvicfin;
    private final AdvancedModelRenderer bodymiddlebellyslope;
    private final AdvancedModelRenderer bodymiddledorsalslope;
    private final AdvancedModelRenderer dorsalfin1;
    private final AdvancedModelRenderer bodyfrontdorsalslope;
    private final AdvancedModelRenderer bodyfrontbellyslope;
    private final AdvancedModelRenderer leftpectoralfin;
    private final AdvancedModelRenderer rightpectoralfin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer headslope;
    private final AdvancedModelRenderer headmiddle;
    private final AdvancedModelRenderer snoutfront;
    private final AdvancedModelRenderer mouthhingeleft;
    private final AdvancedModelRenderer leftupperteeth1;
    private final AdvancedModelRenderer leftupperteeth2;
    private final AdvancedModelRenderer mouthhingeright;
    private final AdvancedModelRenderer rightupperteeth1;
    private final AdvancedModelRenderer rightupperteeth2;
    private final AdvancedModelRenderer lefteyeportion;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer righteyeportion;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer upperfrontteeth;
    private final AdvancedModelRenderer headunderside;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer leftcheek;
    private final AdvancedModelRenderer rightcheek;
    private final AdvancedModelRenderer leftlowerfrontteeth;
    private final AdvancedModelRenderer leftlowerteeth;
    private final AdvancedModelRenderer rightlowerfrontteeth;
    private final AdvancedModelRenderer rightlowerteeth;
    private final AdvancedModelRenderer gillunderside;
    private final AdvancedModelRenderer leftgill;
    private final AdvancedModelRenderer rightgill;

    private ModelAnimator animator;

    public ModelPachyrhizodus_marathonensis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 16.5F, -2.0F);
        this.root.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0424F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 22, 52, -2.0F, -2.0F, -6.0F, 4, 6, 6, 0.02F, true));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(-0.01F, 0.0F, -0.5F);
        this.bodyfront.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, -0.1061F, 0.0F, 0.0F);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 0, 51, -1.99F, -2.5F, 0.0F, 4, 7, 6, -0.01F, true));

        this.bodyend = new AdvancedModelRenderer(this);
        this.bodyend.setRotationPoint(0.0F, 0.2F, 5.5F);
        this.bodymiddle.addChild(bodyend);
        this.setRotateAngle(bodyend, -0.0424F, 0.0F, 0.0F);
        this.bodyend.cubeList.add(new ModelBox(bodyend, 0, 41, -1.49F, -2.0F, 0.0F, 3, 5, 4, 0.01F, true));

        this.tailbase = new AdvancedModelRenderer(this);
        this.tailbase.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.bodyend.addChild(tailbase);
        this.tailbase.cubeList.add(new ModelBox(tailbase, 15, 49, -0.99F, -1.5F, 0.0F, 2, 3, 4, 0.01F, true));

        this.tailend = new AdvancedModelRenderer(this);
        this.tailend.setRotationPoint(0.0F, 0.0F, 3.7F);
        this.tailbase.addChild(tailend);
        this.tailend.cubeList.add(new ModelBox(tailend, 15, 42, -0.49F, -1.0F, 0.0F, 1, 2, 4, 0.01F, true));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, 0.0F, 3.9F);
        this.tailend.addChild(tailfin);
        this.setRotateAngle(tailfin, 0.1061F, 0.0F, 0.0F);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 39, 27, 0.0F, -5.0F, 0.0F, 0, 10, 5, 0.0F, true));

        this.tailendbellyslope = new AdvancedModelRenderer(this);
        this.tailendbellyslope.setRotationPoint(0.01F, 1.5F, 0.0F);
        this.tailend.addChild(tailendbellyslope);
        this.setRotateAngle(tailendbellyslope, 0.1274F, 0.0F, 0.0F);
        this.tailendbellyslope.cubeList.add(new ModelBox(tailendbellyslope, 9, 11, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tailenddorsalslope = new AdvancedModelRenderer(this);
        this.tailenddorsalslope.setRotationPoint(-0.01F, -1.5F, 0.0F);
        this.tailend.addChild(tailenddorsalslope);
        this.setRotateAngle(tailenddorsalslope, -0.1274F, 0.0F, 0.0F);
        this.tailenddorsalslope.cubeList.add(new ModelBox(tailenddorsalslope, 0, 9, -0.48F, 0.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tailbasebellyslope = new AdvancedModelRenderer(this);
        this.tailbasebellyslope.setRotationPoint(-0.01F, 3.0F, 0.0F);
        this.tailbase.addChild(tailbasebellyslope);
        this.setRotateAngle(tailbasebellyslope, 0.3609F, 0.0F, 0.0F);
        this.tailbasebellyslope.cubeList.add(new ModelBox(tailbasebellyslope, 0, 16, -0.98F, -2.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 0.0F, 1.8F);
        this.tailbasebellyslope.addChild(analfin);
        this.setRotateAngle(analfin, 0.743F, 0.0F, 0.0F);
        this.analfin.cubeList.add(new ModelBox(analfin, 29, 26, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tailbasedorsalslope = new AdvancedModelRenderer(this);
        this.tailbasedorsalslope.setRotationPoint(0.01F, -2.3F, 0.0F);
        this.tailbase.addChild(tailbasedorsalslope);
        this.setRotateAngle(tailbasedorsalslope, -0.2035F, 0.0F, 0.0F);
        this.tailbasedorsalslope.cubeList.add(new ModelBox(tailbasedorsalslope, 13, 17, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, true));

        this.dorsalfin3 = new AdvancedModelRenderer(this);
        this.dorsalfin3.setRotationPoint(0.0F, 0.3F, 0.0F);
        this.tailbasedorsalslope.addChild(dorsalfin3);
        this.setRotateAngle(dorsalfin3, -0.0848F, 0.0F, 0.0F);
        this.dorsalfin3.cubeList.add(new ModelBox(dorsalfin3, 35, 27, 0.0F, -1.0F, 0.0F, 0, 1, 4, 0.0F, true));

        this.bodyenddorsalslope = new AdvancedModelRenderer(this);
        this.bodyenddorsalslope.setRotationPoint(-0.01F, -2.9F, 0.0F);
        this.bodyend.addChild(bodyenddorsalslope);
        this.setRotateAngle(bodyenddorsalslope, -0.1485F, 0.0F, 0.0F);
        this.bodyenddorsalslope.cubeList.add(new ModelBox(bodyenddorsalslope, 15, 23, -1.48F, 0.0F, 0.0F, 3, 1, 4, 0.0F, true));

        this.dorsalfin2 = new AdvancedModelRenderer(this);
        this.dorsalfin2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodyenddorsalslope.addChild(dorsalfin2);
        this.setRotateAngle(dorsalfin2, -0.1061F, 0.0F, 0.0F);
        this.dorsalfin2.cubeList.add(new ModelBox(dorsalfin2, 35, 25, 0.0F, -1.0F, 0.0F, 0, 1, 4, 0.0F, true));

        this.bodyendbellyslope = new AdvancedModelRenderer(this);
        this.bodyendbellyslope.setRotationPoint(0.01F, 4.3F, 0.0F);
        this.bodyend.addChild(bodyendbellyslope);
        this.setRotateAngle(bodyendbellyslope, 0.3183F, 0.0F, 0.0F);
        this.bodyendbellyslope.cubeList.add(new ModelBox(bodyendbellyslope, 16, 29, -1.5F, -2.0F, 0.0F, 3, 2, 4, 0.0F, true));

        this.leftpelvicfin = new AdvancedModelRenderer(this);
        this.leftpelvicfin.setRotationPoint(-0.4F, 0.0F, 2.4F);
        this.bodyendbellyslope.addChild(leftpelvicfin);
        this.setRotateAngle(leftpelvicfin, 0.4245F, 0.0F, 0.3609F);
        this.leftpelvicfin.cubeList.add(new ModelBox(leftpelvicfin, 26, 22, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.rightpelvicfin = new AdvancedModelRenderer(this);
        this.rightpelvicfin.setRotationPoint(0.4F, 0.0F, 2.4F);
        this.bodyendbellyslope.addChild(rightpelvicfin);
        this.setRotateAngle(rightpelvicfin, 0.4245F, 0.0F, -0.3609F);
        this.rightpelvicfin.cubeList.add(new ModelBox(rightpelvicfin, 26, 19, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.bodymiddlebellyslope = new AdvancedModelRenderer(this);
        this.bodymiddlebellyslope.setRotationPoint(-0.01F, 4.5F, 6.0F);
        this.bodymiddle.addChild(bodymiddlebellyslope);
        this.setRotateAngle(bodymiddlebellyslope, 0.1698F, 0.0F, 0.0F);
        this.bodymiddlebellyslope.cubeList.add(new ModelBox(bodymiddlebellyslope, 0, 23, -1.98F, -2.0F, -6.0F, 4, 2, 6, -0.02F, true));

        this.bodymiddledorsalslope = new AdvancedModelRenderer(this);
        this.bodymiddledorsalslope.setRotationPoint(0.01F, -3.0F, 0.0F);
        this.bodymiddle.addChild(bodymiddledorsalslope);
        this.setRotateAngle(bodymiddledorsalslope, -0.0424F, 0.0F, 0.0F);
        this.bodymiddledorsalslope.cubeList.add(new ModelBox(bodymiddledorsalslope, 24, 44, -2.0F, 0.0F, 0.0F, 4, 1, 6, -0.02F, true));

        this.dorsalfin1 = new AdvancedModelRenderer(this);
        this.dorsalfin1.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.bodymiddledorsalslope.addChild(dorsalfin1);
        this.setRotateAngle(dorsalfin1, -0.3821F, 0.0F, 0.0F);
        this.dorsalfin1.cubeList.add(new ModelBox(dorsalfin1, 31, 29, 0.0F, -4.0F, 0.0F, 0, 4, 2, 0.0F, true));

        this.bodyfrontdorsalslope = new AdvancedModelRenderer(this);
        this.bodyfrontdorsalslope.setRotationPoint(-0.02F, -2.2F, -5.6F);
        this.bodyfront.addChild(bodyfrontdorsalslope);
        this.setRotateAngle(bodyfrontdorsalslope, 0.1274F, 0.0F, 0.0F);
        this.bodyfrontdorsalslope.cubeList.add(new ModelBox(bodyfrontdorsalslope, 22, 36, -1.98F, 0.0F, 0.0F, 4, 1, 6, 0.0F, true));

        this.bodyfrontbellyslope = new AdvancedModelRenderer(this);
        this.bodyfrontbellyslope.setRotationPoint(0.01F, 4.3F, -6.0F);
        this.bodyfront.addChild(bodyfrontbellyslope);
        this.setRotateAngle(bodyfrontbellyslope, -0.1911F, 0.0F, 0.0F);
        this.bodyfrontbellyslope.cubeList.add(new ModelBox(bodyfrontbellyslope, 0, 32, -2.01F, -2.0F, 0.0F, 4, 2, 6, 0.0F, true));

        this.leftpectoralfin = new AdvancedModelRenderer(this);
        this.leftpectoralfin.setRotationPoint(-1.95F, 3.5F, -5.9F);
        this.bodyfront.addChild(leftpectoralfin);
        this.setRotateAngle(leftpectoralfin, 0.658F, -0.1698F, 0.1485F);
        this.leftpectoralfin.cubeList.add(new ModelBox(leftpectoralfin, 38, 20, 0.0F, 0.0F, 0.0F, 0, 5, 3, 0.0F, true));

        this.rightpectoralfin = new AdvancedModelRenderer(this);
        this.rightpectoralfin.setRotationPoint(1.95F, 3.5F, -5.9F);
        this.bodyfront.addChild(rightpectoralfin);
        this.setRotateAngle(rightpectoralfin, 0.658F, 0.1698F, -0.1485F);
        this.rightpectoralfin.cubeList.add(new ModelBox(rightpectoralfin, 31, 19, 0.0F, 0.0F, 0.0F, 0, 5, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.01F, -0.3F, -6.0F);
        this.bodyfront.addChild(head);
        this.setRotateAngle(head, -0.0424F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 38, 0, -1.99F, -1.0F, -2.5F, 4, 5, 3, 0.01F, true));

        this.headslope = new AdvancedModelRenderer(this);
        this.headslope.setRotationPoint(0.02F, -0.7F, -4.4F);
        this.head.addChild(headslope);
        this.setRotateAngle(headslope, 0.2546F, 0.0F, 0.0F);
        this.headslope.cubeList.add(new ModelBox(headslope, 19, 0, -2.01F, 0.0F, 0.0F, 4, 1, 5, -0.01F, true));

        this.headmiddle = new AdvancedModelRenderer(this);
        this.headmiddle.setRotationPoint(-0.01F, -1.0F, -2.5F);
        this.head.addChild(headmiddle);
        this.setRotateAngle(headmiddle, 0.1698F, 0.0F, 0.0F);
        this.headmiddle.cubeList.add(new ModelBox(headmiddle, 51, 6, -1.98F, 0.0F, -2.0F, 4, 4, 2, 0.0F, true));

        this.snoutfront = new AdvancedModelRenderer(this);
        this.snoutfront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.headmiddle.addChild(snoutfront);
        this.setRotateAngle(snoutfront, 0.3609F, 0.0F, 0.0F);
        this.snoutfront.cubeList.add(new ModelBox(snoutfront, 42, 11, -1.48F, 0.0F, -3.0F, 3, 1, 3, 0.0F, true));

        this.mouthhingeleft = new AdvancedModelRenderer(this);
        this.mouthhingeleft.setRotationPoint(-0.52F, 0.5F, -2.95F);
        this.snoutfront.addChild(mouthhingeleft);
        this.setRotateAngle(mouthhingeleft, 0.3183F, 0.0F, 0.1698F);
        this.mouthhingeleft.cubeList.add(new ModelBox(mouthhingeleft, 28, 15, -1.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, true));

        this.leftupperteeth1 = new AdvancedModelRenderer(this);
        this.leftupperteeth1.setRotationPoint(-0.95F, 0.3F, 0.0F);
        this.mouthhingeleft.addChild(leftupperteeth1);
        this.setRotateAngle(leftupperteeth1, -0.3396F, 0.0F, 0.0F);
        this.leftupperteeth1.cubeList.add(new ModelBox(leftupperteeth1, 18, 1, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.leftupperteeth2 = new AdvancedModelRenderer(this);
        this.leftupperteeth2.setRotationPoint(-0.9F, 1.8F, -0.19F);
        this.mouthhingeleft.addChild(leftupperteeth2);
        this.setRotateAngle(leftupperteeth2, 0.0637F, 0.0F, -0.1698F);
        this.leftupperteeth2.cubeList.add(new ModelBox(leftupperteeth2, 21, 1, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.mouthhingeright = new AdvancedModelRenderer(this);
        this.mouthhingeright.setRotationPoint(0.52F, 0.5F, -2.95F);
        this.snoutfront.addChild(mouthhingeright);
        this.setRotateAngle(mouthhingeright, 0.3183F, 0.0F, -0.1698F);
        this.mouthhingeright.cubeList.add(new ModelBox(mouthhingeright, 23, 15, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, true));

        this.rightupperteeth1 = new AdvancedModelRenderer(this);
        this.rightupperteeth1.setRotationPoint(0.95F, 0.3F, 0.0F);
        this.mouthhingeright.addChild(rightupperteeth1);
        this.setRotateAngle(rightupperteeth1, -0.3396F, 0.0F, 0.0F);
        this.rightupperteeth1.cubeList.add(new ModelBox(rightupperteeth1, 32, 0, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.rightupperteeth2 = new AdvancedModelRenderer(this);
        this.rightupperteeth2.setRotationPoint(0.9F, 1.8F, -0.19F);
        this.mouthhingeright.addChild(rightupperteeth2);
        this.setRotateAngle(rightupperteeth2, 0.0637F, 0.0F, 0.1698F);
        this.rightupperteeth2.cubeList.add(new ModelBox(rightupperteeth2, 35, 0, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.lefteyeportion = new AdvancedModelRenderer(this);
        this.lefteyeportion.setRotationPoint(-0.5F, 0.3F, -1.0F);
        this.snoutfront.addChild(lefteyeportion);
        this.setRotateAngle(lefteyeportion, 0.0848F, -0.1061F, 0.1201F);
        this.lefteyeportion.cubeList.add(new ModelBox(lefteyeportion, 4, 1, -1.0F, 0.0F, -1.0F, 1, 4, 2, 0.0F, true));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(-0.7F, 0.75F, -0.25F);
        this.lefteyeportion.addChild(lefteye);
        this.setRotateAngle(lefteye, -0.5943F, -0.1061F, 0.1061F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 9, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.righteyeportion = new AdvancedModelRenderer(this);
        this.righteyeportion.setRotationPoint(0.5F, 0.3F, -1.0F);
        this.snoutfront.addChild(righteyeportion);
        this.setRotateAngle(righteyeportion, 0.0848F, 0.1061F, -0.1061F);
        this.righteyeportion.cubeList.add(new ModelBox(righteyeportion, 12, 1, 0.0F, 0.0F, -1.0F, 1, 4, 2, 0.0F, true));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(0.7F, 0.75F, -0.25F);
        this.righteyeportion.addChild(righteye);
        this.setRotateAngle(righteye, -0.5943F, 0.1061F, -0.1061F);
        this.righteye.cubeList.add(new ModelBox(righteye, 1, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.upperfrontteeth = new AdvancedModelRenderer(this);
        this.upperfrontteeth.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.snoutfront.addChild(upperfrontteeth);
        this.setRotateAngle(upperfrontteeth, -0.8491F, 0.0F, 0.0F);
        this.upperfrontteeth.cubeList.add(new ModelBox(upperfrontteeth, 17, 0, -1.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.headunderside = new AdvancedModelRenderer(this);
        this.headunderside.setRotationPoint(-0.01F, 4.7F, -2.6F);
        this.headmiddle.addChild(headunderside);
        this.setRotateAngle(headunderside, -0.1274F, 0.0F, 0.0F);
        this.headunderside.cubeList.add(new ModelBox(headunderside, 18, 7, -2.0F, -1.0F, 0.0F, 4, 1, 2, 0.0F, true));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(-0.01F, -0.4F, 0.4F);
        this.headunderside.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.743F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 41, 17, -1.46F, -0.5F, -4.0F, 3, 1, 4, -0.01F, true));

        this.leftcheek = new AdvancedModelRenderer(this);
        this.leftcheek.setRotationPoint(-1.4F, -0.5F, -2.3F);
        this.lowerjaw.addChild(leftcheek);
        this.setRotateAngle(leftcheek, 0.7217F, 0.2122F, 0.0F);
        this.leftcheek.cubeList.add(new ModelBox(leftcheek, 7, 5, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.rightcheek = new AdvancedModelRenderer(this);
        this.rightcheek.setRotationPoint(1.4F, -0.5F, -2.3F);
        this.lowerjaw.addChild(rightcheek);
        this.setRotateAngle(rightcheek, 0.7217F, -0.2122F, 0.0F);
        this.rightcheek.cubeList.add(new ModelBox(rightcheek, 16, 8, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.leftlowerfrontteeth = new AdvancedModelRenderer(this);
        this.leftlowerfrontteeth.setRotationPoint(-0.3F, 0.25F, -4.0F);
        this.lowerjaw.addChild(leftlowerfrontteeth);
        this.setRotateAngle(leftlowerfrontteeth, -0.1274F, -0.4458F, 0.0F);
        this.leftlowerfrontteeth.cubeList.add(new ModelBox(leftlowerfrontteeth, 0, 2, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.leftlowerteeth = new AdvancedModelRenderer(this);
        this.leftlowerteeth.setRotationPoint(-0.9F, 0.3F, -2.9F);
        this.lowerjaw.addChild(leftlowerteeth);
        this.setRotateAngle(leftlowerteeth, -0.1485F, -0.2122F, 0.0F);
        this.leftlowerteeth.cubeList.add(new ModelBox(leftlowerteeth, 0, 4, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.rightlowerfrontteeth = new AdvancedModelRenderer(this);
        this.rightlowerfrontteeth.setRotationPoint(0.3F, 0.25F, -4.0F);
        this.lowerjaw.addChild(rightlowerfrontteeth);
        this.setRotateAngle(rightlowerfrontteeth, -0.1274F, 0.4458F, 0.0F);
        this.rightlowerfrontteeth.cubeList.add(new ModelBox(rightlowerfrontteeth, 0, 6, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.rightlowerteeth = new AdvancedModelRenderer(this);
        this.rightlowerteeth.setRotationPoint(0.9F, 0.3F, -2.9F);
        this.lowerjaw.addChild(rightlowerteeth);
        this.setRotateAngle(rightlowerteeth, -0.1485F, 0.2122F, 0.0F);
        this.rightlowerteeth.cubeList.add(new ModelBox(rightlowerteeth, 0, 8, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.gillunderside = new AdvancedModelRenderer(this);
        this.gillunderside.setRotationPoint(-0.01F, 4.0F, -3.6F);
        this.head.addChild(gillunderside);
        this.setRotateAngle(gillunderside, -0.1485F, 0.0F, 0.0F);
        this.gillunderside.cubeList.add(new ModelBox(gillunderside, 27, 8, -1.98F, -1.0F, 0.0F, 4, 1, 4, -0.01F, true));

        this.leftgill = new AdvancedModelRenderer(this);
        this.leftgill.setRotationPoint(-1.0F, 1.8F, -2.4F);
        this.head.addChild(leftgill);
        this.setRotateAngle(leftgill, 0.0637F, -0.0848F, 0.0F);
        this.leftgill.cubeList.add(new ModelBox(leftgill, 33, 14, -1.0F, -2.0F, 0.0F, 1, 4, 3, 0.0F, true));

        this.rightgill = new AdvancedModelRenderer(this);
        this.rightgill.setRotationPoint(1.0F, 1.8F, -2.4F);
        this.head.addChild(rightgill);
        this.setRotateAngle(rightgill, 0.0637F, 0.0848F, 0.0F);
        this.rightgill.cubeList.add(new ModelBox(rightgill, 52, 13, 0.0F, -2.0F, 0.0F, 1, 4, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.8F;
        this.root.offsetX = 0.258F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(235);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 1.4F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.6F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetX = -0.14F;
        this.root.offsetY = -0.19F;
        this.root.offsetZ = 0.06F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.18F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.bodyend, this.tailbase, this.tailend, this.tailfin};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(root, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(leftpectoralfin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(leftpectoralfin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(rightpectoralfin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(rightpectoralfin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(leftpelvicfin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(leftpelvicfin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(rightpelvicfin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(rightpelvicfin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(270);
            this.root.offsetY = 1.4F;
            this.root.offsetX = -1.3F;
            this.bob(root, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.lowerjaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

