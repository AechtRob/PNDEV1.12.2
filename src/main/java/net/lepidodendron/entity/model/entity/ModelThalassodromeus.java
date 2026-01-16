package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraThalassodromeus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelThalassodromeus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer legmembrane4;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer legmembrane5;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer legmembrane6;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer legmembrane2;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer legmembrane3;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer legmembrane7;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer leftwing;
    private final AdvancedModelRenderer propatagium2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer lwmembrane;
    private final AdvancedModelRenderer lwmembrane2;
    private final AdvancedModelRenderer leftwing2;
    private final AdvancedModelRenderer propatagium;
    private final AdvancedModelRenderer lw2membrane;
    private final AdvancedModelRenderer lw2membrane2;
    private final AdvancedModelRenderer leftwing3;
    private final AdvancedModelRenderer lw3membrane;
    private final AdvancedModelRenderer lw3membrane2;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer leftwing4;
    private final AdvancedModelRenderer lw4membrane;
    private final AdvancedModelRenderer lw4membrane2;
    private final AdvancedModelRenderer leftwing5;
    private final AdvancedModelRenderer lw5membrane;
    private final AdvancedModelRenderer lw5membrane2;
    private final AdvancedModelRenderer rightwing;
    private final AdvancedModelRenderer propatagium3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer lwmembrane3;
    private final AdvancedModelRenderer lwmembrane4;
    private final AdvancedModelRenderer rightwing2;
    private final AdvancedModelRenderer propatagium4;
    private final AdvancedModelRenderer lw2membrane3;
    private final AdvancedModelRenderer lw2membrane4;
    private final AdvancedModelRenderer rightwing3;
    private final AdvancedModelRenderer lw3membrane3;
    private final AdvancedModelRenderer lw3membrane4;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer rightwing4;
    private final AdvancedModelRenderer lw4membrane3;
    private final AdvancedModelRenderer lw4membrane4;
    private final AdvancedModelRenderer rightwing5;
    private final AdvancedModelRenderer lw5membrane3;
    private final AdvancedModelRenderer lw5membrane4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail;

    private ModelAnimator animator;

    public ModelThalassodromeus() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 7.2835F, 0.625F);
        this.setRotateAngle(main, -0.6501F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 68, 60, -1.5F, -0.5F, -1.0F, 4, 5, 3, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-2.5F, 2.4848F, 0.1736F);
        this.main.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.5518F, 0.1819F, 0.6138F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 70, 17, -1.0F, -1.0F, -1.0F, 3, 7, 3, 0.0F, true));

        this.legmembrane4 = new AdvancedModelRenderer(this);
        this.legmembrane4.setRotationPoint(0.0F, 3.0F, 2.0F);
        this.rightleg.addChild(legmembrane4);
        this.legmembrane4.cubeList.add(new ModelBox(legmembrane4, 82, 14, 0.5F, -5.0F, -0.5F, 0, 8, 2, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 5.2483F, -0.3359F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.6564F, -0.0819F, -0.4023F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 78, 41, -0.5F, 0.0F, -0.5F, 2, 6, 2, 0.0F, true));

        this.legmembrane5 = new AdvancedModelRenderer(this);
        this.legmembrane5.setRotationPoint(0.0F, 1.0F, 1.5F);
        this.rightleg2.addChild(legmembrane5);
        this.legmembrane5.cubeList.add(new ModelBox(legmembrane5, 32, 38, 0.55F, -1.0F, 0.0F, 0, 6, 2, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 5.0624F, 0.7712F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.0305F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 12, 43, 0.0F, 0.0F, -0.5F, 1, 6, 1, 0.0F, true));

        this.legmembrane6 = new AdvancedModelRenderer(this);
        this.legmembrane6.setRotationPoint(0.5F, 3.0F, 0.5F);
        this.rightleg3.addChild(legmembrane6);
        this.legmembrane6.cubeList.add(new ModelBox(legmembrane6, 30, 51, 0.0F, -3.0F, 0.0F, 0, 6, 1, 0.0F, true));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.5F, 5.2769F, 0.5688F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, -0.3883F, 0.0F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 24, 75, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, true));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(3.5F, 2.4848F, 0.1736F);
        this.main.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.5518F, -0.1819F, -0.6138F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 70, 17, -2.0F, -1.0F, -1.0F, 3, 7, 3, 0.0F, false));

        this.legmembrane2 = new AdvancedModelRenderer(this);
        this.legmembrane2.setRotationPoint(0.0F, 3.0F, 2.0F);
        this.leftleg.addChild(legmembrane2);
        this.legmembrane2.cubeList.add(new ModelBox(legmembrane2, 82, 14, -0.5F, -5.0F, -0.5F, 0, 8, 2, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 5.2483F, -0.3359F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.6564F, 0.0819F, 0.4023F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 78, 41, -1.5F, 0.0F, -0.5F, 2, 6, 2, 0.0F, false));

        this.legmembrane3 = new AdvancedModelRenderer(this);
        this.legmembrane3.setRotationPoint(0.0F, 1.0F, 1.5F);
        this.leftleg2.addChild(legmembrane3);
        this.legmembrane3.cubeList.add(new ModelBox(legmembrane3, 32, 38, -0.55F, -1.0F, 0.0F, 0, 6, 2, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 5.0624F, 0.7712F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.0305F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 12, 43, -1.0F, 0.0F, -0.5F, 1, 6, 1, 0.0F, false));

        this.legmembrane7 = new AdvancedModelRenderer(this);
        this.legmembrane7.setRotationPoint(-0.5F, 3.0F, 0.5F);
        this.leftleg3.addChild(legmembrane7);
        this.legmembrane7.cubeList.add(new ModelBox(legmembrane7, 30, 51, 0.0F, -3.0F, 0.0F, 0, 6, 1, 0.0F, false));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(-0.5F, 5.2769F, 0.5688F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, -0.3883F, 0.0F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 24, 75, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, -0.75F, -0.25F);
        this.main.addChild(body);
        this.setRotateAngle(body, -0.0698F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, 0.0F, -7.0F, 6, 6, 7, 0.0F, false));

        this.leftwing = new AdvancedModelRenderer(this);
        this.leftwing.setRotationPoint(2.4941F, 3.6818F, -7.0645F);
        this.body.addChild(leftwing);
        this.setRotateAngle(leftwing, 0.3691F, 0.0784F, -0.8284F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 72, 0, -1.5F, -0.5F, -0.5F, 3, 5, 3, 0.001F, false));

        this.propatagium2 = new AdvancedModelRenderer(this);
        this.propatagium2.setRotationPoint(0.35F, 0.5F, -0.5F);
        this.leftwing.addChild(propatagium2);
        this.setRotateAngle(propatagium2, -0.3491F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.75F, 0.0F, 0.0F);
        this.propatagium2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 82, 60, -0.75F, -1.0F, -0.5F, 0, 5, 3, 0.001F, false));

        this.lwmembrane = new AdvancedModelRenderer(this);
        this.lwmembrane.setRotationPoint(1.25F, -0.5F, 2.5F);
        this.leftwing.addChild(lwmembrane);
        this.setRotateAngle(lwmembrane, -0.1479F, 0.0726F, 0.2878F);
        this.lwmembrane.cubeList.add(new ModelBox(lwmembrane, 16, 38, -1.45F, 0.05F, -0.5F, 1, 6, 7, 0.001F, false));

        this.lwmembrane2 = new AdvancedModelRenderer(this);
        this.lwmembrane2.setRotationPoint(-1.45F, 5.55F, 3.0F);
        this.lwmembrane.addChild(lwmembrane2);
        this.setRotateAngle(lwmembrane2, 0.0F, 0.0F, -0.3491F);
        this.lwmembrane2.cubeList.add(new ModelBox(lwmembrane2, 54, 18, 0.0F, 0.0F, -3.5F, 1, 3, 7, 0.0F, false));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(0.075F, 3.75F, 0.0F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -0.1932F, 0.0887F, 0.5709F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 48, 71, -1.5F, -1.5F, -0.5F, 2, 9, 3, 0.0F, false));

        this.propatagium = new AdvancedModelRenderer(this);
        this.propatagium.setRotationPoint(0.5F, 7.5F, -0.5F);
        this.leftwing2.addChild(propatagium);
        this.setRotateAngle(propatagium, 0.1309F, 0.0F, 0.0F);
        this.propatagium.cubeList.add(new ModelBox(propatagium, 76, 76, -1.0F, -8.0F, 0.0F, 0, 8, 3, 0.0F, false));

        this.lw2membrane = new AdvancedModelRenderer(this);
        this.lw2membrane.setRotationPoint(-0.5F, 3.5F, 2.5F);
        this.leftwing2.addChild(lw2membrane);
        this.setRotateAngle(lw2membrane, 0.0F, 0.0393F, 0.0F);
        this.lw2membrane.cubeList.add(new ModelBox(lw2membrane, 0, 43, -0.5F, -7.0F, 0.0F, 1, 11, 5, 0.0F, false));

        this.lw2membrane2 = new AdvancedModelRenderer(this);
        this.lw2membrane2.setRotationPoint(0.5F, 3.5212F, 1.6844F);
        this.lw2membrane.addChild(lw2membrane2);
        this.setRotateAngle(lw2membrane2, -0.3924F, 0.0167F, 0.0403F);
        this.lw2membrane2.cubeList.add(new ModelBox(lw2membrane2, 0, 25, -1.0F, -11.0F, -0.95F, 1, 11, 7, -0.002F, false));

        this.leftwing3 = new AdvancedModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.2F, 7.0535F, -0.314F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.4797F, -0.0474F, 0.2391F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 58, 71, -0.5F, 0.0F, 0.0F, 1, 11, 2, 0.0F, false));

        this.lw3membrane = new AdvancedModelRenderer(this);
        this.lw3membrane.setRotationPoint(0.0F, 5.5F, 2.0F);
        this.leftwing3.addChild(lw3membrane);
        this.lw3membrane.cubeList.add(new ModelBox(lw3membrane, 0, 59, -0.5089F, -5.4959F, 0.002F, 1, 11, 4, 0.0F, false));

        this.lw3membrane2 = new AdvancedModelRenderer(this);
        this.lw3membrane2.setRotationPoint(-0.5F, 3.7487F, 1.7252F);
        this.lw3membrane.addChild(lw3membrane2);
        this.setRotateAngle(lw3membrane2, -0.0873F, 0.0F, 0.0F);
        this.lw3membrane2.cubeList.add(new ModelBox(lw3membrane2, 42, 54, -0.0089F, -9.4959F, 1.552F, 1, 11, 4, -0.001F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(0.3546F, 10.225F, 1.344F);
        this.leftwing3.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0714F, -0.0588F, 0.0058F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 10, 82, -0.825F, 0.0F, -3.9F, 2, 1, 3, 0.0F, false));

        this.leftwing4 = new AdvancedModelRenderer(this);
        this.leftwing4.setRotationPoint(0.0321F, 10.7133F, 0.9144F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, -0.3883F, 0.0F, 0.0F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 42, 69, -0.5F, -14.1503F, -0.9769F, 1, 14, 2, 0.001F, false));

        this.lw4membrane = new AdvancedModelRenderer(this);
        this.lw4membrane.setRotationPoint(-0.025F, -7.1504F, 0.7731F);
        this.leftwing4.addChild(lw4membrane);
        this.lw4membrane.cubeList.add(new ModelBox(lw4membrane, 58, 28, -0.5F, -7.0F, -4.25F, 1, 14, 3, 0.0F, false));

        this.lw4membrane2 = new AdvancedModelRenderer(this);
        this.lw4membrane2.setRotationPoint(0.0F, 0.0F, -4.25F);
        this.lw4membrane.addChild(lw4membrane2);
        this.lw4membrane2.cubeList.add(new ModelBox(lw4membrane2, 32, 46, -0.5F, -7.0F, -4.0F, 1, 14, 4, -0.001F, false));

        this.leftwing5 = new AdvancedModelRenderer(this);
        this.leftwing5.setRotationPoint(0.0F, -14.1503F, 1.0231F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.2964F, 0.0167F, -0.0403F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 66, 0, -0.5F, -15.0F, -2.0F, 1, 15, 2, 0.0F, false));

        this.lw5membrane = new AdvancedModelRenderer(this);
        this.lw5membrane.setRotationPoint(0.0F, -8.5F, -1.5F);
        this.leftwing5.addChild(lw5membrane);
        this.lw5membrane.cubeList.add(new ModelBox(lw5membrane, 66, 28, -0.5F, -6.5F, -2.525F, 1, 15, 2, 0.0F, false));

        this.lw5membrane2 = new AdvancedModelRenderer(this);
        this.lw5membrane2.setRotationPoint(0.0F, 1.5F, -2.025F);
        this.lw5membrane.addChild(lw5membrane2);
        this.lw5membrane2.cubeList.add(new ModelBox(lw5membrane2, 10, 60, 0.0F, -3.0F, -3.5F, 0, 10, 5, 0.0F, false));
        this.lw5membrane2.cubeList.add(new ModelBox(lw5membrane2, 20, 60, -0.1F, -3.0F, -3.5F, 0, 10, 5, 0.0F, false));

        this.rightwing = new AdvancedModelRenderer(this);
        this.rightwing.setRotationPoint(-2.4941F, 3.6818F, -7.0645F);
        this.body.addChild(rightwing);
        this.setRotateAngle(rightwing, 0.3691F, -0.0784F, 0.8284F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 72, 0, -1.5F, -0.5F, -0.5F, 3, 5, 3, 0.001F, true));

        this.propatagium3 = new AdvancedModelRenderer(this);
        this.propatagium3.setRotationPoint(-0.35F, 0.5F, -0.5F);
        this.rightwing.addChild(propatagium3);
        this.setRotateAngle(propatagium3, -0.3491F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.75F, 0.0F, 0.0F);
        this.propatagium3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 82, 60, 0.75F, -1.0F, -0.5F, 0, 5, 3, 0.001F, true));

        this.lwmembrane3 = new AdvancedModelRenderer(this);
        this.lwmembrane3.setRotationPoint(-1.25F, -0.5F, 2.5F);
        this.rightwing.addChild(lwmembrane3);
        this.setRotateAngle(lwmembrane3, -0.1479F, -0.0726F, -0.2878F);
        this.lwmembrane3.cubeList.add(new ModelBox(lwmembrane3, 16, 38, 0.45F, 0.05F, -0.5F, 1, 6, 7, 0.001F, true));

        this.lwmembrane4 = new AdvancedModelRenderer(this);
        this.lwmembrane4.setRotationPoint(1.45F, 5.55F, 3.0F);
        this.lwmembrane3.addChild(lwmembrane4);
        this.setRotateAngle(lwmembrane4, 0.0F, 0.0F, 0.3491F);
        this.lwmembrane4.cubeList.add(new ModelBox(lwmembrane4, 54, 18, -1.0F, 0.0F, -3.5F, 1, 3, 7, 0.0F, true));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(-0.075F, 3.75F, 0.0F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -0.1932F, -0.0887F, -0.5709F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 48, 71, -0.5F, -1.5F, -0.5F, 2, 9, 3, 0.0F, true));

        this.propatagium4 = new AdvancedModelRenderer(this);
        this.propatagium4.setRotationPoint(-0.5F, 7.5F, -0.5F);
        this.rightwing2.addChild(propatagium4);
        this.setRotateAngle(propatagium4, 0.1309F, 0.0F, 0.0F);
        this.propatagium4.cubeList.add(new ModelBox(propatagium4, 76, 76, 1.0F, -8.0F, 0.0F, 0, 8, 3, 0.0F, true));

        this.lw2membrane3 = new AdvancedModelRenderer(this);
        this.lw2membrane3.setRotationPoint(0.5F, 3.5F, 2.5F);
        this.rightwing2.addChild(lw2membrane3);
        this.setRotateAngle(lw2membrane3, 0.0F, -0.0393F, 0.0F);
        this.lw2membrane3.cubeList.add(new ModelBox(lw2membrane3, 0, 43, -0.5F, -7.0F, 0.0F, 1, 11, 5, 0.0F, true));

        this.lw2membrane4 = new AdvancedModelRenderer(this);
        this.lw2membrane4.setRotationPoint(-0.5F, 3.5212F, 1.6844F);
        this.lw2membrane3.addChild(lw2membrane4);
        this.setRotateAngle(lw2membrane4, -0.3924F, -0.0167F, -0.0403F);
        this.lw2membrane4.cubeList.add(new ModelBox(lw2membrane4, 0, 25, 0.0F, -11.0F, -0.95F, 1, 11, 7, -0.002F, true));

        this.rightwing3 = new AdvancedModelRenderer(this);
        this.rightwing3.setRotationPoint(0.2F, 7.0535F, -0.314F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.4797F, 0.0474F, -0.2391F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 58, 71, -0.5F, 0.0F, 0.0F, 1, 11, 2, 0.0F, true));

        this.lw3membrane3 = new AdvancedModelRenderer(this);
        this.lw3membrane3.setRotationPoint(0.0F, 5.5F, 2.0F);
        this.rightwing3.addChild(lw3membrane3);
        this.lw3membrane3.cubeList.add(new ModelBox(lw3membrane3, 0, 59, -0.4911F, -5.4959F, 0.002F, 1, 11, 4, 0.0F, true));

        this.lw3membrane4 = new AdvancedModelRenderer(this);
        this.lw3membrane4.setRotationPoint(0.5F, 3.7487F, 1.7252F);
        this.lw3membrane3.addChild(lw3membrane4);
        this.setRotateAngle(lw3membrane4, -0.0873F, 0.0F, 0.0F);
        this.lw3membrane4.cubeList.add(new ModelBox(lw3membrane4, 42, 54, -0.9911F, -9.4959F, 1.552F, 1, 11, 4, -0.001F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-0.3546F, 10.225F, 1.344F);
        this.rightwing3.addChild(righthand);
        this.setRotateAngle(righthand, 0.0714F, 0.0588F, -0.0058F);
        this.righthand.cubeList.add(new ModelBox(righthand, 10, 82, -1.175F, 0.0F, -3.9F, 2, 1, 3, 0.0F, true));

        this.rightwing4 = new AdvancedModelRenderer(this);
        this.rightwing4.setRotationPoint(-0.0321F, 10.7133F, 0.9144F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, -0.3883F, 0.0F, 0.0F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 42, 69, -0.5F, -14.1503F, -0.9769F, 1, 14, 2, 0.001F, true));

        this.lw4membrane3 = new AdvancedModelRenderer(this);
        this.lw4membrane3.setRotationPoint(0.025F, -7.1504F, 0.7731F);
        this.rightwing4.addChild(lw4membrane3);
        this.lw4membrane3.cubeList.add(new ModelBox(lw4membrane3, 58, 28, -0.5F, -7.0F, -4.25F, 1, 14, 3, 0.0F, true));

        this.lw4membrane4 = new AdvancedModelRenderer(this);
        this.lw4membrane4.setRotationPoint(0.0F, 0.0F, -4.25F);
        this.lw4membrane3.addChild(lw4membrane4);
        this.lw4membrane4.cubeList.add(new ModelBox(lw4membrane4, 32, 46, -0.5F, -7.0F, -4.0F, 1, 14, 4, -0.001F, true));

        this.rightwing5 = new AdvancedModelRenderer(this);
        this.rightwing5.setRotationPoint(0.0F, -14.1503F, 1.0231F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.2964F, -0.0167F, 0.0403F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 66, 0, -0.5F, -15.0F, -2.0F, 1, 15, 2, 0.0F, true));

        this.lw5membrane3 = new AdvancedModelRenderer(this);
        this.lw5membrane3.setRotationPoint(0.0F, -8.5F, -1.5F);
        this.rightwing5.addChild(lw5membrane3);
        this.lw5membrane3.cubeList.add(new ModelBox(lw5membrane3, 66, 28, -0.5F, -6.5F, -2.525F, 1, 15, 2, 0.0F, true));

        this.lw5membrane4 = new AdvancedModelRenderer(this);
        this.lw5membrane4.setRotationPoint(0.0F, 1.5F, -2.025F);
        this.lw5membrane3.addChild(lw5membrane4);
        this.lw5membrane4.cubeList.add(new ModelBox(lw5membrane4, 10, 60, 0.0F, -3.0F, -3.5F, 0, 10, 5, 0.0F, true));
        this.lw5membrane4.cubeList.add(new ModelBox(lw5membrane4, 20, 60, 0.1F, -3.0F, -3.5F, 0, 10, 5, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.2174F, -6.2521F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.2793F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 62, 45, -2.5F, 0.0F, -3.0F, 5, 5, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 2.0273F, -1.5941F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.2923F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 42, 46, -2.0F, -1.25F, -6.0F, 4, 2, 6, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 48, 0, -1.5F, 0.0F, -6.075F, 3, 3, 6, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1702F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 68, 53, -1.5F, -1.25F, -5.0F, 3, 2, 5, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 68, 68, -1.0F, 0.15F, -5.0F, 2, 3, 5, -0.003F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.169F, -3.8875F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.4363F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 72, 8, -1.5F, -1.25F, -4.0F, 3, 2, 4, -0.01F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 24, 80, -1.0F, 0.35F, -3.0F, 2, 2, 3, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -1.2354F, -4.5913F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 1.5272F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 13, -1.0F, 0.0F, -10.0F, 3, 2, 10, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 78, 49, -0.5F, -1.0F, -6.0F, 2, 1, 3, 0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.8036F, -1.8432F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 72, 33, -0.5F, 0.0F, -4.0F, 2, 4, 4, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.4393F, -11.4457F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6501F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 82, 73, -0.5F, 1.0F, -4.875F, 1, 1, 3, -0.001F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 82, 68, -0.5F, 1.0F, -2.375F, 1, 2, 3, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 9, -0.5F, 0.0F, -7.275F, 1, 1, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -8.9542F, 7.0355F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 75, -0.5F, -2.0F, -0.075F, 1, 2, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -2.61F, 4.0772F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.1345F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 54, -0.5F, -2.0F, 0.0F, 1, 2, 7, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -2.164F, -1.3275F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.48F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 64, -0.5F, -3.9F, 0.0F, 1, 6, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -11.5228F, 2.1958F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5672F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 75, -0.5F, 0.0F, 0.0F, 1, 2, 5, 0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -7.2244F, -4.5513F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5672F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 80, -0.5F, 1.25F, 8.0F, 1, 3, 3, -0.002F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 22, -0.5F, 0.0F, 0.0F, 1, 6, 8, 0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -2.7997F, -6.713F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.6981F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 25, -0.5F, -2.0F, -4.5F, 1, 4, 9, 0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4843F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 11, -0.5F, 0.0F, 0.0F, 2, 2, 9, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.0F, -10.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 72, 27, -0.5F, 0.0F, -4.25F, 2, 1, 5, 0.002F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 82, 0.0F, 0.0F, -8.0F, 1, 1, 4, 0.002F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.25F, -1.0536F, -1.5932F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.3054F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 32, 22, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 32, 22, -2.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, -1.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0044F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 47, 18, -0.5F, -2.0F, -4.5F, 2, 2, 5, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 0, -0.5F, 0.0F, -8.5F, 2, 2, 9, 0.002F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 1.9929F, -15.9376F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 51, -0.5F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.9706F, -12.1222F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 64, 76, -0.5F, 0.0F, -0.225F, 2, 1, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.0F, -8.5F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 64, 81, -0.5F, 0.0F, -7.7F, 1, 1, 4, 0.001F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.5F, 2.0F, -8.5F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.3927F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throat.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 52, 63, -1.0F, -2.5F, 3.0F, 2, 2, 6, -0.002F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 36, -1.0F, -1.0F, 0.0F, 2, 1, 9, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, 0.0682F, 1.7833F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 26, 22, 0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));



        this.lwmembrane.scaleChildren = true;
        this.lwmembrane2.scaleChildren = true;
        this.lwmembrane3.scaleChildren = true;
        this.lwmembrane4.scaleChildren = true;
        this.lw2membrane.scaleChildren = true;
        this.lw2membrane2.scaleChildren = true;
        this.lw2membrane3.scaleChildren = true;
        this.lw2membrane4.scaleChildren = true;
        this.lw3membrane.scaleChildren = true;
        this.lw3membrane2.scaleChildren = true;
        this.lw3membrane3.scaleChildren = true;
        this.lw3membrane4.scaleChildren = true;
        this.lw4membrane.scaleChildren = true;
        this.lw4membrane2.scaleChildren = true;
        this.lw4membrane3.scaleChildren = true;
        this.lw4membrane4.scaleChildren = true;
        this.lw5membrane.scaleChildren = true;
        this.lw5membrane2.scaleChildren = true;
        this.lw5membrane3.scaleChildren = true;
        this.lw5membrane4.scaleChildren = true;
        this.lw2membrane.setScale((float)1,(float)0,(float)0);
        this.lw2membrane2.setScale((float)1,(float)0,(float)0);
        this.lw2membrane3.setScale((float)1,(float)0,(float)0);
        this.lw2membrane4.setScale((float)1,(float)0,(float)0);
        this.lw3membrane.setScale((float)1,(float)0,(float)0);
        this.lw3membrane2.setScale((float)1,(float)0,(float)0);
        this.lw3membrane3.setScale((float)1,(float)0,(float)0);
        this.lw3membrane4.setScale((float)1,(float)0,(float)0);
        this.lw4membrane.setScale((float)1,(float)0,(float)0);
        this.lw4membrane2.setScale((float)1,(float)0,(float)0);
        this.lw4membrane3.setScale((float)1,(float)0,(float)0);
        this.lw4membrane4.setScale((float)1,(float)0,(float)0);
        this.lw5membrane.setScale((float)1,(float)0,(float)0);
        this.lw5membrane2.setScale((float)1,(float)0,(float)0);
        this.lw5membrane3.setScale((float)1,(float)0,(float)0);
        this.lw5membrane4.setScale((float)1,(float)0,(float)0);
        this.lwmembrane.setScale((float)1,(float)0,(float)0);
        this.lwmembrane2.setScale((float)1,(float)0,(float)0);
        this.lwmembrane3.setScale((float)1,(float)0,(float)0);
        this.lwmembrane4.setScale((float)1,(float)0,(float)0);


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.main.offsetZ = -0.3F;
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.main.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.2F;
        this.main.offsetX = -0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(125);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, -0.4F, 3.8F, -0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) e;

        AdvancedModelRenderer[] tailFull = {this.tail};

        float speed = 0.76F;

        //Animations:

        if (flier.isReallyFlying()) { //flying
//            this.faceTarget(f3, f4, 8, neck);
//            this.faceTarget(f3, f4, 8, neck2);
//            this.faceTarget(f3, f4, 8, neck3);
//            this.faceTarget(f3, f4, 4, head);

        }
        else { //not flying
            if (flier.getIsFast()) {
                speed = speed;
            }
            else {
                speed = speed / 1.5F;
            }
            this.faceTarget(f3, f4, 12, neck);
            this.faceTarget(f3, f4, 12, neck2);
            this.faceTarget(f3, f4, 12, neck3);
            this.faceTarget(f3, f4, 8, head);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraThalassodromeus ee = (EntityPrehistoricFloraThalassodromeus) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            //The pose itself is given by the animation, which plays constantly
            //also within the flight anim itself is the rescaling of the wings
            //so we don't need to do them here either, but I will for consistency!
            this.lw2membrane.setScale((float)1,(float)1,(float)1);
            this.lw2membrane2.setScale((float)1,(float)1,(float)1);
            this.lw2membrane3.setScale((float)1,(float)1,(float)1);
            this.lw2membrane4.setScale((float)1,(float)1,(float)1);
            this.lw3membrane.setScale((float)1,(float)1,(float)1);
            this.lw3membrane2.setScale((float)1,(float)1,(float)1);
            this.lw3membrane3.setScale((float)1,(float)1,(float)1);
            this.lw3membrane4.setScale((float)1,(float)1,(float)1);
            this.lw4membrane.setScale((float)1,(float)1,(float)1);
            this.lw4membrane2.setScale((float)1,(float)1,(float)1);
            this.lw4membrane3.setScale((float)1,(float)1,(float)1);
            this.lw4membrane4.setScale((float)1,(float)1,(float)1);
            this.lw5membrane.setScale((float)1,(float)1,(float)1);
            this.lw5membrane2.setScale((float)1,(float)1,(float)1);
            this.lw5membrane3.setScale((float)1,(float)1,(float)1);
            this.lw5membrane4.setScale((float)1,(float)1,(float)1);
            this.lwmembrane.setScale((float)1,(float)1,(float)1);
            this.lwmembrane2.setScale((float)1,(float)1,(float)1);
            this.lwmembrane3.setScale((float)1,(float)1,(float)1);
            this.lwmembrane4.setScale((float)1,(float)1,(float)1);



            //And now the pose:
            this.setRotateAngle(body, 0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(body2, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, 0.6981F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, 0.4843F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, 0.6501F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, 1.309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 1.1345F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.48F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, 0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, 0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(eye, 0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(head, 1.1563F, 0.0F, 0.0F);
            this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(lefthand, 0.829F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg, 0.6489F, 0.2123F, -1.6022F);
            this.setRotateAngle(leftleg2, 0.4787F, -0.0409F, 0.0671F);
            this.setRotateAngle(leftleg3, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg4, 1.0472F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing, -0.0859F, 0.0212F, -1.6741F);
            this.setRotateAngle(leftwing2, -0.1944F, -0.1791F, -0.0258F);
            this.setRotateAngle(leftwing3, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing4, -2.8362F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing5, 0.2615F, 0.0167F, -0.0403F);
            this.setRotateAngle(lw2membrane, 0.0F, 0.0393F, 0.0F);
            this.setRotateAngle(lw2membrane2, -0.3924F, 0.0167F, 0.0403F);
            this.setRotateAngle(lw2membrane3, 0.0F, -0.0393F, 0.0F);
            this.setRotateAngle(lw2membrane4, -0.3924F, -0.0167F, -0.0403F);
            this.setRotateAngle(lw3membrane2, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(lw3membrane4, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(lwmembrane, -0.1619F, -0.1189F, 0.2107F);
            this.setRotateAngle(lwmembrane2, 0.0F, 0.0F, -0.3491F);
            this.setRotateAngle(lwmembrane3, -0.1619F, 0.1189F, -0.2107F);
            this.setRotateAngle(lwmembrane4, 0.0F, 0.0F, 0.3491F);
            this.setRotateAngle(main, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(neck, -0.3185F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(neck3, -0.4363F, 0.0F, 0.0F);
            this.setRotateAngle(propatagium, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(propatagium2, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(propatagium3, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(propatagium4, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(righthand, 0.829F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg, 0.6489F, -0.2123F, 1.6022F);
            this.setRotateAngle(rightleg2, 0.4787F, 0.0409F, -0.0671F);
            this.setRotateAngle(rightleg3, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg4, 1.0472F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing, -0.0859F, -0.0212F, 1.6741F);
            this.setRotateAngle(rightwing2, -0.1944F, 0.1791F, 0.0258F);
            this.setRotateAngle(rightwing3, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing4, -2.8362F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing5, 0.2615F, -0.0167F, 0.0403F);
            this.setRotateAngle(tail, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(throat, -0.3927F, 0.0F, 0.0F);

            



        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The pose is reset here, and I have hard coded these into the default
                //pose as BB won't have done that

                this.lw2membrane.setScale((float)1,(float)0,(float)0);
                this.lw2membrane2.setScale((float)1,(float)0,(float)0);
                this.lw2membrane3.setScale((float)1,(float)0,(float)0);
                this.lw2membrane4.setScale((float)1,(float)0,(float)0);
                this.lw3membrane.setScale((float)1,(float)0,(float)0);
                this.lw3membrane2.setScale((float)1,(float)0,(float)0);
                this.lw3membrane3.setScale((float)1,(float)0,(float)0);
                this.lw3membrane4.setScale((float)1,(float)0,(float)0);
                this.lw4membrane.setScale((float)1,(float)0,(float)0);
                this.lw4membrane2.setScale((float)1,(float)0,(float)0);
                this.lw4membrane3.setScale((float)1,(float)0,(float)0);
                this.lw4membrane4.setScale((float)1,(float)0,(float)0);
                this.lw5membrane.setScale((float)1,(float)0,(float)0);
                this.lw5membrane2.setScale((float)1,(float)0,(float)0);
                this.lw5membrane3.setScale((float)1,(float)0,(float)0);
                this.lw5membrane4.setScale((float)1,(float)0,(float)0);
                this.lwmembrane.setScale((float)1,(float)0,(float)0);
                this.lwmembrane2.setScale((float)1,(float)0,(float)0);
                this.lwmembrane3.setScale((float)1,(float)0,(float)0);
                this.lwmembrane4.setScale((float)1,(float)0,(float)0);

            }
            else {
                //Climb pose

            }
        }

        if (ee.getAttachmentPos() == null) {

        } else {

        }

        if (ee.getAttachmentPos() == null ) {
            if (ee.getIsMoving()) {
                animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }
        else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is Walking:
                if (ee.getIsMoving()) {
                    if(ee.getIsFast()) {
                        animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    } else {
                        animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }

            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraThalassodromeus entity = (EntityPrehistoricFloraThalassodromeus) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.lw2membrane.setScale((float)1,(float)0,(float)0);


        this.lw3membrane.setScale((float)1,(float)0,(float)0);


        this.lw4membrane.setScale((float)1,(float)0,(float)0);


        this.lw5membrane.setScale((float)1,(float)0,(float)0);


        this.lwmembrane4.setScale((float)1,(float)0,(float)0);


        this.lw2membrane3.setScale((float)1,(float)0,(float)0);


        this.lw2membrane4.setScale((float)1,(float)0,(float)0);


        this.lw3membrane3.setScale((float)1,(float)0,(float)0);


        this.lw4membrane3.setScale((float)1,(float)0,(float)0);


        this.lw5membrane3.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 10.25 + (((tickAnim - 12) / 11) * (0-(10.25)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.7-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = -0.7 + (((tickAnim - 12) / 11) * (0-(-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 27 + (((tickAnim - 12) / 11) * (0-(27)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-1.125-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = 0.7 + (((tickAnim - 12) / 11) * (0-(0.7)));
            zz = -1.125 + (((tickAnim - 12) / 11) * (0-(-1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 21.5 + (((tickAnim - 5) / 7) * (0-(21.5)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -20.75 + (((tickAnim - 18) / 5) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 14 + (((tickAnim - 5) / 7) * (0-(14)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.025-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = -1.025 + (((tickAnim - 5) / 7) * (0-(-1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 14.25 + (((tickAnim - 12) / 11) * (0-(14.25)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraThalassodromeus entity = (EntityPrehistoricFloraThalassodromeus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -10.25 + (((tickAnim - 5) / 7) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (9.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 9.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*25 + (((tickAnim - 5) / 7) * (18.5-(9.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*25)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 18.5 + (((tickAnim - 12) / 4) * (0-(18.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (-0.9-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = -0.9 + (((tickAnim - 12) / 4) * (0-(-0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = -8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 3) / 9) * (13.25-(-8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            yy = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 13.25 + (((tickAnim - 12) / 4) * (0-(13.25)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 9) * (0.075-(0)));
            zz = 0 + (((tickAnim - 3) / 9) * (-0.875-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.075 + (((tickAnim - 12) / 4) * (0-(0.075)));
            zz = -0.875 + (((tickAnim - 12) / 4) * (0-(-0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -8.25 + (((tickAnim - 3) / 5) * (8.25-(-8.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 8.25 + (((tickAnim - 8) / 4) * (-17.25-(8.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -17.25 + (((tickAnim - 12) / 4) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 6.25 + (((tickAnim - 5) / 3) * (-34.75-(6.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -34.75 + (((tickAnim - 8) / 4) * (-10.25-(-34.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -10.25 + (((tickAnim - 12) / 4) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = -0.15 + (((tickAnim - 5) / 7) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (24.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 24.5 + (((tickAnim - 8) / 4) * (0-(24.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (1-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 5) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 5) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 5) / 7) * (1.1-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 1 + (((tickAnim - 12) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 12) / 4) * (1-(1)));
            zz = 1.1 + (((tickAnim - 12) / 4) * (1-(1.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraThalassodromeus entity = (EntityPrehistoricFloraThalassodromeus) entitylivingbaseIn;
        int animCycle = 113;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-16.2489071657+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-6-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-3.75393-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-3.76276-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = -16.2489071657+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-6 + (((tickAnim - 60) / 18) * (-35.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50-(-16.2489071657+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-6)));
            yy = -3.75393 + (((tickAnim - 60) / 18) * (0-(-3.75393)));
            zz = -3.76276 + (((tickAnim - 60) / 18) * (0-(-3.76276)));
        }
        else if (tickAnim >= 78 && tickAnim < 99) {
            xx = -35.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50 + (((tickAnim - 78) / 21) * (47.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50-(-35.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50)));
            yy = 0 + (((tickAnim - 78) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 21) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = 47.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50 + (((tickAnim - 99) / 14) * (0-(47.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50)));
            yy = 0 + (((tickAnim - 99) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-18.6423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-6-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (1.18276-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.66016-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = -18.6423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-6 + (((tickAnim - 60) / 18) * (-4.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-56-(-18.6423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-6)));
            yy = 1.18276 + (((tickAnim - 60) / 18) * (0-(1.18276)));
            zz = 0.66016 + (((tickAnim - 60) / 18) * (0-(0.66016)));
        }
        else if (tickAnim >= 78 && tickAnim < 99) {
            xx = -4.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-56 + (((tickAnim - 78) / 21) * (62.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*56-(-4.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-56)));
            yy = 0 + (((tickAnim - 78) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 21) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = 62.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*56 + (((tickAnim - 99) / 14) * (0-(62.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*56)));
            yy = 0 + (((tickAnim - 99) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-18.67231-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.17971-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (8.82824-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 69) {
            xx = -18.67231 + (((tickAnim - 60) / 9) * (6.5794+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*76-(-18.67231)));
            yy = -0.17971 + (((tickAnim - 60) / 9) * (-0.13231-(-0.17971)));
            zz = 8.82824 + (((tickAnim - 60) / 9) * (6.49988-(8.82824)));
        }
        else if (tickAnim >= 69 && tickAnim < 78) {
            xx = 6.5794+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*76 + (((tickAnim - 69) / 9) * (-35-(6.5794+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*76)));
            yy = -0.13231 + (((tickAnim - 69) / 9) * (0-(-0.13231)));
            zz = 6.49988 + (((tickAnim - 69) / 9) * (0-(6.49988)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = -35 + (((tickAnim - 78) / 10) * (0-(-35)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 88) / 11) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 88) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 11) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = -27.5 + (((tickAnim - 99) / 14) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 99) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0.3-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 69) {
            xx = 0.3 + (((tickAnim - 60) / 9) * (0.15-(0.3)));
            yy = 0 + (((tickAnim - 60) / 9) * (0.275-(0)));
            zz = 0 + (((tickAnim - 60) / 9) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 78) {
            xx = 0.15 + (((tickAnim - 69) / 9) * (0-(0.15)));
            yy = 0.275 + (((tickAnim - 69) / 9) * (-0.8-(0.275)));
            zz = 0 + (((tickAnim - 69) / 9) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            yy = -0.8 + (((tickAnim - 78) / 10) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 88) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 11) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 99) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 99) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+90))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 69) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+90))*3 + (((tickAnim - 60) / 9) * (-5.895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+90))*3)));
            yy = 0 + (((tickAnim - 60) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 9) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 78) {
            xx = -5.895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*-20 + (((tickAnim - 69) / 9) * (29.25-(-5.895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*-20)));
            yy = 0 + (((tickAnim - 69) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 9) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 29.25 + (((tickAnim - 78) / 10) * (0-(29.25)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 88) / 11) * (23.25-(0)));
            yy = 0 + (((tickAnim - 88) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 11) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 106) {
            xx = 23.25 + (((tickAnim - 99) / 7) * (0-(23.25)));
            yy = 0 + (((tickAnim - 99) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 7) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 106) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraThalassodromeus entity = (EntityPrehistoricFloraThalassodromeus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*5 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-90))*5-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*15 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*15)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-130))*15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*-15 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*-15)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-140))*-15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-190))*-5 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-190))*-5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-230))*-5-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*25 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*25)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-120))*25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*0.5 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*0.5)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*0.5-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing.rotationPointX = this.leftwing.rotationPointX + (float)(xx);
        this.leftwing.rotationPointY = this.leftwing.rotationPointY - (float)(yy);
        this.leftwing.rotationPointZ = this.leftwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-120))*15 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-120))*15)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-160))*15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing2.rotationPointX = this.leftwing2.rotationPointX + (float)(xx);
        this.leftwing2.rotationPointY = this.leftwing2.rotationPointY - (float)(yy);
        this.leftwing2.rotationPointZ = this.leftwing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*30 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*30)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5 + (((tickAnim - 106) / 54) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing3.rotationPointX = this.leftwing3.rotationPointX + (float)(xx);
        this.leftwing3.rotationPointY = this.leftwing3.rotationPointY - (float)(yy);
        this.leftwing3.rotationPointZ = this.leftwing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-250))*35 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-250))*35)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-290))*35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing4.rotationPointX = this.leftwing4.rotationPointX + (float)(xx);
        this.leftwing4.rotationPointY = this.leftwing4.rotationPointY - (float)(yy);
        this.leftwing4.rotationPointZ = this.leftwing4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-300))*-30 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-300))*-30)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-340))*-30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing5.rotationPointX = this.leftwing5.rotationPointX + (float)(xx);
        this.leftwing5.rotationPointY = this.leftwing5.rotationPointY - (float)(yy);
        this.leftwing5.rotationPointZ = this.leftwing5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*-25 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*-25)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-120))*-25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*0.5 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*0.5)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*0.5-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing.rotationPointX = this.rightwing.rotationPointX + (float)(xx);
        this.rightwing.rotationPointY = this.rightwing.rotationPointY - (float)(yy);
        this.rightwing.rotationPointZ = this.rightwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-120))*-15 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-120))*-15)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-160))*-15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing2.rotationPointX = this.rightwing2.rotationPointX + (float)(xx);
        this.rightwing2.rotationPointY = this.rightwing2.rotationPointY - (float)(yy);
        this.rightwing2.rotationPointZ = this.rightwing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-30 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-30)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5 + (((tickAnim - 106) / 54) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*-30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing3.rotationPointX = this.rightwing3.rotationPointX + (float)(xx);
        this.rightwing3.rotationPointY = this.rightwing3.rotationPointY - (float)(yy);
        this.rightwing3.rotationPointZ = this.rightwing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-250))*-35 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-250))*-35)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-290))*-35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing4.rotationPointX = this.rightwing4.rotationPointX + (float)(xx);
        this.rightwing4.rotationPointY = this.rightwing4.rotationPointY - (float)(yy);
        this.rightwing4.rotationPointZ = this.rightwing4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-280))*30 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-280))*30)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-300))*30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing5.rotationPointX = this.rightwing5.rotationPointX + (float)(xx);
        this.rightwing5.rotationPointY = this.rightwing5.rotationPointY - (float)(yy);
        this.rightwing5.rotationPointZ = this.rightwing5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-250))*5 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-250))*5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-470))*-5-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-300))*5 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-300))*5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-520))*-5-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-350))*-10 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-350))*-10)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-750))*-10-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraThalassodromeus entity = (EntityPrehistoricFloraThalassodromeus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 29) {
            xx = -18.50392 + (((tickAnim - 0) / 29) * (17.5989-(-18.50392)));
            yy = 2.44439 + (((tickAnim - 0) / 29) * (-9.4675-(2.44439)));
            zz = -9.90178 + (((tickAnim - 0) / 29) * (-14.78697-(-9.90178)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 17.5989 + (((tickAnim - 29) / 7) * (26.0989-(17.5989)));
            yy = -9.4675 + (((tickAnim - 29) / 7) * (-9.4675-(-9.4675)));
            zz = -14.78697 + (((tickAnim - 29) / 7) * (-14.78697-(-14.78697)));
        }
        else if (tickAnim >= 36 && tickAnim < 52) {
            xx = 26.0989 + (((tickAnim - 36) / 16) * (-74.0152+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*95-(26.0989)));
            yy = -9.4675 + (((tickAnim - 36) / 16) * (-1.96235-(-9.4675)));
            zz = -14.78697 + (((tickAnim - 36) / 16) * (7.952+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25-(-14.78697)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = -74.0152+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*95 + (((tickAnim - 52) / 8) * (-18.50392-(-74.0152+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*95)));
            yy = -1.96235 + (((tickAnim - 52) / 8) * (2.44439-(-1.96235)));
            zz = 7.952+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25 + (((tickAnim - 52) / 8) * (-9.90178-(7.952+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = -17.75 + (((tickAnim - 0) / 29) * (-7.69312-(-17.75)));
            yy = 0 + (((tickAnim - 0) / 29) * (8.00507-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (14.52278-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = -7.69312 + (((tickAnim - 29) / 7) * (-9.40345-(-7.69312)));
            yy = 8.00507 + (((tickAnim - 29) / 7) * (7.91318-(8.00507)));
            zz = 14.52278 + (((tickAnim - 29) / 7) * (14.36845-(14.52278)));
        }
        else if (tickAnim >= 36 && tickAnim < 46) {
            xx = -9.40345 + (((tickAnim - 36) / 10) * (21.06466-(-9.40345)));
            yy = 7.91318 + (((tickAnim - 36) / 10) * (5.90446-(7.91318)));
            zz = 14.36845 + (((tickAnim - 36) / 10) * (15.24735-(14.36845)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = 21.06466 + (((tickAnim - 46) / 14) * (-17.75-(21.06466)));
            yy = 5.90446 + (((tickAnim - 46) / 14) * (0-(5.90446)));
            zz = 15.24735 + (((tickAnim - 46) / 14) * (0-(15.24735)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = -0.225 + (((tickAnim - 29) / 31) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 34.51819 + (((tickAnim - 0) / 14) * (8.79984-(34.51819)));
            yy = -9.96542 + (((tickAnim - 0) / 14) * (-4.95302-(-9.96542)));
            zz = 3.75688 + (((tickAnim - 0) / 14) * (2.67551-(3.75688)));
        }
        else if (tickAnim >= 14 && tickAnim < 29) {
            xx = 8.79984 + (((tickAnim - 14) / 15) * (22.63235-(8.79984)));
            yy = -4.95302 + (((tickAnim - 14) / 15) * (-1.88472-(-4.95302)));
            zz = 2.67551 + (((tickAnim - 14) / 15) * (-8.03328-(2.67551)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 22.63235 + (((tickAnim - 29) / 7) * (53.38235-(22.63235)));
            yy = -1.88472 + (((tickAnim - 29) / 7) * (-1.88472-(-1.88472)));
            zz = -8.03328 + (((tickAnim - 29) / 7) * (-8.03328-(-8.03328)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 53.38235 + (((tickAnim - 36) / 5) * (91.02942-(53.38235)));
            yy = -1.88472 + (((tickAnim - 36) / 5) * (-3.55659-(-1.88472)));
            zz = -8.03328 + (((tickAnim - 36) / 5) * (-5.59394-(-8.03328)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 91.02942 + (((tickAnim - 41) / 7) * (71.87503-(91.02942)));
            yy = -3.55659 + (((tickAnim - 41) / 7) * (6.06439-(-3.55659)));
            zz = -5.59394 + (((tickAnim - 41) / 7) * (1.93492-(-5.59394)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = 71.87503 + (((tickAnim - 48) / 6) * (36.94661-(71.87503)));
            yy = 6.06439 + (((tickAnim - 48) / 6) * (-8.0149-(6.06439)));
            zz = 1.93492 + (((tickAnim - 48) / 6) * (0.91098-(1.93492)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 36.94661 + (((tickAnim - 54) / 6) * (34.51819-(36.94661)));
            yy = -8.0149 + (((tickAnim - 54) / 6) * (-9.96542-(-8.0149)));
            zz = 0.91098 + (((tickAnim - 54) / 6) * (3.75688-(0.91098)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.9 + (((tickAnim - 0) / 6) * (1.115-(0.9)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            yy = 1.115 + (((tickAnim - 6) / 8) * (0.585-(1.115)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 14) / 15) * (0-(0)));
            yy = 0.585 + (((tickAnim - 14) / 15) * (0-(0.585)));
            zz = 0 + (((tickAnim - 14) / 15) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 5) * (0.34-(0)));
            zz = 0 + (((tickAnim - 36) / 5) * (-0.555-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            yy = 0.34 + (((tickAnim - 41) / 7) * (1.21-(0.34)));
            zz = -0.555 + (((tickAnim - 41) / 7) * (-0.1-(-0.555)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 48) / 3) * (0-(0)));
            yy = 1.21 + (((tickAnim - 48) / 3) * (1.81-(1.21)));
            zz = -0.1 + (((tickAnim - 48) / 3) * (-0.19-(-0.1)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            yy = 1.81 + (((tickAnim - 51) / 9) * (0.9-(1.81)));
            zz = -0.19 + (((tickAnim - 51) / 9) * (0-(-0.19)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 17.5989 + (((tickAnim - 0) / 7) * (26.0989-(17.5989)));
            yy = 9.4675 + (((tickAnim - 0) / 7) * (9.4675-(9.4675)));
            zz = 14.78697 + (((tickAnim - 0) / 7) * (14.78697-(14.78697)));
        }
        else if (tickAnim >= 7 && tickAnim < 23) {
            xx = 26.0989 + (((tickAnim - 7) / 16) * (58.6098+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-95-(26.0989)));
            yy = 9.4675 + (((tickAnim - 7) / 16) * (-1.96235-(9.4675)));
            zz = 14.78697 + (((tickAnim - 7) / 16) * (-2.277+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25-(14.78697)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 58.6098+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-95 + (((tickAnim - 23) / 8) * (-18.50392-(58.6098+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-95)));
            yy = -1.96235 + (((tickAnim - 23) / 8) * (-2.44439-(-1.96235)));
            zz = -2.277+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 23) / 8) * (9.90178-(-2.277+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
        }
        else if (tickAnim >= 31 && tickAnim < 60) {
            xx = -18.50392 + (((tickAnim - 31) / 29) * (17.5989-(-18.50392)));
            yy = -2.44439 + (((tickAnim - 31) / 29) * (9.4675-(-2.44439)));
            zz = 9.90178 + (((tickAnim - 31) / 29) * (14.78697-(9.90178)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -7.69312 + (((tickAnim - 0) / 7) * (-9.40345-(-7.69312)));
            yy = 8.00507 + (((tickAnim - 0) / 7) * (7.91318-(8.00507)));
            zz = -14.52278 + (((tickAnim - 0) / 7) * (-14.36845-(-14.52278)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = -9.40345 + (((tickAnim - 7) / 10) * (21.06466-(-9.40345)));
            yy = 7.91318 + (((tickAnim - 7) / 10) * (5.90446-(7.91318)));
            zz = -14.36845 + (((tickAnim - 7) / 10) * (-15.24735-(-14.36845)));
        }
        else if (tickAnim >= 17 && tickAnim < 31) {
            xx = 21.06466 + (((tickAnim - 17) / 14) * (-17.75-(21.06466)));
            yy = 5.90446 + (((tickAnim - 17) / 14) * (0-(5.90446)));
            zz = -15.24735 + (((tickAnim - 17) / 14) * (0-(-15.24735)));
        }
        else if (tickAnim >= 31 && tickAnim < 60) {
            xx = -17.75 + (((tickAnim - 31) / 29) * (-7.69312-(-17.75)));
            yy = 0 + (((tickAnim - 31) / 29) * (8.00507-(0)));
            zz = 0 + (((tickAnim - 31) / 29) * (-14.52278-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 31) {
            xx = -0.225 + (((tickAnim - 0) / 31) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 31) / 29) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 31) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 22.63235 + (((tickAnim - 0) / 7) * (53.38235-(22.63235)));
            yy = 1.88472 + (((tickAnim - 0) / 7) * (1.88472-(1.88472)));
            zz = 8.03328 + (((tickAnim - 0) / 7) * (8.03328-(8.03328)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 53.38235 + (((tickAnim - 7) / 5) * (91.02942-(53.38235)));
            yy = 1.88472 + (((tickAnim - 7) / 5) * (3.55659-(1.88472)));
            zz = 8.03328 + (((tickAnim - 7) / 5) * (5.59394-(8.03328)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 91.02942 + (((tickAnim - 12) / 7) * (71.87503-(91.02942)));
            yy = 3.55659 + (((tickAnim - 12) / 7) * (6.06439-(3.55659)));
            zz = 5.59394 + (((tickAnim - 12) / 7) * (1.93492-(5.59394)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 71.87503 + (((tickAnim - 19) / 6) * (23.19661-(71.87503)));
            yy = 6.06439 + (((tickAnim - 19) / 6) * (8.0149-(6.06439)));
            zz = 1.93492 + (((tickAnim - 19) / 6) * (-0.91098-(1.93492)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 23.19661 + (((tickAnim - 25) / 6) * (34.51819-(23.19661)));
            yy = 8.0149 + (((tickAnim - 25) / 6) * (9.96542-(8.0149)));
            zz = -0.91098 + (((tickAnim - 25) / 6) * (-3.75688-(-0.91098)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = 34.51819 + (((tickAnim - 31) / 12) * (12.92426-(34.51819)));
            yy = 9.96542 + (((tickAnim - 31) / 12) * (6.50226-(9.96542)));
            zz = -3.75688 + (((tickAnim - 31) / 12) * (1.29605-(-3.75688)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 12.92426 + (((tickAnim - 43) / 17) * (22.63235-(12.92426)));
            yy = 6.50226 + (((tickAnim - 43) / 17) * (1.88472-(6.50226)));
            zz = 1.29605 + (((tickAnim - 43) / 17) * (8.03328-(1.29605)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0.34-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (-0.555-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 0.34 + (((tickAnim - 12) / 7) * (1.21-(0.34)));
            zz = -0.555 + (((tickAnim - 12) / 7) * (-0.1-(-0.555)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 1.21 + (((tickAnim - 19) / 3) * (1.81-(1.21)));
            zz = -0.1 + (((tickAnim - 19) / 3) * (-0.19-(-0.1)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 1.81 + (((tickAnim - 22) / 6) * (0.155-(1.81)));
            zz = -0.19 + (((tickAnim - 22) / 6) * (-0.28-(-0.19)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0.155 + (((tickAnim - 28) / 3) * (0.925-(0.155)));
            zz = -0.28 + (((tickAnim - 28) / 3) * (0-(-0.28)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = 0.925 + (((tickAnim - 31) / 7) * (1.345-(0.925)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 1.345 + (((tickAnim - 38) / 5) * (1.2-(1.345)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            yy = 1.2 + (((tickAnim - 43) / 17) * (0-(1.2)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 2.25 + (((tickAnim - 0) / 23) * (21.14681-(2.25)));
            yy = 0 + (((tickAnim - 0) / 23) * (12.81854-(0)));
            zz = 4.75 + (((tickAnim - 0) / 23) * (-13.61717-(4.75)));
        }
        else if (tickAnim >= 23 && tickAnim < 44) {
            xx = 21.14681 + (((tickAnim - 23) / 21) * (-14.97812-(21.14681)));
            yy = 12.81854 + (((tickAnim - 23) / 21) * (1.10018-(12.81854)));
            zz = -13.61717 + (((tickAnim - 23) / 21) * (18.99437-(-13.61717)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -14.97812 + (((tickAnim - 44) / 16) * (2.25-(-14.97812)));
            yy = 1.10018 + (((tickAnim - 44) / 16) * (0-(1.10018)));
            zz = 18.99437 + (((tickAnim - 44) / 16) * (4.75-(18.99437)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 5.5 + (((tickAnim - 0) / 23) * (13.05809-(5.5)));
            yy = 0 + (((tickAnim - 0) / 23) * (25.77726-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (8.13707-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 13.05809 + (((tickAnim - 23) / 11) * (-8.1794+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*40-(13.05809)));
            yy = 25.77726 + (((tickAnim - 23) / 11) * (-2.7712-(25.77726)));
            zz = 8.13707 + (((tickAnim - 23) / 11) * (4.37625-(8.13707)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -8.1794+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*40 + (((tickAnim - 34) / 10) * (10.40787-(-8.1794+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*40)));
            yy = -2.7712 + (((tickAnim - 34) / 10) * (-13.98522-(-2.7712)));
            zz = 4.37625 + (((tickAnim - 34) / 10) * (-8.25739-(4.37625)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 10.40787 + (((tickAnim - 44) / 16) * (5.5-(10.40787)));
            yy = -13.98522 + (((tickAnim - 44) / 16) * (0-(-13.98522)));
            zz = -8.25739 + (((tickAnim - 44) / 16) * (0-(-8.25739)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 11) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 34) / 10) * (-0.3-(0)));
            yy = -0.675 + (((tickAnim - 34) / 10) * (-0.65-(-0.675)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -0.3 + (((tickAnim - 44) / 16) * (0-(-0.3)));
            yy = -0.65 + (((tickAnim - 44) / 16) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing2.rotationPointX = this.leftwing2.rotationPointX + (float)(xx);
        this.leftwing2.rotationPointY = this.leftwing2.rotationPointY - (float)(yy);
        this.leftwing2.rotationPointZ = this.leftwing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -7.05406 + (((tickAnim - 0) / 9) * (-22.75615-(-7.05406)));
            yy = -0.87454 + (((tickAnim - 0) / 9) * (-1.65888-(-0.87454)));
            zz = -6.70799 + (((tickAnim - 0) / 9) * (-7.39613-(-6.70799)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = -22.75615 + (((tickAnim - 9) / 14) * (42.25-(-22.75615)));
            yy = -1.65888 + (((tickAnim - 9) / 14) * (0-(-1.65888)));
            zz = -7.39613 + (((tickAnim - 9) / 14) * (0-(-7.39613)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 42.25 + (((tickAnim - 23) / 11) * (71.36742-(42.25)));
            yy = 0 + (((tickAnim - 23) / 11) * (-2.37961-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (6.191-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 71.36742 + (((tickAnim - 34) / 10) * (13.22581-(71.36742)));
            yy = -2.37961 + (((tickAnim - 34) / 10) * (4.57617-(-2.37961)));
            zz = 6.191 + (((tickAnim - 34) / 10) * (-11.90577-(6.191)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 13.22581 + (((tickAnim - 44) / 9) * (2.56063-(13.22581)));
            yy = 4.57617 + (((tickAnim - 44) / 9) * (4.21489-(4.57617)));
            zz = -11.90577 + (((tickAnim - 44) / 9) * (-7.16876-(-11.90577)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 2.56063 + (((tickAnim - 53) / 7) * (-7.05406-(2.56063)));
            yy = 4.21489 + (((tickAnim - 53) / 7) * (-0.87454-(4.21489)));
            zz = -7.16876 + (((tickAnim - 53) / 7) * (-6.70799-(-7.16876)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 1.1 + (((tickAnim - 0) / 9) * (0.15-(1.1)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 9) / 14) * (0-(0)));
            yy = 0.15 + (((tickAnim - 9) / 14) * (0.65-(0.15)));
            zz = 0 + (((tickAnim - 9) / 14) * (-0.675-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            yy = 0.65 + (((tickAnim - 23) / 11) * (2.75-(0.65)));
            zz = -0.675 + (((tickAnim - 23) / 11) * (-0.125-(-0.675)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            yy = 2.75 + (((tickAnim - 34) / 10) * (0-(2.75)));
            zz = -0.125 + (((tickAnim - 34) / 10) * (0.9-(-0.125)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 4) * (0.05-(0)));
            zz = 0.9 + (((tickAnim - 44) / 4) * (0.49-(0.9)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = 0.05 + (((tickAnim - 48) / 5) * (0.55-(0.05)));
            zz = 0.49 + (((tickAnim - 48) / 5) * (0-(0.49)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0.55 + (((tickAnim - 53) / 7) * (1.1-(0.55)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 21.14681 + (((tickAnim - 0) / 21) * (-15.12625-(21.14681)));
            yy = -12.81854 + (((tickAnim - 0) / 21) * (-1.25946-(-12.81854)));
            zz = 13.61717 + (((tickAnim - 0) / 21) * (-17.49551-(13.61717)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = -15.12625 + (((tickAnim - 21) / 39) * (21.14681-(-15.12625)));
            yy = -1.25946 + (((tickAnim - 21) / 39) * (-12.81854-(-1.25946)));
            zz = -17.49551 + (((tickAnim - 21) / 39) * (13.61717-(-17.49551)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = -2.425 + (((tickAnim - 0) / 21) * (0-(-2.425)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 21) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 39) * (-2.425-(0)));
            zz = 0 + (((tickAnim - 21) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lwmembrane3.rotationPointX = this.lwmembrane3.rotationPointX + (float)(xx);
        this.lwmembrane3.rotationPointY = this.lwmembrane3.rotationPointY - (float)(yy);
        this.lwmembrane3.rotationPointZ = this.lwmembrane3.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 1 + (((tickAnim - 0) / 21) * (1-(1)));
            yy = 0.6 + (((tickAnim - 0) / 21) * (1-(0.6)));
            zz = 0.6 + (((tickAnim - 0) / 21) * (1-(0.6)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 21) / 39) * (1-(1)));
            yy = 1 + (((tickAnim - 21) / 39) * (0.6-(1)));
            zz = 1 + (((tickAnim - 21) / 39) * (0.6-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lwmembrane3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 8.75 + (((tickAnim - 0) / 11) * (3.1024+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-40-(8.75)));
            yy = -6.5 + (((tickAnim - 0) / 11) * (-0.73873-(-6.5)));
            zz = 0 + (((tickAnim - 0) / 11) * (-11.86242-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 3.1024+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-40 + (((tickAnim - 11) / 10) * (7.72311-(3.1024+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-40)));
            yy = -0.73873 + (((tickAnim - 11) / 10) * (14.15979-(-0.73873)));
            zz = -11.86242 + (((tickAnim - 11) / 10) * (10.27454-(-11.86242)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = 7.72311 + (((tickAnim - 21) / 39) * (8.75-(7.72311)));
            yy = 14.15979 + (((tickAnim - 21) / 39) * (-6.5-(14.15979)));
            zz = 10.27454 + (((tickAnim - 21) / 39) * (0-(10.27454)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 11) / 10) * (-0.3-(0)));
            yy = -0.675 + (((tickAnim - 11) / 10) * (-0.65-(-0.675)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = -0.3 + (((tickAnim - 21) / 39) * (0-(-0.3)));
            yy = -0.65 + (((tickAnim - 21) / 39) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 21) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing2.rotationPointX = this.rightwing2.rotationPointX + (float)(xx);
        this.rightwing2.rotationPointY = this.rightwing2.rotationPointY - (float)(yy);
        this.rightwing2.rotationPointZ = this.rightwing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 11.73309 + (((tickAnim - 0) / 11) * (19.5552+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-40-(11.73309)));
            yy = -0.13763 + (((tickAnim - 0) / 11) * (1.40684-(-0.13763)));
            zz = 4.10982 + (((tickAnim - 0) / 11) * (7.02082-(4.10982)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 19.5552+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-40 + (((tickAnim - 11) / 10) * (-8.75-(19.5552+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-40)));
            yy = 1.40684 + (((tickAnim - 11) / 10) * (0-(1.40684)));
            zz = 7.02082 + (((tickAnim - 11) / 10) * (0-(7.02082)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = -8.75 + (((tickAnim - 21) / 39) * (11.73309-(-8.75)));
            yy = 0 + (((tickAnim - 21) / 39) * (-0.13763-(0)));
            zz = 0 + (((tickAnim - 21) / 39) * (4.10982-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.125-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            yy = -0.425 + (((tickAnim - 11) / 10) * (-0.35-(-0.425)));
            zz = -0.125 + (((tickAnim - 11) / 10) * (0-(-0.125)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 21) / 39) * (0-(0)));
            yy = -0.35 + (((tickAnim - 21) / 39) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 21) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing3.rotationPointX = this.rightwing3.rotationPointX + (float)(xx);
        this.rightwing3.rotationPointY = this.rightwing3.rotationPointY - (float)(yy);
        this.rightwing3.rotationPointZ = this.rightwing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 42.25 + (((tickAnim - 0) / 11) * (71.36742-(42.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (-2.37961-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (6.191-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 71.36742 + (((tickAnim - 11) / 10) * (16.97581-(71.36742)));
            yy = -2.37961 + (((tickAnim - 11) / 10) * (-4.57617-(-2.37961)));
            zz = 6.191 + (((tickAnim - 11) / 10) * (11.90577-(6.191)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 16.97581 + (((tickAnim - 21) / 9) * (0.20656-(16.97581)));
            yy = -4.57617 + (((tickAnim - 21) / 9) * (-3.33509-(-4.57617)));
            zz = 11.90577 + (((tickAnim - 21) / 9) * (1.46734-(11.90577)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.20656 + (((tickAnim - 30) / 10) * (-14.8254-(0.20656)));
            yy = -3.33509 + (((tickAnim - 30) / 10) * (-0.73387-(-3.33509)));
            zz = 1.46734 + (((tickAnim - 30) / 10) * (2.0225-(1.46734)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -14.8254 + (((tickAnim - 40) / 10) * (-0.5377-(-14.8254)));
            yy = -0.73387 + (((tickAnim - 40) / 10) * (-0.36693-(-0.73387)));
            zz = 2.0225 + (((tickAnim - 40) / 10) * (1.01125-(2.0225)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -0.5377 + (((tickAnim - 50) / 10) * (42.25-(-0.5377)));
            yy = -0.36693 + (((tickAnim - 50) / 10) * (0-(-0.36693)));
            zz = 1.01125 + (((tickAnim - 50) / 10) * (0-(1.01125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0.65 + (((tickAnim - 0) / 11) * (2.75-(0.65)));
            zz = -0.675 + (((tickAnim - 0) / 11) * (-0.125-(-0.675)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            yy = 2.75 + (((tickAnim - 11) / 10) * (-0.175-(2.75)));
            zz = -0.125 + (((tickAnim - 11) / 10) * (0.7-(-0.125)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = -0.175 + (((tickAnim - 21) / 9) * (1.49-(-0.175)));
            zz = 0.7 + (((tickAnim - 21) / 9) * (-0.16-(0.7)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 1.49 + (((tickAnim - 30) / 10) * (0.82-(1.49)));
            zz = -0.16 + (((tickAnim - 30) / 10) * (-0.33-(-0.16)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0.82 + (((tickAnim - 40) / 20) * (0.65-(0.82)));
            zz = -0.33 + (((tickAnim - 40) / 20) * (-0.675-(-0.33)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -4.75 + (((tickAnim - 0) / 11) * (-10.68064-(-4.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (-2.99475-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-2.6529-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -10.68064 + (((tickAnim - 11) / 10) * (4.75-(-10.68064)));
            yy = -2.99475 + (((tickAnim - 11) / 10) * (0-(-2.99475)));
            zz = -2.6529 + (((tickAnim - 11) / 10) * (0-(-2.6529)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = 4.75 + (((tickAnim - 21) / 39) * (-4.75-(4.75)));
            yy = 0 + (((tickAnim - 21) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -15 + (((tickAnim - 0) / 11) * (-3.75-(-15)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -3.75 + (((tickAnim - 11) / 10) * (-9.75-(-3.75)));
            yy = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = -9.75 + (((tickAnim - 21) / 39) * (-15-(-9.75)));
            yy = 0 + (((tickAnim - 21) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.lwmembrane2.setScale((float)1,(float)0,(float)0);


        this.lw2membrane.setScale((float)1,(float)0,(float)0);


        this.lw3membrane.setScale((float)1,(float)0,(float)0);


        this.lw4membrane.setScale((float)1,(float)0,(float)0);


        this.lw5membrane.setScale((float)1,(float)0,(float)0);


        this.lwmembrane4.setScale((float)1,(float)0,(float)0);


        this.lw2membrane3.setScale((float)1,(float)0,(float)0);


        this.lw3membrane3.setScale((float)1,(float)0,(float)0);


        this.lw4membrane3.setScale((float)1,(float)0,(float)0);


        this.lw4membrane4.setScale((float)1,(float)0,(float)0);


        this.lw5membrane3.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 31) {
            xx = 3.5 + (((tickAnim - 7) / 24) * (0-(3.5)));
            yy = 0 + (((tickAnim - 7) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 24) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 31) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 7) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 18) * (1.475-(0)));
            zz = 0 + (((tickAnim - 7) / 18) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            yy = 1.475 + (((tickAnim - 25) / 6) * (0-(1.475)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-30))*1), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-59))*0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-59))*-0.2);



        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 29) / 7) * (3.5-(0)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 60) {
            xx = 3.5 + (((tickAnim - 36) / 24) * (0-(3.5)));
            yy = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 14) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 15) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 36) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 18) * (1.475-(0)));
            zz = 0 + (((tickAnim - 36) / 18) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            yy = 1.475 + (((tickAnim - 54) / 6) * (0-(1.475)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-90))*-2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+50))*2));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 8 + (((tickAnim - 0) / 23) * (0-(8)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 23) / 21) * (11.79526-(0)));
            yy = 0 + (((tickAnim - 23) / 21) * (-6.98826-(0)));
            zz = 0 + (((tickAnim - 23) / 21) * (-0.40556-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 11.79526 + (((tickAnim - 44) / 16) * (8-(11.79526)));
            yy = -6.98826 + (((tickAnim - 44) / 16) * (0-(-6.98826)));
            zz = -0.40556 + (((tickAnim - 44) / 16) * (0-(-0.40556)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lwmembrane, lwmembrane.rotateAngleX + (float) Math.toRadians(xx), lwmembrane.rotateAngleY + (float) Math.toRadians(yy), lwmembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-2.425-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 23) / 21) * (0-(0)));
            yy = -2.425 + (((tickAnim - 23) / 21) * (0-(-2.425)));
            zz = 0 + (((tickAnim - 23) / 21) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lwmembrane.rotationPointX = this.lwmembrane.rotationPointX + (float)(xx);
        this.lwmembrane.rotationPointY = this.lwmembrane.rotationPointY - (float)(yy);
        this.lwmembrane.rotationPointZ = this.lwmembrane.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 0) / 23) * (1-(1)));
            yy = 0.9 + (((tickAnim - 0) / 23) * (0.6-(0.9)));
            zz = 0.7 + (((tickAnim - 0) / 23) * (0.6-(0.7)));
        }
        else if (tickAnim >= 23 && tickAnim < 44) {
            xx = 1 + (((tickAnim - 23) / 21) * (1-(1)));
            yy = 0.6 + (((tickAnim - 23) / 21) * (1-(0.6)));
            zz = 0.6 + (((tickAnim - 23) / 21) * (1-(0.6)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 44) / 16) * (1-(1)));
            yy = 1 + (((tickAnim - 44) / 16) * (0.9-(1)));
            zz = 1 + (((tickAnim - 44) / 16) * (0.7-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lwmembrane.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (11.73309-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-0.13763-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (4.10982-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 11.73309 + (((tickAnim - 23) / 11) * (-10.4948+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*40-(11.73309)));
            yy = -0.13763 + (((tickAnim - 23) / 11) * (-1.40684-(-0.13763)));
            zz = 4.10982 + (((tickAnim - 23) / 11) * (-7.02082-(4.10982)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -10.4948+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*40 + (((tickAnim - 34) / 10) * (-8.75-(-10.4948+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*40)));
            yy = -1.40684 + (((tickAnim - 34) / 10) * (0-(-1.40684)));
            zz = -7.02082 + (((tickAnim - 34) / 10) * (0-(-7.02082)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -8.75 + (((tickAnim - 44) / 16) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = -4.75 + (((tickAnim - 23) / 11) * (-10.68064-(-4.75)));
            yy = 0 + (((tickAnim - 23) / 11) * (-2.99475-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (-2.6529-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -10.68064 + (((tickAnim - 34) / 10) * (4.75-(-10.68064)));
            yy = -2.99475 + (((tickAnim - 34) / 10) * (0-(-2.99475)));
            zz = -2.6529 + (((tickAnim - 34) / 10) * (0-(-2.6529)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 4.75 + (((tickAnim - 44) / 16) * (0-(4.75)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = -15 + (((tickAnim - 23) / 11) * (-3.75-(-15)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -3.75 + (((tickAnim - 34) / 10) * (-9.75-(-3.75)));
            yy = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -9.75 + (((tickAnim - 44) / 16) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-130))*3), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+150))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-180))*-2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+190))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-240))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+20))*-3), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*2));

    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraThalassodromeus entity = (EntityPrehistoricFloraThalassodromeus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 26.0989 + (((tickAnim - 0) / 6) * (23.5055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120-(26.0989)));
            yy = -9.4675 + (((tickAnim - 0) / 6) * (-6.12506-(-9.4675)));
            zz = -14.78697 + (((tickAnim - 0) / 6) * (-22.0745+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25-(-14.78697)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 23.5055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120 + (((tickAnim - 6) / 4) * (-30.00392-(23.5055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120)));
            yy = -6.12506 + (((tickAnim - 6) / 4) * (2.44439-(-6.12506)));
            zz = -22.0745+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 6) / 4) * (-9.90178-(-22.0745+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -30.00392 + (((tickAnim - 10) / 10) * (26.0989-(-30.00392)));
            yy = 2.44439 + (((tickAnim - 10) / 10) * (-9.4675-(2.44439)));
            zz = -9.90178 + (((tickAnim - 10) / 10) * (-14.78697-(-9.90178)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17.09307 + (((tickAnim - 0) / 4) * (36.59307-(17.09307)));
            yy = -12.28041 + (((tickAnim - 0) / 4) * (-12.28041-(-12.28041)));
            zz = 19.31638 + (((tickAnim - 0) / 4) * (19.31638-(19.31638)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 36.59307 + (((tickAnim - 4) / 6) * (-14-(36.59307)));
            yy = -12.28041 + (((tickAnim - 4) / 6) * (0-(-12.28041)));
            zz = 19.31638 + (((tickAnim - 4) / 6) * (0-(19.31638)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14 + (((tickAnim - 10) / 10) * (17.09307-(-14)));
            yy = 0 + (((tickAnim - 10) / 10) * (-12.28041-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (19.31638-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-0.2-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.2 + (((tickAnim - 10) / 10) * (0-(-0.2)));
            yy = -0.875 + (((tickAnim - 10) / 10) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 53.38235 + (((tickAnim - 0) / 3) * (91.02942-(53.38235)));
            yy = -1.88472 + (((tickAnim - 0) / 3) * (-3.55659-(-1.88472)));
            zz = -8.03328 + (((tickAnim - 0) / 3) * (-5.59394-(-8.03328)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 91.02942 + (((tickAnim - 3) / 2) * (71.87503-(91.02942)));
            yy = -3.55659 + (((tickAnim - 3) / 2) * (-6.06439-(-3.55659)));
            zz = -5.59394 + (((tickAnim - 3) / 2) * (-1.93492-(-5.59394)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 71.87503 + (((tickAnim - 5) / 3) * (72.69661-(71.87503)));
            yy = -6.06439 + (((tickAnim - 5) / 3) * (-8.0149-(-6.06439)));
            zz = -1.93492 + (((tickAnim - 5) / 3) * (-0.91098-(-1.93492)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 72.69661 + (((tickAnim - 8) / 2) * (33.36265-(72.69661)));
            yy = -8.0149 + (((tickAnim - 8) / 2) * (-10.96849-(-8.0149)));
            zz = -0.91098 + (((tickAnim - 8) / 2) * (1.22448-(-0.91098)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 33.36265 + (((tickAnim - 10) / 4) * (6.96643-(33.36265)));
            yy = -10.96849 + (((tickAnim - 10) / 4) * (-5.91147-(-10.96849)));
            zz = 1.22448 + (((tickAnim - 10) / 4) * (0.62598-(1.22448)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 6.96643 + (((tickAnim - 14) / 6) * (53.38235-(6.96643)));
            yy = -5.91147 + (((tickAnim - 14) / 6) * (-1.88472-(-5.91147)));
            zz = 0.62598 + (((tickAnim - 14) / 6) * (-8.03328-(0.62598)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.34-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.555-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.34 + (((tickAnim - 3) / 2) * (1.21-(0.34)));
            zz = -0.555 + (((tickAnim - 3) / 2) * (-0.1-(-0.555)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.21 + (((tickAnim - 5) / 3) * (1.81-(1.21)));
            zz = -0.1 + (((tickAnim - 5) / 3) * (-0.19-(-0.1)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.81 + (((tickAnim - 8) / 1) * (1.4-(1.81)));
            zz = -0.19 + (((tickAnim - 8) / 1) * (-0.06-(-0.19)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.4 + (((tickAnim - 9) / 1) * (0-(1.4)));
            zz = -0.06 + (((tickAnim - 9) / 1) * (0-(-0.06)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.47-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.47 + (((tickAnim - 12) / 2) * (-0.775-(-0.47)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.775 + (((tickAnim - 14) / 6) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 26.0989 + (((tickAnim - 0) / 6) * (23.8723+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120-(26.0989)));
            yy = 9.4675 + (((tickAnim - 0) / 6) * (3.73399-(9.4675)));
            zz = 14.78697 + (((tickAnim - 0) / 6) * (15.8445+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25-(14.78697)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 23.8723+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120 + (((tickAnim - 6) / 4) * (-30.00392-(23.8723+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120)));
            yy = 3.73399 + (((tickAnim - 6) / 4) * (-2.44439-(3.73399)));
            zz = 15.8445+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25 + (((tickAnim - 6) / 4) * (9.90178-(15.8445+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -30.00392 + (((tickAnim - 10) / 10) * (26.0989-(-30.00392)));
            yy = -2.44439 + (((tickAnim - 10) / 10) * (9.4675-(-2.44439)));
            zz = 9.90178 + (((tickAnim - 10) / 10) * (14.78697-(9.90178)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17.09307 + (((tickAnim - 0) / 4) * (36.59307-(17.09307)));
            yy = 12.28041 + (((tickAnim - 0) / 4) * (12.28041-(12.28041)));
            zz = -19.31638 + (((tickAnim - 0) / 4) * (-19.31638-(-19.31638)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 36.59307 + (((tickAnim - 4) / 6) * (-14-(36.59307)));
            yy = 12.28041 + (((tickAnim - 4) / 6) * (0-(12.28041)));
            zz = -19.31638 + (((tickAnim - 4) / 6) * (0-(-19.31638)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14 + (((tickAnim - 10) / 10) * (17.09307-(-14)));
            yy = 0 + (((tickAnim - 10) / 10) * (12.28041-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-19.31638-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-0.2-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.2 + (((tickAnim - 10) / 10) * (0-(-0.2)));
            yy = -0.875 + (((tickAnim - 10) / 10) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 53.38235 + (((tickAnim - 0) / 3) * (91.02942-(53.38235)));
            yy = 1.88472 + (((tickAnim - 0) / 3) * (3.55659-(1.88472)));
            zz = 8.03328 + (((tickAnim - 0) / 3) * (5.59394-(8.03328)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 91.02942 + (((tickAnim - 3) / 2) * (71.87503-(91.02942)));
            yy = 3.55659 + (((tickAnim - 3) / 2) * (6.06439-(3.55659)));
            zz = 5.59394 + (((tickAnim - 3) / 2) * (1.93492-(5.59394)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 71.87503 + (((tickAnim - 5) / 3) * (72.69661-(71.87503)));
            yy = 6.06439 + (((tickAnim - 5) / 3) * (8.0149-(6.06439)));
            zz = 1.93492 + (((tickAnim - 5) / 3) * (0.91098-(1.93492)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 72.69661 + (((tickAnim - 8) / 2) * (34.26819-(72.69661)));
            yy = 8.0149 + (((tickAnim - 8) / 2) * (9.96542-(8.0149)));
            zz = 0.91098 + (((tickAnim - 8) / 2) * (3.75688-(0.91098)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 34.26819 + (((tickAnim - 10) / 4) * (6.96643-(34.26819)));
            yy = 9.96542 + (((tickAnim - 10) / 4) * (5.91147-(9.96542)));
            zz = 3.75688 + (((tickAnim - 10) / 4) * (-0.62598-(3.75688)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 6.96643 + (((tickAnim - 14) / 6) * (53.38235-(6.96643)));
            yy = 5.91147 + (((tickAnim - 14) / 6) * (1.88472-(5.91147)));
            zz = -0.62598 + (((tickAnim - 14) / 6) * (8.03328-(-0.62598)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.34-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.555-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.34 + (((tickAnim - 3) / 2) * (1.21-(0.34)));
            zz = -0.555 + (((tickAnim - 3) / 2) * (-0.1-(-0.555)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.21 + (((tickAnim - 5) / 3) * (1.81-(1.21)));
            zz = -0.1 + (((tickAnim - 5) / 3) * (-0.19-(-0.1)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.81 + (((tickAnim - 8) / 1) * (1.4-(1.81)));
            zz = -0.19 + (((tickAnim - 8) / 1) * (-0.06-(-0.19)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.4 + (((tickAnim - 9) / 1) * (0-(1.4)));
            zz = -0.06 + (((tickAnim - 9) / 1) * (0-(-0.06)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.47-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.47 + (((tickAnim - 12) / 2) * (-0.775-(-0.47)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.775 + (((tickAnim - 14) / 6) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -14.97812 + (((tickAnim - 0) / 9) * (21.14681-(-14.97812)));
            yy = 1.10018 + (((tickAnim - 0) / 9) * (12.81854-(1.10018)));
            zz = 18.99437 + (((tickAnim - 0) / 9) * (-13.61717-(18.99437)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 21.14681 + (((tickAnim - 9) / 11) * (-14.97812-(21.14681)));
            yy = 12.81854 + (((tickAnim - 9) / 11) * (1.10018-(12.81854)));
            zz = -13.61717 + (((tickAnim - 9) / 11) * (18.99437-(-13.61717)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 10.40787 + (((tickAnim - 0) / 9) * (13.05809-(10.40787)));
            yy = -13.98522 + (((tickAnim - 0) / 9) * (25.77726-(-13.98522)));
            zz = -8.25739 + (((tickAnim - 0) / 9) * (8.13707-(-8.25739)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 13.05809 + (((tickAnim - 9) / 5) * (46.1206+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-80-(13.05809)));
            yy = 25.77726 + (((tickAnim - 9) / 5) * (-2.7712-(25.77726)));
            zz = 8.13707 + (((tickAnim - 9) / 5) * (4.37625-(8.13707)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 46.1206+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-80 + (((tickAnim - 14) / 6) * (10.40787-(46.1206+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-80)));
            yy = -2.7712 + (((tickAnim - 14) / 6) * (-13.98522-(-2.7712)));
            zz = 4.37625 + (((tickAnim - 14) / 6) * (-8.25739-(4.37625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -0.3 + (((tickAnim - 0) / 9) * (0-(-0.3)));
            yy = -0.65 + (((tickAnim - 0) / 9) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (-0.3-(0)));
            yy = -0.675 + (((tickAnim - 14) / 6) * (-0.65-(-0.675)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing2.rotationPointX = this.leftwing2.rotationPointX + (float)(xx);
        this.leftwing2.rotationPointY = this.leftwing2.rotationPointY - (float)(yy);
        this.leftwing2.rotationPointZ = this.leftwing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.72581 + (((tickAnim - 0) / 3) * (-34.98998-(4.72581)));
            yy = 4.57617 + (((tickAnim - 0) / 3) * (-2.2764-(4.57617)));
            zz = -11.90577 + (((tickAnim - 0) / 3) * (-4.4952-(-11.90577)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -34.98998 + (((tickAnim - 3) / 6) * (70-(-34.98998)));
            yy = -2.2764 + (((tickAnim - 3) / 6) * (0-(-2.2764)));
            zz = -4.4952 + (((tickAnim - 3) / 6) * (0-(-4.4952)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 70 + (((tickAnim - 9) / 5) * (71.36742-(70)));
            yy = 0 + (((tickAnim - 9) / 5) * (-2.37961-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (6.191-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 71.36742 + (((tickAnim - 14) / 6) * (4.72581-(71.36742)));
            yy = -2.37961 + (((tickAnim - 14) / 6) * (4.57617-(-2.37961)));
            zz = 6.191 + (((tickAnim - 14) / 6) * (-11.90577-(6.191)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 2.225 + (((tickAnim - 0) / 2) * (2.855-(2.225)));
            zz = 0.9 + (((tickAnim - 0) / 2) * (0.56-(0.9)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.855 + (((tickAnim - 2) / 1) * (1.3-(2.855)));
            zz = 0.56 + (((tickAnim - 2) / 1) * (0.225-(0.56)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 1.3 + (((tickAnim - 3) / 6) * (0.65-(1.3)));
            zz = 0.225 + (((tickAnim - 3) / 6) * (-0.675-(0.225)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0.65 + (((tickAnim - 9) / 5) * (2.75-(0.65)));
            zz = -0.675 + (((tickAnim - 9) / 5) * (-0.125-(-0.675)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 2.75 + (((tickAnim - 14) / 5) * (1.075-(2.75)));
            zz = -0.125 + (((tickAnim - 14) / 5) * (0.46-(-0.125)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 1.075 + (((tickAnim - 19) / 1) * (2.225-(1.075)));
            zz = 0.46 + (((tickAnim - 19) / 1) * (0.9-(0.46)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -14.97812 + (((tickAnim - 0) / 9) * (21.14681-(-14.97812)));
            yy = -1.10018 + (((tickAnim - 0) / 9) * (-12.81854-(-1.10018)));
            zz = -18.99437 + (((tickAnim - 0) / 9) * (13.61717-(-18.99437)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 21.14681 + (((tickAnim - 9) / 11) * (-14.97812-(21.14681)));
            yy = -12.81854 + (((tickAnim - 9) / 11) * (-1.10018-(-12.81854)));
            zz = 13.61717 + (((tickAnim - 9) / 11) * (-18.99437-(13.61717)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 40.25 + (((tickAnim - 0) / 9) * (14.41412-(40.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (2.7392-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-10.91439-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 14.41412 + (((tickAnim - 9) / 11) * (40.25-(14.41412)));
            yy = 2.7392 + (((tickAnim - 9) / 11) * (0-(2.7392)));
            zz = -10.91439 + (((tickAnim - 9) / 11) * (0-(-10.91439)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lwmembrane3, lwmembrane3.rotateAngleX + (float) Math.toRadians(xx), lwmembrane3.rotateAngleY + (float) Math.toRadians(yy), lwmembrane3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -0.525 + (((tickAnim - 0) / 9) * (0-(-0.525)));
            yy = -1.875 + (((tickAnim - 0) / 9) * (-3.4-(-1.875)));
            zz = -2.125 + (((tickAnim - 0) / 9) * (-1.65-(-2.125)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (-0.525-(0)));
            yy = -3.4 + (((tickAnim - 9) / 11) * (-1.875-(-3.4)));
            zz = -1.65 + (((tickAnim - 9) / 11) * (-2.125-(-1.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lwmembrane3.rotationPointX = this.lwmembrane3.rotationPointX + (float)(xx);
        this.lwmembrane3.rotationPointY = this.lwmembrane3.rotationPointY - (float)(yy);
        this.lwmembrane3.rotationPointZ = this.lwmembrane3.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 0) / 9) * (1-(1)));
            yy = 0.9 + (((tickAnim - 0) / 9) * (1-(0.9)));
            zz = 1 + (((tickAnim - 0) / 9) * (0.7-(1)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 9) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 9) / 11) * (0.9-(1)));
            zz = 0.7 + (((tickAnim - 9) / 11) * (1-(0.7)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lwmembrane3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 10.40787 + (((tickAnim - 0) / 9) * (13.05809-(10.40787)));
            yy = 13.98522 + (((tickAnim - 0) / 9) * (-25.77726-(13.98522)));
            zz = 8.25739 + (((tickAnim - 0) / 9) * (-8.13707-(8.25739)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 13.05809 + (((tickAnim - 9) / 5) * (54.5456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-80-(13.05809)));
            yy = -25.77726 + (((tickAnim - 9) / 5) * (-2.7712-(-25.77726)));
            zz = -8.13707 + (((tickAnim - 9) / 5) * (4.37625-(-8.13707)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 54.5456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-80 + (((tickAnim - 14) / 6) * (10.40787-(54.5456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-80)));
            yy = -2.7712 + (((tickAnim - 14) / 6) * (13.98522-(-2.7712)));
            zz = 4.37625 + (((tickAnim - 14) / 6) * (8.25739-(4.37625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -0.3 + (((tickAnim - 0) / 9) * (0-(-0.3)));
            yy = -0.65 + (((tickAnim - 0) / 9) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (-0.3-(0)));
            yy = -0.675 + (((tickAnim - 14) / 6) * (-0.65-(-0.675)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing2.rotationPointX = this.rightwing2.rotationPointX + (float)(xx);
        this.rightwing2.rotationPointY = this.rightwing2.rotationPointY - (float)(yy);
        this.rightwing2.rotationPointZ = this.rightwing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -8.75 + (((tickAnim - 0) / 14) * (11.6802+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-80-(-8.75)));
            yy = 0 + (((tickAnim - 0) / 14) * (-1.40684-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-7.02082-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 11.6802+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-80 + (((tickAnim - 14) / 6) * (-8.75-(11.6802+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-80)));
            yy = -1.40684 + (((tickAnim - 14) / 6) * (0-(-1.40684)));
            zz = -7.02082 + (((tickAnim - 14) / 6) * (0-(-7.02082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 1.975 + (((tickAnim - 0) / 14) * (0-(1.975)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (1.975-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing3.rotationPointX = this.rightwing3.rotationPointX + (float)(xx);
        this.rightwing3.rotationPointY = this.rightwing3.rotationPointY - (float)(yy);
        this.rightwing3.rotationPointZ = this.rightwing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.72581 + (((tickAnim - 0) / 3) * (-34.98998-(4.72581)));
            yy = -4.57617 + (((tickAnim - 0) / 3) * (2.2764-(-4.57617)));
            zz = 11.90577 + (((tickAnim - 0) / 3) * (4.4952-(11.90577)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -34.98998 + (((tickAnim - 3) / 6) * (70-(-34.98998)));
            yy = 2.2764 + (((tickAnim - 3) / 6) * (0-(2.2764)));
            zz = 4.4952 + (((tickAnim - 3) / 6) * (0-(4.4952)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 70 + (((tickAnim - 9) / 5) * (71.36742-(70)));
            yy = 0 + (((tickAnim - 9) / 5) * (-2.37961-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (6.191-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 71.36742 + (((tickAnim - 14) / 6) * (4.72581-(71.36742)));
            yy = -2.37961 + (((tickAnim - 14) / 6) * (-4.57617-(-2.37961)));
            zz = 6.191 + (((tickAnim - 14) / 6) * (11.90577-(6.191)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 2 + (((tickAnim - 0) / 2) * (2.855-(2)));
            zz = 0.9 + (((tickAnim - 0) / 2) * (0.56-(0.9)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.855 + (((tickAnim - 2) / 1) * (1.1-(2.855)));
            zz = 0.56 + (((tickAnim - 2) / 1) * (0.225-(0.56)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 1.1 + (((tickAnim - 3) / 6) * (0.65-(1.1)));
            zz = 0.225 + (((tickAnim - 3) / 6) * (-0.675-(0.225)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0.65 + (((tickAnim - 9) / 5) * (2.75-(0.65)));
            zz = -0.675 + (((tickAnim - 9) / 5) * (-0.125-(-0.675)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 2.75 + (((tickAnim - 14) / 5) * (1.075-(2.75)));
            zz = -0.125 + (((tickAnim - 14) / 5) * (0.46-(-0.125)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 1.075 + (((tickAnim - 19) / 1) * (2-(1.075)));
            zz = 0.46 + (((tickAnim - 19) / 1) * (0.9-(0.46)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 4.75 + (((tickAnim - 0) / 9) * (-11.49424-(4.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (4.29554-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (7.32319-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -11.49424 + (((tickAnim - 9) / 5) * (-10.68064-(-11.49424)));
            yy = 4.29554 + (((tickAnim - 9) / 5) * (2.99475-(4.29554)));
            zz = 7.32319 + (((tickAnim - 9) / 5) * (2.6529-(7.32319)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -10.68064 + (((tickAnim - 14) / 6) * (4.75-(-10.68064)));
            yy = 2.99475 + (((tickAnim - 14) / 6) * (0-(2.99475)));
            zz = 2.6529 + (((tickAnim - 14) / 6) * (0-(2.6529)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -9.75 + (((tickAnim - 0) / 9) * (-15.06676-(-9.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.12747-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (3.74843-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -15.06676 + (((tickAnim - 9) / 5) * (-3.75-(-15.06676)));
            yy = -0.12747 + (((tickAnim - 9) / 5) * (0-(-0.12747)));
            zz = 3.74843 + (((tickAnim - 9) / 5) * (0-(3.74843)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -3.75 + (((tickAnim - 14) / 6) * (-9.75-(-3.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.lwmembrane2.setScale((float)1,(float)0,(float)0);


        this.lw2membrane.setScale((float)1,(float)0,(float)0);


        this.lw3membrane.setScale((float)1,(float)0,(float)0);


        this.lw4membrane.setScale((float)1,(float)0,(float)0);


        this.lw5membrane.setScale((float)1,(float)0,(float)0);


        this.lwmembrane4.setScale((float)1,(float)0,(float)0);


        this.lw2membrane3.setScale((float)1,(float)0,(float)0);


        this.lw3membrane3.setScale((float)1,(float)0,(float)0);


        this.lw4membrane3.setScale((float)1,(float)1,(float)0.4);


        this.lw4membrane4.setScale((float)1,(float)1,(float)0);


        this.lw5membrane3.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 3.5 + (((tickAnim - 0) / 10) * (0-(3.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (3.5-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.475-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 1.475 + (((tickAnim - 7) / 3) * (-0.475-(1.475)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -0.475 + (((tickAnim - 10) / 4) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*12), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*1);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 3.5 + (((tickAnim - 0) / 10) * (0-(3.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (3.5-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.475-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 1.475 + (((tickAnim - 7) / 3) * (-0.475-(1.475)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -0.475 + (((tickAnim - 10) / 4) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-12), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 40.25 + (((tickAnim - 0) / 9) * (14.41412-(40.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (-2.7392-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (10.91439-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 14.41412 + (((tickAnim - 9) / 11) * (40.25-(14.41412)));
            yy = -2.7392 + (((tickAnim - 9) / 11) * (0-(-2.7392)));
            zz = 10.91439 + (((tickAnim - 9) / 11) * (0-(10.91439)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lwmembrane, lwmembrane.rotateAngleX + (float) Math.toRadians(xx), lwmembrane.rotateAngleY + (float) Math.toRadians(yy), lwmembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -0.525 + (((tickAnim - 0) / 9) * (0-(-0.525)));
            yy = -1.875 + (((tickAnim - 0) / 9) * (-3.4-(-1.875)));
            zz = -2.125 + (((tickAnim - 0) / 9) * (-1.65-(-2.125)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (-0.525-(0)));
            yy = -3.4 + (((tickAnim - 9) / 11) * (-1.875-(-3.4)));
            zz = -1.65 + (((tickAnim - 9) / 11) * (-2.125-(-1.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lwmembrane.rotationPointX = this.lwmembrane.rotationPointX + (float)(xx);
        this.lwmembrane.rotationPointY = this.lwmembrane.rotationPointY - (float)(yy);
        this.lwmembrane.rotationPointZ = this.lwmembrane.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 0) / 9) * (1-(1)));
            yy = 0.9 + (((tickAnim - 0) / 9) * (1-(0.9)));
            zz = 1 + (((tickAnim - 0) / 9) * (0.7-(1)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 9) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 9) / 11) * (0.9-(1)));
            zz = 0.7 + (((tickAnim - 9) / 11) * (1-(0.7)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lwmembrane.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -8.75 + (((tickAnim - 0) / 14) * (11.8052+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-80-(-8.75)));
            yy = 0 + (((tickAnim - 0) / 14) * (-1.40684-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-7.02082-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 11.8052+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-80 + (((tickAnim - 14) / 6) * (-8.75-(11.8052+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-80)));
            yy = -1.40684 + (((tickAnim - 14) / 6) * (0-(-1.40684)));
            zz = -7.02082 + (((tickAnim - 14) / 6) * (0-(-7.02082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 1.975 + (((tickAnim - 0) / 14) * (0-(1.975)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (1.975-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing3.rotationPointX = this.leftwing3.rotationPointX + (float)(xx);
        this.leftwing3.rotationPointY = this.leftwing3.rotationPointY - (float)(yy);
        this.leftwing3.rotationPointZ = this.leftwing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 4.75 + (((tickAnim - 0) / 9) * (-11.68623-(4.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1.92805-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-3.78821-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -11.68623 + (((tickAnim - 9) / 5) * (-10.68064-(-11.68623)));
            yy = -1.92805 + (((tickAnim - 9) / 5) * (2.99475-(-1.92805)));
            zz = -3.78821 + (((tickAnim - 9) / 5) * (2.6529-(-3.78821)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -10.68064 + (((tickAnim - 14) / 6) * (4.75-(-10.68064)));
            yy = 2.99475 + (((tickAnim - 14) / 6) * (0-(2.99475)));
            zz = 2.6529 + (((tickAnim - 14) / 6) * (0-(2.6529)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -9.75 + (((tickAnim - 0) / 9) * (-15-(-9.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -15 + (((tickAnim - 9) / 5) * (-3.75-(-15)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -3.75 + (((tickAnim - 14) / 6) * (-9.75-(-3.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*12), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(11.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*12), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0.35);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-11.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-350))*12), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*9), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-230))*-9), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*-25), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraThalassodromeus e = (EntityPrehistoricFloraThalassodromeus) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length

        animator.rotate(body, ((0.2182F)-(-0.0698F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(body2, ((0.1309F)-(0.2793F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((0.6981F)-(0.6981F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((0.4843F)-(0.4843F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r12, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r13, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r14, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r15, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((0.7854F)-(0.7854F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((0.6501F)-(0.6501F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((1.309F)-(1.309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((1.1345F)-(1.1345F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((0.48F)-(0.48F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((0.5672F)-(0.5672F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((0.5672F)-(0.5672F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(eye, ((0.3054F)-(0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head, ((1.1563F)-(1.5272F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw, ((-0.0436F)-(-0.0044F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(lefthand, ((0.829F)-(0.0714F)), ((0.0F)-(-0.0588F)),((0.0F)-(0.0058F)));
        animator.rotate(leftleg, ((0.6489F)-(0.5518F)), ((0.2123F)-(-0.1819F)),((-1.6022F)-(-0.6138F)));
        animator.rotate(leftleg2, ((0.4787F)-(0.6564F)), ((-0.0409F)-(0.0819F)),((0.0671F)-(0.4023F)));
        animator.rotate(leftleg3, ((0.1745F)-(-0.0305F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftleg4, ((1.0472F)-(-0.3883F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing, ((-0.0859F)-(0.3691F)), ((0.0212F)-(0.0784F)),((-1.6741F)-(-0.8284F)));
        animator.rotate(leftwing2, ((-0.1944F)-(-0.1932F)), ((-0.1791F)-(0.0887F)),((-0.0258F)-(0.5709F)));
        animator.rotate(leftwing3, ((0.1309F)-(0.4797F)), ((0.0F)-(-0.0474F)),((0.0F)-(0.2391F)));
        animator.rotate(leftwing4, ((-2.8362F)-(-0.3883F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing5, ((0.2615F)-(0.2964F)), ((0.0167F)-(0.0167F)),((-0.0403F)-(-0.0403F)));
        animator.rotate(lw2membrane, ((0.0F)-(0.0F)), ((0.0393F)-(0.0393F)),((0.0F)-(0.0F)));
        animator.rotate(lw2membrane2, ((-0.3924F)-(-0.3924F)), ((0.0167F)-(0.0167F)),((0.0403F)-(0.0403F)));
        animator.rotate(lw2membrane3, ((0.0F)-(0.0F)), ((-0.0393F)-(-0.0393F)),((0.0F)-(0.0F)));
        animator.rotate(lw2membrane4, ((-0.3924F)-(-0.3924F)), ((-0.0167F)-(-0.0167F)),((-0.0403F)-(-0.0403F)));
        animator.rotate(lw3membrane2, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(lw3membrane4, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(lwmembrane, ((-0.1619F)-(-0.1479F)), ((-0.1189F)-(0.0726F)),((0.2107F)-(0.2878F)));
        animator.rotate(lwmembrane2, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.3491F)-(-0.3491F)));
        animator.rotate(lwmembrane3, ((-0.1619F)-(-0.1479F)), ((0.1189F)-(-0.0726F)),((-0.2107F)-(-0.2878F)));
        animator.rotate(lwmembrane4, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.3491F)-(0.3491F)));
        animator.rotate(main, ((-0.2618F)-(-0.6501F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck, ((-0.3185F)-(-0.2923F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.1309F)-(-0.1702F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck3, ((-0.4363F)-(-0.4363F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(propatagium, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(propatagium2, ((-0.3491F)-(-0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(propatagium3, ((-0.3491F)-(-0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(propatagium4, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(righthand, ((0.829F)-(0.0714F)), ((0.0F)-(0.0588F)),((0.0F)-(-0.0058F)));
        animator.rotate(rightleg, ((0.6489F)-(0.5518F)), ((-0.2123F)-(0.1819F)),((1.6022F)-(0.6138F)));
        animator.rotate(rightleg2, ((0.4787F)-(0.6564F)), ((0.0409F)-(-0.0819F)),((-0.0671F)-(-0.4023F)));
        animator.rotate(rightleg3, ((0.1745F)-(-0.0305F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightleg4, ((1.0472F)-(-0.3883F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing, ((-0.0859F)-(0.3691F)), ((-0.0212F)-(-0.0784F)),((1.6741F)-(0.8284F)));
        animator.rotate(rightwing2, ((-0.1944F)-(-0.1932F)), ((0.1791F)-(-0.0887F)),((0.0258F)-(-0.5709F)));
        animator.rotate(rightwing3, ((0.1309F)-(0.4797F)), ((0.0F)-(0.0474F)),((0.0F)-(-0.2391F)));
        animator.rotate(rightwing4, ((-2.8362F)-(-0.3883F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing5, ((0.2615F)-(0.2964F)), ((-0.0167F)-(-0.0167F)),((0.0403F)-(0.0403F)));
        animator.rotate(tail, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(throat, ((-0.3927F)-(-0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));


        

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length

        animator.rotate(body, -((0.2182F)-(-0.0698F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(body2, -((0.1309F)-(0.2793F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((0.6981F)-(0.6981F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((0.4843F)-(0.4843F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r12, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r13, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r14, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r15, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((0.7854F)-(0.7854F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((0.6501F)-(0.6501F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((1.309F)-(1.309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((1.1345F)-(1.1345F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((0.48F)-(0.48F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((0.5672F)-(0.5672F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((0.5672F)-(0.5672F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(eye, -((0.3054F)-(0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head, -((1.1563F)-(1.5272F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw, -((-0.0436F)-(-0.0044F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(lefthand, -((0.829F)-(0.0714F)), -((0.0F)-(-0.0588F)),-((0.0F)-(0.0058F)));
        animator.rotate(leftleg, -((0.6489F)-(0.5518F)), -((0.2123F)-(-0.1819F)),-((-1.6022F)-(-0.6138F)));
        animator.rotate(leftleg2, -((0.4787F)-(0.6564F)), -((-0.0409F)-(0.0819F)),-((0.0671F)-(0.4023F)));
        animator.rotate(leftleg3, -((0.1745F)-(-0.0305F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftleg4, -((1.0472F)-(-0.3883F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing, -((-0.0859F)-(0.3691F)), -((0.0212F)-(0.0784F)),-((-1.6741F)-(-0.8284F)));
        animator.rotate(leftwing2, -((-0.1944F)-(-0.1932F)), -((-0.1791F)-(0.0887F)),-((-0.0258F)-(0.5709F)));
        animator.rotate(leftwing3, -((0.1309F)-(0.4797F)), -((0.0F)-(-0.0474F)),-((0.0F)-(0.2391F)));
        animator.rotate(leftwing4, -((-2.8362F)-(-0.3883F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing5, -((0.2615F)-(0.2964F)), -((0.0167F)-(0.0167F)),-((-0.0403F)-(-0.0403F)));
        animator.rotate(lw2membrane, -((0.0F)-(0.0F)), -((0.0393F)-(0.0393F)),-((0.0F)-(0.0F)));
        animator.rotate(lw2membrane2, -((-0.3924F)-(-0.3924F)), -((0.0167F)-(0.0167F)),-((0.0403F)-(0.0403F)));
        animator.rotate(lw2membrane3, -((0.0F)-(0.0F)), -((-0.0393F)-(-0.0393F)),-((0.0F)-(0.0F)));
        animator.rotate(lw2membrane4, -((-0.3924F)-(-0.3924F)), -((-0.0167F)-(-0.0167F)),-((-0.0403F)-(-0.0403F)));
        animator.rotate(lw3membrane2, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(lw3membrane4, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(lwmembrane, -((-0.1619F)-(-0.1479F)), -((-0.1189F)-(0.0726F)),-((0.2107F)-(0.2878F)));
        animator.rotate(lwmembrane2, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.3491F)-(-0.3491F)));
        animator.rotate(lwmembrane3, -((-0.1619F)-(-0.1479F)), -((0.1189F)-(-0.0726F)),-((-0.2107F)-(-0.2878F)));
        animator.rotate(lwmembrane4, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.3491F)-(0.3491F)));
        animator.rotate(main, -((-0.2618F)-(-0.6501F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck, -((-0.3185F)-(-0.2923F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.1309F)-(-0.1702F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck3, -((-0.4363F)-(-0.4363F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(propatagium, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(propatagium2, -((-0.3491F)-(-0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(propatagium3, -((-0.3491F)-(-0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(propatagium4, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(righthand, -((0.829F)-(0.0714F)), -((0.0F)-(0.0588F)),-((0.0F)-(-0.0058F)));
        animator.rotate(rightleg, -((0.6489F)-(0.5518F)), -((-0.2123F)-(0.1819F)),-((1.6022F)-(0.6138F)));
        animator.rotate(rightleg2, -((0.4787F)-(0.6564F)), -((0.0409F)-(-0.0819F)),-((-0.0671F)-(-0.4023F)));
        animator.rotate(rightleg3, -((0.1745F)-(-0.0305F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightleg4, -((1.0472F)-(-0.3883F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing, -((-0.0859F)-(0.3691F)), -((-0.0212F)-(-0.0784F)),-((1.6741F)-(0.8284F)));
        animator.rotate(rightwing2, -((-0.1944F)-(-0.1932F)), -((0.1791F)-(-0.0887F)),-((0.0258F)-(-0.5709F)));
        animator.rotate(rightwing3, -((0.1309F)-(0.4797F)), -((0.0F)-(0.0474F)),-((0.0F)-(-0.2391F)));
        animator.rotate(rightwing4, -((-2.8362F)-(-0.3883F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing5, -((0.2615F)-(0.2964F)), -((-0.0167F)-(-0.0167F)),-((0.0403F)-(0.0403F)));
        animator.rotate(tail, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(throat, -((-0.3927F)-(-0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));

        
        

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
