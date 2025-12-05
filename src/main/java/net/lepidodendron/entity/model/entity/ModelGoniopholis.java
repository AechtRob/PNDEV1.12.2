package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGoniopholis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGoniopholis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Head1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Lefteye;
    private final AdvancedModelRenderer Righteye;
    private final AdvancedModelRenderer Head2;
    private final AdvancedModelRenderer Head3;
    private final AdvancedModelRenderer Head4;
    private final AdvancedModelRenderer Head5;
    private final AdvancedModelRenderer Head8;
    private final AdvancedModelRenderer Teeth3;
    private final AdvancedModelRenderer Teeth;
    private final AdvancedModelRenderer Teeth2;
    private final AdvancedModelRenderer Head6;
    private final AdvancedModelRenderer Teeth4;
    private final AdvancedModelRenderer Teeth5;
    private final AdvancedModelRenderer Teeth6;
    private final AdvancedModelRenderer Head7;
    private final AdvancedModelRenderer Teeth8;
    private final AdvancedModelRenderer Teeth9;
    private final AdvancedModelRenderer Teeth10;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer Jaw1;
    private final AdvancedModelRenderer Jaw2;
    private final AdvancedModelRenderer Jaw3;
    private final AdvancedModelRenderer Jaw4;
    private final AdvancedModelRenderer Teeth11;
    private final AdvancedModelRenderer Jaw5;
    private final AdvancedModelRenderer Teeth12;
    private final AdvancedModelRenderer Teeth13;
    private final AdvancedModelRenderer Jaw6;
    private final AdvancedModelRenderer Jaw7;
    private final AdvancedModelRenderer Teeth14;
    private final AdvancedModelRenderer Jaw8;
    private final AdvancedModelRenderer Teeth15;
    private final AdvancedModelRenderer Jaw9;
    private final AdvancedModelRenderer Jaw10;
    private final AdvancedModelRenderer scute;
    private final AdvancedModelRenderer Throat;
    private final AdvancedModelRenderer Throat2;
    private final AdvancedModelRenderer scute2;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2w;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2w;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer scute3;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Tail6;
    private final AdvancedModelRenderer Tail7;
    private final AdvancedModelRenderer scute4;
    private final AdvancedModelRenderer scute5;
    private final AdvancedModelRenderer scute6;
    private final AdvancedModelRenderer scute7;
    private final AdvancedModelRenderer scute8;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;

    private ModelAnimator animator;

    public ModelGoniopholis() {
        this.textureWidth = 120;
        this.textureHeight = 120;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 17.1F, 9.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.0848F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 45, 86, -4.0F, -1.5F, -5.0F, 8, 7, 7, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.2F, -4.3F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.0637F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 82, -6.0F, -1.5F, -10.0F, 12, 8, 10, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.3F, -9.3F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.1274F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 0, 67, -5.0F, -1.0F, -7.0F, 10, 7, 7, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.4F, -5.5F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.1911F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 52, -4.5F, -1.0F, -7.5F, 9, 6, 8, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -6.7F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.1911F, 0.0F, 0.0F);


        this.Head1 = new AdvancedModelRenderer(this);
        this.Head1.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Head.addChild(Head1);
        this.setRotateAngle(Head1, -0.1061F, 0.0F, 0.0F);
        this.Head1.cubeList.add(new ModelBox(Head1, 63, 74, -2.5F, -1.4704F, -8.9719F, 5, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.2296F, -5.1719F);
        this.Head1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 74, 22, -4.0F, -1.7F, 0.2F, 8, 2, 5, 0.0F, false));

        this.Lefteye = new AdvancedModelRenderer(this);
        this.Lefteye.setRotationPoint(-1.0F, -1.3204F, -5.4719F);
        this.Head1.addChild(Lefteye);
        this.setRotateAngle(Lefteye, 0.0707F, -0.3344F, 0.1911F);
        this.Lefteye.cubeList.add(new ModelBox(Lefteye, 95, 66, -1.0F, -1.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.Righteye = new AdvancedModelRenderer(this);
        this.Righteye.setRotationPoint(1.0F, -1.3204F, -5.4719F);
        this.Head1.addChild(Righteye);
        this.setRotateAngle(Righteye, 0.0707F, 0.3344F, -0.1911F);
        this.Righteye.cubeList.add(new ModelBox(Righteye, 86, 60, -2.0F, -1.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.Head2 = new AdvancedModelRenderer(this);
        this.Head2.setRotationPoint(0.0F, -2.4704F, -4.9719F);
        this.Head1.addChild(Head2);
        this.setRotateAngle(Head2, 0.1934F, 0.0F, 0.0F);
        this.Head2.cubeList.add(new ModelBox(Head2, 56, 66, -1.5F, 0.0F, -5.0F, 3, 1, 6, 0.0F, false));

        this.Head3 = new AdvancedModelRenderer(this);
        this.Head3.setRotationPoint(0.0F, -2.9704F, -3.7719F);
        this.Head1.addChild(Head3);
        this.setRotateAngle(Head3, 0.0873F, 0.0F, 0.0F);
        this.Head3.cubeList.add(new ModelBox(Head3, 82, 74, -3.0F, 0.0F, -0.2F, 6, 2, 4, 0.0F, false));

        this.Head4 = new AdvancedModelRenderer(this);
        this.Head4.setRotationPoint(0.0F, 0.5296F, -8.9719F);
        this.Head1.addChild(Head4);
        this.setRotateAngle(Head4, -0.0637F, 0.0F, 0.0F);
        this.Head4.cubeList.add(new ModelBox(Head4, 69, 87, -2.0F, -2.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.Head5 = new AdvancedModelRenderer(this);
        this.Head5.setRotationPoint(0.0F, -2.3F, -3.0F);
        this.Head4.addChild(Head5);
        this.setRotateAngle(Head5, 0.2972F, 0.0F, 0.0F);
        this.Head5.cubeList.add(new ModelBox(Head5, 91, 87, -1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.Head8 = new AdvancedModelRenderer(this);
        this.Head8.setRotationPoint(0.01F, 0.0F, 0.0F);
        this.Head5.addChild(Head8);
        this.setRotateAngle(Head8, -0.2972F, 0.0F, 0.0F);
        this.Head8.cubeList.add(new ModelBox(Head8, 80, 89, -1.5F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.Teeth3 = new AdvancedModelRenderer(this);
        this.Teeth3.setRotationPoint(0.0F, 1.5F, -1.95F);
        this.Head5.addChild(Teeth3);
        this.setRotateAngle(Teeth3, 0.0424F, 0.0F, 0.0F);
        this.Teeth3.cubeList.add(new ModelBox(Teeth3, 16, 0, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.Teeth = new AdvancedModelRenderer(this);
        this.Teeth.setRotationPoint(-1.52F, -0.25F, -3.1F);
        this.Head4.addChild(Teeth);
        this.setRotateAngle(Teeth, 0.1698F, -0.2122F, 0.3821F);
        this.Teeth.cubeList.add(new ModelBox(Teeth, 6, 0, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Teeth2 = new AdvancedModelRenderer(this);
        this.Teeth2.setRotationPoint(1.52F, -0.25F, -3.1F);
        this.Head4.addChild(Teeth2);
        this.setRotateAngle(Teeth2, 0.1698F, 0.2122F, -0.3821F);
        this.Teeth2.cubeList.add(new ModelBox(Teeth2, 3, 0, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Head6 = new AdvancedModelRenderer(this);
        this.Head6.setRotationPoint(-2.5F, -0.5004F, -8.6719F);
        this.Head1.addChild(Head6);
        this.setRotateAngle(Head6, -0.0175F, -0.3609F, 0.0F);
        this.Head6.cubeList.add(new ModelBox(Head6, 51, 36, 0.0F, -1.0F, -2.0F, 2, 2, 6, 0.0F, false));

        this.Teeth4 = new AdvancedModelRenderer(this);
        this.Teeth4.setRotationPoint(0.2F, 0.4F, 2.7F);
        this.Head6.addChild(Teeth4);
        this.setRotateAngle(Teeth4, 0.0848F, 0.0848F, 0.0F);
        this.Teeth4.cubeList.add(new ModelBox(Teeth4, 7, 5, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, false));

        this.Teeth5 = new AdvancedModelRenderer(this);
        this.Teeth5.setRotationPoint(-0.01F, 1.0F, 0.25F);
        this.Head6.addChild(Teeth5);
        this.setRotateAngle(Teeth5, 0.2122F, 0.1061F, 0.2972F);
        this.Teeth5.cubeList.add(new ModelBox(Teeth5, 0, 3, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Teeth6 = new AdvancedModelRenderer(this);
        this.Teeth6.setRotationPoint(0.01F, 0.8F, -1.5F);
        this.Head6.addChild(Teeth6);
        this.setRotateAngle(Teeth6, 0.2122F, 0.0424F, 0.2335F);
        this.Teeth6.cubeList.add(new ModelBox(Teeth6, 11, 3, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Head7 = new AdvancedModelRenderer(this);
        this.Head7.setRotationPoint(2.5F, -0.5004F, -8.6719F);
        this.Head1.addChild(Head7);
        this.setRotateAngle(Head7, -0.0175F, 0.3609F, 0.0F);
        this.Head7.cubeList.add(new ModelBox(Head7, 43, 45, -2.0F, -1.0F, -2.0F, 2, 2, 6, 0.0F, false));

        this.Teeth8 = new AdvancedModelRenderer(this);
        this.Teeth8.setRotationPoint(-0.3F, 0.4F, 2.7F);
        this.Head7.addChild(Teeth8);
        this.setRotateAngle(Teeth8, 0.0848F, -0.0848F, 0.0F);
        this.Teeth8.cubeList.add(new ModelBox(Teeth8, 15, 3, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, false));

        this.Teeth9 = new AdvancedModelRenderer(this);
        this.Teeth9.setRotationPoint(0.01F, 1.0F, 0.25F);
        this.Head7.addChild(Teeth9);
        this.setRotateAngle(Teeth9, 0.2122F, -0.1061F, -0.2972F);
        this.Teeth9.cubeList.add(new ModelBox(Teeth9, 7, 3, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Teeth10 = new AdvancedModelRenderer(this);
        this.Teeth10.setRotationPoint(-0.01F, 0.8F, -1.5F);
        this.Head7.addChild(Teeth10);
        this.setRotateAngle(Teeth10, 0.2122F, -0.0424F, -0.2335F);
        this.Teeth10.cubeList.add(new ModelBox(Teeth10, 14, 3, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 72, 30, -4.0F, 0.0F, -5.0F, 8, 3, 6, 0.0F, false));

        this.Jaw1 = new AdvancedModelRenderer(this);
        this.Jaw1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Jaw.addChild(Jaw1);
        this.setRotateAngle(Jaw1, -0.1061F, 0.0F, 0.0F);
        this.Jaw1.cubeList.add(new ModelBox(Jaw1, 75, 66, -2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F, false));

        this.Jaw2 = new AdvancedModelRenderer(this);
        this.Jaw2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Jaw1.addChild(Jaw2);
        this.setRotateAngle(Jaw2, -0.0637F, 0.0F, 0.0F);
        this.Jaw2.cubeList.add(new ModelBox(Jaw2, 87, 81, -2.0F, 0.0F, -3.0F, 4, 1, 4, 0.0F, false));

        this.Jaw3 = new AdvancedModelRenderer(this);
        this.Jaw3.setRotationPoint(0.0F, -0.1F, -2.85F);
        this.Jaw2.addChild(Jaw3);
        this.setRotateAngle(Jaw3, 0.1911F, 0.0F, 0.0F);
        this.Jaw3.cubeList.add(new ModelBox(Jaw3, 90, 95, -1.5F, 0.0F, -1.5F, 3, 1, 2, 0.0F, false));

        this.Jaw4 = new AdvancedModelRenderer(this);
        this.Jaw4.setRotationPoint(-0.01F, 1.0F, -1.5F);
        this.Jaw3.addChild(Jaw4);
        this.setRotateAngle(Jaw4, -0.5007F, 0.0F, 0.0F);
        this.Jaw4.cubeList.add(new ModelBox(Jaw4, 96, 59, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.Teeth11 = new AdvancedModelRenderer(this);
        this.Teeth11.setRotationPoint(0.01F, 0.6F, -1.3F);
        this.Jaw3.addChild(Teeth11);
        this.setRotateAngle(Teeth11, 0.0424F, 0.0F, 0.0F);
        this.Teeth11.cubeList.add(new ModelBox(Teeth11, 9, 0, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.Jaw5 = new AdvancedModelRenderer(this);
        this.Jaw5.setRotationPoint(-0.01F, 1.0F, 1.3F);
        this.Jaw2.addChild(Jaw5);
        this.setRotateAngle(Jaw5, -0.0393F, 0.0F, 0.0F);
        this.Jaw5.cubeList.add(new ModelBox(Jaw5, 76, 95, -2.0F, 0.0F, -4.0F, 4, 1, 3, 0.0F, false));

        this.Teeth12 = new AdvancedModelRenderer(this);
        this.Teeth12.setRotationPoint(-2.03F, -0.1F, -2.5F);
        this.Jaw2.addChild(Teeth12);
        this.setRotateAngle(Teeth12, 0.0F, 0.0F, -0.2972F);
        this.Teeth12.cubeList.add(new ModelBox(Teeth12, 0, 6, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Teeth13 = new AdvancedModelRenderer(this);
        this.Teeth13.setRotationPoint(2.03F, -0.1F, -2.5F);
        this.Jaw2.addChild(Teeth13);
        this.setRotateAngle(Teeth13, 0.0F, 0.0F, 0.2972F);
        this.Teeth13.cubeList.add(new ModelBox(Teeth13, 0, 0, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Jaw6 = new AdvancedModelRenderer(this);
        this.Jaw6.setRotationPoint(-0.01F, 2.0F, -3.6F);
        this.Jaw1.addChild(Jaw6);
        this.setRotateAngle(Jaw6, -0.2122F, 0.0F, 0.0F);
        this.Jaw6.cubeList.add(new ModelBox(Jaw6, 68, 81, -2.5F, -1.0F, 0.0F, 5, 1, 4, 0.0F, false));

        this.Jaw7 = new AdvancedModelRenderer(this);
        this.Jaw7.setRotationPoint(-2.6F, 0.97F, -3.4F);
        this.Jaw1.addChild(Jaw7);
        this.setRotateAngle(Jaw7, -0.0175F, -0.3522F, 0.03F);
        this.Jaw7.cubeList.add(new ModelBox(Jaw7, 46, 57, 0.0F, -1.0F, -2.0F, 2, 2, 6, 0.0F, false));

        this.Teeth14 = new AdvancedModelRenderer(this);
        this.Teeth14.setRotationPoint(0.19F, -0.9F, 1.2F);
        this.Jaw7.addChild(Teeth14);
        this.setRotateAngle(Teeth14, 0.0F, 0.104F, -0.1485F);
        this.Teeth14.cubeList.add(new ModelBox(Teeth14, 14, 3, 0.0F, -0.5F, -2.5F, 0, 1, 5, 0.0F, false));

        this.Jaw8 = new AdvancedModelRenderer(this);
        this.Jaw8.setRotationPoint(2.6F, 0.97F, -3.4F);
        this.Jaw1.addChild(Jaw8);
        this.setRotateAngle(Jaw8, -0.0175F, 0.3522F, -0.03F);
        this.Jaw8.cubeList.add(new ModelBox(Jaw8, 81, 50, -2.0F, -1.0F, -2.0F, 2, 2, 6, 0.0F, false));

        this.Teeth15 = new AdvancedModelRenderer(this);
        this.Teeth15.setRotationPoint(-0.19F, -0.9F, 1.2F);
        this.Jaw8.addChild(Teeth15);
        this.setRotateAngle(Teeth15, 0.0F, -0.104F, 0.1485F);
        this.Teeth15.cubeList.add(new ModelBox(Teeth15, 14, 5, 0.0F, -0.5F, -2.5F, 0, 2, 5, 0.0F, false));

        this.Jaw9 = new AdvancedModelRenderer(this);
        this.Jaw9.setRotationPoint(-2.9F, 0.0F, -5.0F);
        this.Jaw.addChild(Jaw9);
        this.setRotateAngle(Jaw9, -0.6156F, -0.0848F, 0.1274F);
        this.Jaw9.cubeList.add(new ModelBox(Jaw9, 84, 40, 0.0F, -4.0F, 0.0F, 3, 4, 5, 0.0F, false));

        this.Jaw10 = new AdvancedModelRenderer(this);
        this.Jaw10.setRotationPoint(2.9F, 0.0F, -5.0F);
        this.Jaw.addChild(Jaw10);
        this.setRotateAngle(Jaw10, -0.6156F, 0.0848F, -0.1274F);
        this.Jaw10.cubeList.add(new ModelBox(Jaw10, 67, 40, -3.0F, -4.0F, 0.0F, 3, 4, 5, 0.0F, false));

        this.scute = new AdvancedModelRenderer(this);
        this.scute.setRotationPoint(-0.01F, -0.4F, 0.0F);
        this.Neck.addChild(scute);
        this.scute.cubeList.add(new ModelBox(scute, 57, 12, -2.0F, -1.0F, -7.5F, 4, 1, 8, 0.0F, false));

        this.Throat = new AdvancedModelRenderer(this);
        this.Throat.setRotationPoint(0.0F, 5.0F, -8.0F);
        this.Neck.addChild(Throat);
        this.setRotateAngle(Throat, -0.3396F, 0.0F, 0.0F);
        this.Throat.cubeList.add(new ModelBox(Throat, 63, 59, -3.5F, -2.0F, 0.0F, 7, 2, 4, 0.0F, false));

        this.Throat2 = new AdvancedModelRenderer(this);
        this.Throat2.setRotationPoint(0.01F, 0.0F, 4.0F);
        this.Throat.addChild(Throat2);
        this.setRotateAngle(Throat2, 0.5519F, 0.0F, 0.0F);
        this.Throat2.cubeList.add(new ModelBox(Throat2, 56, 50, -3.5F, -2.0F, 0.0F, 7, 2, 5, 0.0F, false));

        this.scute2 = new AdvancedModelRenderer(this);
        this.scute2.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Chest.addChild(scute2);
        this.scute2.cubeList.add(new ModelBox(scute2, 36, 12, -2.5F, -1.0F, -7.0F, 5, 1, 7, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-4.5F, 4.0F, -5.5F);
        this.Chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.0283F, -0.8915F, -0.0213F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 36, 22, -2.0F, -1.5F, -0.5F, 3, 3, 6, 0.0F, false));

        this.rightArm2w = new AdvancedModelRenderer(this);
        this.rightArm2w.setRotationPoint(-0.225F, -1.025F, 5.0F);
        this.rightArm.addChild(rightArm2w);


        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightArm2w.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.3379F, 0.9043F, 0.5629F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 63, 0, -1.5F, 0.0F, -2.0F, 3, 5, 3, 0.0F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 4.5F, -0.5F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0363F, 0.2335F, -0.2759F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 100, 7, -2.5F, -0.425F, -3.5F, 5, 1, 4, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(4.5F, 4.0F, -5.5F);
        this.Chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.0283F, 0.8915F, 0.0213F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 36, 22, -1.0F, -1.5F, -0.5F, 3, 3, 6, 0.0F, true));

        this.leftArm2w = new AdvancedModelRenderer(this);
        this.leftArm2w.setRotationPoint(0.225F, -1.025F, 5.0F);
        this.leftArm.addChild(leftArm2w);


        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftArm2w.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.3379F, -0.9043F, -0.5629F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 63, 0, -1.5F, 0.0F, -2.0F, 3, 5, 3, 0.0F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 4.5F, -0.5F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0363F, -0.2335F, 0.2759F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 100, 7, -2.5F, -0.425F, -3.5F, 5, 1, 4, 0.0F, true));

        this.scute3 = new AdvancedModelRenderer(this);
        this.scute3.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Body.addChild(scute3);
        this.scute3.cubeList.add(new ModelBox(scute3, 40, 0, -3.0F, -1.0F, -10.0F, 6, 1, 10, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.2F, 1.3F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, -0.0637F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 36, -3.5F, -1.5F, 0.0F, 7, 6, 9, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.2F, 8.3F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0213F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 35, 72, -3.0F, -1.5F, 0.0F, 6, 5, 8, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.1F, 7.3F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0424F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 28, 59, -2.0F, -1.5F, 0.0F, 4, 4, 8, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.2F, 7.3F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0424F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 27, 46, -1.5F, -1.0F, 0.0F, 3, 3, 9, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.4F, 8.3F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.0213F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 24, 33, -1.0F, -1.0F, 0.0F, 2, 2, 9, 0.0F, false));

        this.Tail6 = new AdvancedModelRenderer(this);
        this.Tail6.setRotationPoint(-0.01F, 0.0F, 0.0F);
        this.Tail5.addChild(Tail6);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 75, 0, 0.0F, -4.0F, 0.0F, 0, 5, 12, 0.0F, false));

        this.Tail7 = new AdvancedModelRenderer(this);
        this.Tail7.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Tail4.addChild(Tail7);
        this.Tail7.cubeList.add(new ModelBox(Tail7, 81, 9, 0.0F, -2.0F, 0.0F, 0, 2, 9, 0.0F, false));

        this.scute4 = new AdvancedModelRenderer(this);
        this.scute4.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Tail3.addChild(scute4);
        this.setRotateAngle(scute4, 0.0637F, 0.0F, 0.0F);
        this.scute4.cubeList.add(new ModelBox(scute4, 19, 0, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.scute5 = new AdvancedModelRenderer(this);
        this.scute5.setRotationPoint(0.0F, -1.2F, 3.8F);
        this.Tail3.addChild(scute5);
        this.setRotateAngle(scute5, 0.0424F, 0.0F, 0.0F);
        this.scute5.cubeList.add(new ModelBox(scute5, 0, 6, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.scute6 = new AdvancedModelRenderer(this);
        this.scute6.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Tail2.addChild(scute6);
        this.scute6.cubeList.add(new ModelBox(scute6, 51, 24, -1.5F, -1.0F, 0.0F, 3, 1, 8, 0.0F, false));

        this.scute7 = new AdvancedModelRenderer(this);
        this.scute7.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Tail.addChild(scute7);
        this.scute7.cubeList.add(new ModelBox(scute7, 73, 0, -2.0F, -1.0F, 0.0F, 4, 1, 9, 0.0F, false));

        this.scute8 = new AdvancedModelRenderer(this);
        this.scute8.setRotationPoint(0.0F, -0.9F, 0.0F);
        this.Hips.addChild(scute8);
        this.setRotateAngle(scute8, -0.0424F, 0.0F, 0.0F);
        this.scute8.cubeList.add(new ModelBox(scute8, 25, 0, -2.5F, -1.0F, -5.0F, 5, 1, 7, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.3F, 1.51F, -0.5F);
        this.Hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0213F, 0.6793F, 0.1061F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 24, -2.0F, -1.5F, -6.5F, 3, 4, 7, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.3F, 0.5F, -6.1F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.1698F, -0.3396F, 0.1274F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 21, 22, -1.5F, -0.5F, -0.5F, 3, 6, 4, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 5.0F, 1.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.0637F, 0.0F, -0.1911F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 96, 37, -2.0F, 0.0F, -3.5F, 4, 1, 5, 0.0F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.0F, 0.49F, -3.5F);
        this.rightLeg3.addChild(rightleg4);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 97, 20, -2.5F, -0.5F, -2.5F, 5, 1, 3, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(3.3F, 1.51F, -0.5F);
        this.Hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0213F, -0.6793F, -0.1061F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 12, -1.0F, -1.5F, -6.5F, 3, 4, 7, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.3F, 0.5F, -6.1F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1698F, 0.3396F, -0.1274F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 21, 11, -1.5F, -0.5F, -0.5F, 3, 6, 4, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 5.0F, 1.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.0637F, 0.0F, 0.1911F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 96, 25, -2.0F, 0.0F, -3.5F, 4, 1, 5, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 0.49F, -3.5F);
        this.leftLeg3.addChild(leftLeg4);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 101, 32, -2.5F, -0.5F, -2.5F, 5, 1, 3, 0.0F, false));


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
        this.root.offsetY = 0.2F;
        this.root.offsetX = 0.36F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 0.6F;
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
        this.root.rotateAngleX = (float) Math.toRadians(90);
        this.root.offsetY = -0.2F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.105F;
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

        EntityPrehistoricFloraGoniopholis entityGoniopholis = (EntityPrehistoricFloraGoniopholis) e;


        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6};
        AdvancedModelRenderer[] Neck = {this.Neck, this.Head};
        entityGoniopholis.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityGoniopholis.getAnimation() == entityGoniopholis.LAY_ANIMATION || entityGoniopholis.getAnimation() == entityGoniopholis.STAND_ANIMATION) {
            this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
            this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);

        }
        else {
            if (!entityGoniopholis.isReallyInWater()) {

                if (f3 == 0.0F || !entityGoniopholis.getIsMoving()) {
                    if (entityGoniopholis.getAnimation() != entityGoniopholis.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityGoniopholis.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.Righteye.setScale(1,1,1);
        this.Lefteye.setScale(1,1,1);

        EntityPrehistoricFloraGoniopholis ee = (EntityPrehistoricFloraGoniopholis) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getIsFast());
            }
        } else {
            //Swimming pose:
            //moving in water
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGoniopholis entity = (EntityPrehistoricFloraGoniopholis) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.08623-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.94969-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.33387-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.08623 + (((tickAnim - 5) / 4) * (-1.90986-(-0.08623)));
            yy = -7.94969 + (((tickAnim - 5) / 4) * (-8.51315-(-7.94969)));
            zz = -0.33387 + (((tickAnim - 5) / 4) * (-3.31117-(-0.33387)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -1.90986 + (((tickAnim - 9) / 7) * (-10.25-(-1.90986)));
            yy = -8.51315 + (((tickAnim - 9) / 7) * (0-(-8.51315)));
            zz = -3.31117 + (((tickAnim - 9) / 7) * (0-(-3.31117)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -10.25 + (((tickAnim - 16) / 3) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -10.25 + (((tickAnim - 19) / 4) * (-10.19686-(-10.25)));
            yy = 0 + (((tickAnim - 19) / 4) * (-1.53568-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (-3.96333-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -10.19686 + (((tickAnim - 23) / 4) * (-15.84843-(-10.19686)));
            yy = -1.53568 + (((tickAnim - 23) / 4) * (-0.76784-(-1.53568)));
            zz = -3.96333 + (((tickAnim - 23) / 4) * (-1.98166-(-3.96333)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -15.84843 + (((tickAnim - 27) / 3) * (-15.34843-(-15.84843)));
            yy = -0.76784 + (((tickAnim - 27) / 3) * (-0.76784-(-0.76784)));
            zz = -1.98166 + (((tickAnim - 27) / 3) * (-1.98166-(-1.98166)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -15.34843 + (((tickAnim - 30) / 5) * (0-(-15.34843)));
            yy = -0.76784 + (((tickAnim - 30) / 5) * (0-(-0.76784)));
            zz = -1.98166 + (((tickAnim - 30) / 5) * (0-(-1.98166)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.89347-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (14.03535-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.75415-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 4.89347 + (((tickAnim - 5) / 4) * (11.48596-(4.89347)));
            yy = 14.03535 + (((tickAnim - 5) / 4) * (17.04317-(14.03535)));
            zz = -2.75415 + (((tickAnim - 5) / 4) * (-1.4762-(-2.75415)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 11.48596 + (((tickAnim - 9) / 3) * (13.28126-(11.48596)));
            yy = 17.04317 + (((tickAnim - 9) / 3) * (9.94947-(17.04317)));
            zz = -1.4762 + (((tickAnim - 9) / 3) * (-5.56616-(-1.4762)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 13.28126 + (((tickAnim - 12) / 2) * (-8.78697-(13.28126)));
            yy = 9.94947 + (((tickAnim - 12) / 2) * (7.5849-(9.94947)));
            zz = -5.56616 + (((tickAnim - 12) / 2) * (-6.92949-(-5.56616)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -8.78697 + (((tickAnim - 14) / 4) * (1-(-8.78697)));
            yy = 7.5849 + (((tickAnim - 14) / 4) * (0-(7.5849)));
            zz = -6.92949 + (((tickAnim - 14) / 4) * (0-(-6.92949)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 18) / 5) * (-19.98527-(1)));
            yy = 0 + (((tickAnim - 18) / 5) * (-0.37617-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-4.48428-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -19.98527 + (((tickAnim - 23) / 4) * (-0.24264-(-19.98527)));
            yy = -0.37617 + (((tickAnim - 23) / 4) * (-0.18808-(-0.37617)));
            zz = -4.48428 + (((tickAnim - 23) / 4) * (-2.24214-(-4.48428)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -0.24264 + (((tickAnim - 27) / 3) * (-0.24264-(-0.24264)));
            yy = -0.18808 + (((tickAnim - 27) / 3) * (-0.18808-(-0.18808)));
            zz = -2.24214 + (((tickAnim - 27) / 3) * (-2.24214-(-2.24214)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.24264 + (((tickAnim - 30) / 5) * (0-(-0.24264)));
            yy = -0.18808 + (((tickAnim - 30) / 5) * (0-(-0.18808)));
            zz = -2.24214 + (((tickAnim - 30) / 5) * (0-(-2.24214)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 13) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 13) / 2) * (0.5375-(1)));
            zz = 1 + (((tickAnim - 13) / 2) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 15) / 3) * (1-(1)));
            yy = 0.5375 + (((tickAnim - 15) / 3) * (1-(0.5375)));
            zz = 1 + (((tickAnim - 15) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Lefteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 13) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 13) / 2) * (0.5375-(1)));
            zz = 1 + (((tickAnim - 13) / 2) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 15) / 3) * (1-(1)));
            yy = 0.5375 + (((tickAnim - 15) / 3) * (1-(0.5375)));
            zz = 1 + (((tickAnim - 15) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Righteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 17 + (((tickAnim - 5) / 4) * (0-(17)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (19.5-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 19.5 + (((tickAnim - 14) / 3) * (0-(19.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (19.5-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 19.5 + (((tickAnim - 22) / 3) * (0-(19.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-6.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = -6.25 + (((tickAnim - 5) / 4) * (-6.25-(-6.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = -6.25 + (((tickAnim - 9) / 4) * (3.5-(-6.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 3.5 + (((tickAnim - 13) / 5) * (-3.75-(3.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = -3.75 + (((tickAnim - 18) / 5) * (5-(-3.75)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 23) / 4) * (-7.5-(5)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = -7.5 + (((tickAnim - 27) / 8) * (0-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.25-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            yy = 0.25 + (((tickAnim - 23) / 12) * (0-(0.25)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Throat.rotationPointX = this.Throat.rotationPointX + (float)(xx);
        this.Throat.rotationPointY = this.Throat.rotationPointY - (float)(yy);
        this.Throat.rotationPointZ = this.Throat.rotationPointZ + (float)(zz);

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGoniopholis entity = (EntityPrehistoricFloraGoniopholis) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.75 + (((tickAnim - 3) / 5) * (-10.5-(1.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -10.5 + (((tickAnim - 8) / 2) * (-11-(-10.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -11 + (((tickAnim - 10) / 3) * (0-(-11)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.75 + (((tickAnim - 3) / 5) * (-17.75-(-7.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -17.75 + (((tickAnim - 8) / 5) * (0-(-17.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -8 + (((tickAnim - 7) / 2) * (0-(-8)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head1, Head1.rotateAngleX + (float) Math.toRadians(xx), Head1.rotateAngleY + (float) Math.toRadians(yy), Head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 3.25 + (((tickAnim - 3) / 4) * (40.75-(3.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 40.75 + (((tickAnim - 7) / 2) * (0-(40.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 4 + (((tickAnim - 3) / 1) * (7.75-(4)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 7.75 + (((tickAnim - 4) / 4) * (0-(7.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -1.75 + (((tickAnim - 10) / 3) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.075 + (((tickAnim - 4) / 4) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Throat.rotationPointX = this.Throat.rotationPointX + (float)(xx);
        this.Throat.rotationPointY = this.Throat.rotationPointY - (float)(yy);
        this.Throat.rotationPointZ = this.Throat.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGoniopholis entity = (EntityPrehistoricFloraGoniopholis) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -1 + (((tickAnim - 15) / 15) * (-1-(-1)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1 + (((tickAnim - 30) / 20) * (0-(-1)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -1.3 + (((tickAnim - 15) / 15) * (-1.3-(-1.3)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -1.3 + (((tickAnim - 30) / 20) * (0-(-1.3)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 8.5 + (((tickAnim - 15) / 15) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.5 + (((tickAnim - 30) / 20) * (0-(8.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-8-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 15) / 15) * (-6-(-6)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -8 + (((tickAnim - 15) / 15) * (-8-(-8)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 30) / 20) * (0-(-6)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -8 + (((tickAnim - 30) / 20) * (0-(-8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 8.5 + (((tickAnim - 15) / 15) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.5 + (((tickAnim - 30) / 20) * (0-(8.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (8-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 15) / 15) * (-6-(-6)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 8 + (((tickAnim - 15) / 15) * (8-(8)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 30) / 20) * (0-(-6)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 8 + (((tickAnim - 30) / 20) * (0-(8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 1.5 + (((tickAnim - 15) / 15) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1.5 + (((tickAnim - 30) / 20) * (0-(1.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -8 + (((tickAnim - 15) / 15) * (-8-(-8)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 30) / 20) * (0-(-8)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 7.25 + (((tickAnim - 15) / 15) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 30) / 20) * (0-(7.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -8 + (((tickAnim - 15) / 15) * (-8-(-8)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 30) / 20) * (0-(-8)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 7.25 + (((tickAnim - 15) / 15) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 30) / 20) * (0-(7.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGoniopholis entity = (EntityPrehistoricFloraGoniopholis) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (73.38492-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-3.4558-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-79.01733-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 73.38492 + (((tickAnim - 18) / 17) * (31.84759-(73.38492)));
            yy = -3.4558 + (((tickAnim - 18) / 17) * (-0.25775-(-3.4558)));
            zz = -79.01733 + (((tickAnim - 18) / 17) * (-56.39074-(-79.01733)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 31.84759 + (((tickAnim - 35) / 15) * (0-(31.84759)));
            yy = -0.25775 + (((tickAnim - 35) / 15) * (0-(-0.25775)));
            zz = -56.39074 + (((tickAnim - 35) / 15) * (0-(-56.39074)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-16.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = -16.5 + (((tickAnim - 7) / 11) * (0-(-16.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (14.20492-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-1.83204-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-5.41904-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 14.20492 + (((tickAnim - 7) / 11) * (75.35042-(14.20492)));
            yy = -1.83204 + (((tickAnim - 7) / 11) * (-4.80909-(-1.83204)));
            zz = -5.41904 + (((tickAnim - 7) / 11) * (-14.22498-(-5.41904)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 75.35042 + (((tickAnim - 18) / 17) * (4.02712-(75.35042)));
            yy = -4.80909 + (((tickAnim - 18) / 17) * (-2.21958-(-4.80909)));
            zz = -14.22498 + (((tickAnim - 18) / 17) * (-6.56537-(-14.22498)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4.02712 + (((tickAnim - 35) / 15) * (0-(4.02712)));
            yy = -2.21958 + (((tickAnim - 35) / 15) * (0-(-2.21958)));
            zz = -6.56537 + (((tickAnim - 35) / 15) * (0-(-6.56537)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (39-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = 39 + (((tickAnim - 18) / 32) * (0-(39)));
            yy = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGoniopholis entity = (EntityPrehistoricFloraGoniopholis) entitylivingbaseIn;
        int animCycle = 635;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 0) / 635) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 635) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 635) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = -1.1 + (((tickAnim - 30) / 30) * (-1.1-(-1.1)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            yy = -1.1 + (((tickAnim - 60) / 440) * (-1.1-(-1.1)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = -1.1 + (((tickAnim - 500) / 100) * (-1.1-(-1.1)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            yy = -1.1 + (((tickAnim - 600) / 35) * (0-(-1.1)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 9.25 + (((tickAnim - 30) / 30) * (9.75-(9.25)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = 9.75 + (((tickAnim - 60) / 440) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 9.75 + (((tickAnim - 500) / 100) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = 9.75 + (((tickAnim - 600) / 35) * (0-(9.75)));
            yy = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -4.5 + (((tickAnim - 30) / 30) * (-23.75-(-4.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 480) {
            xx = -23.75 + (((tickAnim - 60) / 420) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 60) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 420) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = -23.75 + (((tickAnim - 480) / 20) * (-1.75-(-23.75)));
            yy = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 20) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -1.75 + (((tickAnim - 500) / 100) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = -1.75 + (((tickAnim - 600) / 35) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head1, Head1.rotateAngleX + (float) Math.toRadians(xx), Head1.rotateAngleY + (float) Math.toRadians(yy), Head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 140 && tickAnim < 180) {
            xx = 1 + (((tickAnim - 140) / 40) * (1-(1)));
            yy = 1 + (((tickAnim - 140) / 40) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 140) / 40) * (1-(1)));
        }
        else if (tickAnim >= 180 && tickAnim < 466) {
            xx = 1 + (((tickAnim - 180) / 286) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 180) / 286) * (0.0325-(0.0325)));
            zz = 1 + (((tickAnim - 180) / 286) * (1-(1)));
        }
        else if (tickAnim >= 466 && tickAnim < 485) {
            xx = 1 + (((tickAnim - 466) / 19) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 466) / 19) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 466) / 19) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Lefteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 140 && tickAnim < 180) {
            xx = 1 + (((tickAnim - 140) / 40) * (1-(1)));
            yy = 1 + (((tickAnim - 140) / 40) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 140) / 40) * (1-(1)));
        }
        else if (tickAnim >= 180 && tickAnim < 466) {
            xx = 1 + (((tickAnim - 180) / 286) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 180) / 286) * (0.0325-(0.0325)));
            zz = 1 + (((tickAnim - 180) / 286) * (1-(1)));
        }
        else if (tickAnim >= 466 && tickAnim < 485) {
            xx = 1 + (((tickAnim - 466) / 19) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 466) / 19) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 466) / 19) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Righteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (21.25-(0)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 480) {
            xx = 21.25 + (((tickAnim - 60) / 420) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 60) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 420) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 500) {
            xx = 21.25 + (((tickAnim - 480) / 20) * (0-(21.25)));
            yy = 0 + (((tickAnim - 480) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 20) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 14.75 + (((tickAnim - 30) / 30) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = 14.75 + (((tickAnim - 60) / 440) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 14.75 + (((tickAnim - 500) / 100) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = 14.75 + (((tickAnim - 600) / 35) * (0-(14.75)));
            yy = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -13.75 + (((tickAnim - 30) / 30) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = -13.75 + (((tickAnim - 60) / 440) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -13.75 + (((tickAnim - 500) / 100) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = -13.75 + (((tickAnim - 600) / 35) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2w, rightArm2w.rotateAngleX + (float) Math.toRadians(xx), rightArm2w.rotateAngleY + (float) Math.toRadians(yy), rightArm2w.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 14.75 + (((tickAnim - 30) / 30) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = 14.75 + (((tickAnim - 60) / 440) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 14.75 + (((tickAnim - 500) / 100) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = 14.75 + (((tickAnim - 600) / 35) * (0-(14.75)));
            yy = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -13.75 + (((tickAnim - 30) / 30) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = -13.75 + (((tickAnim - 60) / 440) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -13.75 + (((tickAnim - 500) / 100) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = -13.75 + (((tickAnim - 600) / 35) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2w, leftArm2w.rotateAngleX + (float) Math.toRadians(xx), leftArm2w.rotateAngleY + (float) Math.toRadians(yy), leftArm2w.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0.75 + (((tickAnim - 30) / 30) * (0.75-(0.75)));
            yy = 3.25 + (((tickAnim - 30) / 30) * (3.25-(3.25)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = 0.75 + (((tickAnim - 60) / 440) * (0.75-(0.75)));
            yy = 3.25 + (((tickAnim - 60) / 440) * (3.25-(3.25)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0.75 + (((tickAnim - 500) / 100) * (0.75-(0.75)));
            yy = 3.25 + (((tickAnim - 500) / 100) * (3.25-(3.25)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = 0.75 + (((tickAnim - 600) / 35) * (0-(0.75)));
            yy = 3.25 + (((tickAnim - 600) / 35) * (0-(3.25)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (4.25-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 4.25 + (((tickAnim - 30) / 30) * (4.25-(4.25)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            yy = 4.25 + (((tickAnim - 60) / 440) * (4.25-(4.25)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = 4.25 + (((tickAnim - 500) / 100) * (4.25-(4.25)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            yy = 4.25 + (((tickAnim - 600) / 35) * (0-(4.25)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 7.5 + (((tickAnim - 30) / 30) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            yy = 7.5 + (((tickAnim - 60) / 440) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = 7.5 + (((tickAnim - 500) / 100) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            yy = 7.5 + (((tickAnim - 600) / 35) * (0-(7.5)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (7-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 7 + (((tickAnim - 30) / 30) * (7-(7)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            yy = 7 + (((tickAnim - 60) / 440) * (7-(7)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = 7 + (((tickAnim - 500) / 100) * (7-(7)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            yy = 7 + (((tickAnim - 600) / 35) * (0-(7)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-15-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -15 + (((tickAnim - 15) / 15) * (6-(-15)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 6 + (((tickAnim - 30) / 30) * (6-(6)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            yy = 6 + (((tickAnim - 60) / 440) * (6-(6)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = 6 + (((tickAnim - 500) / 100) * (6-(6)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            yy = 6 + (((tickAnim - 600) / 35) * (0-(6)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 30) / 30) * (-5-(-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = -5 + (((tickAnim - 60) / 440) * (-5-(-5)));
            yy = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -5 + (((tickAnim - 500) / 100) * (-5-(-5)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = -5 + (((tickAnim - 600) / 35) * (0-(-5)));
            yy = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 6.25 + (((tickAnim - 30) / 30) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = 6.25 + (((tickAnim - 60) / 440) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 6.25 + (((tickAnim - 500) / 100) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = 6.25 + (((tickAnim - 600) / 35) * (0-(6.25)));
            yy = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 0.3 + (((tickAnim - 30) / 30) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            yy = 0.3 + (((tickAnim - 60) / 440) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = 0.3 + (((tickAnim - 500) / 100) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            yy = 0.3 + (((tickAnim - 600) / 35) * (0-(0.3)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 30) / 30) * (-5-(-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = -5 + (((tickAnim - 60) / 440) * (-5-(-5)));
            yy = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -5 + (((tickAnim - 500) / 100) * (-5-(-5)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = -5 + (((tickAnim - 600) / 35) * (0-(-5)));
            yy = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 6.25 + (((tickAnim - 30) / 30) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = 6.25 + (((tickAnim - 60) / 440) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 6.25 + (((tickAnim - 500) / 100) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = 6.25 + (((tickAnim - 600) / 35) * (0-(6.25)));
            yy = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 0.3 + (((tickAnim - 30) / 30) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 60) / 440) * (0-(0)));
            yy = 0.3 + (((tickAnim - 60) / 440) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 60) / 440) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = 0.3 + (((tickAnim - 500) / 100) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 600) / 35) * (0-(0)));
            yy = 0.3 + (((tickAnim - 600) / 35) * (0-(0.3)));
            zz = 0 + (((tickAnim - 600) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGoniopholis entity = (EntityPrehistoricFloraGoniopholis) entitylivingbaseIn;
        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (0.9725-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0.9725 + (((tickAnim - 20) / 20) * (1.0475-(0.9725)));
            yy = 1 + (((tickAnim - 20) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 20) / 20) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 1.0475 + (((tickAnim - 40) / 15) * (1-(1.0475)));
            yy = 1 + (((tickAnim - 40) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 40) / 15) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Body.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1.0375-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 1.0375 + (((tickAnim - 20) / 20) * (0.955-(1.0375)));
            yy = 1 + (((tickAnim - 20) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 20) / 20) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0.955 + (((tickAnim - 40) / 15) * (1-(0.955)));
            yy = 1 + (((tickAnim - 40) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 40) / 15) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Chest.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -16.75 + (((tickAnim - 20) / 15) * (-11.5-(-16.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = -11.5 + (((tickAnim - 35) / 18) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.875-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 20) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 33) * (0-(0)));
            zz = 0.875 + (((tickAnim - 20) / 33) * (0-(0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck.rotationPointX = this.Neck.rotationPointX + (float)(xx);
        this.Neck.rotationPointY = this.Neck.rotationPointY - (float)(yy);
        this.Neck.rotationPointZ = this.Neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (-17-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -17 + (((tickAnim - 40) / 15) * (0-(-17)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 11.5 + (((tickAnim - 20) / 20) * (-19.75-(11.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -19.75 + (((tickAnim - 40) / 15) * (0-(-19.75)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0.525 + (((tickAnim - 20) / 20) * (0.3-(0.525)));
            zz = 0 + (((tickAnim - 20) / 20) * (-1.025-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0.3 + (((tickAnim - 40) / 15) * (0-(0.3)));
            zz = -1.025 + (((tickAnim - 40) / 15) * (0-(-1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Throat.rotationPointX = this.Throat.rotationPointX + (float)(xx);
        this.Throat.rotationPointY = this.Throat.rotationPointY - (float)(yy);
        this.Throat.rotationPointZ = this.Throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (0.1575-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 20) / 20) * (1-(1)));
            yy = 0.1575 + (((tickAnim - 20) / 20) * (2.125-(0.1575)));
            zz = 1 + (((tickAnim - 20) / 20) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 40) / 15) * (1-(1)));
            yy = 2.125 + (((tickAnim - 40) / 15) * (1-(2.125)));
            zz = 1 + (((tickAnim - 40) / 15) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Throat.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGoniopholis entity = (EntityPrehistoricFloraGoniopholis) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*1), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-0.15);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*-1), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0), Chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-140))*-1), Chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(5.5), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-180))*1), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-6), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(29.83646), rightArm.rotateAngleY + (float) Math.toRadians(32.11219), rightArm.rotateAngleZ + (float) Math.toRadians(-81.63009));
        this.setRotateAngle(rightArm2w, rightArm2w.rotateAngleX + (float) Math.toRadians(109.50165), rightArm2w.rotateAngleY + (float) Math.toRadians(55.80319), rightArm2w.rotateAngleZ + (float) Math.toRadians(136.07015));
        this.rightArm2w.rotationPointX = this.rightArm2w.rotationPointX + (float)(-0.3);
        this.rightArm2w.rotationPointY = this.rightArm2w.rotationPointY - (float)(-1.425);
        this.rightArm2w.rotationPointZ = this.rightArm2w.rotationPointZ + (float)(-0.825);
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-19.5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(102.04617), rightArm3.rotateAngleY + (float) Math.toRadians(-13.91991), rightArm3.rotateAngleZ + (float) Math.toRadians(5.49654));
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(29.83646), leftArm.rotateAngleY + (float) Math.toRadians(-32.11219), leftArm.rotateAngleZ + (float) Math.toRadians(81.63009));
        this.setRotateAngle(leftArm2w, leftArm2w.rotateAngleX + (float) Math.toRadians(109.50165), leftArm2w.rotateAngleY + (float) Math.toRadians(-55.80319), leftArm2w.rotateAngleZ + (float) Math.toRadians(-136.07015));
        this.leftArm2w.rotationPointX = this.leftArm2w.rotationPointX + (float)(0.3);
        this.leftArm2w.rotationPointY = this.leftArm2w.rotationPointY - (float)(-1.425);
        this.leftArm2w.rotationPointZ = this.leftArm2w.rotationPointZ + (float)(-0.825);
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-19.5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(102.04617), leftArm3.rotateAngleY + (float) Math.toRadians(13.91991), leftArm3.rotateAngleZ + (float) Math.toRadians(-5.49654));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*3), Tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*6), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*9), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*12), Tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0), Tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-300))*15), Tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(126.4398594867+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2), rightLeg.rotateAngleY + (float) Math.toRadians(-24.46809), rightLeg.rotateAngleZ + (float) Math.toRadians(70.16915));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-48.49273), rightLeg2.rotateAngleY + (float) Math.toRadians(16.02309), rightLeg2.rotateAngleZ + (float) Math.toRadians(-9.28289));
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(83.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*4), rightLeg3.rotateAngleY + (float) Math.toRadians(0), rightLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(3.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-130))*6), rightleg4.rotateAngleY + (float) Math.toRadians(0), rightleg4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(126.4398594867+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-2), leftLeg.rotateAngleY + (float) Math.toRadians(24.46809), leftLeg.rotateAngleZ + (float) Math.toRadians(-70.16915));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-48.49273), leftLeg2.rotateAngleY + (float) Math.toRadians(-16.02309), leftLeg2.rotateAngleZ + (float) Math.toRadians(9.28289));
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(83.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-4), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(3.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-130))*-6), leftLeg4.rotateAngleY + (float) Math.toRadians(0), leftLeg4.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isFast) {
        EntityPrehistoricFloraGoniopholis entity = (EntityPrehistoricFloraGoniopholis) entitylivingbaseIn;
        int animCycle = 45;
        float runFactor = 1F;
        if (entity.getIsFast()) {
            runFactor = 0.5F;
        }
        double tickAnim;
        if (isFast) {
            tickAnim = ((entity.ticksExisted * 1.6) + entity.getTickOffset()) - (int) (Math.floor((double) ((entity.ticksExisted * 1.6) + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + (partialTickTime * 1.6);
        }
        else {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-50))*0.8), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-90))*2), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-80))*1.5));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160))*-0.09);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-100))*0.25);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-90))*(0.8 * runFactor));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(-3.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-90))*-1.2), Chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-100))*-2), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-80))*-1.5));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 13.37531 + (((tickAnim - 0) / 13) * (27.05012-(13.37531)));
            yy = 25.96434 + (((tickAnim - 0) / 13) * (-31.76242-(25.96434)));
            zz = -15.90731 + (((tickAnim - 0) / 13) * (-8.56558-(-15.90731)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 27.05012 + (((tickAnim - 13) / 7) * (0-(27.05012)));
            yy = -31.76242 + (((tickAnim - 13) / 7) * (-60.75-(-31.76242)));
            zz = -8.56558 + (((tickAnim - 13) / 7) * (0-(-8.56558)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (13.37531-(0)));
            yy = -60.75 + (((tickAnim - 20) / 25) * (25.96434-(-60.75)));
            zz = 0 + (((tickAnim - 20) / 25) * (-15.90731-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 69.89134 + (((tickAnim - 0) / 5) * (125.98961-(69.89134)));
            yy = -17.10099 + (((tickAnim - 0) / 5) * (-14.45867-(-17.10099)));
            zz = 9.29922 + (((tickAnim - 0) / 5) * (7.84857-(9.29922)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 125.98961 + (((tickAnim - 5) / 8) * (124.45564-(125.98961)));
            yy = -14.45867 + (((tickAnim - 5) / 8) * (-12.19651-(-14.45867)));
            zz = 7.84857 + (((tickAnim - 5) / 8) * (6.60663-(7.84857)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 124.45564 + (((tickAnim - 13) / 7) * (7.88373-(124.45564)));
            yy = -12.19651 + (((tickAnim - 13) / 7) * (0.11479-(-12.19651)));
            zz = 6.60663 + (((tickAnim - 13) / 7) * (11.74966-(6.60663)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 7.88373 + (((tickAnim - 20) / 9) * (-5.23377-(7.88373)));
            yy = 0.11479 + (((tickAnim - 20) / 9) * (-15.5469-(0.11479)));
            zz = 11.74966 + (((tickAnim - 20) / 9) * (6.75084-(11.74966)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = -5.23377 + (((tickAnim - 29) / 8) * (-15.38404-(-5.23377)));
            yy = -15.5469 + (((tickAnim - 29) / 8) * (-16.1138-(-15.5469)));
            zz = 6.75084 + (((tickAnim - 29) / 8) * (4.33963-(6.75084)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = -15.38404 + (((tickAnim - 37) / 8) * (69.89134-(-15.38404)));
            yy = -16.1138 + (((tickAnim - 37) / 8) * (-17.10099-(-16.1138)));
            zz = 4.33963 + (((tickAnim - 37) / 8) * (9.29922-(4.33963)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.525 + (((tickAnim - 0) / 5) * (1.835-(1.525)));
            zz = 0.225 + (((tickAnim - 0) / 5) * (-0.67-(0.225)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.835 + (((tickAnim - 5) / 3) * (1.505-(1.835)));
            zz = -0.67 + (((tickAnim - 5) / 3) * (-0.69-(-0.67)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.505 + (((tickAnim - 8) / 5) * (0.41-(1.505)));
            zz = -0.69 + (((tickAnim - 8) / 5) * (-0.71-(-0.69)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.41 + (((tickAnim - 13) / 7) * (-0.375-(0.41)));
            zz = -0.71 + (((tickAnim - 13) / 7) * (0-(-0.71)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            yy = -0.375 + (((tickAnim - 20) / 9) * (-0.45-(-0.375)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 29) / 8) * (0-(0)));
            yy = -0.45 + (((tickAnim - 29) / 8) * (-0.615-(-0.45)));
            zz = 0 + (((tickAnim - 29) / 8) * (0.11-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 37) / 8) * (0-(0)));
            yy = -0.615 + (((tickAnim - 37) / 8) * (1.525-(-0.615)));
            zz = 0.11 + (((tickAnim - 37) / 8) * (0.225-(0.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(-7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-50))*-1), Tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-95))*-3), Tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(-4), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-125))*2), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(4), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-155))*-1), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-80))*-2));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(4), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-200))*-2), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-100))*-4));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 8.98465 + (((tickAnim - 0) / 23) * (133.09276-(8.98465)));
            yy = 2.4763 + (((tickAnim - 0) / 23) * (3.15927-(2.4763)));
            zz = 0.43399 + (((tickAnim - 0) / 23) * (104.59606-(0.43399)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 133.09276 + (((tickAnim - 23) / 10) * (71.76634-(133.09276)));
            yy = 3.15927 + (((tickAnim - 23) / 10) * (5.36484-(3.15927)));
            zz = 104.59606 + (((tickAnim - 23) / 10) * (73.43524-(104.59606)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 71.76634 + (((tickAnim - 33) / 12) * (8.98465-(71.76634)));
            yy = 5.36484 + (((tickAnim - 33) / 12) * (2.4763-(5.36484)));
            zz = 73.43524 + (((tickAnim - 33) / 12) * (0.43399-(73.43524)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -31.91953 + (((tickAnim - 0) / 23) * (-49.22418-(-31.91953)));
            yy = -19.90638 + (((tickAnim - 0) / 23) * (18.61109-(-19.90638)));
            zz = 1.97057 + (((tickAnim - 0) / 23) * (7.17491-(1.97057)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -49.22418 + (((tickAnim - 23) / 10) * (-22.05862-(-49.22418)));
            yy = 18.61109 + (((tickAnim - 23) / 10) * (21.8418-(18.61109)));
            zz = 7.17491 + (((tickAnim - 23) / 10) * (-0.14575-(7.17491)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = -22.05862 + (((tickAnim - 33) / 12) * (-31.91953-(-22.05862)));
            yy = 21.8418 + (((tickAnim - 33) / 12) * (-19.90638-(21.8418)));
            zz = -0.14575 + (((tickAnim - 33) / 12) * (1.97057-(-0.14575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -0.05 + (((tickAnim - 0) / 23) * (0-(-0.05)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (-0.01-(0)));
            yy = 0 + (((tickAnim - 29) / 4) * (0.65-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -0.01 + (((tickAnim - 33) / 6) * (-0.03-(-0.01)));
            yy = 0.65 + (((tickAnim - 33) / 6) * (1.115-(0.65)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -0.03 + (((tickAnim - 39) / 6) * (-0.05-(-0.03)));
            yy = 1.115 + (((tickAnim - 39) / 6) * (0-(1.115)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 18.25 + (((tickAnim - 0) / 6) * (2.63021-(18.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (-10.67969-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-9.13986-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 2.63021 + (((tickAnim - 6) / 4) * (-1.71837-(2.63021)));
            yy = -10.67969 + (((tickAnim - 6) / 4) * (-21.32142-(-10.67969)));
            zz = -9.13986 + (((tickAnim - 6) / 4) * (-20.77175-(-9.13986)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -1.71837 + (((tickAnim - 10) / 13) * (76.11639-(-1.71837)));
            yy = -21.32142 + (((tickAnim - 10) / 13) * (-48.72465-(-21.32142)));
            zz = -20.77175 + (((tickAnim - 10) / 13) * (-62.15908-(-20.77175)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 76.11639 + (((tickAnim - 23) / 6) * (71.36334-(76.11639)));
            yy = -48.72465 + (((tickAnim - 23) / 6) * (-15.09279-(-48.72465)));
            zz = -62.15908 + (((tickAnim - 23) / 6) * (7.52059-(-62.15908)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 71.36334 + (((tickAnim - 29) / 10) * (-0.28095-(71.36334)));
            yy = -15.09279 + (((tickAnim - 29) / 10) * (-5.39028-(-15.09279)));
            zz = 7.52059 + (((tickAnim - 29) / 10) * (2.68592-(7.52059)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -0.28095 + (((tickAnim - 39) / 6) * (18.25-(-0.28095)));
            yy = -5.39028 + (((tickAnim - 39) / 6) * (0-(-5.39028)));
            zz = 2.68592 + (((tickAnim - 39) / 6) * (0-(2.68592)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.05-(0)));
            yy = 0.25 + (((tickAnim - 0) / 3) * (0.8-(0.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.04-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -0.05 + (((tickAnim - 3) / 3) * (-0.11-(-0.05)));
            yy = 0.8 + (((tickAnim - 3) / 3) * (0.365-(0.8)));
            zz = 0.04 + (((tickAnim - 3) / 3) * (0.1-(0.04)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.11 + (((tickAnim - 6) / 4) * (-0.22-(-0.11)));
            yy = 0.365 + (((tickAnim - 6) / 4) * (0.255-(0.365)));
            zz = 0.1 + (((tickAnim - 6) / 4) * (0.2-(0.1)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -0.22 + (((tickAnim - 10) / 13) * (-0.475-(-0.22)));
            yy = 0.255 + (((tickAnim - 10) / 13) * (0.4-(0.255)));
            zz = 0.2 + (((tickAnim - 10) / 13) * (0.425-(0.2)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -0.475 + (((tickAnim - 23) / 6) * (-0.25-(-0.475)));
            yy = 0.4 + (((tickAnim - 23) / 6) * (1.925-(0.4)));
            zz = 0.425 + (((tickAnim - 23) / 6) * (0.22-(0.425)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = -0.25 + (((tickAnim - 29) / 10) * (0.09-(-0.25)));
            yy = 1.925 + (((tickAnim - 29) / 10) * (0.305-(1.925)));
            zz = 0.22 + (((tickAnim - 29) / 10) * (0.08-(0.22)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0.09 + (((tickAnim - 39) / 6) * (0-(0.09)));
            yy = 0.305 + (((tickAnim - 39) / 6) * (0.25-(0.305)));
            zz = 0.08 + (((tickAnim - 39) / 6) * (0-(0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 133.09276 + (((tickAnim - 0) / 9) * (71.76634-(133.09276)));
            yy = -3.15927 + (((tickAnim - 0) / 9) * (-5.36484-(-3.15927)));
            zz = -104.59606 + (((tickAnim - 0) / 9) * (-73.43524-(-104.59606)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 71.76634 + (((tickAnim - 9) / 12) * (8.98465-(71.76634)));
            yy = -5.36484 + (((tickAnim - 9) / 12) * (-2.4763-(-5.36484)));
            zz = -73.43524 + (((tickAnim - 9) / 12) * (-0.43399-(-73.43524)));
        }
        else if (tickAnim >= 21 && tickAnim < 45) {
            xx = 8.98465 + (((tickAnim - 21) / 24) * (133.09276-(8.98465)));
            yy = -2.4763 + (((tickAnim - 21) / 24) * (-3.15927-(-2.4763)));
            zz = -0.43399 + (((tickAnim - 21) / 24) * (-104.59606-(-0.43399)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -49.22418 + (((tickAnim - 0) / 9) * (-22.05862-(-49.22418)));
            yy = -18.61109 + (((tickAnim - 0) / 9) * (-21.8418-(-18.61109)));
            zz = -7.17491 + (((tickAnim - 0) / 9) * (0.14575-(-7.17491)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = -22.05862 + (((tickAnim - 9) / 12) * (-31.91953-(-22.05862)));
            yy = -21.8418 + (((tickAnim - 9) / 12) * (19.90638-(-21.8418)));
            zz = 0.14575 + (((tickAnim - 9) / 12) * (-1.97057-(0.14575)));
        }
        else if (tickAnim >= 21 && tickAnim < 45) {
            xx = -31.91953 + (((tickAnim - 21) / 24) * (-49.22418-(-31.91953)));
            yy = 19.90638 + (((tickAnim - 21) / 24) * (-18.61109-(19.90638)));
            zz = -1.97057 + (((tickAnim - 21) / 24) * (-7.17491-(-1.97057)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (-0.01-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0.65-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -0.01 + (((tickAnim - 9) / 6) * (-0.03-(-0.01)));
            yy = 0.65 + (((tickAnim - 9) / 6) * (1.115-(0.65)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -0.03 + (((tickAnim - 15) / 6) * (-0.05-(-0.03)));
            yy = 1.115 + (((tickAnim - 15) / 6) * (0-(1.115)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 45) {
            xx = -0.05 + (((tickAnim - 21) / 24) * (0-(-0.05)));
            yy = 0 + (((tickAnim - 21) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 76.11639 + (((tickAnim - 0) / 6) * (71.36334-(76.11639)));
            yy = 48.72465 + (((tickAnim - 0) / 6) * (15.09279-(48.72465)));
            zz = 62.15908 + (((tickAnim - 0) / 6) * (-7.52059-(62.15908)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 71.36334 + (((tickAnim - 6) / 9) * (-0.28095-(71.36334)));
            yy = 15.09279 + (((tickAnim - 6) / 9) * (5.39028-(15.09279)));
            zz = -7.52059 + (((tickAnim - 6) / 9) * (-2.68592-(-7.52059)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -0.28095 + (((tickAnim - 15) / 6) * (18.25-(-0.28095)));
            yy = 5.39028 + (((tickAnim - 15) / 6) * (0-(5.39028)));
            zz = -2.68592 + (((tickAnim - 15) / 6) * (0-(-2.68592)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 18.25 + (((tickAnim - 21) / 6) * (1.12984-(18.25)));
            yy = 0 + (((tickAnim - 21) / 6) * (9.10514-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (9.18774-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 1.12984 + (((tickAnim - 27) / 6) * (-3.3604-(1.12984)));
            yy = 9.10514 + (((tickAnim - 27) / 6) * (18.48369-(9.10514)));
            zz = 9.18774 + (((tickAnim - 27) / 6) * (25.46078-(9.18774)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = -3.3604 + (((tickAnim - 33) / 12) * (76.11639-(-3.3604)));
            yy = 18.48369 + (((tickAnim - 33) / 12) * (48.72465-(18.48369)));
            zz = 25.46078 + (((tickAnim - 33) / 12) * (62.15908-(25.46078)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.475 + (((tickAnim - 0) / 6) * (0.25-(0.475)));
            yy = 0.4 + (((tickAnim - 0) / 6) * (1.925-(0.4)));
            zz = 0.425 + (((tickAnim - 0) / 6) * (0.22-(0.425)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0.25 + (((tickAnim - 6) / 9) * (0.09-(0.25)));
            yy = 1.925 + (((tickAnim - 6) / 9) * (0.305-(1.925)));
            zz = 0.22 + (((tickAnim - 6) / 9) * (0.08-(0.22)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0.09 + (((tickAnim - 15) / 6) * (0-(0.09)));
            yy = 0.305 + (((tickAnim - 15) / 6) * (0.25-(0.305)));
            zz = 0.08 + (((tickAnim - 15) / 6) * (0-(0.08)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (-0.02-(0)));
            yy = 0.25 + (((tickAnim - 21) / 2) * (0.785-(0.25)));
            zz = 0 + (((tickAnim - 21) / 2) * (0.05-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -0.02 + (((tickAnim - 23) / 4) * (-0.04-(-0.02)));
            yy = 0.785 + (((tickAnim - 23) / 4) * (0.85-(0.785)));
            zz = 0.05 + (((tickAnim - 23) / 4) * (0.11-(0.05)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -0.04 + (((tickAnim - 27) / 6) * (-0.075-(-0.04)));
            yy = 0.85 + (((tickAnim - 27) / 6) * (-0.075-(0.85)));
            zz = 0.11 + (((tickAnim - 27) / 6) * (0.22-(0.11)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = -0.075 + (((tickAnim - 33) / 12) * (0.475-(-0.075)));
            yy = -0.075 + (((tickAnim - 33) / 12) * (0.4-(-0.075)));
            zz = 0.22 + (((tickAnim - 33) / 12) * (0.425-(0.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -50.75 + (((tickAnim - 0) / 6) * (26.79-(-50.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 26.79 + (((tickAnim - 6) / 9) * (-7.43-(26.79)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -7.43 + (((tickAnim - 15) / 6) * (0-(-7.43)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 33) / 12) * (-50.75-(0)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0.85 + (((tickAnim - 0) / 21) * (0-(0.85)));
        }
        else if (tickAnim >= 21 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 21) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 24) * (0.85-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-80))*-2), Body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-90))*1.4), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-100))*2), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-120))*0.5), Throat.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-90))*-2), Throat.rotateAngleZ + (float) Math.toRadians(0));
        this.Throat.rotationPointX = this.Throat.rotationPointX + (float)(0);
        this.Throat.rotationPointY = this.Throat.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-100))*-0.2);
        this.Throat.rotationPointZ = this.Throat.rotationPointZ + (float)(0);


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(4), Tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-250))*-2), Tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-130))*-6));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (-50.75-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -50.75 + (((tickAnim - 23) / 6) * (26.79-(-50.75)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 26.79 + (((tickAnim - 29) / 10) * (-7.43-(26.79)));
            yy = 0 + (((tickAnim - 29) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 10) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -7.43 + (((tickAnim - 39) / 6) * (0-(-7.43)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0.85-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0.85 + (((tickAnim - 23) / 22) * (0-(0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (13.37531-(0)));
            yy = 60.75 + (((tickAnim - 0) / 23) * (-25.96434-(60.75)));
            zz = 0 + (((tickAnim - 0) / 23) * (15.90731-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = 13.37531 + (((tickAnim - 23) / 13) * (27.05012-(13.37531)));
            yy = -25.96434 + (((tickAnim - 23) / 13) * (31.76242-(-25.96434)));
            zz = 15.90731 + (((tickAnim - 23) / 13) * (8.56558-(15.90731)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 27.05012 + (((tickAnim - 36) / 9) * (0-(27.05012)));
            yy = 31.76242 + (((tickAnim - 36) / 9) * (60.75-(31.76242)));
            zz = 8.56558 + (((tickAnim - 36) / 9) * (0-(8.56558)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 7.88373 + (((tickAnim - 0) / 13) * (-10.1027-(7.88373)));
            yy = -0.11479 + (((tickAnim - 0) / 13) * (-0.2923-(-0.11479)));
            zz = -11.74966 + (((tickAnim - 0) / 13) * (-3.8433-(-11.74966)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -10.1027 + (((tickAnim - 13) / 10) * (69.89134-(-10.1027)));
            yy = -0.2923 + (((tickAnim - 13) / 10) * (-17.10099-(-0.2923)));
            zz = -3.8433 + (((tickAnim - 13) / 10) * (9.29922-(-3.8433)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 69.89134 + (((tickAnim - 23) / 5) * (125.98961-(69.89134)));
            yy = -17.10099 + (((tickAnim - 23) / 5) * (-14.45867-(-17.10099)));
            zz = 9.29922 + (((tickAnim - 23) / 5) * (7.84857-(9.29922)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 125.98961 + (((tickAnim - 28) / 8) * (124.45564-(125.98961)));
            yy = -14.45867 + (((tickAnim - 28) / 8) * (12.19651-(-14.45867)));
            zz = 7.84857 + (((tickAnim - 28) / 8) * (-6.60663-(7.84857)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 124.45564 + (((tickAnim - 36) / 9) * (7.88373-(124.45564)));
            yy = 12.19651 + (((tickAnim - 36) / 9) * (-0.11479-(12.19651)));
            zz = -6.60663 + (((tickAnim - 36) / 9) * (-11.74966-(-6.60663)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 13) * (-0.475-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = -0.475 + (((tickAnim - 13) / 10) * (1.525-(-0.475)));
            zz = 0 + (((tickAnim - 13) / 10) * (0.225-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 1.525 + (((tickAnim - 23) / 5) * (1.835-(1.525)));
            zz = 0.225 + (((tickAnim - 23) / 5) * (-0.67-(0.225)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 1.835 + (((tickAnim - 28) / 3) * (1.505-(1.835)));
            zz = -0.67 + (((tickAnim - 28) / 3) * (-0.69-(-0.67)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            yy = 1.505 + (((tickAnim - 31) / 5) * (0.41-(1.505)));
            zz = -0.69 + (((tickAnim - 31) / 5) * (-0.71-(-0.69)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 36) / 9) * (0-(0)));
            yy = 0.41 + (((tickAnim - 36) / 9) * (-0.3-(0.41)));
            zz = -0.71 + (((tickAnim - 36) / 9) * (0-(-0.71)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -11.2889 + (((tickAnim - 0) / 23) * (5.25-(-11.2889)));
            yy = -39.95768 + (((tickAnim - 0) / 23) * (0-(-39.95768)));
            zz = 0.45678 + (((tickAnim - 0) / 23) * (18.75-(0.45678)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = 5.25 + (((tickAnim - 23) / 13) * (-27.73327-(5.25)));
            yy = 0 + (((tickAnim - 23) / 13) * (-37.39994-(0)));
            zz = 18.75 + (((tickAnim - 23) / 13) * (-52.96928-(18.75)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = -27.73327 + (((tickAnim - 36) / 9) * (-11.2889-(-27.73327)));
            yy = -37.39994 + (((tickAnim - 36) / 9) * (-39.95768-(-37.39994)));
            zz = -52.96928 + (((tickAnim - 36) / 9) * (0.45678-(-52.96928)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2w, leftArm2w.rotateAngleX + (float) Math.toRadians(xx), leftArm2w.rotateAngleY + (float) Math.toRadians(yy), leftArm2w.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -0.225 + (((tickAnim - 0) / 23) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 23) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 13) * (-1.925-(0)));
            zz = 0 + (((tickAnim - 23) / 13) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 36) / 9) * (-0.225-(0)));
            yy = -1.925 + (((tickAnim - 36) / 9) * (0-(-1.925)));
            zz = 0 + (((tickAnim - 36) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2w.rotationPointX = this.leftArm2w.rotationPointX + (float)(xx);
        this.leftArm2w.rotationPointY = this.leftArm2w.rotationPointY - (float)(yy);
        this.leftArm2w.rotationPointZ = this.leftArm2w.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 5.25 + (((tickAnim - 0) / 13) * (-27.73327-(5.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (37.39994-(0)));
            zz = -18.75 + (((tickAnim - 0) / 13) * (52.96928-(-18.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -27.73327 + (((tickAnim - 13) / 7) * (-11.2889-(-27.73327)));
            yy = 37.39994 + (((tickAnim - 13) / 7) * (39.95768-(37.39994)));
            zz = 52.96928 + (((tickAnim - 13) / 7) * (-0.45678-(52.96928)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = -11.2889 + (((tickAnim - 20) / 25) * (5.25-(-11.2889)));
            yy = 39.95768 + (((tickAnim - 20) / 25) * (0-(39.95768)));
            zz = -0.45678 + (((tickAnim - 20) / 25) * (-18.75-(-0.45678)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2w, rightArm2w.rotateAngleX + (float) Math.toRadians(xx), rightArm2w.rotateAngleY + (float) Math.toRadians(yy), rightArm2w.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.925-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (-0.225-(0)));
            yy = -1.925 + (((tickAnim - 13) / 7) * (0-(-1.925)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = -0.225 + (((tickAnim - 20) / 25) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2w.rotationPointX = this.rightArm2w.rotationPointX + (float)(xx);
        this.rightArm2w.rotationPointY = this.rightArm2w.rotationPointY - (float)(yy);
        this.rightArm2w.rotationPointZ = this.rightArm2w.rotationPointZ + (float)(zz);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraGoniopholis e = (EntityPrehistoricFloraGoniopholis) entity;
        animator.update(entity);


    }
}
