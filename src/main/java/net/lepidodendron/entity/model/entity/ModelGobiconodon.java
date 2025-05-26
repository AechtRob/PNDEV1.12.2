package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGobiconodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGobiconodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer eyeportion;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer frontteeth;
    private final AdvancedModelRenderer rightuppermiddleteeth;
    private final AdvancedModelRenderer leftuppermiddleteeth;
    private final AdvancedModelRenderer rightuppercheek;
    private final AdvancedModelRenderer leftuppercheek;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer rightupperbackteeth;
    private final AdvancedModelRenderer leftupperbackteeth;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer lowerjawmiddle;
    private final AdvancedModelRenderer lowerjawfront;
    private final AdvancedModelRenderer lowerjawfrontslope;
    private final AdvancedModelRenderer lowerfrontteeth;
    private final AdvancedModelRenderer rightlowermiddleteeth;
    private final AdvancedModelRenderer leftlowermiddleteeth;
    private final AdvancedModelRenderer lowerjawmiddleslope;
    private final AdvancedModelRenderer rightlowercheek;
    private final AdvancedModelRenderer leftlowercheek;
    private final AdvancedModelRenderer rightlowerbackteeth;
    private final AdvancedModelRenderer leftlowerbackteeth;
    private final AdvancedModelRenderer lowerjawbaseextra;
    private final AdvancedModelRenderer rightear;
    private final AdvancedModelRenderer leftear;
    private final AdvancedModelRenderer leftarm1;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer rightarm1;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightfoot;

    private ModelAnimator animator;

    public ModelGobiconodon() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 15.2F, 9.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.5095F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 33, 20, -3.5F, -2.5F, -6.0F, 7, 7, 9, 0.0F, false));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.0F, -0.8F, -4.9F);
        this.hips.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, 0.5519F, 0.0F, 0.0F);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 0, 0, -4.0F, -2.0F, -9.5F, 8, 9, 10, 0.0F, false));

        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 0.1F, -7.6F);
        this.bodymiddle.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.2546F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 20, -3.5F, -2.0F, -9.0F, 7, 7, 9, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -6.6F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, -0.5095F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 37, -2.0F, -2.0F, -5.5F, 4, 5, 7, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.2F, -4.6F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.6156F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 23, 37, -2.5F, -2.0F, -4.0F, 5, 3, 5, 0.0F, false));

        this.eyeportion = new AdvancedModelRenderer(this);
        this.eyeportion.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.head.addChild(eyeportion);
        this.setRotateAngle(eyeportion, 0.3183F, 0.0F, 0.0F);
        this.eyeportion.cubeList.add(new ModelBox(eyeportion, 56, 11, -1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.0F, -0.15F, -3.0F);
        this.eyeportion.addChild(snout);
        this.setRotateAngle(snout, -0.1911F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 41, 56, -1.0F, 0.0F, -2.0F, 2, 2, 3, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(0.0F, 0.0F, -1.3F);
        this.snout.addChild(nose);
        this.setRotateAngle(nose, -0.1061F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 22, 63, -0.5F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.frontteeth = new AdvancedModelRenderer(this);
        this.frontteeth.setRotationPoint(0.0F, 1.8F, -1.6F);
        this.snout.addChild(frontteeth);
        this.setRotateAngle(frontteeth, 0.743F, 0.0F, 0.0F);
        this.frontteeth.cubeList.add(new ModelBox(frontteeth, 59, 45, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.rightuppermiddleteeth = new AdvancedModelRenderer(this);
        this.rightuppermiddleteeth.setRotationPoint(0.55F, 1.4F, -0.3F);
        this.snout.addChild(rightuppermiddleteeth);
        this.setRotateAngle(rightuppermiddleteeth, 0.1698F, 0.1911F, 0.0F);
        this.rightuppermiddleteeth.cubeList.add(new ModelBox(rightuppermiddleteeth, 57, 53, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.leftuppermiddleteeth = new AdvancedModelRenderer(this);
        this.leftuppermiddleteeth.setRotationPoint(-0.55F, 1.4F, -0.3F);
        this.snout.addChild(leftuppermiddleteeth);
        this.setRotateAngle(leftuppermiddleteeth, 0.1698F, -0.1911F, 0.0F);
        this.leftuppermiddleteeth.cubeList.add(new ModelBox(leftuppermiddleteeth, 57, 53, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.rightuppercheek = new AdvancedModelRenderer(this);
        this.rightuppercheek.setRotationPoint(1.5F, 2.0F, -3.0F);
        this.eyeportion.addChild(rightuppercheek);
        this.setRotateAngle(rightuppercheek, -0.8278F, 0.0F, -0.0213F);
        this.rightuppercheek.cubeList.add(new ModelBox(rightuppercheek, 52, 56, 0.0F, -2.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.leftuppercheek = new AdvancedModelRenderer(this);
        this.leftuppercheek.setRotationPoint(-1.5F, 2.0F, -3.0F);
        this.eyeportion.addChild(leftuppercheek);
        this.setRotateAngle(leftuppercheek, -0.8278F, 0.0F, 0.0213F);
        this.leftuppercheek.cubeList.add(new ModelBox(leftuppercheek, 52, 56, 0.0F, -2.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(1.44F, 0.79F, -0.8F);
        this.eyeportion.addChild(righteye);
        this.setRotateAngle(righteye, -0.3183F, 0.4458F, -0.1911F);
        this.righteye.cubeList.add(new ModelBox(righteye, 61, 53, -1.5F, -0.5F, -1.0F, 2, 2, 2, 0.0F, false));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(-1.44F, 0.79F, -0.8F);
        this.eyeportion.addChild(lefteye);
        this.setRotateAngle(lefteye, -0.3183F, -0.4458F, 0.1911F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 61, 53, -0.5F, -0.5F, -1.0F, 2, 2, 2, 0.0F, true));

        this.rightupperbackteeth = new AdvancedModelRenderer(this);
        this.rightupperbackteeth.setRotationPoint(1.1F, 2.3F, -1.5F);
        this.eyeportion.addChild(rightupperbackteeth);
        this.setRotateAngle(rightupperbackteeth, -0.4033F, 0.2335F, 0.0F);
        this.rightupperbackteeth.cubeList.add(new ModelBox(rightupperbackteeth, 17, 50, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.leftupperbackteeth = new AdvancedModelRenderer(this);
        this.leftupperbackteeth.setRotationPoint(-1.1F, 2.3F, -1.5F);
        this.eyeportion.addChild(leftupperbackteeth);
        this.setRotateAngle(leftupperbackteeth, -0.4033F, -0.2335F, 0.0F);
        this.leftupperbackteeth.cubeList.add(new ModelBox(leftupperbackteeth, 17, 50, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.01F, 1.3F, -1.95F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 48, -1.99F, -1.5F, -2.0F, 4, 3, 4, 0.01F, false));

        this.lowerjawmiddle = new AdvancedModelRenderer(this);
        this.lowerjawmiddle.setRotationPoint(0.0F, 1.5F, -1.9F);
        this.jaw.addChild(lowerjawmiddle);
        this.setRotateAngle(lowerjawmiddle, -0.2122F, 0.0F, 0.0F);
        this.lowerjawmiddle.cubeList.add(new ModelBox(lowerjawmiddle, 59, 41, -1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.lowerjawfront = new AdvancedModelRenderer(this);
        this.lowerjawfront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.lowerjawmiddle.addChild(lowerjawfront);
        this.setRotateAngle(lowerjawfront, -0.1698F, 0.0F, 0.0F);
        this.lowerjawfront.cubeList.add(new ModelBox(lowerjawfront, 57, 48, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.lowerjawfrontslope = new AdvancedModelRenderer(this);
        this.lowerjawfrontslope.setRotationPoint(0.02F, -1.0F, -1.8F);
        this.lowerjawfront.addChild(lowerjawfrontslope);
        this.setRotateAngle(lowerjawfrontslope, 0.3396F, 0.0F, 0.0F);
        this.lowerjawfrontslope.cubeList.add(new ModelBox(lowerjawfrontslope, 41, 62, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.lowerfrontteeth = new AdvancedModelRenderer(this);
        this.lowerfrontteeth.setRotationPoint(0.0F, -0.7F, -3.0F);
        this.lowerjawfront.addChild(lowerfrontteeth);
        this.setRotateAngle(lowerfrontteeth, -0.5308F, 0.0F, 0.0F);
        this.lowerfrontteeth.cubeList.add(new ModelBox(lowerfrontteeth, 55, 63, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.rightlowermiddleteeth = new AdvancedModelRenderer(this);
        this.rightlowermiddleteeth.setRotationPoint(0.5F, -0.4F, -1.6F);
        this.lowerjawfront.addChild(rightlowermiddleteeth);
        this.setRotateAngle(rightlowermiddleteeth, -0.0424F, 0.1911F, 0.0F);
        this.rightlowermiddleteeth.cubeList.add(new ModelBox(rightlowermiddleteeth, 29, 63, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.leftlowermiddleteeth = new AdvancedModelRenderer(this);
        this.leftlowermiddleteeth.setRotationPoint(-0.48F, -0.4F, -1.6F);
        this.lowerjawfront.addChild(leftlowermiddleteeth);
        this.setRotateAngle(leftlowermiddleteeth, -0.0424F, -0.1911F, 0.0F);
        this.leftlowermiddleteeth.cubeList.add(new ModelBox(leftlowermiddleteeth, 29, 63, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.lowerjawmiddleslope = new AdvancedModelRenderer(this);
        this.lowerjawmiddleslope.setRotationPoint(0.02F, -1.0F, -2.0F);
        this.lowerjawmiddle.addChild(lowerjawmiddleslope);
        this.setRotateAngle(lowerjawmiddleslope, 0.2972F, 0.0F, 0.0F);
        this.lowerjawmiddleslope.cubeList.add(new ModelBox(lowerjawmiddleslope, 59, 37, -1.51F, -0.5F, 0.0F, 3, 1, 2, 0.001F, false));

        this.rightlowercheek = new AdvancedModelRenderer(this);
        this.rightlowercheek.setRotationPoint(1.48F, -0.5F, 0.0F);
        this.lowerjawmiddleslope.addChild(rightlowercheek);
        this.setRotateAngle(rightlowercheek, -0.5095F, 0.0F, 0.0F);
        this.rightlowercheek.cubeList.add(new ModelBox(rightlowercheek, 61, 58, 0.0F, -3.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.leftlowercheek = new AdvancedModelRenderer(this);
        this.leftlowercheek.setRotationPoint(-1.5F, -0.5F, 0.0F);
        this.lowerjawmiddleslope.addChild(leftlowercheek);
        this.setRotateAngle(leftlowercheek, -0.5095F, 0.0F, 0.0F);
        this.leftlowercheek.cubeList.add(new ModelBox(leftlowercheek, 61, 58, 0.0F, -3.0F, 0.0F, 0, 3, 3, 0.0F, true));

        this.rightlowerbackteeth = new AdvancedModelRenderer(this);
        this.rightlowerbackteeth.setRotationPoint(0.9F, -1.6F, -1.4F);
        this.lowerjawmiddle.addChild(rightlowerbackteeth);
        this.setRotateAngle(rightlowerbackteeth, 0.3609F, 0.1911F, 0.0F);
        this.rightlowerbackteeth.cubeList.add(new ModelBox(rightlowerbackteeth, 50, 63, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.leftlowerbackteeth = new AdvancedModelRenderer(this);
        this.leftlowerbackteeth.setRotationPoint(-0.88F, -1.6F, -1.4F);
        this.lowerjawmiddle.addChild(leftlowerbackteeth);
        this.setRotateAngle(leftlowerbackteeth, 0.3609F, -0.1911F, 0.0F);
        this.leftlowerbackteeth.cubeList.add(new ModelBox(leftlowerbackteeth, 50, 63, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, true));

        this.lowerjawbaseextra = new AdvancedModelRenderer(this);
        this.lowerjawbaseextra.setRotationPoint(0.01F, -1.5F, -2.0F);
        this.jaw.addChild(lowerjawbaseextra);
        this.setRotateAngle(lowerjawbaseextra, -0.4033F, 0.0F, 0.0F);
        this.lowerjawbaseextra.cubeList.add(new ModelBox(lowerjawbaseextra, 56, 17, -2.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.rightear = new AdvancedModelRenderer(this);
        this.rightear.setRotationPoint(2.4F, -0.3F, -0.5F);
        this.head.addChild(rightear);
        this.setRotateAngle(rightear, 0.6369F, 0.4882F, 0.1698F);
        this.rightear.cubeList.add(new ModelBox(rightear, 15, 63, 0.0F, -1.0F, -0.5F, 0, 2, 3, 0.0F, false));

        this.leftear = new AdvancedModelRenderer(this);
        this.leftear.setRotationPoint(-2.4F, -0.3F, -0.5F);
        this.head.addChild(leftear);
        this.setRotateAngle(leftear, 0.6369F, -0.4882F, -0.1698F);
        this.leftear.cubeList.add(new ModelBox(leftear, 15, 63, 0.0F, -1.0F, -0.5F, 0, 2, 3, 0.0F, true));

        this.leftarm1 = new AdvancedModelRenderer(this);
        this.leftarm1.setRotationPoint(3.5F, 2.8F, -7.5F);
        this.bodyfront.addChild(leftarm1);
        this.setRotateAngle(leftarm1, 0.8491F, 0.1911F, -0.3183F);
        this.leftarm1.cubeList.add(new ModelBox(leftarm1, 44, 37, -1.0F, -1.0F, -1.5F, 3, 6, 4, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.5F, 4.5F, 0.3F);
        this.leftarm1.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.5284F, 0.1274F, 0.1698F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 32, 56, -1.0F, -0.5F, -1.5F, 2, 6, 2, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.3396F, -0.1911F, 0.0F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 0, 50, -2.0F, -0.2F, -3.7F, 4, 1, 4, 0.0F, false));

        this.rightarm1 = new AdvancedModelRenderer(this);
        this.rightarm1.setRotationPoint(-3.5F, 2.8F, -7.5F);
        this.bodyfront.addChild(rightarm1);
        this.setRotateAngle(rightarm1, 0.8491F, -0.1911F, 0.3183F);
        this.rightarm1.cubeList.add(new ModelBox(rightarm1, 44, 37, -2.0F, -1.0F, -1.5F, 3, 6, 4, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.5F, 4.5F, 0.3F);
        this.rightarm1.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.5284F, -0.1274F, -0.1698F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 32, 56, -1.0F, -0.5F, -1.5F, 2, 6, 2, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.3396F, 0.1911F, 0.0F);
        this.righthand.cubeList.add(new ModelBox(righthand, 0, 50, -2.0F, -0.2F, -3.7F, 4, 1, 4, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.0F, 2.5F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.2546F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 23, 46, -1.5F, -1.0F, -0.3F, 3, 3, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1F, 4.2F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.3183F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 56, -1.0F, -0.7F, -0.3F, 2, 2, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.01F, 0.01F, 4.3F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2335F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 55, -1.0F, -0.7F, -0.1F, 2, 2, 5, 0.0F, false));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(3.3F, 0.5F, -0.5F);
        this.hips.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.4458F, -0.658F, -0.6156F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 37, 0, -1.5F, -1.5F, -1.5F, 4, 7, 5, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.5F, 4.8F, 0.0F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 1.2099F, 0.0F, 0.1911F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 56, 0, -1.0F, -0.5F, -0.5F, 2, 7, 3, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 6.2F, 1.2F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.0213F, 0.5095F, 0.0213F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 37, 13, -2.0F, -0.2F, -4.3F, 4, 1, 5, 0.0F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-3.3F, 0.5F, -0.5F);
        this.hips.addChild(rightleg1);
        this.setRotateAngle(rightleg1, -0.4458F, 0.658F, 0.6156F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 37, 0, -2.5F, -1.5F, -1.5F, 4, 7, 5, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.5F, 4.8F, 0.0F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 1.2099F, 0.0F, -0.1911F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 56, 0, -1.0F, -0.5F, -0.5F, 2, 7, 3, 0.0F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 6.2F, 1.2F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.0213F, -0.5095F, -0.0213F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 37, 13, -2.0F, -0.2F, -4.3F, 4, 1, 5, 0.0F, true));

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
        this.root.offsetY = -5.6F;
        this.root.offsetX = 0.4F;
        this.root.offsetZ = 3.0F;
        this.root.rotateAngleY = (float)Math.toRadians(130);
        this.root.rotateAngleX = (float)Math.toRadians(1);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 3.4F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.2F, 3.8F, -0.0F);
        this.setRotateAngle(neck, -0.2F, 0.2F, 0.0F);
        this.setRotateAngle(head, -0.2F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm1, 1.2F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm2, -1.2F, 0.0F, 0.0F);
        this.setRotateAngle(lefthand, 0.2F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = 0.2825F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraGobiconodon proteros = (EntityPrehistoricFloraGobiconodon) e;

        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION
                        && proteros.getAnimation() != proteros.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.nose.setScale(1,1,1);
        this.righteye.setScale(1,1,1);
        this.lefteye.setScale(1,1,1);
        EntityPrehistoricFloraGobiconodon ee = (EntityPrehistoricFloraGobiconodon) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The noise anim
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animStand(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGobiconodon entity = (EntityPrehistoricFloraGobiconodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 6.26094 + (((tickAnim - 0) / 10) * (5.60353-(6.26094)));
            yy = -11.53993 + (((tickAnim - 0) / 10) * (-10.0587-(-11.53993)));
            zz = 4.83709 + (((tickAnim - 0) / 10) * (8.3444-(4.83709)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.60353 + (((tickAnim - 10) / 10) * (6.26094-(5.60353)));
            yy = -10.0587 + (((tickAnim - 10) / 10) * (-11.53993-(-10.0587)));
            zz = 8.3444 + (((tickAnim - 10) / 10) * (4.83709-(8.3444)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = 6.26094 + (((tickAnim - 20) / 14) * (5.60353-(6.26094)));
            yy = -11.53993 + (((tickAnim - 20) / 14) * (-10.0587-(-11.53993)));
            zz = 4.83709 + (((tickAnim - 20) / 14) * (8.3444-(4.83709)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 5.60353 + (((tickAnim - 34) / 16) * (6.26094-(5.60353)));
            yy = -10.0587 + (((tickAnim - 34) / 16) * (-11.53993-(-10.0587)));
            zz = 8.3444 + (((tickAnim - 34) / 16) * (4.83709-(8.3444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.04079-(0)));
            yy = -16.75 + (((tickAnim - 0) / 10) * (-25.79085-(-16.75)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.89054-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.04079 + (((tickAnim - 10) / 10) * (0-(-2.04079)));
            yy = -25.79085 + (((tickAnim - 10) / 10) * (-16.75-(-25.79085)));
            zz = 4.89054 + (((tickAnim - 10) / 10) * (0-(4.89054)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 20) / 14) * (-2.04079-(0)));
            yy = -16.75 + (((tickAnim - 20) / 14) * (-25.79085-(-16.75)));
            zz = 0 + (((tickAnim - 20) / 14) * (4.89054-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -2.04079 + (((tickAnim - 34) / 16) * (0-(-2.04079)));
            yy = -25.79085 + (((tickAnim - 34) / 16) * (-16.75-(-25.79085)));
            zz = 4.89054 + (((tickAnim - 34) / 16) * (0-(4.89054)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -56.75 + (((tickAnim - 0) / 10) * (-5.5-(-56.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5.5 + (((tickAnim - 10) / 10) * (-56.75-(-5.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = -56.75 + (((tickAnim - 20) / 14) * (-5.5-(-56.75)));
            yy = 0 + (((tickAnim - 20) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 14) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 49) {
            xx = -5.5 + (((tickAnim - 34) / 15) * (-56.75-(-5.5)));
            yy = 0 + (((tickAnim - 34) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 1.875 + (((tickAnim - 0) / 20) * (1.875-(1.875)));
        }
        else if (tickAnim >= 20 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 20) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 29) * (0-(0)));
            zz = 1.875 + (((tickAnim - 20) / 29) * (1.875-(1.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm1.rotationPointX = this.leftarm1.rotationPointX + (float)(xx);
        this.leftarm1.rotationPointY = this.leftarm1.rotationPointY - (float)(yy);
        this.leftarm1.rotationPointZ = this.leftarm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 33.35976 + (((tickAnim - 0) / 10) * (55.10976-(33.35976)));
            yy = -14.8172 + (((tickAnim - 0) / 10) * (-14.8172-(-14.8172)));
            zz = -1.37209 + (((tickAnim - 0) / 10) * (-1.37209-(-1.37209)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 55.10976 + (((tickAnim - 10) / 5) * (-6.1526-(55.10976)));
            yy = -14.8172 + (((tickAnim - 10) / 5) * (-16.0608-(-14.8172)));
            zz = -1.37209 + (((tickAnim - 10) / 5) * (-2.00355-(-1.37209)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -6.1526 + (((tickAnim - 15) / 5) * (33.35976-(-6.1526)));
            yy = -16.0608 + (((tickAnim - 15) / 5) * (-14.8172-(-16.0608)));
            zz = -2.00355 + (((tickAnim - 15) / 5) * (-1.37209-(-2.00355)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = 33.35976 + (((tickAnim - 20) / 14) * (55.10976-(33.35976)));
            yy = -14.8172 + (((tickAnim - 20) / 14) * (-14.8172-(-14.8172)));
            zz = -1.37209 + (((tickAnim - 20) / 14) * (-1.37209-(-1.37209)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 55.10976 + (((tickAnim - 34) / 9) * (-6.1526-(55.10976)));
            yy = -14.8172 + (((tickAnim - 34) / 9) * (-16.0608-(-14.8172)));
            zz = -1.37209 + (((tickAnim - 34) / 9) * (-2.00355-(-1.37209)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -6.1526 + (((tickAnim - 43) / 7) * (33.35976-(-6.1526)));
            yy = -16.0608 + (((tickAnim - 43) / 7) * (-14.8172-(-16.0608)));
            zz = -2.00355 + (((tickAnim - 43) / 7) * (-1.37209-(-2.00355)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.775-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.7 + (((tickAnim - 10) / 5) * (0.075-(0.7)));
            zz = 0.775 + (((tickAnim - 10) / 5) * (0-(0.775)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.075 + (((tickAnim - 15) / 5) * (0-(0.075)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0.4-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0.775-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 0.4 + (((tickAnim - 28) / 6) * (0.9-(0.4)));
            zz = 0.775 + (((tickAnim - 28) / 6) * (0.825-(0.775)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            yy = 0.9 + (((tickAnim - 34) / 9) * (0-(0.9)));
            zz = 0.825 + (((tickAnim - 34) / 9) * (0.775-(0.825)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0.775 + (((tickAnim - 43) / 7) * (0-(0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 24.25 + (((tickAnim - 0) / 4) * (-5.6554-(24.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (-2.15836-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (8.40688-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -5.6554 + (((tickAnim - 4) / 6) * (75.5-(-5.6554)));
            yy = -2.15836 + (((tickAnim - 4) / 6) * (0-(-2.15836)));
            zz = 8.40688 + (((tickAnim - 4) / 6) * (0-(8.40688)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 75.5 + (((tickAnim - 10) / 5) * (74.38-(75.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 74.38 + (((tickAnim - 15) / 5) * (24.25-(74.38)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 24.25 + (((tickAnim - 20) / 8) * (-14.38606-(24.25)));
            yy = 0 + (((tickAnim - 20) / 8) * (-2.46338-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (10.70663-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -14.38606 + (((tickAnim - 28) / 6) * (75.5-(-14.38606)));
            yy = -2.46338 + (((tickAnim - 28) / 6) * (0-(-2.46338)));
            zz = 10.70663 + (((tickAnim - 28) / 6) * (0-(10.70663)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 75.5 + (((tickAnim - 34) / 9) * (74.38-(75.5)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 74.38 + (((tickAnim - 43) / 7) * (24.25-(74.38)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 1.4 + (((tickAnim - 0) / 10) * (1.825-(1.4)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.35-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.825 + (((tickAnim - 10) / 3) * (2.745-(1.825)));
            zz = -0.35 + (((tickAnim - 10) / 3) * (-0.685-(-0.35)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 2.745 + (((tickAnim - 13) / 2) * (1.525-(2.745)));
            zz = -0.685 + (((tickAnim - 13) / 2) * (-0.425-(-0.685)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 1.525 + (((tickAnim - 15) / 5) * (1.4-(1.525)));
            zz = -0.425 + (((tickAnim - 15) / 5) * (0-(-0.425)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 1.4 + (((tickAnim - 20) / 8) * (0.525-(1.4)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 0.525 + (((tickAnim - 28) / 6) * (1.825-(0.525)));
            zz = 0 + (((tickAnim - 28) / 6) * (-0.35-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 1.825 + (((tickAnim - 34) / 4) * (2.745-(1.825)));
            zz = -0.35 + (((tickAnim - 34) / 4) * (-0.26-(-0.35)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 2.745 + (((tickAnim - 38) / 5) * (1.525-(2.745)));
            zz = -0.26 + (((tickAnim - 38) / 5) * (-0.425-(-0.26)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.525 + (((tickAnim - 43) / 7) * (1.4-(1.525)));
            zz = -0.425 + (((tickAnim - 43) / 7) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);
        

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGobiconodon entity = (EntityPrehistoricFloraGobiconodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -12.5 + (((tickAnim - 15) / 20) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 35) / 15) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.35-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -2.35 + (((tickAnim - 15) / 20) * (-2.35-(-2.35)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -2.35 + (((tickAnim - 35) / 15) * (0-(-2.35)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7 + (((tickAnim - 15) / 20) * (7-(7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 35) / 15) * (0-(7)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7 + (((tickAnim - 15) / 20) * (7-(7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 35) / 15) * (0-(7)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(0), leftarm1.rotateAngleY + (float) Math.toRadians(0), leftarm1.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.725 + (((tickAnim - 15) / 20) * (0.725-(0.725)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.725 + (((tickAnim - 35) / 15) * (0-(0.725)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm1.rotationPointX = this.leftarm1.rotationPointX + (float)(xx);
        this.leftarm1.rotationPointY = this.leftarm1.rotationPointY - (float)(yy);
        this.leftarm1.rotationPointZ = this.leftarm1.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(0), lefthand.rotateAngleY + (float) Math.toRadians(0), lefthand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(0), rightarm1.rotateAngleY + (float) Math.toRadians(0), rightarm1.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.725 + (((tickAnim - 15) / 20) * (0.725-(0.725)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.725 + (((tickAnim - 35) / 15) * (0-(0.725)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm1.rotationPointX = this.rightarm1.rotationPointX + (float)(xx);
        this.rightarm1.rotationPointY = this.rightarm1.rotationPointY - (float)(yy);
        this.rightarm1.rotationPointZ = this.rightarm1.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(0), righthand.rotateAngleY + (float) Math.toRadians(0), righthand.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0.75 + (((tickAnim - 7) / 8) * (18.5-(0.75)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 18.5 + (((tickAnim - 15) / 20) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 18.5 + (((tickAnim - 35) / 15) * (0-(18.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -16.75 + (((tickAnim - 15) / 20) * (-16.75-(-16.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -16.75 + (((tickAnim - 35) / 15) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 24.75 + (((tickAnim - 15) / 20) * (24.75-(24.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 24.75 + (((tickAnim - 35) / 15) * (0-(24.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.70317-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.6172-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.57982-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0.70317 + (((tickAnim - 15) / 20) * (0.70317-(0.70317)));
            yy = -3.6172 + (((tickAnim - 15) / 20) * (-3.6172-(-3.6172)));
            zz = -2.57982 + (((tickAnim - 15) / 20) * (-2.57982-(-2.57982)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0.70317 + (((tickAnim - 35) / 15) * (0-(0.70317)));
            yy = -3.6172 + (((tickAnim - 35) / 15) * (0-(-3.6172)));
            zz = -2.57982 + (((tickAnim - 35) / 15) * (0-(-2.57982)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -16.75 + (((tickAnim - 15) / 20) * (-16.75-(-16.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -16.75 + (((tickAnim - 35) / 15) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 24.75 + (((tickAnim - 15) / 20) * (24.75-(24.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 24.75 + (((tickAnim - 35) / 15) * (0-(24.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.70317-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (3.6172-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.5798-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0.70317 + (((tickAnim - 15) / 20) * (0.70317-(0.70317)));
            yy = 3.6172 + (((tickAnim - 15) / 20) * (3.6172-(3.6172)));
            zz = 2.5798 + (((tickAnim - 15) / 20) * (2.5798-(2.5798)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0.70317 + (((tickAnim - 35) / 15) * (0-(0.70317)));
            yy = 3.6172 + (((tickAnim - 35) / 15) * (0-(3.6172)));
            zz = 2.5798 + (((tickAnim - 35) / 15) * (0-(2.5798)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGobiconodon entity = (EntityPrehistoricFloraGobiconodon) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2.47562-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.31301-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.12763-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -2.47562 + (((tickAnim - 8) / 5) * (7.77438-(-2.47562)));
            yy = -1.31301 + (((tickAnim - 8) / 5) * (-1.31301-(-1.31301)));
            zz = -2.12763 + (((tickAnim - 8) / 5) * (-2.12763-(-2.12763)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 7.77438 + (((tickAnim - 13) / 5) * (-1.97562-(7.77438)));
            yy = -1.31301 + (((tickAnim - 13) / 5) * (-1.31301-(-1.31301)));
            zz = -2.12763 + (((tickAnim - 13) / 5) * (0-(-2.12763)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -1.97562 + (((tickAnim - 18) / 4) * (0-(-1.97562)));
            yy = -1.31301 + (((tickAnim - 18) / 4) * (0-(-1.31301)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -21.75 + (((tickAnim - 8) / 5) * (-29-(-21.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -29 + (((tickAnim - 13) / 5) * (-21-(-29)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -21 + (((tickAnim - 18) / 4) * (0-(-21)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0.425 + (((tickAnim - 8) / 14) * (0-(0.425)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (30.25-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 30.25 + (((tickAnim - 8) / 5) * (0-(30.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (32.5-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 32.5 + (((tickAnim - 18) / 4) * (0-(32.5)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -24.75 + (((tickAnim - 8) / 5) * (-17-(-24.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -17 + (((tickAnim - 13) / 5) * (-24.75-(-17)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -24.75 + (((tickAnim - 18) / 4) * (0-(-24.75)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightear, rightear.rotateAngleX + (float) Math.toRadians(xx), rightear.rotateAngleY + (float) Math.toRadians(yy), rightear.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -31.25 + (((tickAnim - 8) / 5) * (-17-(-31.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -17 + (((tickAnim - 13) / 5) * (-24.75-(-17)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -24.75 + (((tickAnim - 18) / 4) * (0-(-24.75)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftear, leftear.rotateAngleX + (float) Math.toRadians(xx), leftear.rotateAngleY + (float) Math.toRadians(yy), leftear.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGobiconodon entity = (EntityPrehistoricFloraGobiconodon) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 6.75 + (((tickAnim - 3) / 4) * (-1.75-(6.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -1.75 + (((tickAnim - 7) / 2) * (-7.5-(-1.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -7.5 + (((tickAnim - 9) / 3) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -20 + (((tickAnim - 3) / 4) * (-30.25-(-20)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -30.25 + (((tickAnim - 7) / 2) * (-11-(-30.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -11 + (((tickAnim - 9) / 3) * (0-(-11)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (-0.425-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = -0.425 + (((tickAnim - 7) / 2) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 4.75 + (((tickAnim - 3) / 4) * (37.25-(4.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 37.25 + (((tickAnim - 7) / 2) * (0-(37.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-29-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -29 + (((tickAnim - 3) / 4) * (-29-(-29)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -29 + (((tickAnim - 7) / 2) * (0-(-29)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightear, rightear.rotateAngleX + (float) Math.toRadians(xx), rightear.rotateAngleY + (float) Math.toRadians(yy), rightear.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -29.5 + (((tickAnim - 3) / 4) * (-29.5-(-29.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -29.5 + (((tickAnim - 7) / 2) * (0-(-29.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftear, leftear.rotateAngleX + (float) Math.toRadians(xx), leftear.rotateAngleY + (float) Math.toRadians(yy), leftear.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGobiconodon entity = (EntityPrehistoricFloraGobiconodon) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 16.25 + (((tickAnim - 8) / 7) * (0-(16.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (23.5665-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (2.91986-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-3.59302-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 23.5665 + (((tickAnim - 4) / 4) * (4.13299-(23.5665)));
            yy = 2.91986 + (((tickAnim - 4) / 4) * (5.83973-(2.91986)));
            zz = -3.59302 + (((tickAnim - 4) / 4) * (-7.18604-(-3.59302)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.13299 + (((tickAnim - 8) / 2) * (17.34974-(4.13299)));
            yy = 5.83973 + (((tickAnim - 8) / 2) * (4.3798-(5.83973)));
            zz = -7.18604 + (((tickAnim - 8) / 2) * (-5.38953-(-7.18604)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 17.34974 + (((tickAnim - 10) / 5) * (0-(17.34974)));
            yy = 4.3798 + (((tickAnim - 10) / 5) * (0-(4.3798)));
            zz = -5.38953 + (((tickAnim - 10) / 5) * (0-(-5.38953)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (35.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 35.75 + (((tickAnim - 8) / 2) * (0-(35.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGobiconodon entity = (EntityPrehistoricFloraGobiconodon) entitylivingbaseIn;
        int animCycle = 95;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0.25 + (((tickAnim - 8) / 12) * (-2.25-(0.25)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 78) {
            xx = -2.25 + (((tickAnim - 20) / 58) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 20) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 58) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = -2.25 + (((tickAnim - 78) / 17) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -0.5 + (((tickAnim - 8) / 12) * (2.75-(-0.5)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 78) {
            xx = 2.75 + (((tickAnim - 20) / 58) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 20) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 58) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = 2.75 + (((tickAnim - 78) / 17) * (0-(2.75)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 44) {
            xx = -13.75 + (((tickAnim - 15) / 29) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 15) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 29) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 51) {
            xx = -13.75 + (((tickAnim - 44) / 7) * (-13.68064-(-13.75)));
            yy = 0 + (((tickAnim - 44) / 7) * (7.50648-(0)));
            zz = 0 + (((tickAnim - 44) / 7) * (-2.20671-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 58) {
            xx = -13.68064 + (((tickAnim - 51) / 7) * (-13.68064-(-13.68064)));
            yy = 7.50648 + (((tickAnim - 51) / 7) * (7.50648-(7.50648)));
            zz = -2.20671 + (((tickAnim - 51) / 7) * (-2.20671-(-2.20671)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = -13.68064 + (((tickAnim - 58) / 20) * (-13.68064-(-13.68064)));
            yy = 7.50648 + (((tickAnim - 58) / 20) * (7.50648-(7.50648)));
            zz = -2.20671 + (((tickAnim - 58) / 20) * (-2.20671-(-2.20671)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = -13.68064 + (((tickAnim - 78) / 17) * (0-(-13.68064)));
            yy = 7.50648 + (((tickAnim - 78) / 17) * (0-(7.50648)));
            zz = -2.20671 + (((tickAnim - 78) / 17) * (0-(-2.20671)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.75 + (((tickAnim - 15) / 5) * (-6.75-(-2.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -6.75 + (((tickAnim - 20) / 4) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -6.75 + (((tickAnim - 24) / 3) * (-5.75-(-6.75)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -5.75 + (((tickAnim - 27) / 2) * (-6.75-(-5.75)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -6.75 + (((tickAnim - 29) / 3) * (-5.75-(-6.75)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -5.75 + (((tickAnim - 32) / 2) * (-6.75-(-5.75)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -6.75 + (((tickAnim - 34) / 10) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -6.75 + (((tickAnim - 44) / 4) * (-6.0867-(-6.75)));
            yy = 0 + (((tickAnim - 44) / 4) * (8.74269-(0)));
            zz = 0 + (((tickAnim - 44) / 4) * (8.60806-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = -6.0867 + (((tickAnim - 48) / 3) * (-4.8367-(-6.0867)));
            yy = 8.74269 + (((tickAnim - 48) / 3) * (8.74269-(8.74269)));
            zz = 8.60806 + (((tickAnim - 48) / 3) * (8.60806-(8.60806)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = -4.8367 + (((tickAnim - 51) / 4) * (-6.0867-(-4.8367)));
            yy = 8.74269 + (((tickAnim - 51) / 4) * (8.74269-(8.74269)));
            zz = 8.60806 + (((tickAnim - 51) / 4) * (8.60806-(8.60806)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -6.0867 + (((tickAnim - 55) / 3) * (-5.8367-(-6.0867)));
            yy = 8.74269 + (((tickAnim - 55) / 3) * (8.74269-(8.74269)));
            zz = 8.60806 + (((tickAnim - 55) / 3) * (8.60806-(8.60806)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = -5.8367 + (((tickAnim - 58) / 3) * (-6.0867-(-5.8367)));
            yy = 8.74269 + (((tickAnim - 58) / 3) * (8.74269-(8.74269)));
            zz = 8.60806 + (((tickAnim - 58) / 3) * (8.60806-(8.60806)));
        }
        else if (tickAnim >= 61 && tickAnim < 65) {
            xx = -6.0867 + (((tickAnim - 61) / 4) * (-5.8367-(-6.0867)));
            yy = 8.74269 + (((tickAnim - 61) / 4) * (8.74269-(8.74269)));
            zz = 8.60806 + (((tickAnim - 61) / 4) * (8.60806-(8.60806)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = -5.8367 + (((tickAnim - 65) / 13) * (-5.8367-(-5.8367)));
            yy = 8.74269 + (((tickAnim - 65) / 13) * (8.74269-(8.74269)));
            zz = 8.60806 + (((tickAnim - 65) / 13) * (8.60806-(8.60806)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = -5.8367 + (((tickAnim - 78) / 17) * (0-(-5.8367)));
            yy = 8.74269 + (((tickAnim - 78) / 17) * (0-(8.74269)));
            zz = 8.60806 + (((tickAnim - 78) / 17) * (0-(8.60806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = -0.025 + (((tickAnim - 27) / 2) * (0-(-0.025)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = -0.025 + (((tickAnim - 32) / 2) * (0-(-0.025)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 34) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 14) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            yy = -0.025 + (((tickAnim - 50) / 3) * (0-(-0.025)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 2) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            yy = -0.025 + (((tickAnim - 55) / 3) * (0-(-0.025)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 2) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            yy = -0.025 + (((tickAnim - 60) / 3) * (0-(-0.025)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 2) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            yy = -0.025 + (((tickAnim - 65) / 3) * (0-(-0.025)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.nose.rotationPointX = this.nose.rotationPointX + (float)(xx);
        this.nose.rotationPointY = this.nose.rotationPointY - (float)(yy);
        this.nose.rotationPointZ = this.nose.rotationPointZ + (float)(zz);


        if (tickAnim >= 24 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 24) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 24) / 3) * (0.8875-(1)));
            zz = 1 + (((tickAnim - 24) / 3) * (1-(1)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 1 + (((tickAnim - 27) / 2) * (1-(1)));
            yy = 0.8875 + (((tickAnim - 27) / 2) * (1-(0.8875)));
            zz = 1 + (((tickAnim - 27) / 2) * (1-(1)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 29) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 29) / 3) * (0.98-(1)));
            zz = 1 + (((tickAnim - 29) / 3) * (1-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 1 + (((tickAnim - 32) / 2) * (1-(1)));
            yy = 0.98 + (((tickAnim - 32) / 2) * (1-(0.98)));
            zz = 1 + (((tickAnim - 32) / 2) * (1-(1)));
        }
        else if (tickAnim >= 34 && tickAnim < 48) {
            xx = 1 + (((tickAnim - 34) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 34) / 14) * (1-(1)));
            zz = 1 + (((tickAnim - 34) / 14) * (1-(1)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 48) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 48) / 2) * (0.98-(1)));
            zz = 1 + (((tickAnim - 48) / 2) * (1-(1)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 1 + (((tickAnim - 50) / 3) * (1-(1)));
            yy = 0.98 + (((tickAnim - 50) / 3) * (1-(0.98)));
            zz = 1 + (((tickAnim - 50) / 3) * (1-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 53) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 53) / 2) * (0.98-(1)));
            zz = 1 + (((tickAnim - 53) / 2) * (1-(1)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 1 + (((tickAnim - 55) / 3) * (1-(1)));
            yy = 0.98 + (((tickAnim - 55) / 3) * (1-(0.98)));
            zz = 1 + (((tickAnim - 55) / 3) * (1-(1)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 58) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 58) / 2) * (0.98-(1)));
            zz = 1 + (((tickAnim - 58) / 2) * (1-(1)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 1 + (((tickAnim - 60) / 3) * (1-(1)));
            yy = 0.98 + (((tickAnim - 60) / 3) * (1-(0.98)));
            zz = 1 + (((tickAnim - 60) / 3) * (1-(1)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 1 + (((tickAnim - 63) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 63) / 2) * (0.98-(1)));
            zz = 1 + (((tickAnim - 63) / 2) * (1-(1)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 1 + (((tickAnim - 65) / 3) * (1-(1)));
            yy = 0.98 + (((tickAnim - 65) / 3) * (1-(0.98)));
            zz = 1 + (((tickAnim - 65) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.nose.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24.66664-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (19.2877-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-11.4183-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 44) {
            xx = 24.66664 + (((tickAnim - 15) / 29) * (24.66664-(24.66664)));
            yy = 19.2877 + (((tickAnim - 15) / 29) * (19.2877-(19.2877)));
            zz = -11.4183 + (((tickAnim - 15) / 29) * (-11.4183-(-11.4183)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 24.66664 + (((tickAnim - 44) / 4) * (33.85628-(24.66664)));
            yy = 19.2877 + (((tickAnim - 44) / 4) * (-14.7466-(19.2877)));
            zz = -11.4183 + (((tickAnim - 44) / 4) * (-5.93321-(-11.4183)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 33.85628 + (((tickAnim - 48) / 3) * (24.66664-(33.85628)));
            yy = -14.7466 + (((tickAnim - 48) / 3) * (19.2877-(-14.7466)));
            zz = -5.93321 + (((tickAnim - 48) / 3) * (-11.4183-(-5.93321)));
        }
        else if (tickAnim >= 51 && tickAnim < 78) {
            xx = 24.66664 + (((tickAnim - 51) / 27) * (24.66664-(24.66664)));
            yy = 19.2877 + (((tickAnim - 51) / 27) * (19.2877-(19.2877)));
            zz = -11.4183 + (((tickAnim - 51) / 27) * (-11.4183-(-11.4183)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = 24.66664 + (((tickAnim - 78) / 17) * (0-(24.66664)));
            yy = 19.2877 + (((tickAnim - 78) / 17) * (0-(19.2877)));
            zz = -11.4183 + (((tickAnim - 78) / 17) * (0-(-11.4183)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightear, rightear.rotateAngleX + (float) Math.toRadians(xx), rightear.rotateAngleY + (float) Math.toRadians(yy), rightear.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24.66664-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-19.2877-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (11.4183-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 44) {
            xx = 24.66664 + (((tickAnim - 15) / 29) * (24.66664-(24.66664)));
            yy = -19.2877 + (((tickAnim - 15) / 29) * (-19.2877-(-19.2877)));
            zz = 11.4183 + (((tickAnim - 15) / 29) * (11.4183-(11.4183)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 24.66664 + (((tickAnim - 44) / 4) * (24.66664-(24.66664)));
            yy = -19.2877 + (((tickAnim - 44) / 4) * (19.2877-(-19.2877)));
            zz = 11.4183 + (((tickAnim - 44) / 4) * (-11.4183-(11.4183)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 24.66664 + (((tickAnim - 48) / 3) * (24.66664-(24.66664)));
            yy = 19.2877 + (((tickAnim - 48) / 3) * (-19.2877-(19.2877)));
            zz = -11.4183 + (((tickAnim - 48) / 3) * (11.4183-(-11.4183)));
        }
        else if (tickAnim >= 51 && tickAnim < 78) {
            xx = 24.66664 + (((tickAnim - 51) / 27) * (24.66664-(24.66664)));
            yy = -19.2877 + (((tickAnim - 51) / 27) * (-19.2877-(-19.2877)));
            zz = 11.4183 + (((tickAnim - 51) / 27) * (11.4183-(11.4183)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = 24.66664 + (((tickAnim - 78) / 17) * (0-(24.66664)));
            yy = -19.2877 + (((tickAnim - 78) / 17) * (0-(-19.2877)));
            zz = 11.4183 + (((tickAnim - 78) / 17) * (0-(11.4183)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftear, leftear.rotateAngleX + (float) Math.toRadians(xx), leftear.rotateAngleY + (float) Math.toRadians(yy), leftear.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-7-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 78) {
            xx = -7 + (((tickAnim - 20) / 58) * (-7-(-7)));
            yy = 0 + (((tickAnim - 20) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 58) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = -7 + (((tickAnim - 78) / 17) * (0-(-7)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (9.25-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 78) {
            xx = 9.25 + (((tickAnim - 20) / 58) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 20) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 58) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = 9.25 + (((tickAnim - 78) / 17) * (0-(9.25)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(0), lefthand.rotateAngleY + (float) Math.toRadians(0), lefthand.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-41-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 78) {
            xx = -41 + (((tickAnim - 20) / 58) * (-41-(-41)));
            yy = 0 + (((tickAnim - 20) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 58) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = -41 + (((tickAnim - 78) / 17) * (0-(-41)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.525-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 20) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 58) * (0-(0)));
            zz = 1.525 + (((tickAnim - 20) / 58) * (1.525-(1.525)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 1.525 + (((tickAnim - 78) / 17) * (0-(1.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm1.rotationPointX = this.rightarm1.rotationPointX + (float)(xx);
        this.rightarm1.rotationPointY = this.rightarm1.rotationPointY - (float)(yy);
        this.rightarm1.rotationPointZ = this.rightarm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -21.25 + (((tickAnim - 10) / 10) * (19-(-21.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 78) {
            xx = 19 + (((tickAnim - 20) / 58) * (19-(19)));
            yy = 0 + (((tickAnim - 20) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 58) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 19 + (((tickAnim - 78) / 10) * (-12.2-(19)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 95) {
            xx = -12.2 + (((tickAnim - 88) / 7) * (0-(-12.2)));
            yy = 0 + (((tickAnim - 88) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.675 + (((tickAnim - 10) / 10) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 20) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 58) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 10) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 88) / 7) * (0-(0)));
            yy = -0.4 + (((tickAnim - 88) / 7) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 88) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (62.69784-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.80315-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.03092-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 62.69784 + (((tickAnim - 10) / 10) * (20.89567-(62.69784)));
            yy = -2.80315 + (((tickAnim - 10) / 10) * (-5.60629-(-2.80315)));
            zz = 4.03092 + (((tickAnim - 10) / 10) * (8.06184-(4.03092)));
        }
        else if (tickAnim >= 20 && tickAnim < 78) {
            xx = 20.89567 + (((tickAnim - 20) / 58) * (20.89567-(20.89567)));
            yy = -5.60629 + (((tickAnim - 20) / 58) * (-5.60629-(-5.60629)));
            zz = 8.06184 + (((tickAnim - 20) / 58) * (8.06184-(8.06184)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 20.89567 + (((tickAnim - 78) / 10) * (77.40305-(20.89567)));
            yy = -5.60629 + (((tickAnim - 78) / 10) * (-2.52283-(-5.60629)));
            zz = 8.06184 + (((tickAnim - 78) / 10) * (3.62783-(8.06184)));
        }
        else if (tickAnim >= 88 && tickAnim < 95) {
            xx = 77.40305 + (((tickAnim - 88) / 7) * (0-(77.40305)));
            yy = -2.52283 + (((tickAnim - 88) / 7) * (0-(-2.52283)));
            zz = 3.62783 + (((tickAnim - 88) / 7) * (0-(3.62783)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.475-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.375 + (((tickAnim - 10) / 10) * (0.525-(0.375)));
            zz = -0.475 + (((tickAnim - 10) / 10) * (0-(-0.475)));
        }
        else if (tickAnim >= 20 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 20) / 58) * (0-(0)));
            yy = 0.525 + (((tickAnim - 20) / 58) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 20) / 58) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            yy = 0.525 + (((tickAnim - 78) / 10) * (1.65-(0.525)));
            zz = 0 + (((tickAnim - 78) / 10) * (-0.575-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 88) / 7) * (0-(0)));
            yy = 1.65 + (((tickAnim - 88) / 7) * (0-(1.65)));
            zz = -0.575 + (((tickAnim - 88) / 7) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = -5 + (((tickAnim - 20) / 14) * (1-(-5)));
            yy = 0 + (((tickAnim - 20) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 14) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 1 + (((tickAnim - 34) / 10) * (8-(1)));
            yy = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 58) {
            xx = 8 + (((tickAnim - 44) / 14) * (11.5-(8)));
            yy = 0 + (((tickAnim - 44) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 14) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = 11.5 + (((tickAnim - 58) / 20) * (15-(11.5)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = 15 + (((tickAnim - 78) / 17) * (0-(15)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = -4.5 + (((tickAnim - 20) / 14) * (-6.5-(-4.5)));
            yy = 0 + (((tickAnim - 20) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 14) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -6.5 + (((tickAnim - 34) / 10) * (-14.5-(-6.5)));
            yy = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 58) {
            xx = -14.5 + (((tickAnim - 44) / 14) * (-27.75-(-14.5)));
            yy = 0 + (((tickAnim - 44) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 14) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = -27.75 + (((tickAnim - 58) / 20) * (-19.25-(-27.75)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = -19.25 + (((tickAnim - 78) / 17) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 78) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = -5.5 + (((tickAnim - 20) / 14) * (-13-(-5.5)));
            yy = 0 + (((tickAnim - 20) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 14) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -13 + (((tickAnim - 34) / 10) * (-8.5-(-13)));
            yy = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 58) {
            xx = -8.5 + (((tickAnim - 44) / 14) * (-5.25-(-8.5)));
            yy = 0 + (((tickAnim - 44) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 14) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 69) {
            xx = -5.25 + (((tickAnim - 58) / 11) * (-19.23697-(-5.25)));
            yy = 0 + (((tickAnim - 58) / 11) * (0.91965-(0)));
            zz = 0 + (((tickAnim - 58) / 11) * (-0.21657-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 78) {
            xx = -19.23697 + (((tickAnim - 69) / 9) * (-13.57669-(-19.23697)));
            yy = 0.91965 + (((tickAnim - 69) / 9) * (2.6247-(0.91965)));
            zz = -0.21657 + (((tickAnim - 69) / 9) * (-0.61809-(-0.21657)));
        }
        else if (tickAnim >= 78 && tickAnim < 95) {
            xx = -13.57669 + (((tickAnim - 78) / 17) * (0-(-13.57669)));
            yy = 2.6247 + (((tickAnim - 78) / 17) * (0-(2.6247)));
            zz = -0.61809 + (((tickAnim - 78) / 17) * (0-(-0.61809)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animStand(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGobiconodon entity = (EntityPrehistoricFloraGobiconodon) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -20.25 + (((tickAnim - 21) / 4) * (-21.5-(-20.25)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -21.5 + (((tickAnim - 25) / 10) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 1 + (((tickAnim - 0) / 21) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 21) * (0.1625-(1)));
            zz = 1 + (((tickAnim - 0) / 21) * (1-(1)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 21) / 4) * (1-(1)));
            yy = 0.1625 + (((tickAnim - 21) / 4) * (0.1625-(0.1625)));
            zz = 1 + (((tickAnim - 21) / 4) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 25) / 10) * (1-(1)));
            yy = 0.1625 + (((tickAnim - 25) / 10) * (1-(0.1625)));
            zz = 1 + (((tickAnim - 25) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.righteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 1 + (((tickAnim - 0) / 21) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 21) * (0.1625-(1)));
            zz = 1 + (((tickAnim - 0) / 21) * (1-(1)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 21) / 4) * (1-(1)));
            yy = 0.1625 + (((tickAnim - 21) / 4) * (0.1625-(0.1625)));
            zz = 1 + (((tickAnim - 21) / 4) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 25) / 10) * (1-(1)));
            yy = 0.1625 + (((tickAnim - 25) / 10) * (1-(0.1625)));
            zz = 1 + (((tickAnim - 25) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lefteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 33.75 + (((tickAnim - 21) / 4) * (33.75-(33.75)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 33.75 + (((tickAnim - 25) / 10) * (0-(33.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -30 + (((tickAnim - 21) / 4) * (-22.43-(-30)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -22.43 + (((tickAnim - 25) / 10) * (0-(-22.43)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightear, rightear.rotateAngleX + (float) Math.toRadians(xx), rightear.rotateAngleY + (float) Math.toRadians(yy), rightear.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -30 + (((tickAnim - 21) / 4) * (-22.43-(-30)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -22.43 + (((tickAnim - 25) / 10) * (0-(-22.43)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftear, leftear.rotateAngleX + (float) Math.toRadians(xx), leftear.rotateAngleY + (float) Math.toRadians(yy), leftear.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGobiconodon entity = (EntityPrehistoricFloraGobiconodon) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*2), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+60))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0.225+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*0.2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*0.2);


        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-120))*2), bodymiddle.rotateAngleY + (float) Math.toRadians(0), bodymiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*2));


        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*-2), bodyfront.rotateAngleY + (float) Math.toRadians(0), bodyfront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+300))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*-2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+350))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-11.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-290))*-1.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+500))*-2));


        this.setRotateAngle(rightear, rightear.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*-3), rightear.rotateAngleY + (float) Math.toRadians(0), rightear.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftear, leftear.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*-3), leftear.rotateAngleY + (float) Math.toRadians(0), leftear.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -27.15832 + (((tickAnim - 0) / 6) * (-71.06664-(-27.15832)));
            yy = 0.22655 + (((tickAnim - 0) / 6) * (0.4531-(0.22655)));
            zz = 0.3372 + (((tickAnim - 0) / 6) * (0.6744-(0.3372)));
        }
        else if (tickAnim >= 6 && tickAnim < 19) {
            xx = -71.06664 + (((tickAnim - 6) / 13) * (12-(-71.06664)));
            yy = 0.4531 + (((tickAnim - 6) / 13) * (0-(0.4531)));
            zz = 0.6744 + (((tickAnim - 6) / 13) * (0-(0.6744)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 12 + (((tickAnim - 19) / 6) * (-27.15832-(12)));
            yy = 0 + (((tickAnim - 19) / 6) * (0.22655-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0.3372-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 6) * (1.2-(0.4)));
            zz = 1.225 + (((tickAnim - 0) / 6) * (1.725-(1.225)));
        }
        else if (tickAnim >= 6 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 6) / 13) * (0-(0)));
            yy = 1.2 + (((tickAnim - 6) / 13) * (-0.35-(1.2)));
            zz = 1.725 + (((tickAnim - 6) / 13) * (1.1-(1.725)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = -0.35 + (((tickAnim - 19) / 6) * (0.4-(-0.35)));
            zz = 1.1 + (((tickAnim - 19) / 6) * (1.225-(1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm1.rotationPointX = this.leftarm1.rotationPointX + (float)(xx);
        this.leftarm1.rotationPointY = this.leftarm1.rotationPointY - (float)(yy);
        this.leftarm1.rotationPointZ = this.leftarm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -0.54177 + (((tickAnim - 0) / 6) * (41.56226-(-0.54177)));
            yy = -2.6291 + (((tickAnim - 0) / 6) * (-13.405-(-2.6291)));
            zz = -1.7825 + (((tickAnim - 0) / 6) * (-0.5706-(-1.7825)));
        }
        else if (tickAnim >= 6 && tickAnim < 19) {
            xx = 41.56226 + (((tickAnim - 6) / 13) * (38.8542-(41.56226)));
            yy = -13.405 + (((tickAnim - 6) / 13) * (8.1468-(-13.405)));
            zz = -0.5706 + (((tickAnim - 6) / 13) * (-2.9944-(-0.5706)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 38.8542 + (((tickAnim - 19) / 6) * (-0.54177-(38.8542)));
            yy = 8.1468 + (((tickAnim - 19) / 6) * (-2.6291-(8.1468)));
            zz = -2.9944 + (((tickAnim - 19) / 6) * (-1.7825-(-2.9944)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 6) * (0-(-0.15)));
            zz = 0.975 + (((tickAnim - 0) / 6) * (0-(0.975)));
        }
        else if (tickAnim >= 6 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 6) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 13) * (-0.32-(0)));
            zz = 0 + (((tickAnim - 6) / 13) * (1.025-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = -0.32 + (((tickAnim - 19) / 6) * (-0.15-(-0.32)));
            zz = 1.025 + (((tickAnim - 19) / 6) * (0.975-(1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 81.81162 + (((tickAnim - 0) / 6) * (29.39814-(81.81162)));
            yy = -2.21355 + (((tickAnim - 0) / 6) * (0.61907-(-2.21355)));
            zz = 2.0492 + (((tickAnim - 0) / 6) * (-8.69858-(2.0492)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 29.39814 + (((tickAnim - 6) / 7) * (-19.64479-(29.39814)));
            yy = 0.61907 + (((tickAnim - 6) / 7) * (-2.1269-(0.61907)));
            zz = -8.69858 + (((tickAnim - 6) / 7) * (3.71721-(-8.69858)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -19.64479 + (((tickAnim - 13) / 6) * (47.75-(-19.64479)));
            yy = -2.1269 + (((tickAnim - 13) / 6) * (0-(-2.1269)));
            zz = 3.71721 + (((tickAnim - 13) / 6) * (0-(3.71721)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 47.75 + (((tickAnim - 19) / 6) * (81.81162-(47.75)));
            yy = 0 + (((tickAnim - 19) / 6) * (-2.21355-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (2.0492-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 2.025 + (((tickAnim - 0) / 6) * (0.575-(2.025)));
            zz = -1 + (((tickAnim - 0) / 6) * (0.075-(-1)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.575 + (((tickAnim - 6) / 4) * (0.705-(0.575)));
            zz = 0.075 + (((tickAnim - 6) / 4) * (0-(0.075)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.705 + (((tickAnim - 10) / 3) * (0.05-(0.705)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.05 + (((tickAnim - 13) / 4) * (1.51-(0.05)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 1.51 + (((tickAnim - 17) / 2) * (1.075-(1.51)));
            zz = 0 + (((tickAnim - 17) / 2) * (-0.55-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 1.075 + (((tickAnim - 19) / 4) * (2.16-(1.075)));
            zz = -0.55 + (((tickAnim - 19) / 4) * (-0.25-(-0.55)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 2.16 + (((tickAnim - 23) / 2) * (2.025-(2.16)));
            zz = -0.25 + (((tickAnim - 23) / 2) * (-1-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -16.65968 + (((tickAnim - 0) / 7) * (17.25-(-16.65968)));
            yy = 2.83944 + (((tickAnim - 0) / 7) * (0-(2.83944)));
            zz = -5.07059 + (((tickAnim - 0) / 7) * (0-(-5.07059)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 17.25 + (((tickAnim - 7) / 5) * (-20.90832-(17.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0.22655-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0.3372-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -20.90832 + (((tickAnim - 12) / 5) * (-71.06664-(-20.90832)));
            yy = 0.22655 + (((tickAnim - 12) / 5) * (0.4531-(0.22655)));
            zz = 0.3372 + (((tickAnim - 12) / 5) * (0.6744-(0.3372)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -71.06664 + (((tickAnim - 17) / 8) * (-16.65968-(-71.06664)));
            yy = 0.4531 + (((tickAnim - 17) / 8) * (2.83944-(0.4531)));
            zz = 0.6744 + (((tickAnim - 17) / 8) * (-5.07059-(0.6744)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 1.525 + (((tickAnim - 0) / 7) * (1.2-(1.525)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0.4-(0)));
            zz = 1.2 + (((tickAnim - 7) / 5) * (1.225-(1.2)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0.4 + (((tickAnim - 12) / 5) * (1.2-(0.4)));
            zz = 1.225 + (((tickAnim - 12) / 5) * (1.725-(1.225)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 1.2 + (((tickAnim - 17) / 8) * (0-(1.2)));
            zz = 1.725 + (((tickAnim - 17) / 8) * (1.525-(1.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm1.rotationPointX = this.rightarm1.rotationPointX + (float)(xx);
        this.rightarm1.rotationPointY = this.rightarm1.rotationPointY - (float)(yy);
        this.rightarm1.rotationPointZ = this.rightarm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 24.71121 + (((tickAnim - 0) / 7) * (46.3542-(24.71121)));
            yy = 3.87635 + (((tickAnim - 0) / 7) * (-8.14675-(3.87635)));
            zz = 5.37817 + (((tickAnim - 0) / 7) * (2.99443-(5.37817)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 46.3542 + (((tickAnim - 7) / 5) * (-0.54177-(46.3542)));
            yy = -8.14675 + (((tickAnim - 7) / 5) * (2.62912-(-8.14675)));
            zz = 2.99443 + (((tickAnim - 7) / 5) * (1.78251-(2.99443)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -0.54177 + (((tickAnim - 12) / 5) * (41.56226-(-0.54177)));
            yy = 2.62912 + (((tickAnim - 12) / 5) * (13.405-(2.62912)));
            zz = 1.78251 + (((tickAnim - 12) / 5) * (0.5706-(1.78251)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 41.56226 + (((tickAnim - 17) / 8) * (24.71121-(41.56226)));
            yy = 13.405 + (((tickAnim - 17) / 8) * (3.87635-(13.405)));
            zz = 0.5706 + (((tickAnim - 17) / 8) * (5.37817-(0.5706)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (-0.32-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0.425-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = -0.32 + (((tickAnim - 7) / 5) * (-0.15-(-0.32)));
            zz = 0.425 + (((tickAnim - 7) / 5) * (0.975-(0.425)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = -0.15 + (((tickAnim - 12) / 13) * (0-(-0.15)));
            zz = 0.975 + (((tickAnim - 12) / 13) * (0-(0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -6.25 + (((tickAnim - 0) / 3) * (-14.5-(-6.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -14.5 + (((tickAnim - 3) / 4) * (47.75-(-14.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 47.75 + (((tickAnim - 7) / 5) * (81.81162-(47.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (-2.21355-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (2.0492-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 81.81162 + (((tickAnim - 12) / 5) * (28.37323-(81.81162)));
            yy = -2.21355 + (((tickAnim - 12) / 5) * (-4.4271-(-2.21355)));
            zz = 2.0492 + (((tickAnim - 12) / 5) * (4.0984-(2.0492)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 28.37323 + (((tickAnim - 17) / 8) * (-6.25-(28.37323)));
            yy = -4.4271 + (((tickAnim - 17) / 8) * (0-(-4.4271)));
            zz = 4.0984 + (((tickAnim - 17) / 8) * (0-(4.0984)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 7) * (0-(0.125)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (2.425-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (-0.8-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 2.425 + (((tickAnim - 10) / 2) * (1.925-(2.425)));
            zz = -0.8 + (((tickAnim - 10) / 2) * (-0.95-(-0.8)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.925 + (((tickAnim - 12) / 1) * (1.83-(1.925)));
            zz = -0.95 + (((tickAnim - 12) / 1) * (-0.575-(-0.95)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 1.83 + (((tickAnim - 13) / 4) * (0-(1.83)));
            zz = -0.575 + (((tickAnim - 13) / 4) * (0-(-0.575)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0.825-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.825 + (((tickAnim - 20) / 5) * (0.125-(0.825)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+50))*-2), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+50))*-4), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+010))*-4), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*2));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 9.07827 + (((tickAnim - 0) / 13) * (56.10126-(9.07827)));
            yy = 18.5416 + (((tickAnim - 0) / 13) * (39.648-(18.5416)));
            zz = 29.6111 + (((tickAnim - 0) / 13) * (28.2807-(29.6111)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 56.10126 + (((tickAnim - 13) / 8) * (-11.2049-(56.10126)));
            yy = 39.648 + (((tickAnim - 13) / 8) * (8.9478-(39.648)));
            zz = 28.2807 + (((tickAnim - 13) / 8) * (30.2158-(28.2807)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -11.2049 + (((tickAnim - 21) / 4) * (9.07827-(-11.2049)));
            yy = 8.9478 + (((tickAnim - 21) / 4) * (18.5416-(8.9478)));
            zz = 30.2158 + (((tickAnim - 21) / 4) * (29.6111-(30.2158)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -30.65802 + (((tickAnim - 0) / 13) * (7.25-(-30.65802)));
            yy = 9.80051 + (((tickAnim - 0) / 13) * (0-(9.80051)));
            zz = -7.455 + (((tickAnim - 0) / 13) * (0-(-7.455)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 7.25 + (((tickAnim - 13) / 3) * (-46.19537-(7.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (-0.0828-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (1.6306-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -46.19537 + (((tickAnim - 16) / 2) * (-50.84191-(-46.19537)));
            yy = -0.0828 + (((tickAnim - 16) / 2) * (-0.14491-(-0.0828)));
            zz = 1.6306 + (((tickAnim - 16) / 2) * (2.85355-(1.6306)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -50.84191 + (((tickAnim - 18) / 3) * (-26.98844-(-50.84191)));
            yy = -0.14491 + (((tickAnim - 18) / 3) * (-0.20701-(-0.14491)));
            zz = 2.85355 + (((tickAnim - 18) / 3) * (4.07651-(2.85355)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -26.98844 + (((tickAnim - 21) / 4) * (-30.65802-(-26.98844)));
            yy = -0.20701 + (((tickAnim - 21) / 4) * (9.80051-(-0.20701)));
            zz = 4.07651 + (((tickAnim - 21) / 4) * (-7.455-(4.07651)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = -0.95 + (((tickAnim - 0) / 13) * (0-(-0.95)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (2.4-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.73-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 2.4 + (((tickAnim - 16) / 2) * (0.7-(2.4)));
            zz = -0.73 + (((tickAnim - 16) / 2) * (-0.65-(-0.73)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.7 + (((tickAnim - 18) / 3) * (0.55-(0.7)));
            zz = -0.65 + (((tickAnim - 18) / 3) * (-0.025-(-0.65)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.55 + (((tickAnim - 21) / 4) * (0-(0.55)));
            zz = -0.025 + (((tickAnim - 21) / 4) * (-0.95-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.70765 + (((tickAnim - 0) / 3) * (-11.91738-(8.70765)));
            yy = -18.6357 + (((tickAnim - 0) / 3) * (-23.02849-(-18.6357)));
            zz = -2.62993 + (((tickAnim - 0) / 3) * (-3.88775-(-2.62993)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -11.91738 + (((tickAnim - 3) / 5) * (-28.24558-(-11.91738)));
            yy = -23.02849 + (((tickAnim - 3) / 5) * (-26.42181-(-23.02849)));
            zz = -3.88775 + (((tickAnim - 3) / 5) * (1.07324-(-3.88775)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -28.24558 + (((tickAnim - 8) / 5) * (41.81057-(-28.24558)));
            yy = -26.42181 + (((tickAnim - 8) / 5) * (-30.4938-(-26.42181)));
            zz = 1.07324 + (((tickAnim - 8) / 5) * (7.02643-(1.07324)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 41.81057 + (((tickAnim - 13) / 3) * (19.46873-(41.81057)));
            yy = -30.4938 + (((tickAnim - 13) / 3) * (-37.70177-(-30.4938)));
            zz = 7.02643 + (((tickAnim - 13) / 3) * (-7.97513-(7.02643)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 19.46873 + (((tickAnim - 16) / 2) * (58.54364-(19.46873)));
            yy = -37.70177 + (((tickAnim - 16) / 2) * (-24.83979-(-37.70177)));
            zz = -7.97513 + (((tickAnim - 16) / 2) * (-8.33866-(-7.97513)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 58.54364 + (((tickAnim - 18) / 3) * (29.86855-(58.54364)));
            yy = -24.83979 + (((tickAnim - 18) / 3) * (-11.9778-(-24.83979)));
            zz = -8.33866 + (((tickAnim - 18) / 3) * (-8.7022-(-8.33866)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 29.86855 + (((tickAnim - 21) / 4) * (8.70765-(29.86855)));
            yy = -11.9778 + (((tickAnim - 21) / 4) * (-18.6357-(-11.9778)));
            zz = -8.7022 + (((tickAnim - 21) / 4) * (-2.62993-(-8.7022)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.85 + (((tickAnim - 0) / 3) * (1.295-(0.85)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 1.295 + (((tickAnim - 3) / 10) * (0-(1.295)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (2.095-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0.325-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 2.095 + (((tickAnim - 14) / 2) * (1.245-(2.095)));
            zz = 0.325 + (((tickAnim - 14) / 2) * (0-(0.325)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.245 + (((tickAnim - 16) / 2) * (2.775-(1.245)));
            zz = 0 + (((tickAnim - 16) / 2) * (0.15-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 2.775 + (((tickAnim - 18) / 3) * (-0.2-(2.775)));
            zz = 0.15 + (((tickAnim - 18) / 3) * (0.35-(0.15)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = -0.2 + (((tickAnim - 21) / 4) * (0.85-(-0.2)));
            zz = 0.35 + (((tickAnim - 21) / 4) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 56.10126 + (((tickAnim - 0) / 8) * (-11.2049-(56.10126)));
            yy = -39.64803 + (((tickAnim - 0) / 8) * (-8.94777-(-39.64803)));
            zz = -28.28074 + (((tickAnim - 0) / 8) * (-30.21576-(-28.28074)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = -11.2049 + (((tickAnim - 8) / 17) * (56.10126-(-11.2049)));
            yy = -8.94777 + (((tickAnim - 8) / 17) * (-39.64803-(-8.94777)));
            zz = -30.21576 + (((tickAnim - 8) / 17) * (-28.28074-(-30.21576)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 7.25 + (((tickAnim - 0) / 5) * (-33.54306-(7.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.12421-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.4459-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -33.54306 + (((tickAnim - 5) / 3) * (-26.98844-(-33.54306)));
            yy = -0.12421 + (((tickAnim - 5) / 3) * (-0.20701-(-0.12421)));
            zz = 2.4459 + (((tickAnim - 5) / 3) * (4.07651-(2.4459)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -26.98844 + (((tickAnim - 8) / 5) * (-29.78893-(-26.98844)));
            yy = -0.20701 + (((tickAnim - 8) / 5) * (-0.14232-(-0.20701)));
            zz = 4.07651 + (((tickAnim - 8) / 5) * (2.8026-(4.07651)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -29.78893 + (((tickAnim - 13) / 12) * (7.25-(-29.78893)));
            yy = -0.14232 + (((tickAnim - 13) / 12) * (0-(-0.14232)));
            zz = 2.8026 + (((tickAnim - 13) / 12) * (0-(2.8026)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.05-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.145-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 2.05 + (((tickAnim - 5) / 3) * (0-(2.05)));
            zz = -1.145 + (((tickAnim - 5) / 3) * (-0.45-(-1.145)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = -0.45 + (((tickAnim - 8) / 5) * (-0.95-(-0.45)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = -0.95 + (((tickAnim - 13) / 12) * (0-(-0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 41.81057 + (((tickAnim - 0) / 2) * (88.86259-(41.81057)));
            yy = 30.49376 + (((tickAnim - 0) / 2) * (30.29022-(30.49376)));
            zz = 7.02643 + (((tickAnim - 0) / 2) * (7.04485-(7.02643)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 88.86259 + (((tickAnim - 2) / 3) * (26.258-(88.86259)));
            yy = 30.29022 + (((tickAnim - 2) / 3) * (22.44204-(30.29022)));
            zz = 7.04485 + (((tickAnim - 2) / 3) * (7.75515-(7.04485)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 26.258 + (((tickAnim - 5) / 2) * (9.93827-(26.258)));
            yy = 22.44204 + (((tickAnim - 5) / 2) * (17.20992-(22.44204)));
            zz = 7.75515 + (((tickAnim - 5) / 2) * (8.22868-(7.75515)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 9.93827 + (((tickAnim - 7) / 1) * (25.61855-(9.93827)));
            yy = 17.20992 + (((tickAnim - 7) / 1) * (11.9778-(17.20992)));
            zz = 8.22868 + (((tickAnim - 7) / 1) * (8.70221-(8.22868)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 25.61855 + (((tickAnim - 8) / 5) * (13.42856-(25.61855)));
            yy = 11.9778 + (((tickAnim - 8) / 5) * (17.76404-(11.9778)));
            zz = 8.70221 + (((tickAnim - 8) / 5) * (8.17853-(8.70221)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 13.42856 + (((tickAnim - 13) / 3) * (-10.15397-(13.42856)));
            yy = 17.76404 + (((tickAnim - 13) / 3) * (23.22124-(17.76404)));
            zz = 8.17853 + (((tickAnim - 13) / 3) * (11.18143-(8.17853)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -10.15397 + (((tickAnim - 16) / 3) * (-31.20093-(-10.15397)));
            yy = 23.22124 + (((tickAnim - 16) / 3) * (34.53075-(23.22124)));
            zz = 11.18143 + (((tickAnim - 16) / 3) * (5.26981-(11.18143)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -31.20093 + (((tickAnim - 19) / 6) * (41.81057-(-31.20093)));
            yy = 34.53075 + (((tickAnim - 19) / 6) * (30.49376-(34.53075)));
            zz = 5.26981 + (((tickAnim - 19) / 6) * (7.02643-(5.26981)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.61-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.61 + (((tickAnim - 2) / 1) * (2.82-(1.61)));
            zz = 0 + (((tickAnim - 2) / 1) * (0.275-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 2.82 + (((tickAnim - 3) / 2) * (1.33-(2.82)));
            zz = 0.275 + (((tickAnim - 3) / 2) * (0-(0.275)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.33 + (((tickAnim - 5) / 2) * (0.4-(1.33)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 7) / 1) * (-0.2-(0.4)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 5) * (0.6-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 13) / 3) * (1.07-(0.6)));
            zz = 0 + (((tickAnim - 13) / 3) * (0.4-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 1.07 + (((tickAnim - 16) / 9) * (0-(1.07)));
            zz = 0.4 + (((tickAnim - 16) / 9) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);
       

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGobiconodon entity = (EntityPrehistoricFloraGobiconodon) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*6), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(2.625+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*7), bodymiddle.rotateAngleY + (float) Math.toRadians(0), bodymiddle.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-6), bodyfront.rotateAngleY + (float) Math.toRadians(0), bodyfront.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(10.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*8), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-22.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*15), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5));


        this.setRotateAngle(rightear, rightear.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*15), rightear.rotateAngleY + (float) Math.toRadians(0), rightear.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftear, leftear.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*15), leftear.rotateAngleY + (float) Math.toRadians(0), leftear.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -1.28879 + (((tickAnim - 0) / 4) * (-78.06185-(-1.28879)));
            yy = -0.59557 + (((tickAnim - 0) / 4) * (-11.4117-(-0.59557)));
            zz = 1.56846 + (((tickAnim - 0) / 4) * (23.2401-(1.56846)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -78.06185 + (((tickAnim - 4) / 4) * (6.71121-(-78.06185)));
            yy = -11.4117 + (((tickAnim - 4) / 4) * (-0.59557-(-11.4117)));
            zz = 23.2401 + (((tickAnim - 4) / 4) * (1.56846-(23.2401)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6.71121 + (((tickAnim - 8) / 2) * (-1.28879-(6.71121)));
            yy = -0.59557 + (((tickAnim - 8) / 2) * (-0.59557-(-0.59557)));
            zz = 1.56846 + (((tickAnim - 8) / 2) * (1.56846-(1.56846)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.105 + (((tickAnim - 0) / 4) * (-0.325-(0.105)));
            zz = 1.62 + (((tickAnim - 0) / 4) * (1.62-(1.62)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.325 + (((tickAnim - 4) / 4) * (0.105-(-0.325)));
            zz = 1.62 + (((tickAnim - 4) / 4) * (1.62-(1.62)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm1.rotationPointX = this.leftarm1.rotationPointX + (float)(xx);
        this.leftarm1.rotationPointY = this.leftarm1.rotationPointY - (float)(yy);
        this.leftarm1.rotationPointZ = this.leftarm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.25 + (((tickAnim - 0) / 3) * (-3.44781-(12.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-2.0622-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-3.80075-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -3.44781 + (((tickAnim - 3) / 1) * (49.35426-(-3.44781)));
            yy = -2.0622 + (((tickAnim - 3) / 1) * (-2.12424-(-2.0622)));
            zz = -3.80075 + (((tickAnim - 3) / 1) * (-12.11273-(-3.80075)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 49.35426 + (((tickAnim - 4) / 3) * (60.05958-(49.35426)));
            yy = -2.12424 + (((tickAnim - 4) / 3) * (-1.21385-(-2.12424)));
            zz = -12.11273 + (((tickAnim - 4) / 3) * (-6.92156-(-12.11273)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 60.05958 + (((tickAnim - 7) / 1) * (33.5-(60.05958)));
            yy = -1.21385 + (((tickAnim - 7) / 1) * (0-(-1.21385)));
            zz = -6.92156 + (((tickAnim - 7) / 1) * (0-(-6.92156)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 33.5 + (((tickAnim - 8) / 2) * (12.25-(33.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.35 + (((tickAnim - 0) / 4) * (0-(-0.35)));
            zz = 0.775 + (((tickAnim - 0) / 4) * (0-(0.775)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0.775-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 76.25 + (((tickAnim - 0) / 3) * (66.0176-(76.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (13.90934-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (3.78297-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 66.0176 + (((tickAnim - 3) / 1) * (28.14165-(66.0176)));
            yy = 13.90934 + (((tickAnim - 3) / 1) * (11.8921-(13.90934)));
            zz = 3.78297 + (((tickAnim - 3) / 1) * (1.61508-(3.78297)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 28.14165 + (((tickAnim - 4) / 2) * (-14.48276-(28.14165)));
            yy = 11.8921 + (((tickAnim - 4) / 2) * (10.98004-(11.8921)));
            zz = 1.61508 + (((tickAnim - 4) / 2) * (-2.9956-(1.61508)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -14.48276 + (((tickAnim - 6) / 2) * (90.25-(-14.48276)));
            yy = 10.98004 + (((tickAnim - 6) / 2) * (0-(10.98004)));
            zz = -2.9956 + (((tickAnim - 6) / 2) * (0-(-2.9956)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 90.25 + (((tickAnim - 8) / 2) * (76.25-(90.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.5 + (((tickAnim - 0) / 2) * (1.925-(1.5)));
            zz = -1.15 + (((tickAnim - 0) / 2) * (-0.39-(-1.15)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.925 + (((tickAnim - 2) / 1) * (2.09-(1.925)));
            zz = -0.39 + (((tickAnim - 2) / 1) * (-0.46-(-0.39)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 2.09 + (((tickAnim - 3) / 1) * (1.4-(2.09)));
            zz = -0.46 + (((tickAnim - 3) / 1) * (-0.225-(-0.46)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 1.4 + (((tickAnim - 4) / 1) * (1.885-(1.4)));
            zz = -0.225 + (((tickAnim - 4) / 1) * (-0.15-(-0.225)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 1.885 + (((tickAnim - 5) / 1) * (0.445-(1.885)));
            zz = -0.15 + (((tickAnim - 5) / 1) * (-0.07-(-0.15)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.445 + (((tickAnim - 6) / 2) * (1.5-(0.445)));
            zz = -0.07 + (((tickAnim - 6) / 2) * (-1.15-(-0.07)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.5 + (((tickAnim - 8) / 2) * (1.5-(1.5)));
            zz = -1.15 + (((tickAnim - 8) / 2) * (-1.15-(-1.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -46.56185 + (((tickAnim - 0) / 3) * (-78.06185-(-46.56185)));
            yy = 11.41168 + (((tickAnim - 0) / 3) * (11.41168-(11.41168)));
            zz = -23.24011 + (((tickAnim - 0) / 3) * (-23.24011-(-23.24011)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -78.06185 + (((tickAnim - 3) / 5) * (-17.28879-(-78.06185)));
            yy = 11.41168 + (((tickAnim - 3) / 5) * (-0.59557-(11.41168)));
            zz = -23.24011 + (((tickAnim - 3) / 5) * (1.56846-(-23.24011)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.28879 + (((tickAnim - 8) / 2) * (-46.56185-(-17.28879)));
            yy = -0.59557 + (((tickAnim - 8) / 2) * (11.41168-(-0.59557)));
            zz = 1.56846 + (((tickAnim - 8) / 2) * (-23.24011-(1.56846)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.925-(0)));
            zz = 1.225 + (((tickAnim - 0) / 3) * (1.62-(1.225)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.925 + (((tickAnim - 3) / 5) * (-0.09-(-0.925)));
            zz = 1.62 + (((tickAnim - 3) / 5) * (1.37-(1.62)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.09 + (((tickAnim - 8) / 2) * (0-(-0.09)));
            zz = 1.37 + (((tickAnim - 8) / 2) * (1.225-(1.37)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm1.rotationPointX = this.rightarm1.rotationPointX + (float)(xx);
        this.rightarm1.rotationPointY = this.rightarm1.rotationPointY - (float)(yy);
        this.rightarm1.rotationPointZ = this.rightarm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.10437 + (((tickAnim - 0) / 3) * (45.60437-(7.10437)));
            yy = 4.12439 + (((tickAnim - 0) / 3) * (4.12439-(4.12439)));
            zz = 7.60147 + (((tickAnim - 0) / 3) * (7.60147-(7.60147)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 45.60437 + (((tickAnim - 3) / 5) * (66-(45.60437)));
            yy = 4.12439 + (((tickAnim - 3) / 5) * (0-(4.12439)));
            zz = 7.60147 + (((tickAnim - 3) / 5) * (0-(7.60147)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 66 + (((tickAnim - 8) / 2) * (7.10437-(66)));
            yy = 0 + (((tickAnim - 8) / 2) * (4.12439-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (7.60147-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.45 + (((tickAnim - 0) / 3) * (0.425-(-0.45)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.78-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 3) / 5) * (-0.35-(0.425)));
            zz = 0.78 + (((tickAnim - 3) / 5) * (0.775-(0.78)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 8) / 2) * (-0.45-(-0.35)));
            zz = 0.775 + (((tickAnim - 8) / 2) * (0-(0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 84.64165 + (((tickAnim - 0) / 3) * (38.19848-(84.64165)));
            yy = -11.89205 + (((tickAnim - 0) / 3) * (-16.54555-(-11.89205)));
            zz = 1.61508 + (((tickAnim - 0) / 3) * (4.99901-(1.61508)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 38.19848 + (((tickAnim - 3) / 0) * (25.19688-(38.19848)));
            yy = -16.54555 + (((tickAnim - 3) / 0) * (-9.64468-(-16.54555)));
            zz = 4.99901 + (((tickAnim - 3) / 0) * (7.62955-(4.99901)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 25.19688 + (((tickAnim - 3) / 2) * (0.96813-(25.19688)));
            yy = -9.64468 + (((tickAnim - 3) / 2) * (-5.78681-(-9.64468)));
            zz = 7.62955 + (((tickAnim - 3) / 2) * (4.57773-(7.62955)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.96813 + (((tickAnim - 5) / 3) * (76.5-(0.96813)));
            yy = -5.78681 + (((tickAnim - 5) / 3) * (0-(-5.78681)));
            zz = 4.57773 + (((tickAnim - 5) / 3) * (0-(4.57773)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 76.5 + (((tickAnim - 8) / 2) * (84.64165-(76.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (-11.89205-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (1.61508-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.9 + (((tickAnim - 0) / 3) * (0-(0.9)));
            zz = -0.5 + (((tickAnim - 0) / 3) * (0-(-0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (1.875-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.875 + (((tickAnim - 3) / 1) * (2.635-(1.875)));
            zz = 0 + (((tickAnim - 3) / 1) * (-0.12-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 2.635 + (((tickAnim - 4) / 1) * (1.84-(2.635)));
            zz = -0.12 + (((tickAnim - 4) / 1) * (-0.23-(-0.12)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 1.84 + (((tickAnim - 5) / 1) * (2.075-(1.84)));
            zz = -0.23 + (((tickAnim - 5) / 1) * (0-(-0.23)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 2.075 + (((tickAnim - 6) / 2) * (1.5-(2.075)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.325-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 1.5 + (((tickAnim - 8) / 0) * (2.585-(1.5)));
            zz = -0.325 + (((tickAnim - 8) / 0) * (-0.4-(-0.325)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.585 + (((tickAnim - 8) / 2) * (0.9-(2.585)));
            zz = -0.4 + (((tickAnim - 8) / 2) * (-0.5-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-10), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*-8), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*15), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -20.42557 + (((tickAnim - 0) / 3) * (-15.68102-(-20.42557)));
            yy = 4.9891 + (((tickAnim - 0) / 3) * (19.2669-(4.9891)));
            zz = 16.66158 + (((tickAnim - 0) / 3) * (36.9066-(16.66158)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -15.68102 + (((tickAnim - 3) / 4) * (51.9484-(-15.68102)));
            yy = 19.2669 + (((tickAnim - 3) / 4) * (32.70969-(19.2669)));
            zz = 36.9066 + (((tickAnim - 3) / 4) * (26.69585-(36.9066)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 51.9484 + (((tickAnim - 7) / 3) * (-20.42557-(51.9484)));
            yy = 32.70969 + (((tickAnim - 7) / 3) * (4.9891-(32.70969)));
            zz = 26.69585 + (((tickAnim - 7) / 3) * (16.66158-(26.69585)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15 + (((tickAnim - 0) / 3) * (-36.34545-(-15)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.23356-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-12.7339-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -36.34545 + (((tickAnim - 3) / 4) * (11.65455-(-36.34545)));
            yy = 0.23356 + (((tickAnim - 3) / 4) * (0.23356-(0.23356)));
            zz = -12.7339 + (((tickAnim - 3) / 4) * (-12.7339-(-12.7339)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 11.65455 + (((tickAnim - 7) / 3) * (-15-(11.65455)));
            yy = 0.23356 + (((tickAnim - 7) / 3) * (0-(0.23356)));
            zz = -12.7339 + (((tickAnim - 7) / 3) * (0-(-12.7339)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 3) * (-1.125-(0.55)));
            zz = -0.9 + (((tickAnim - 0) / 3) * (0-(-0.9)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -1.125 + (((tickAnim - 3) / 1) * (-0.015-(-1.125)));
            zz = 0 + (((tickAnim - 3) / 1) * (-0.925-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -0.015 + (((tickAnim - 4) / 3) * (0.25-(-0.015)));
            zz = -0.925 + (((tickAnim - 4) / 3) * (0-(-0.925)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 7) / 1) * (0.37-(0.25)));
            zz = 0 + (((tickAnim - 7) / 1) * (-1.12-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.37 + (((tickAnim - 8) / 2) * (0.55-(0.37)));
            zz = -1.12 + (((tickAnim - 8) / 2) * (-0.9-(-1.12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 58.69037 + (((tickAnim - 0) / 3) * (35.83927-(58.69037)));
            yy = -22.5698 + (((tickAnim - 0) / 3) * (-24.7924-(-22.5698)));
            zz = 4.286 + (((tickAnim - 0) / 3) * (-9.7985-(4.286)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 35.83927 + (((tickAnim - 3) / 1) * (0.55922-(35.83927)));
            yy = -24.7924 + (((tickAnim - 3) / 1) * (-24.20127-(-24.7924)));
            zz = -9.7985 + (((tickAnim - 3) / 1) * (-4.05968-(-9.7985)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0.55922 + (((tickAnim - 4) / 3) * (30-(0.55922)));
            yy = -24.20127 + (((tickAnim - 4) / 3) * (-33-(-24.20127)));
            zz = -4.05968 + (((tickAnim - 4) / 3) * (0-(-4.05968)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 30 + (((tickAnim - 7) / 1) * (89.72615-(30)));
            yy = -33 + (((tickAnim - 7) / 1) * (-28.82792-(-33)));
            zz = 0 + (((tickAnim - 7) / 1) * (1.7144-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 89.72615 + (((tickAnim - 8) / 2) * (58.69037-(89.72615)));
            yy = -28.82792 + (((tickAnim - 8) / 2) * (-22.5698-(-28.82792)));
            zz = 1.7144 + (((tickAnim - 8) / 2) * (4.286-(1.7144)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.725 + (((tickAnim - 0) / 3) * (0.6-(1.725)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.6 + (((tickAnim - 3) / 0) * (1.6-(0.6)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.6 + (((tickAnim - 3) / 1) * (0.425-(1.6)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.425 + (((tickAnim - 4) / 3) * (0-(0.425)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (2.065-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0.075-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.065 + (((tickAnim - 8) / 2) * (1.725-(2.065)));
            zz = 0.075 + (((tickAnim - 8) / 2) * (0-(0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -15.68102 + (((tickAnim - 0) / 5) * (52.49032-(-15.68102)));
            yy = -19.26692 + (((tickAnim - 0) / 5) * (-25.55899-(-19.26692)));
            zz = -36.9066 + (((tickAnim - 0) / 5) * (-23.06574-(-36.9066)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 52.49032 + (((tickAnim - 5) / 5) * (-15.68102-(52.49032)));
            yy = -25.55899 + (((tickAnim - 5) / 5) * (-19.26692-(-25.55899)));
            zz = -23.06574 + (((tickAnim - 5) / 5) * (-36.9066-(-23.06574)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -36.34545 + (((tickAnim - 0) / 5) * (11.65455-(-36.34545)));
            yy = 0.23356 + (((tickAnim - 0) / 5) * (0.23356-(0.23356)));
            zz = 12.73393 + (((tickAnim - 0) / 5) * (12.73393-(12.73393)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 11.65455 + (((tickAnim - 5) / 3) * (-35.09545-(11.65455)));
            yy = 0.23356 + (((tickAnim - 5) / 3) * (0.23356-(0.23356)));
            zz = 12.73393 + (((tickAnim - 5) / 3) * (12.73393-(12.73393)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -35.09545 + (((tickAnim - 8) / 2) * (-36.34545-(-35.09545)));
            yy = 0.23356 + (((tickAnim - 8) / 2) * (0.23356-(0.23356)));
            zz = 12.73393 + (((tickAnim - 8) / 2) * (12.73393-(12.73393)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.125 + (((tickAnim - 0) / 3) * (-0.19-(-1.125)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.8-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.19 + (((tickAnim - 3) / 2) * (0.25-(-0.19)));
            zz = -0.8 + (((tickAnim - 3) / 2) * (0-(-0.8)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 5) / 3) * (1.56-(0.25)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.925-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.56 + (((tickAnim - 8) / 2) * (-1.125-(1.56)));
            zz = -0.925 + (((tickAnim - 8) / 2) * (0-(-0.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 35.83927 + (((tickAnim - 0) / 3) * (-9.67207-(35.83927)));
            yy = 24.79245 + (((tickAnim - 0) / 3) * (23.7555-(24.79245)));
            zz = 9.79851 + (((tickAnim - 0) / 3) * (6.18137-(9.79851)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -9.67207 + (((tickAnim - 3) / 0) * (-18.7914-(-9.67207)));
            yy = 23.7555 + (((tickAnim - 3) / 0) * (24.27397-(23.7555)));
            zz = 6.18137 + (((tickAnim - 3) / 0) * (7.98994-(6.18137)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -18.7914 + (((tickAnim - 3) / 2) * (42.08927-(-18.7914)));
            yy = 24.27397 + (((tickAnim - 3) / 2) * (24.79245-(24.27397)));
            zz = 7.98994 + (((tickAnim - 3) / 2) * (9.79851-(7.98994)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 42.08927 + (((tickAnim - 5) / 2) * (64.73123-(42.08927)));
            yy = 24.79245 + (((tickAnim - 5) / 2) * (25.47655-(24.79245)));
            zz = 9.79851 + (((tickAnim - 5) / 2) * (8.09455-(9.79851)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 64.73123 + (((tickAnim - 7) / 1) * (28.26514-(64.73123)));
            yy = 25.47655 + (((tickAnim - 7) / 1) * (26.84477-(25.47655)));
            zz = 8.09455 + (((tickAnim - 7) / 1) * (4.68664-(8.09455)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 28.26514 + (((tickAnim - 8) / 2) * (35.83927-(28.26514)));
            yy = 26.84477 + (((tickAnim - 8) / 2) * (24.79245-(26.84477)));
            zz = 4.68664 + (((tickAnim - 8) / 2) * (9.79851-(4.68664)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 1 + (((tickAnim - 3) / 0) * (0.27-(1)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.27 + (((tickAnim - 3) / 4) * (2.875-(0.27)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 2.875 + (((tickAnim - 7) / 1) * (2.05-(2.875)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.05 + (((tickAnim - 8) / 2) * (0-(2.05)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);


    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraGobiconodon e = (EntityPrehistoricFloraGobiconodon) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
