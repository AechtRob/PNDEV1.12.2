package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAbyssosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAbyssosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer Neck4;
    private final AdvancedModelRenderer Neck5;
    private final AdvancedModelRenderer Neck6;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer jaw4;
    private final AdvancedModelRenderer jaw5;
    private final AdvancedModelRenderer teeth;
    private final AdvancedModelRenderer teeth2;
    private final AdvancedModelRenderer jaw6;
    private final AdvancedModelRenderer jaw7;
    private final AdvancedModelRenderer teeth3;
    private final AdvancedModelRenderer teeth4;
    private final AdvancedModelRenderer jaw8;
    private final AdvancedModelRenderer Head2;
    private final AdvancedModelRenderer Head3;
    private final AdvancedModelRenderer Head4;
    private final AdvancedModelRenderer Head5;
    private final AdvancedModelRenderer Head6;
    private final AdvancedModelRenderer Head7;
    private final AdvancedModelRenderer Head8;
    private final AdvancedModelRenderer Head9;
    private final AdvancedModelRenderer teeth5;
    private final AdvancedModelRenderer teeth6;
    private final AdvancedModelRenderer Head10;
    private final AdvancedModelRenderer Head11;
    private final AdvancedModelRenderer teeth7;
    private final AdvancedModelRenderer teeth8;
    private final AdvancedModelRenderer Head12;
    private final AdvancedModelRenderer Head13;
    private final AdvancedModelRenderer teeth9;
    private final AdvancedModelRenderer teeth10;
    private final AdvancedModelRenderer Head14;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer Head15;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer armRight;
    private final AdvancedModelRenderer armRight2;
    private final AdvancedModelRenderer armRight3;
    private final AdvancedModelRenderer armLeft;
    private final AdvancedModelRenderer armLeft2;
    private final AdvancedModelRenderer armLeft3;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Tail6;
    private final AdvancedModelRenderer Tail7;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;

    private ModelAnimator animator;

    public ModelAbyssosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 14.5F, 7.0F);
        this.setRotateAngle(Hips, -0.1698F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 78, -7.0F, -3.0F, 0.0F, 14, 10, 12, 0.0F, true));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.3F, 0.5F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.0848F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 101, -9.5F, -3.0F, -14.5F, 19, 12, 15, 0.0F, true));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.9F, -14.0F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.2335F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 69, 107, -7.5F, -3.5F, -10.0F, 15, 10, 11, 0.0F, true));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.3F, -10.0F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.0637F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 28, 17, -4.0F, -3.0F, -8.5F, 8, 7, 10, 0.0F, true));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.7F, -8.0F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.1485F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 76, 17, -3.0F, -2.0F, -9.5F, 6, 6, 10, 0.0F, true));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 0.51F, -8.9F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0213F, 0.0F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 55, 27, -2.5F, -2.5F, -9.5F, 5, 6, 10, 0.0F, true));

        this.Neck4 = new AdvancedModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, -0.4F, -9.1F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, 0.0213F, 0.0F, 0.0F);
        this.Neck4.cubeList.add(new ModelBox(Neck4, 75, 0, -2.0F, -2.0F, -10.5F, 4, 5, 11, 0.0F, true));

        this.Neck5 = new AdvancedModelRenderer(this);
        this.Neck5.setRotationPoint(0.0F, 0.04F, -10.1F);
        this.Neck4.addChild(Neck5);
        this.setRotateAngle(Neck5, 0.0213F, 0.0F, 0.0F);
        this.Neck5.cubeList.add(new ModelBox(Neck5, 29, 0, -1.5F, -2.0F, -10.5F, 3, 5, 11, 0.0F, true));

        this.Neck6 = new AdvancedModelRenderer(this);
        this.Neck6.setRotationPoint(0.0F, 0.04F, -9.9F);
        this.Neck5.addChild(Neck6);
        this.setRotateAngle(Neck6, 0.0213F, 0.0F, 0.0F);
        this.Neck6.cubeList.add(new ModelBox(Neck6, 56, 11, -2.0F, -2.0F, -9.5F, 4, 5, 10, 0.0F, true));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.55F, -9.3F);
        this.Neck6.addChild(Head);
        this.setRotateAngle(Head, 0.0213F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 47, 0, -2.5F, -1.5F, -2.5F, 5, 4, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.5F, 0.5F);
        this.Head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 21, -2.5F, 0.0F, -3.0F, 5, 1, 3, 0.0F, true));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.0637F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 11, 0, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, true));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.0637F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 21, 27, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, true));

        this.jaw4 = new AdvancedModelRenderer(this);
        this.jaw4.setRotationPoint(-2.5F, 0.5F, -3.0F);
        this.jaw.addChild(jaw4);
        this.setRotateAngle(jaw4, 0.0424F, -0.2759F, 0.0F);
        this.jaw4.cubeList.add(new ModelBox(jaw4, 9, 4, 0.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.jaw5 = new AdvancedModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.jaw4.addChild(jaw5);
        this.setRotateAngle(jaw5, -0.0213F, -0.7006F, 0.0F);
        this.jaw5.cubeList.add(new ModelBox(jaw5, 15, 24, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.teeth = new AdvancedModelRenderer(this);
        this.teeth.setRotationPoint(-0.1F, -0.9F, -1.3F);
        this.jaw5.addChild(teeth);
        this.setRotateAngle(teeth, 0.0F, 0.1698F, -0.6866F);
        this.teeth.cubeList.add(new ModelBox(teeth, 8, 0, 0.0F, -1.2F, -0.5F, 0, 2, 1, 0.0F, true));

        this.teeth2 = new AdvancedModelRenderer(this);
        this.teeth2.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.jaw4.addChild(teeth2);
        this.setRotateAngle(teeth2, -0.1485F, 0.0F, -0.1274F);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 0, 10, 0.0F, -0.6F, -1.5F, 0, 1, 3, 0.0F, true));

        this.jaw6 = new AdvancedModelRenderer(this);
        this.jaw6.setRotationPoint(2.5F, 0.5F, -3.0F);
        this.jaw.addChild(jaw6);
        this.setRotateAngle(jaw6, 0.0424F, 0.2759F, 0.0F);
        this.jaw6.cubeList.add(new ModelBox(jaw6, 8, 9, -1.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.jaw7 = new AdvancedModelRenderer(this);
        this.jaw7.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.jaw6.addChild(jaw7);
        this.setRotateAngle(jaw7, -0.0213F, 0.7006F, 0.0F);
        this.jaw7.cubeList.add(new ModelBox(jaw7, 11, 27, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.teeth3 = new AdvancedModelRenderer(this);
        this.teeth3.setRotationPoint(0.1F, -0.9F, -1.3F);
        this.jaw7.addChild(teeth3);
        this.setRotateAngle(teeth3, 0.0F, -0.1698F, 0.6866F);
        this.teeth3.cubeList.add(new ModelBox(teeth3, 5, 0, 0.0F, -1.2F, -0.5F, 0, 2, 1, 0.0F, true));

        this.teeth4 = new AdvancedModelRenderer(this);
        this.teeth4.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.jaw6.addChild(teeth4);
        this.setRotateAngle(teeth4, -0.1485F, 0.0F, 0.1274F);
        this.teeth4.cubeList.add(new ModelBox(teeth4, 0, 8, 0.0F, -0.6F, -1.5F, 0, 1, 3, 0.0F, true));

        this.jaw8 = new AdvancedModelRenderer(this);
        this.jaw8.setRotationPoint(-0.01F, 0.0F, -2.6F);
        this.jaw.addChild(jaw8);
        this.setRotateAngle(jaw8, -0.1485F, 0.0F, 0.0F);
        this.jaw8.cubeList.add(new ModelBox(jaw8, 16, 7, -2.0F, -3.0F, 0.0F, 4, 3, 2, 0.0F, true));

        this.Head2 = new AdvancedModelRenderer(this);
        this.Head2.setRotationPoint(0.0F, 2.5F, -2.5F);
        this.Head.addChild(Head2);
        this.Head2.cubeList.add(new ModelBox(Head2, 0, 26, -1.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F, true));

        this.Head3 = new AdvancedModelRenderer(this);
        this.Head3.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Head2.addChild(Head3);
        this.setRotateAngle(Head3, 0.3183F, 0.0F, 0.0F);
        this.Head3.cubeList.add(new ModelBox(Head3, 6, 14, -2.0F, 0.0F, -1.0F, 4, 3, 1, 0.0F, true));

        this.Head4 = new AdvancedModelRenderer(this);
        this.Head4.setRotationPoint(-0.01F, 0.0F, -1.0F);
        this.Head3.addChild(Head4);
        this.setRotateAngle(Head4, 0.7006F, 0.0F, 0.0F);
        this.Head4.cubeList.add(new ModelBox(Head4, 26, 17, -1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F, true));

        this.Head5 = new AdvancedModelRenderer(this);
        this.Head5.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Head2.addChild(Head5);
        this.setRotateAngle(Head5, -0.0637F, 0.0F, 0.0F);
        this.Head5.cubeList.add(new ModelBox(Head5, 30, 23, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, true));

        this.Head6 = new AdvancedModelRenderer(this);
        this.Head6.setRotationPoint(0.01F, 0.0F, -0.9F);
        this.Head5.addChild(Head6);
        this.setRotateAngle(Head6, 1.04F, 0.0F, 0.0F);
        this.Head6.cubeList.add(new ModelBox(Head6, 21, 22, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.Head7 = new AdvancedModelRenderer(this);
        this.Head7.setRotationPoint(0.02F, -1.0F, 2.0F);
        this.Head6.addChild(Head7);
        this.setRotateAngle(Head7, -0.2972F, 0.0F, 0.0F);
        this.Head7.cubeList.add(new ModelBox(Head7, 17, 13, -1.0F, 0.0F, -1.0F, 2, 2, 3, 0.0F, true));

        this.Head8 = new AdvancedModelRenderer(this);
        this.Head8.setRotationPoint(0.0F, -1.4F, 0.08F);
        this.Head6.addChild(Head8);
        this.setRotateAngle(Head8, -0.2122F, 0.0F, 0.0F);
        this.Head8.cubeList.add(new ModelBox(Head8, 4, 7, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.Head9 = new AdvancedModelRenderer(this);
        this.Head9.setRotationPoint(0.0F, -0.15F, 0.14F);
        this.Head8.addChild(Head9);
        this.setRotateAngle(Head9, -0.8409F, 0.0F, 0.0F);
        this.Head9.cubeList.add(new ModelBox(Head9, 20, 19, -0.5F, 0.0F, -0.35F, 1, 1, 1, 0.0F, true));

        this.teeth5 = new AdvancedModelRenderer(this);
        this.teeth5.setRotationPoint(-0.3F, 0.5F, 0.0F);
        this.Head9.addChild(teeth5);
        this.setRotateAngle(teeth5, -0.5095F, 0.0424F, 0.0848F);
        this.teeth5.cubeList.add(new ModelBox(teeth5, 0, 5, 0.0F, -0.7F, 0.0F, 0, 2, 1, 0.0F, true));

        this.teeth6 = new AdvancedModelRenderer(this);
        this.teeth6.setRotationPoint(0.3F, 0.5F, 0.0F);
        this.Head9.addChild(teeth6);
        this.setRotateAngle(teeth6, -0.5095F, -0.0424F, -0.0848F);
        this.teeth6.cubeList.add(new ModelBox(teeth6, 3, 5, 0.0F, -0.7F, 0.0F, 0, 2, 1, 0.0F, true));

        this.Head10 = new AdvancedModelRenderer(this);
        this.Head10.setRotationPoint(-2.47F, 2.0F, -2.5F);
        this.Head.addChild(Head10);
        this.setRotateAngle(Head10, -0.0038F, -0.2759F, 0.0F);
        this.Head10.cubeList.add(new ModelBox(Head10, 0, 16, 0.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.Head11 = new AdvancedModelRenderer(this);
        this.Head11.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.Head10.addChild(Head11);
        this.setRotateAngle(Head11, -0.0436F, -0.4033F, 0.0F);
        this.Head11.cubeList.add(new ModelBox(Head11, 5, 3, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.teeth7 = new AdvancedModelRenderer(this);
        this.teeth7.setRotationPoint(0.1F, 0.0F, -1.0F);
        this.Head11.addChild(teeth7);
        this.setRotateAngle(teeth7, 0.0F, -0.0424F, 0.4671F);
        this.teeth7.cubeList.add(new ModelBox(teeth7, 0, 8, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.teeth8 = new AdvancedModelRenderer(this);
        this.teeth8.setRotationPoint(0.0F, 0.3F, -1.5F);
        this.Head10.addChild(teeth8);
        this.setRotateAngle(teeth8, 0.2335F, 0.0F, 0.2122F);
        this.teeth8.cubeList.add(new ModelBox(teeth8, 0, 2, 0.0F, -0.2F, -1.0F, 0, 1, 2, 0.0F, true));

        this.Head12 = new AdvancedModelRenderer(this);
        this.Head12.setRotationPoint(2.47F, 2.0F, -2.5F);
        this.Head.addChild(Head12);
        this.setRotateAngle(Head12, 0.0F, 0.2759F, 0.0F);
        this.Head12.cubeList.add(new ModelBox(Head12, 14, 19, -1.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.Head13 = new AdvancedModelRenderer(this);
        this.Head13.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.Head12.addChild(Head13);
        this.setRotateAngle(Head13, -0.0436F, 0.4033F, 0.0F);
        this.Head13.cubeList.add(new ModelBox(Head13, 30, 7, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.teeth9 = new AdvancedModelRenderer(this);
        this.teeth9.setRotationPoint(-0.1F, 0.0F, -1.0F);
        this.Head13.addChild(teeth9);
        this.setRotateAngle(teeth9, 0.0F, 0.0424F, -0.4671F);
        this.teeth9.cubeList.add(new ModelBox(teeth9, 0, 14, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.teeth10 = new AdvancedModelRenderer(this);
        this.teeth10.setRotationPoint(0.0F, 0.3F, -1.5F);
        this.Head12.addChild(teeth10);
        this.setRotateAngle(teeth10, 0.2335F, 0.0F, -0.2122F);
        this.teeth10.cubeList.add(new ModelBox(teeth10, 0, 0, 0.0F, -0.2F, -1.0F, 0, 1, 2, 0.0F, true));

        this.Head14 = new AdvancedModelRenderer(this);
        this.Head14.setRotationPoint(-1.1F, 0.95F, -4.4F);
        this.Head.addChild(Head14);
        this.setRotateAngle(Head14, 0.2546F, -0.2759F, 0.1698F);
        this.Head14.cubeList.add(new ModelBox(Head14, 22, 0, -0.5F, -1.0F, 0.0F, 1, 3, 3, 0.0F, true));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(-0.55F, -0.25F, -0.15F);
        this.Head14.addChild(lefteye);
        this.setRotateAngle(lefteye, -0.2335F, -0.0848F, 0.0F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 22, 30, 0.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.Head15 = new AdvancedModelRenderer(this);
        this.Head15.setRotationPoint(1.1F, 0.95F, -4.4F);
        this.Head.addChild(Head15);
        this.setRotateAngle(Head15, 0.2546F, 0.2759F, -0.1698F);
        this.Head15.cubeList.add(new ModelBox(Head15, 31, 0, -0.5F, -1.0F, 0.0F, 1, 3, 3, 0.0F, true));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(0.55F, -0.25F, -0.15F);
        this.Head15.addChild(righteye);
        this.setRotateAngle(righteye, -0.2335F, 0.0848F, 0.0F);
        this.righteye.cubeList.add(new ModelBox(righteye, 16, 30, -1.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.armRight = new AdvancedModelRenderer(this);
        this.armRight.setRotationPoint(-6.0F, 4.0F, -6.0F);
        this.Chest.addChild(armRight);
        this.setRotateAngle(armRight, -0.1485F, -0.3183F, -0.1698F);
        this.armRight.cubeList.add(new ModelBox(armRight, 75, 45, -5.0F, -1.5F, -2.5F, 6, 3, 5, 0.0F, true));

        this.armRight2 = new AdvancedModelRenderer(this);
        this.armRight2.setRotationPoint(-3.8F, 0.0F, -0.5F);
        this.armRight.addChild(armRight2);
        this.setRotateAngle(armRight2, 0.0F, 0.2546F, 0.0213F);
        this.armRight2.cubeList.add(new ModelBox(armRight2, 74, 54, -7.0F, -1.0F, -2.5F, 7, 2, 6, 0.0F, true));

        this.armRight3 = new AdvancedModelRenderer(this);
        this.armRight3.setRotationPoint(-6.4F, 0.0F, -1.3F);
        this.armRight2.addChild(armRight3);
        this.setRotateAngle(armRight3, 0.0F, 0.2335F, 0.0424F);
        this.armRight3.cubeList.add(new ModelBox(armRight3, 99, 21, -8.0F, -0.5F, -1.0F, 8, 1, 4, 0.0F, true));

        this.armLeft = new AdvancedModelRenderer(this);
        this.armLeft.setRotationPoint(6.0F, 4.0F, -6.0F);
        this.Chest.addChild(armLeft);
        this.setRotateAngle(armLeft, -0.1485F, 0.3183F, 0.1698F);
        this.armLeft.cubeList.add(new ModelBox(armLeft, 101, 54, -1.0F, -1.5F, -2.5F, 6, 3, 5, 0.0F, true));

        this.armLeft2 = new AdvancedModelRenderer(this);
        this.armLeft2.setRotationPoint(3.8F, 0.0F, -0.5F);
        this.armLeft.addChild(armLeft2);
        this.setRotateAngle(armLeft2, 0.0F, -0.2546F, -0.0213F);
        this.armLeft2.cubeList.add(new ModelBox(armLeft2, 100, 11, 0.0F, -1.0F, -2.5F, 7, 2, 6, 0.0F, true));

        this.armLeft3 = new AdvancedModelRenderer(this);
        this.armLeft3.setRotationPoint(6.4F, 0.0F, -1.3F);
        this.armLeft2.addChild(armLeft3);
        this.setRotateAngle(armLeft3, 0.0F, -0.2335F, -0.0424F);
        this.armLeft3.cubeList.add(new ModelBox(armLeft3, 101, 5, 0.0F, -0.5F, -1.0F, 8, 1, 4, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -1.3F, 11.0F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, -0.0424F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 54, 93, -3.5F, -1.5F, 0.0F, 7, 6, 7, 0.0F, true));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.1F, 6.2F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 53, 83, -2.0F, -1.5F, 0.0F, 4, 4, 5, 0.0F, true));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.4F, 4.3F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0213F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 50, 75, -1.5F, -1.0F, 0.0F, 3, 3, 4, 0.0F, true));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.1F, 3.5F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0213F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 65, 76, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, -1.0F, -0.77F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.1911F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 41, 79, -0.5F, 0.0F, 0.0F, 1, 2, 6, 0.0F, true));

        this.Tail6 = new AdvancedModelRenderer(this);
        this.Tail6.setRotationPoint(-0.01F, 2.0F, 6.0F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.6156F, 0.0F, 0.0F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 67, 83, -0.5F, 0.0F, -2.0F, 1, 2, 2, 0.0F, true));

        this.Tail7 = new AdvancedModelRenderer(this);
        this.Tail7.setRotationPoint(0.02F, 2.0F, 0.0F);
        this.Tail6.addChild(Tail7);
        this.setRotateAngle(Tail7, 0.4458F, 0.0F, 0.0F);
        this.Tail7.cubeList.add(new ModelBox(Tail7, 72, 83, -0.5F, -2.0F, -5.0F, 1, 2, 5, 0.0F, true));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-5.5F, 4.0F, 8.0F);
        this.Hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.1911F, 0.4245F, -0.0848F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 48, 44, -6.0F, -1.5F, -3.0F, 7, 3, 6, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-4.8F, 0.0F, -0.9F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.1485F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 98, 44, -8.0F, -1.0F, -2.5F, 8, 2, 7, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-7.5F, 0.0F, -0.7F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.2335F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 100, 63, -9.0F, -0.5F, -1.5F, 9, 1, 5, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(5.5F, 4.0F, 8.0F);
        this.Hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.1911F, -0.4245F, 0.0848F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 27, 35, -1.0F, -1.5F, -3.0F, 7, 3, 6, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(4.8F, 0.0F, -0.9F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -0.1485F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 86, 34, 0.0F, -1.0F, -2.5F, 8, 2, 7, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(7.5F, 0.0F, -0.7F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, -0.2335F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 71, 63, 0.0F, -0.5F, -1.5F, 9, 1, 5, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = -0.2F;
        this.Hips.offsetX = -0.2F;
        this.Hips.rotateAngleY = (float)Math.toRadians(220);
        this.Hips.rotateAngleX = (float)Math.toRadians(18);
        this.Hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.Hips.scaleChildren = true;
        float scaler = 0.4F;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Hips.render(f);
        //Reset rotations, positions and sizing:
        this.Hips.setScale(1.0F, 1.0F, 1.0F);
        this.Hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.Hips.offsetY = -0.35F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.Hips.offsetY = -0.08F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAbyssosaurus ee = (EntityPrehistoricFloraAbyssosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAbyssosaurus entity = (EntityPrehistoricFloraAbyssosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0.75 + (((tickAnim - 7) / 7) * (1.5-(0.75)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1.5 + (((tickAnim - 14) / 6) * (0-(1.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -2.75 + (((tickAnim - 7) / 7) * (2-(-2.75)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 14) / 6) * (0-(2)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -7.25 + (((tickAnim - 7) / 7) * (6.25-(-7.25)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 6.25 + (((tickAnim - 14) / 6) * (0-(6.25)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(xx), Neck5.rotateAngleY + (float) Math.toRadians(yy), Neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -4.25 + (((tickAnim - 7) / 7) * (7.5-(-4.25)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 14) / 6) * (0-(7.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians(xx), Neck6.rotateAngleY + (float) Math.toRadians(yy), Neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -10 + (((tickAnim - 3) / 4) * (8-(-10)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 8 + (((tickAnim - 7) / 7) * (16-(8)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 16 + (((tickAnim - 14) / 6) * (0-(16)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 22.75 + (((tickAnim - 7) / 3) * (31.39-(22.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 31.39 + (((tickAnim - 10) / 4) * (0-(31.39)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        
        
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAbyssosaurus entity = (EntityPrehistoricFloraAbyssosaurus) entitylivingbaseIn;
        int animCycle = 75;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-30))*-5), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-70))*1.5);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*-5), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-420))*5), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*2.5), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-300))*1.5), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-350))*1.5), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(0), Neck5.rotateAngleY + (float) Math.toRadians(0), Neck5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians(0), Neck6.rotateAngleY + (float) Math.toRadians(0), Neck6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*-4.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-280))*-10), armRight2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-400))*-10), armRight2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-120))*-20));
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-220))*-20), armLeft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-400))*25), armLeft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+30))*-15));
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-280))*-10), armLeft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-400))*10), armLeft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-120))*20));
        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*-10), armLeft3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*5), armLeft3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-50))*-30));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-100))*-4), Tail.rotateAngleY + (float) Math.toRadians(0), Tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-150))*-5.5), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-200))*-6), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*-6.5), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-350))*-20), rightLeg.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*-20), rightLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+10))*25));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-300))*-20), rightLeg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*-20), rightLeg2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+10))*10));
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-300))*-10), rightLeg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-550))*-10), rightLeg3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-80))*30));
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-350))*-20), leftLeg.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*20), leftLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+10))*-25));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-300))*-20), leftLeg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*20), leftLeg2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+10))*-10));
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-300))*-10), leftLeg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-550))*10), leftLeg3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-80))*-30));
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-220))*-20), armRight.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-400))*-25), armRight.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+30))*15));
        this.setRotateAngle(armRight3, armRight3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*-10), armRight3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*-5), armRight3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-50))*30));
        
        
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAbyssosaurus entity = (EntityPrehistoricFloraAbyssosaurus) entitylivingbaseIn;
        int animCycle = 43;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-30))*-5), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-70))*-2));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-70))*1.5);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-5), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-420))*5), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-270))*2.5), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-300))*1.5), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-350))*1.5), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(0), Neck5.rotateAngleY + (float) Math.toRadians(0), Neck5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians(0), Neck6.rotateAngleY + (float) Math.toRadians(0), Neck6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*-4.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-20), armRight.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-400))*-25), armRight.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+30))*15));
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-280))*-20), armRight2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-400))*-10), armRight2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-120))*-20));
        this.setRotateAngle(armRight3, armRight3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-10), armRight3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*-5), armRight3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-50))*20));
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-20), armLeft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-400))*25), armLeft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+30))*-15));
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-280))*-20), armLeft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-400))*10), armLeft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-120))*20));
        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-10), armLeft3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*5), armLeft3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-50))*-20));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-150))*-5.5), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-200))*-6), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-6.5), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-350))*-20), rightLeg.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*-25), rightLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+10))*25));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-300))*-20), rightLeg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*-20), rightLeg2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+10))*10));
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-300))*-10), rightLeg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-550))*-10), rightLeg3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-90))*30));
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-350))*-20), leftLeg.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*25), leftLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+10))*-25));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-300))*-20), leftLeg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*20), leftLeg2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+10))*-10));
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-300))*-10), leftLeg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-550))*10), leftLeg3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-90))*-30));
       
        
    }
    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAbyssosaurus entity = (EntityPrehistoricFloraAbyssosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(-9), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(-1.8);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(8.25), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.015),(float)1,(float)1);
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(15.75), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0));
        this.Chest.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.015),(float)1,(float)1);
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(-3.74712), Neck.rotateAngleY + (float) Math.toRadians(-0.14712), Neck.rotateAngleZ + (float) Math.toRadians(-2.24519));
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(-8.57794), Neck2.rotateAngleY + (float) Math.toRadians(5.71298), Neck2.rotateAngleZ + (float) Math.toRadians(-5.88382));
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(2.41599), Neck3.rotateAngleY + (float) Math.toRadians(7.6526), Neck3.rotateAngleZ + (float) Math.toRadians(-4.42368));
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(-7.80757), Neck4.rotateAngleY + (float) Math.toRadians(11.42662), Neck4.rotateAngleZ + (float) Math.toRadians(-2.80499));
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(-2.8104+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+250))*-0.5), Neck5.rotateAngleY + (float) Math.toRadians(11.53455), Neck5.rotateAngleZ + (float) Math.toRadians(-2.8063));
        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians(-4.2494006915+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*0.5), Neck6.rotateAngleY + (float) Math.toRadians(-0.0458), Neck6.rotateAngleZ + (float) Math.toRadians(-1.4993));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-1.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*3), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(0), armRight.rotateAngleY + (float) Math.toRadians(-21.25), armRight.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(0), armRight2.rotateAngleY + (float) Math.toRadians(0), armRight2.rotateAngleZ + (float) Math.toRadians(11.75));
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(0), armLeft2.rotateAngleY + (float) Math.toRadians(0), armLeft2.rotateAngleZ + (float) Math.toRadians(-5));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(12), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(-4.33327), Tail3.rotateAngleY + (float) Math.toRadians(-2.01919), Tail3.rotateAngleZ + (float) Math.toRadians(0.40747));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(27.75));
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(4.34856), rightLeg.rotateAngleY + (float) Math.toRadians(-8.59914), rightLeg.rotateAngleZ + (float) Math.toRadians(-1.50015));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0), rightLeg2.rotateAngleY + (float) Math.toRadians(0), rightLeg2.rotateAngleZ + (float) Math.toRadians(7.5));
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(0), rightLeg3.rotateAngleY + (float) Math.toRadians(0), rightLeg3.rotateAngleZ + (float) Math.toRadians(6.5));
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(4.06126), leftLeg.rotateAngleY + (float) Math.toRadians(-0.26271), leftLeg.rotateAngleZ + (float) Math.toRadians(1.05994));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0), leftLeg2.rotateAngleY + (float) Math.toRadians(0), leftLeg2.rotateAngleZ + (float) Math.toRadians(-11));
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(-4.25));
       
    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        this.faceTarget(f3, f4, 5, Neck4);
        this.faceTarget(f3, f4, 5, Neck5);
        this.faceTarget(f3, f4, 5, Neck6);
        this.faceTarget(f3, f4, 5, Head);

        AdvancedModelRenderer[] fishTail = {this.Tail, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6, this.Tail7};

        EntityPrehistoricFloraAbyssosaurus ee = (EntityPrehistoricFloraAbyssosaurus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

