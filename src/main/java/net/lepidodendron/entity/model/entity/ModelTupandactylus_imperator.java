package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTupandactylus_imperator;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelTupandactylus_imperator extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer legmembrane;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer legmembrane2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer legmembrane3;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer legmembrane4;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer leftwing;
    private final AdvancedModelRenderer lwmembrane;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftwing2;
    private final AdvancedModelRenderer lw2membrane;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer lw2membrane2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftwing3;
    private final AdvancedModelRenderer lw3membrane;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer lw3membrane2;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer leftwing4;
    private final AdvancedModelRenderer lw4membrane;
    private final AdvancedModelRenderer lw4membrane2;
    private final AdvancedModelRenderer leftwing5;
    private final AdvancedModelRenderer lw5membrane;
    private final AdvancedModelRenderer lw5membrane2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightwing;
    private final AdvancedModelRenderer lwmembrane2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightwing2;
    private final AdvancedModelRenderer lw2membrane3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer lw2membrane4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightwing3;
    private final AdvancedModelRenderer lw3membrane3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer lw3membrane4;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer rightwing4;
    private final AdvancedModelRenderer lw4membrane3;
    private final AdvancedModelRenderer lw4membrane4;
    private final AdvancedModelRenderer rightwing5;
    private final AdvancedModelRenderer lw5membrane3;
    private final AdvancedModelRenderer lw5membrane4;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer tail;

    private ModelAnimator animator;

    public ModelTupandactylus_imperator() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 10.9835F, 4.875F);
        this.setRotateAngle(main, -0.7418F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 46, 68, -1.5F, -0.5F, -1.0F, 4, 5, 3, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(2.6232F, 2.057F, -0.7832F);
        this.main.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.4394F, 0.1739F, -0.0631F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 68, 29, -2.0F, -0.25F, -1.0F, 3, 7, 3, 0.0F, false));

        this.legmembrane = new AdvancedModelRenderer(this);
        this.legmembrane.setRotationPoint(0.0F, 3.75F, 2.0F);
        this.leftleg.addChild(legmembrane);
        this.legmembrane.cubeList.add(new ModelBox(legmembrane, 30, 75, -1.3F, -4.0F, -0.5F, 1, 7, 2, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 5.9983F, -0.3359F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 1.0023F, -0.0409F, 0.0671F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 17, 40, -1.5F, 0.0F, -0.5F, 2, 9, 2, 0.0F, false));

        this.legmembrane2 = new AdvancedModelRenderer(this);
        this.legmembrane2.setRotationPoint(0.0F, 1.0F, 1.5F);
        this.leftleg2.addChild(legmembrane2);
        this.legmembrane2.cubeList.add(new ModelBox(legmembrane2, 19, 6, -0.55F, -1.0F, 0.0F, 0, 9, 2, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(-0.07F, 8.4329F, 0.4646F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -2.2865F, -0.0637F, 0.1195F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 45, 26, -2.0F, 0.0F, -0.5F, 3, 5, 1, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.6232F, 2.057F, -0.7832F);
        this.main.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.4394F, -0.1739F, 0.0631F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 68, 29, -1.0F, -0.25F, -1.0F, 3, 7, 3, 0.0F, true));

        this.legmembrane3 = new AdvancedModelRenderer(this);
        this.legmembrane3.setRotationPoint(0.0F, 3.75F, 2.0F);
        this.rightleg.addChild(legmembrane3);
        this.legmembrane3.cubeList.add(new ModelBox(legmembrane3, 30, 75, 0.3F, -4.0F, -0.5F, 1, 7, 2, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 5.9983F, -0.3359F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 1.0023F, 0.0409F, -0.0671F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 17, 40, -0.5F, 0.0F, -0.5F, 2, 9, 2, 0.0F, true));

        this.legmembrane4 = new AdvancedModelRenderer(this);
        this.legmembrane4.setRotationPoint(0.0F, 1.0F, 1.5F);
        this.rightleg2.addChild(legmembrane4);
        this.legmembrane4.cubeList.add(new ModelBox(legmembrane4, 19, 6, 0.55F, -1.0F, 0.0F, 0, 9, 2, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.07F, 8.4329F, 0.4646F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -2.2865F, 0.0637F, -0.1195F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 45, 26, -1.0F, 0.0F, -0.5F, 3, 5, 1, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, -0.75F, -0.25F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.2182F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 25, 0, -2.5F, 0.0F, -7.0F, 5, 6, 7, 0.0F, false));

        this.leftwing = new AdvancedModelRenderer(this);
        this.leftwing.setRotationPoint(2.0285F, 1.2531F, -6.1281F);
        this.body.addChild(leftwing);
        this.setRotateAngle(leftwing, 0.0756F, -0.0436F, -0.8743F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 75, 17, -2.2064F, -0.0019F, -0.5F, 3, 5, 3, 0.001F, false));

        this.lwmembrane = new AdvancedModelRenderer(this);
        this.lwmembrane.setRotationPoint(0.2436F, -0.7769F, 2.6F);
        this.leftwing.addChild(lwmembrane);
        this.setRotateAngle(lwmembrane, -0.145F, 0.0351F, 0.0636F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.4F, 1.0F, -3.0F);
        this.lwmembrane.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0086F, -0.1266F, -0.0763F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 60, 38, -1.45F, -0.95F, 2.5F, 1, 6, 5, 0.001F, false));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(0.0436F, 3.9981F, 0.0F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, 0.1507F, 0.0872F, 0.7399F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 19, 73, -1.5F, -0.5F, -0.5F, 2, 8, 3, 0.0F, false));

        this.lw2membrane = new AdvancedModelRenderer(this);
        this.lw2membrane.setRotationPoint(-0.5F, 4.5F, 2.5F);
        this.leftwing2.addChild(lw2membrane);
        this.setRotateAngle(lw2membrane, 0.0F, -0.1571F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.5F, -3.0F, -0.3F);
        this.lw2membrane.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0349F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 41, -2.0F, -3.0F, 0.0F, 1, 10, 6, 0.0F, false));

        this.lw2membrane2 = new AdvancedModelRenderer(this);
        this.lw2membrane2.setRotationPoint(0.2502F, 3.1284F, 0.7647F);
        this.lw2membrane.addChild(lw2membrane2);
        this.setRotateAngle(lw2membrane2, -0.4796F, 0.0167F, 0.0403F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.9F, -1.3F, 3.3F);
        this.lw2membrane2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -3.0F, -12.0F, -3.45F, 1, 12, 8, -0.002F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 32, -3.9F, -12.0F, -3.45F, 1, 12, 8, -0.002F, false));

        this.leftwing3 = new AdvancedModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.2F, 7.062F, -0.4445F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.3459F, -0.0484F, 0.0796F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 0, 71, -0.5F, 0.0F, 0.0F, 1, 7, 2, 0.0F, false));

        this.lw3membrane = new AdvancedModelRenderer(this);
        this.lw3membrane.setRotationPoint(0.5F, 5.5F, 2.0F);
        this.leftwing3.addChild(lw3membrane);
        this.setRotateAngle(lw3membrane, 0.0F, -0.1789F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -4.5F, -1.0F);
        this.lw3membrane.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0349F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 58, -1.5089F, -0.9959F, 1.002F, 1, 7, 5, 0.0F, false));

        this.lw3membrane2 = new AdvancedModelRenderer(this);
        this.lw3membrane2.setRotationPoint(-1.25F, 1.0092F, 1.9649F);
        this.lw3membrane.addChild(lw3membrane2);
        this.setRotateAngle(lw3membrane2, -0.0873F, 0.0F, 0.0F);
        this.lw3membrane2.cubeList.add(new ModelBox(lw3membrane2, 48, 55, -0.0089F, -6.7459F, 0.252F, 1, 7, 5, -0.001F, false));
        this.lw3membrane2.cubeList.add(new ModelBox(lw3membrane2, 35, 53, 0.8911F, -6.7459F, 0.252F, 1, 7, 5, -0.001F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(-0.0954F, 6.475F, 0.194F);
        this.leftwing3.addChild(lefthand);
        this.setRotateAngle(lefthand, 3.1416F, 0.4363F, 0.0F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 38, 16, -0.5F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

        this.leftwing4 = new AdvancedModelRenderer(this);
        this.leftwing4.setRotationPoint(0.0321F, 6.6137F, 0.9376F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, -0.4775F, 0.0462F, 0.1645F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 30, 40, -0.5F, -10.0F, -1.0F, 1, 10, 2, 0.001F, false));

        this.lw4membrane = new AdvancedModelRenderer(this);
        this.lw4membrane.setRotationPoint(-0.025F, -7.0F, 0.75F);
        this.leftwing4.addChild(lw4membrane);
        this.setRotateAngle(lw4membrane, 0.0F, 0.0873F, 0.0F);
        this.lw4membrane.cubeList.add(new ModelBox(lw4membrane, 13, 55, -0.5F, -3.0F, -5.25F, 1, 10, 4, 0.0F, false));

        this.lw4membrane2 = new AdvancedModelRenderer(this);
        this.lw4membrane2.setRotationPoint(-0.249F, 0.0F, -4.2282F);
        this.lw4membrane.addChild(lw4membrane2);
        this.setRotateAngle(lw4membrane2, 0.0F, 0.0873F, 0.0F);
        this.lw4membrane2.cubeList.add(new ModelBox(lw4membrane2, 10, 70, -0.5F, -3.0F, -4.0F, 1, 10, 3, -0.001F, false));
        this.lw4membrane2.cubeList.add(new ModelBox(lw4membrane2, 68, 64, 0.4F, -3.0F, -4.0F, 1, 10, 3, -0.001F, false));

        this.leftwing5 = new AdvancedModelRenderer(this);
        this.leftwing5.setRotationPoint(0.0F, -10.0F, 1.0F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.3482F, 0.0111F, -0.0474F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 61, 55, -0.5F, -15.0F, -2.0F, 1, 15, 2, 0.0F, false));

        this.lw5membrane = new AdvancedModelRenderer(this);
        this.lw5membrane.setRotationPoint(0.0F, -8.5F, -1.0F);
        this.leftwing5.addChild(lw5membrane);
        this.lw5membrane.cubeList.add(new ModelBox(lw5membrane, 24, 55, -0.5F, -6.5F, -3.0F, 1, 15, 2, 0.0F, false));

        this.lw5membrane2 = new AdvancedModelRenderer(this);
        this.lw5membrane2.setRotationPoint(-0.1743F, 0.0F, -2.9924F);
        this.lw5membrane.addChild(lw5membrane2);
        this.setRotateAngle(lw5membrane2, 0.0F, 0.0873F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.4F, -1.5F, 0.975F);
        this.lw5membrane2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1134F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 68, 50, -1.1F, 0.0F, -4.0F, 1, 10, 3, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 72, 0, -2.0F, 0.0F, -4.0F, 1, 10, 3, 0.0F, false));

        this.rightwing = new AdvancedModelRenderer(this);
        this.rightwing.setRotationPoint(-2.0285F, 1.2531F, -6.1281F);
        this.body.addChild(rightwing);
        this.setRotateAngle(rightwing, 0.0756F, 0.0436F, 0.8743F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 75, 17, -0.7936F, -0.0019F, -0.5F, 3, 5, 3, 0.001F, true));

        this.lwmembrane2 = new AdvancedModelRenderer(this);
        this.lwmembrane2.setRotationPoint(-0.2436F, -0.7769F, 2.6F);
        this.rightwing.addChild(lwmembrane2);
        this.setRotateAngle(lwmembrane2, -0.145F, -0.0351F, -0.0636F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.4F, 1.0F, -3.0F);
        this.lwmembrane2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0086F, 0.1266F, 0.0763F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 60, 38, 0.45F, -0.95F, 2.5F, 1, 6, 5, 0.001F, true));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(-0.0436F, 3.9981F, 0.0F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, 0.1507F, -0.0872F, -0.7399F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 19, 73, -0.5F, -0.5F, -0.5F, 2, 8, 3, 0.0F, true));

        this.lw2membrane3 = new AdvancedModelRenderer(this);
        this.lw2membrane3.setRotationPoint(0.5F, 4.5F, 2.5F);
        this.rightwing2.addChild(lw2membrane3);
        this.setRotateAngle(lw2membrane3, 0.0F, 0.1571F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, -3.0F, -0.3F);
        this.lw2membrane3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.0349F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 1, 41, 1.0F, -3.0F, 0.0F, 1, 10, 6, 0.0F, true));

        this.lw2membrane4 = new AdvancedModelRenderer(this);
        this.lw2membrane4.setRotationPoint(-0.2502F, 3.1284F, 0.7647F);
        this.lw2membrane3.addChild(lw2membrane4);
        this.setRotateAngle(lw2membrane4, -0.4796F, -0.0167F, -0.0403F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.9F, -1.3F, 3.3F);
        this.lw2membrane4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 2.0F, -12.0F, -3.45F, 1, 12, 8, -0.002F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 32, 2.9F, -12.0F, -3.45F, 1, 12, 8, -0.002F, true));

        this.rightwing3 = new AdvancedModelRenderer(this);
        this.rightwing3.setRotationPoint(0.2F, 7.062F, -0.4445F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.3459F, 0.0484F, -0.0796F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 0, 71, -0.5F, 0.0F, 0.0F, 1, 7, 2, 0.0F, true));

        this.lw3membrane3 = new AdvancedModelRenderer(this);
        this.lw3membrane3.setRotationPoint(-0.5F, 5.5F, 2.0F);
        this.rightwing3.addChild(lw3membrane3);
        this.setRotateAngle(lw3membrane3, 0.0F, 0.1789F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -4.5F, -1.0F);
        this.lw3membrane3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.0349F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 58, 0.5089F, -0.9959F, 1.002F, 1, 7, 5, 0.0F, true));

        this.lw3membrane4 = new AdvancedModelRenderer(this);
        this.lw3membrane4.setRotationPoint(1.25F, 1.0092F, 1.9649F);
        this.lw3membrane3.addChild(lw3membrane4);
        this.setRotateAngle(lw3membrane4, -0.0873F, 0.0F, 0.0F);
        this.lw3membrane4.cubeList.add(new ModelBox(lw3membrane4, 48, 55, -0.9911F, -6.7459F, 0.252F, 1, 7, 5, -0.001F, true));
        this.lw3membrane4.cubeList.add(new ModelBox(lw3membrane4, 35, 53, -1.8911F, -6.7459F, 0.252F, 1, 7, 5, -0.001F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(0.0954F, 6.475F, 0.194F);
        this.rightwing3.addChild(righthand);
        this.setRotateAngle(righthand, 3.1416F, -0.4363F, 0.0F);
        this.righthand.cubeList.add(new ModelBox(righthand, 38, 16, -1.5F, -0.5F, -3.0F, 2, 1, 3, 0.0F, true));

        this.rightwing4 = new AdvancedModelRenderer(this);
        this.rightwing4.setRotationPoint(-0.0321F, 6.6137F, 0.9376F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, -0.4775F, -0.0462F, -0.1645F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 30, 40, -0.5F, -10.0F, -1.0F, 1, 10, 2, 0.001F, true));

        this.lw4membrane3 = new AdvancedModelRenderer(this);
        this.lw4membrane3.setRotationPoint(0.025F, -7.0F, 0.75F);
        this.rightwing4.addChild(lw4membrane3);
        this.setRotateAngle(lw4membrane3, 0.0F, -0.0873F, 0.0F);
        this.lw4membrane3.cubeList.add(new ModelBox(lw4membrane3, 13, 55, -0.5F, -3.0F, -5.25F, 1, 10, 4, 0.0F, true));

        this.lw4membrane4 = new AdvancedModelRenderer(this);
        this.lw4membrane4.setRotationPoint(0.249F, 0.0F, -4.2282F);
        this.lw4membrane3.addChild(lw4membrane4);
        this.setRotateAngle(lw4membrane4, 0.0F, -0.0873F, 0.0F);
        this.lw4membrane4.cubeList.add(new ModelBox(lw4membrane4, 10, 70, -0.5F, -3.0F, -4.0F, 1, 10, 3, -0.001F, true));
        this.lw4membrane4.cubeList.add(new ModelBox(lw4membrane4, 68, 64, -1.4F, -3.0F, -4.0F, 1, 10, 3, -0.001F, true));

        this.rightwing5 = new AdvancedModelRenderer(this);
        this.rightwing5.setRotationPoint(0.0F, -10.0F, 1.0F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.3482F, -0.0111F, 0.0474F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 61, 55, -0.5F, -15.0F, -2.0F, 1, 15, 2, 0.0F, true));

        this.lw5membrane3 = new AdvancedModelRenderer(this);
        this.lw5membrane3.setRotationPoint(0.0F, -8.5F, -1.0F);
        this.rightwing5.addChild(lw5membrane3);
        this.lw5membrane3.cubeList.add(new ModelBox(lw5membrane3, 24, 55, -0.5F, -6.5F, -3.0F, 1, 15, 2, 0.0F, true));

        this.lw5membrane4 = new AdvancedModelRenderer(this);
        this.lw5membrane4.setRotationPoint(0.1743F, 0.0F, -2.9924F);
        this.lw5membrane3.addChild(lw5membrane4);
        this.setRotateAngle(lw5membrane4, 0.0F, -0.0873F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.4F, -1.5F, 0.975F);
        this.lw5membrane4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.1134F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 68, 50, 0.1F, 0.0F, -4.0F, 1, 10, 3, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 72, 0, 1.0F, 0.0F, -4.0F, 1, 10, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.2174F, -6.2521F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.2182F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 31, 66, -2.0F, 0.0F, -3.0F, 4, 5, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 2.0273F, -1.5941F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.48F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 47, 16, -1.5F, -1.25F, -7.0F, 3, 2, 7, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.5F, -0.825F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 53, 0, -1.0F, -1.0F, -6.25F, 2, 3, 7, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3467F, -5.7294F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 1.1345F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 48, 26, -1.0F, -4.0F, -9.225F, 2, 4, 7, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -3.4863F, 0.5572F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0218F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.5F, -16.7F, -10.175F, 0, 17, 22, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.4863F, 0.5572F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 4, -0.5F, -0.7F, -0.2F, 1, 1, 10, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -3.9674F, -2.2279F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 0, -2.25F, 1.225F, 1.25F, 1, 1, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 0, 0.25F, 1.225F, 1.25F, 1, 1, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 73, 40, -2.0F, -0.025F, 0.0F, 3, 4, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -10.9523F, -7.8598F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.9556F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 43, -0.5F, -0.1F, 0.0F, 1, 1, 10, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 43, -0.5F, 0.1F, 0.0F, 1, 1, 10, 0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -6.3526F, -5.9431F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.8762F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 77, -0.5F, -3.0F, -3.0F, 1, 3, 3, -0.002F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -8.3794F, -8.155F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 2.3998F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 37, 75, 0.5F, -3.0F, -3.0F, 1, 3, 3, -0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.001F, -4.7453F, -11.0662F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.1083F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 61, 11, -0.5F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.001F, -4.5688F, -11.0805F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.0908F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 61, 11, -0.5F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0864F, -12.3861F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 56, 73, -0.5F, 0.0F, 0.0F, 1, 1, 5, 0.002F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, -2.7336F, -10.486F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3927F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 77, 48, 0.5F, -3.65F, -0.425F, 1, 5, 2, -0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, -9.225F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3491F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 55, 38, -0.5F, -2.0F, -2.0F, 1, 1, 3, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 72, 73, -0.5F, -1.0F, -4.0F, 1, 1, 5, 0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, -2.725F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 47, 45, -1.0F, 0.0F, -6.5F, 2, 1, 8, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 25, 14, -1.0F, -2.0F, -2.5F, 2, 3, 4, -0.005F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 2.3194F, -4.9685F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.9163F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 34, 14, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.002F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 2.6667F, -6.9382F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1745F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, 0.0F, -2.0F, 0.0F, 1, 2, 2, -0.001F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 1.2525F, -8.3524F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.7854F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 17, 18, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.002F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 0.0F, -6.5F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3491F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 12, 0, -1.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(-0.5F, 0.75F, -2.75F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.48F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 62, 20, 0.0F, -1.775F, 0.1F, 1, 2, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, 0.0682F, 1.7833F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 25, 0, 0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));



        this.lwmembrane.scaleChildren = true;
        this.lwmembrane2.scaleChildren = true;
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
            this.faceTarget(f3, f4, 8, head);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTupandactylus_imperator ee = (EntityPrehistoricFloraTupandactylus_imperator) entitylivingbaseIn;

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



            //And now the pose:

            this.setRotateAngle(body, 0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.0086F, 0.1266F, 0.0763F);
            this.setRotateAngle(cube_r10, 0.0F, 0.1134F, 0.0F);
            this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, 0.0218F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r14, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, 0.9556F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, 1.8762F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r17, 2.3998F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r18, 1.1083F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r19, 1.0908F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, 0.0F, -0.0349F, 0.0F);
            this.setRotateAngle(cube_r20, 1.309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r21, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r22, 0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r23, 0.9163F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r24, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r25, -0.7854F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r26, 0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, 0.0F, -0.0349F, 0.0F);
            this.setRotateAngle(cube_r5, 0.0F, -0.1134F, 0.0F);
            this.setRotateAngle(cube_r6, -0.0086F, -0.1266F, -0.0763F);
            this.setRotateAngle(cube_r7, 0.0F, 0.0349F, 0.0F);
            this.setRotateAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, 0.0F, 0.0349F, 0.0F);
            this.setRotateAngle(head, 0.6109F, 0.0F, 0.0F);
            this.setRotateAngle(lefthand, -0.1659F, -1.0836F, 1.758F);
            this.setRotateAngle(leftleg, 0.8068F, 0.3073F, -1.6308F);
            this.setRotateAngle(leftleg2, 0.6532F, -0.0409F, 0.0671F);
            this.setRotateAngle(leftleg3, -0.6527F, -0.0531F, -0.0693F);
            this.setRotateAngle(leftwing, 0.0852F, 0.0189F, -1.6136F);
            this.setRotateAngle(leftwing2, -0.0865F, -0.0114F, -0.1304F);
            this.setRotateAngle(leftwing3, -0.0872F, -0.0038F, -0.0435F);
            this.setRotateAngle(leftwing4, -2.8362F, -0.0038F, 0.0435F);
            this.setRotateAngle(leftwing5, 0.1742F, 0.0167F, -0.0403F);
            this.setRotateAngle(lw2membrane, 0.0F, -0.1571F, 0.0F);
            this.setRotateAngle(lw2membrane2, -0.4796F, 0.0167F, 0.0403F);
            this.setRotateAngle(lw2membrane3, 0.0F, 0.1571F, 0.0F);
            this.setRotateAngle(lw2membrane4, -0.4796F, -0.0167F, -0.0403F);
            this.setRotateAngle(lw3membrane, 0.0F, -0.1789F, 0.0F);
            this.setRotateAngle(lw3membrane2, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(lw3membrane3, 0.0F, 0.1789F, 0.0F);
            this.setRotateAngle(lw3membrane4, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(lw4membrane, 0.0F, 0.0873F, 0.0F);
            this.setRotateAngle(lw4membrane2, 0.0F, 0.0873F, 0.0F);
            this.setRotateAngle(lw4membrane3, 0.0F, -0.0873F, 0.0F);
            this.setRotateAngle(lw4membrane4, 0.0F, -0.0873F, 0.0F);
            this.setRotateAngle(lw5membrane2, 0.0F, 0.0873F, 0.0F);
            this.setRotateAngle(lw5membrane4, 0.0F, -0.0873F, 0.0F);
            this.setRotateAngle(lwmembrane, -0.145F, 0.0351F, 0.0636F);
            this.setRotateAngle(lwmembrane2, -0.145F, -0.0351F, -0.0636F);
            this.setRotateAngle(main, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(neck, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(righthand, -0.1659F, 1.0836F, -1.758F);
            this.setRotateAngle(rightleg, 0.8068F, -0.3073F, 1.6308F);
            this.setRotateAngle(rightleg2, 0.6532F, 0.0409F, -0.0671F);
            this.setRotateAngle(rightleg3, -0.6527F, 0.0531F, 0.0693F);
            this.setRotateAngle(rightwing, 0.0852F, -0.0189F, 1.6136F);
            this.setRotateAngle(rightwing2, -0.0865F, 0.0114F, 0.1304F);
            this.setRotateAngle(rightwing3, -0.0872F, 0.0038F, 0.0435F);
            this.setRotateAngle(rightwing4, -2.8362F, 0.0038F, -0.0435F);
            this.setRotateAngle(rightwing5, 0.1742F, -0.0167F, 0.0403F);
            this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(throat, -0.48F, 0.0F, 0.0F);


            



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
                    animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }

            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTupandactylus_imperator entity = (EntityPrehistoricFloraTupandactylus_imperator) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 17 + (((tickAnim - 12) / 11) * (0-(17)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (30.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 30.5 + (((tickAnim - 5) / 7) * (0-(30.5)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTupandactylus_imperator entity = (EntityPrehistoricFloraTupandactylus_imperator) entitylivingbaseIn;
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
            yy = 0 + (((tickAnim - 88) / 11) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 88) / 11) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 99) / 14) * (0-(0)));
            yy = -0.975 + (((tickAnim - 99) / 14) * (0-(-0.975)));
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
            xx = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+90))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 69) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+90))*5 + (((tickAnim - 60) / 9) * (-5.895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+90))*5)));
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
            xx = 0 + (((tickAnim - 88) / 11) * (37.5-(0)));
            yy = 0 + (((tickAnim - 88) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 11) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 106) {
            xx = 37.5 + (((tickAnim - 99) / 7) * (0-(37.5)));
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
    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTupandactylus_imperator entity = (EntityPrehistoricFloraTupandactylus_imperator) entitylivingbaseIn;
        int animCycle = 165;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*10 + (((tickAnim - 0) / 60) * (-36-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*10)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -36 + (((tickAnim - 60) / 40) * (-36-(-36)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = -36 + (((tickAnim - 100) / 35) * (-36-(-36)));
            yy = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 35) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -36 + (((tickAnim - 135) / 30) * (0-(-36)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (3.375-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 3.375 + (((tickAnim - 60) / 40) * (3.375-(3.375)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            zz = 3.375 + (((tickAnim - 100) / 35) * (3.375-(3.375)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 3.375 + (((tickAnim - 135) / 30) * (0-(3.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-10 + (((tickAnim - 0) / 27) * (-17.1204+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-10)));
            yy = 0 + (((tickAnim - 0) / 27) * (-5.23822-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (-19.77704-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 60) {
            xx = -17.1204+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-10 + (((tickAnim - 27) / 33) * (18.27239-(-17.1204+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-10)));
            yy = -5.23822 + (((tickAnim - 27) / 33) * (-12.80003-(-5.23822)));
            zz = -19.77704 + (((tickAnim - 27) / 33) * (-38.18673-(-19.77704)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 18.27239 + (((tickAnim - 60) / 40) * (18.27239-(18.27239)));
            yy = -12.80003 + (((tickAnim - 60) / 40) * (-12.80003-(-12.80003)));
            zz = -38.18673 + (((tickAnim - 60) / 40) * (-38.18673-(-38.18673)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 18.27239 + (((tickAnim - 100) / 35) * (18.27239-(18.27239)));
            yy = -12.80003 + (((tickAnim - 100) / 35) * (-12.80003-(-12.80003)));
            zz = -38.18673 + (((tickAnim - 100) / 35) * (-38.18673-(-38.18673)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 18.27239 + (((tickAnim - 135) / 30) * (0-(18.27239)));
            yy = -12.80003 + (((tickAnim - 135) / 30) * (0-(-12.80003)));
            zz = -38.18673 + (((tickAnim - 135) / 30) * (0-(-38.18673)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (21.58-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 60) {
            xx = 21.58 + (((tickAnim - 27) / 33) * (-8.25-(21.58)));
            yy = 0 + (((tickAnim - 27) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 33) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -8.25 + (((tickAnim - 60) / 40) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = -8.25 + (((tickAnim - 100) / 35) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 35) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -8.25 + (((tickAnim - 135) / 30) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (80.54534-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (-0.49882-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (-0.99555-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 60) {
            xx = 80.54534 + (((tickAnim - 27) / 33) * (29.91451-(80.54534)));
            yy = -0.49882 + (((tickAnim - 27) / 33) * (-1.12234-(-0.49882)));
            zz = -0.99555 + (((tickAnim - 27) / 33) * (-2.23999-(-0.99555)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 29.91451 + (((tickAnim - 60) / 40) * (29.91451-(29.91451)));
            yy = -1.12234 + (((tickAnim - 60) / 40) * (-1.12234-(-1.12234)));
            zz = -2.23999 + (((tickAnim - 60) / 40) * (-2.23999-(-2.23999)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 29.91451 + (((tickAnim - 100) / 35) * (29.91451-(29.91451)));
            yy = -1.12234 + (((tickAnim - 100) / 35) * (-1.12234-(-1.12234)));
            zz = -2.23999 + (((tickAnim - 100) / 35) * (-2.23999-(-2.23999)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 29.91451 + (((tickAnim - 135) / 30) * (0-(29.91451)));
            yy = -1.12234 + (((tickAnim - 135) / 30) * (0-(-1.12234)));
            zz = -2.23999 + (((tickAnim - 135) / 30) * (0-(-2.23999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (3.22-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 27) / 33) * (0-(0)));
            yy = 3.22 + (((tickAnim - 27) / 33) * (-0.3-(3.22)));
            zz = 0 + (((tickAnim - 27) / 33) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            yy = -0.3 + (((tickAnim - 60) / 40) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            yy = -0.3 + (((tickAnim - 100) / 35) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 100) / 35) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            yy = -0.3 + (((tickAnim - 135) / 30) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 135) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-10 + (((tickAnim - 0) / 60) * (23.0824-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-10)));
            yy = 0 + (((tickAnim - 0) / 60) * (10.56235-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (40.18596-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 23.0824 + (((tickAnim - 60) / 40) * (23.0824-(23.0824)));
            yy = 10.56235 + (((tickAnim - 60) / 40) * (10.56235-(10.56235)));
            zz = 40.18596 + (((tickAnim - 60) / 40) * (40.18596-(40.18596)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 23.0824 + (((tickAnim - 100) / 35) * (23.0824-(23.0824)));
            yy = 10.56235 + (((tickAnim - 100) / 35) * (10.56235-(10.56235)));
            zz = 40.18596 + (((tickAnim - 100) / 35) * (40.18596-(40.18596)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 23.0824 + (((tickAnim - 135) / 30) * (0-(23.0824)));
            yy = 10.56235 + (((tickAnim - 135) / 30) * (0-(10.56235)));
            zz = 40.18596 + (((tickAnim - 135) / 30) * (0-(40.18596)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -8.25 + (((tickAnim - 60) / 40) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = -8.25 + (((tickAnim - 100) / 35) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 35) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -8.25 + (((tickAnim - 135) / 30) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (27.41451-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (1.12234-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (2.23999-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 27.41451 + (((tickAnim - 60) / 40) * (27.41451-(27.41451)));
            yy = 1.12234 + (((tickAnim - 60) / 40) * (1.12234-(1.12234)));
            zz = 2.23999 + (((tickAnim - 60) / 40) * (2.23999-(2.23999)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 27.41451 + (((tickAnim - 100) / 35) * (27.41451-(27.41451)));
            yy = 1.12234 + (((tickAnim - 100) / 35) * (1.12234-(1.12234)));
            zz = 2.23999 + (((tickAnim - 100) / 35) * (2.23999-(2.23999)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 27.41451 + (((tickAnim - 135) / 30) * (0-(27.41451)));
            yy = 1.12234 + (((tickAnim - 135) / 30) * (0-(1.12234)));
            zz = 2.23999 + (((tickAnim - 135) / 30) * (0-(2.23999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            yy = -0.3 + (((tickAnim - 60) / 40) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            yy = -0.3 + (((tickAnim - 100) / 35) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 100) / 35) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            yy = -0.3 + (((tickAnim - 135) / 30) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 135) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 60) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 75) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1 + (((tickAnim - 60) / 75) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1 + (((tickAnim - 135) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 135) {
            xx = -13.25 + (((tickAnim - 60) / 75) * (-22.5-(-13.25)));
            yy = 0 + (((tickAnim - 60) / 75) * (0-(0)));
            zz = -38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1 + (((tickAnim - 60) / 75) * (-38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.1-(-38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -22.5 + (((tickAnim - 135) / 30) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = -38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.1 + (((tickAnim - 135) / 30) * (0-(-38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-8.4356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.67282-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-15.32162-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = -8.4356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 25) / 35) * (-25.88553-(-8.4356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            yy = -0.67282 + (((tickAnim - 25) / 35) * (-1.61477-(-0.67282)));
            zz = -15.32162 + (((tickAnim - 25) / 35) * (-36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5-(-15.32162)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -25.88553 + (((tickAnim - 60) / 40) * (-25.88553-(-25.88553)));
            yy = -1.61477 + (((tickAnim - 60) / 40) * (-1.61477-(-1.61477)));
            zz = -36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5 + (((tickAnim - 60) / 40) * (-36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5-(-36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = -25.88553 + (((tickAnim - 100) / 35) * (-25.88553-(-25.88553)));
            yy = -1.61477 + (((tickAnim - 100) / 35) * (-1.61477-(-1.61477)));
            zz = -36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5 + (((tickAnim - 100) / 35) * (-36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5-(-36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -25.88553 + (((tickAnim - 135) / 30) * (0-(-25.88553)));
            yy = -1.61477 + (((tickAnim - 135) / 30) * (0-(-1.61477)));
            zz = -36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5 + (((tickAnim - 135) / 30) * (0-(-36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 4.5 + (((tickAnim - 60) / 40) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 4.5 + (((tickAnim - 100) / 35) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 35) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 4.5 + (((tickAnim - 135) / 30) * (0-(4.5)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lw2membrane, lw2membrane.rotateAngleX + (float) Math.toRadians(xx), lw2membrane.rotateAngleY + (float) Math.toRadians(yy), lw2membrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-0.6-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            yy = 1.1 + (((tickAnim - 60) / 40) * (1.1-(1.1)));
            zz = -0.6 + (((tickAnim - 60) / 40) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            yy = 1.1 + (((tickAnim - 100) / 35) * (1.1-(1.1)));
            zz = -0.6 + (((tickAnim - 100) / 35) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            yy = 1.1 + (((tickAnim - 135) / 30) * (0-(1.1)));
            zz = -0.6 + (((tickAnim - 135) / 30) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lw2membrane.rotationPointX = this.lw2membrane.rotationPointX + (float)(xx);
        this.lw2membrane.rotationPointY = this.lw2membrane.rotationPointY - (float)(yy);
        this.lw2membrane.rotationPointZ = this.lw2membrane.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (33.60245-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-0.94218-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-11.48786-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 33.60245 + (((tickAnim - 33) / 27) * (42.14874-(33.60245)));
            yy = -0.94218 + (((tickAnim - 33) / 27) * (-2.72266-(-0.94218)));
            zz = -11.48786 + (((tickAnim - 33) / 27) * (-12.02999-(-11.48786)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 42.14874 + (((tickAnim - 60) / 40) * (42.14874-(42.14874)));
            yy = -2.72266 + (((tickAnim - 60) / 40) * (-2.72266-(-2.72266)));
            zz = -12.02999 + (((tickAnim - 60) / 40) * (-12.02999-(-12.02999)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 42.14874 + (((tickAnim - 100) / 35) * (42.14874-(42.14874)));
            yy = -2.72266 + (((tickAnim - 100) / 35) * (-2.72266-(-2.72266)));
            zz = -12.02999 + (((tickAnim - 100) / 35) * (-12.02999-(-12.02999)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 42.14874 + (((tickAnim - 135) / 30) * (0-(42.14874)));
            yy = -2.72266 + (((tickAnim - 135) / 30) * (0-(-2.72266)));
            zz = -12.02999 + (((tickAnim - 135) / 30) * (0-(-12.02999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lw2membrane2, lw2membrane2.rotateAngleX + (float) Math.toRadians(xx), lw2membrane2.rotateAngleY + (float) Math.toRadians(yy), lw2membrane2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.3-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 0.5 + (((tickAnim - 60) / 40) * (0.5-(0.5)));
            yy = -1.15 + (((tickAnim - 60) / 40) * (-1.15-(-1.15)));
            zz = 0.3 + (((tickAnim - 60) / 40) * (0.3-(0.3)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 0.5 + (((tickAnim - 100) / 35) * (0.5-(0.5)));
            yy = -1.15 + (((tickAnim - 100) / 35) * (-1.15-(-1.15)));
            zz = 0.3 + (((tickAnim - 100) / 35) * (0.3-(0.3)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 0.5 + (((tickAnim - 135) / 30) * (0-(0.5)));
            yy = -1.15 + (((tickAnim - 135) / 30) * (0-(-1.15)));
            zz = 0.3 + (((tickAnim - 135) / 30) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lw2membrane2.rotationPointX = this.lw2membrane2.rotationPointX + (float)(xx);
        this.lw2membrane2.rotationPointY = this.lw2membrane2.rotationPointY - (float)(yy);
        this.lw2membrane2.rotationPointZ = this.lw2membrane2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*1-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -20 + (((tickAnim - 60) / 40) * (-20-(-20)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*1 + (((tickAnim - 60) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*1)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = -20 + (((tickAnim - 100) / 35) * (-20-(-20)));
            yy = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*1 + (((tickAnim - 100) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*1)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -20 + (((tickAnim - 135) / 30) * (0-(-20)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*1 + (((tickAnim - 135) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 4.75 + (((tickAnim - 60) / 40) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 4.75 + (((tickAnim - 100) / 35) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 35) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 4.75 + (((tickAnim - 135) / 30) * (0-(4.75)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lw3membrane2, lw3membrane2.rotateAngleX + (float) Math.toRadians(xx), lw3membrane2.rotateAngleY + (float) Math.toRadians(yy), lw3membrane2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.25-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            yy = 0.125 + (((tickAnim - 60) / 40) * (0.125-(0.125)));
            zz = 0.25 + (((tickAnim - 60) / 40) * (0.25-(0.25)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            yy = 0.125 + (((tickAnim - 100) / 35) * (0.125-(0.125)));
            zz = 0.25 + (((tickAnim - 100) / 35) * (0.25-(0.25)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            yy = 0.125 + (((tickAnim - 135) / 30) * (0-(0.125)));
            zz = 0.25 + (((tickAnim - 135) / 30) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lw3membrane2.rotationPointX = this.lw3membrane2.rotationPointX + (float)(xx);
        this.lw3membrane2.rotationPointY = this.lw3membrane2.rotationPointY - (float)(yy);
        this.lw3membrane2.rotationPointZ = this.lw3membrane2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-480-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (52-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-390.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -480 + (((tickAnim - 60) / 40) * (-480-(-480)));
            yy = 52 + (((tickAnim - 60) / 40) * (52-(52)));
            zz = -390.5 + (((tickAnim - 60) / 40) * (-390.5-(-390.5)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = -480 + (((tickAnim - 100) / 35) * (-480-(-480)));
            yy = 52 + (((tickAnim - 100) / 35) * (52-(52)));
            zz = -390.5 + (((tickAnim - 100) / 35) * (-390.5-(-390.5)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -480 + (((tickAnim - 135) / 30) * (0-(-480)));
            yy = 52 + (((tickAnim - 135) / 30) * (0-(52)));
            zz = -390.5 + (((tickAnim - 135) / 30) * (0-(-390.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-146.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -146.5 + (((tickAnim - 60) / 40) * (-146.5-(-146.5)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 60) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = -146.5 + (((tickAnim - 100) / 35) * (-146.5-(-146.5)));
            yy = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 100) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -146.5 + (((tickAnim - 135) / 30) * (0-(-146.5)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 135) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 29 + (((tickAnim - 24) / 9) * (42.69-(29)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 42.69 + (((tickAnim - 33) / 8) * (41.25-(42.69)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 61) {
            xx = 41.25 + (((tickAnim - 41) / 20) * (0-(41.25)));
            yy = 0 + (((tickAnim - 41) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*3-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 61) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 40) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*3 + (((tickAnim - 61) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*3)));
        }
        else if (tickAnim >= 101 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 101) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 101) / 35) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*3 + (((tickAnim - 101) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*3)));
        }
        else if (tickAnim >= 136 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 136) / 7) * (49.65-(0)));
            yy = 0 + (((tickAnim - 136) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*3 + (((tickAnim - 136) / 7) * (1.01422-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*3)));
        }
        else if (tickAnim >= 143 && tickAnim < 148) {
            xx = 49.65 + (((tickAnim - 143) / 5) * (52.75-(49.65)));
            yy = 0 + (((tickAnim - 143) / 5) * (0-(0)));
            zz = 1.01422 + (((tickAnim - 143) / 5) * (1.57408-(1.01422)));
        }
        else if (tickAnim >= 148 && tickAnim < 165) {
            xx = 52.75 + (((tickAnim - 148) / 17) * (0-(52.75)));
            yy = 0 + (((tickAnim - 148) / 17) * (0-(0)));
            zz = 1.57408 + (((tickAnim - 148) / 17) * (0-(1.57408)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.1-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 135) {
            xx = -13.25 + (((tickAnim - 60) / 75) * (-22.5-(-13.25)));
            yy = 0 + (((tickAnim - 60) / 75) * (0-(0)));
            zz = 38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.1 + (((tickAnim - 60) / 75) * (38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.1-(38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.1)));
        }
        else if (tickAnim >= 135 && tickAnim < 155) {
            xx = -22.5 + (((tickAnim - 135) / 20) * (3.77888-(-22.5)));
            yy = 0 + (((tickAnim - 135) / 20) * (-21.33082-(0)));
            zz = 38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.1 + (((tickAnim - 135) / 20) * (-11.33305-(38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.1)));
        }
        else if (tickAnim >= 155 && tickAnim < 165) {
            xx = 3.77888 + (((tickAnim - 155) / 10) * (0-(3.77888)));
            yy = -21.33082 + (((tickAnim - 155) / 10) * (0-(-21.33082)));
            zz = -11.33305 + (((tickAnim - 155) / 10) * (0-(-11.33305)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-8.4356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.67282-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (15.32162-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = -8.4356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 25) / 35) * (-25.88553-(-8.4356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            yy = 0.67282 + (((tickAnim - 25) / 35) * (1.61477-(0.67282)));
            zz = 15.32162 + (((tickAnim - 25) / 35) * (36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*-0.5-(15.32162)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -25.88553 + (((tickAnim - 60) / 40) * (-25.88553-(-25.88553)));
            yy = 1.61477 + (((tickAnim - 60) / 40) * (1.61477-(1.61477)));
            zz = 36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*-0.5 + (((tickAnim - 60) / 40) * (36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*-0.5-(36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*-0.5)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = -25.88553 + (((tickAnim - 100) / 35) * (-25.88553-(-25.88553)));
            yy = 1.61477 + (((tickAnim - 100) / 35) * (1.61477-(1.61477)));
            zz = 36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*-0.5 + (((tickAnim - 100) / 35) * (36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*-0.5-(36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*-0.5)));
        }
        else if (tickAnim >= 135 && tickAnim < 155) {
            xx = -25.88553 + (((tickAnim - 135) / 20) * (-6.42816-(-25.88553)));
            yy = 1.61477 + (((tickAnim - 135) / 20) * (-0.33324-(1.61477)));
            zz = 36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*-0.5 + (((tickAnim - 135) / 20) * (7.52319-(36.7718968083+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*-0.5)));
        }
        else if (tickAnim >= 155 && tickAnim < 165) {
            xx = -6.42816 + (((tickAnim - 155) / 10) * (0-(-6.42816)));
            yy = -0.33324 + (((tickAnim - 155) / 10) * (0-(-0.33324)));
            zz = 7.52319 + (((tickAnim - 155) / 10) * (0-(7.52319)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (33.60245-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0.94218-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (11.48786-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 33.60245 + (((tickAnim - 33) / 27) * (42.14874-(33.60245)));
            yy = 0.94218 + (((tickAnim - 33) / 27) * (2.72266-(0.94218)));
            zz = 11.48786 + (((tickAnim - 33) / 27) * (12.02999-(11.48786)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 42.14874 + (((tickAnim - 60) / 40) * (42.14874-(42.14874)));
            yy = 2.72266 + (((tickAnim - 60) / 40) * (2.72266-(2.72266)));
            zz = 12.02999 + (((tickAnim - 60) / 40) * (12.02999-(12.02999)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 42.14874 + (((tickAnim - 100) / 35) * (42.14874-(42.14874)));
            yy = 2.72266 + (((tickAnim - 100) / 35) * (2.72266-(2.72266)));
            zz = 12.02999 + (((tickAnim - 100) / 35) * (12.02999-(12.02999)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 42.14874 + (((tickAnim - 135) / 30) * (0-(42.14874)));
            yy = 2.72266 + (((tickAnim - 135) / 30) * (0-(2.72266)));
            zz = 12.02999 + (((tickAnim - 135) / 30) * (0-(12.02999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lw2membrane4, lw2membrane4.rotateAngleX + (float) Math.toRadians(xx), lw2membrane4.rotateAngleY + (float) Math.toRadians(yy), lw2membrane4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-0.3-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -0.5 + (((tickAnim - 60) / 40) * (-0.5-(-0.5)));
            yy = 1.15 + (((tickAnim - 60) / 40) * (1.15-(1.15)));
            zz = -0.3 + (((tickAnim - 60) / 40) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = -0.5 + (((tickAnim - 100) / 35) * (-0.5-(-0.5)));
            yy = 1.15 + (((tickAnim - 100) / 35) * (1.15-(1.15)));
            zz = -0.3 + (((tickAnim - 100) / 35) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -0.5 + (((tickAnim - 135) / 30) * (0-(-0.5)));
            yy = 1.15 + (((tickAnim - 135) / 30) * (0-(1.15)));
            zz = -0.3 + (((tickAnim - 135) / 30) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lw2membrane4.rotationPointX = this.lw2membrane4.rotationPointX + (float)(xx);
        this.lw2membrane4.rotationPointY = this.lw2membrane4.rotationPointY - (float)(yy);
        this.lw2membrane4.rotationPointZ = this.lw2membrane4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-1-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -20 + (((tickAnim - 60) / 40) * (-20-(-20)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-1 + (((tickAnim - 60) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-1)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = -20 + (((tickAnim - 100) / 35) * (-20-(-20)));
            yy = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-1 + (((tickAnim - 100) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-1)));
        }
        else if (tickAnim >= 135 && tickAnim < 155) {
            xx = -20 + (((tickAnim - 135) / 20) * (2.5-(-20)));
            yy = 0 + (((tickAnim - 135) / 20) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-1 + (((tickAnim - 135) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-1)));
        }
        else if (tickAnim >= 155 && tickAnim < 165) {
            xx = 2.5 + (((tickAnim - 155) / 10) * (0-(2.5)));
            yy = 0 + (((tickAnim - 155) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 0) / 135) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 135) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 135) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 20) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 135) / 20) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 155) / 10) * (0-(0)));
            yy = -0.75 + (((tickAnim - 155) / 10) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 155) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing3.rotationPointX = this.rightwing3.rotationPointX + (float)(xx);
        this.rightwing3.rotationPointY = this.rightwing3.rotationPointY - (float)(yy);
        this.rightwing3.rotationPointZ = this.rightwing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-480-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-52-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (390.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -480 + (((tickAnim - 60) / 40) * (-480-(-480)));
            yy = -52 + (((tickAnim - 60) / 40) * (-52-(-52)));
            zz = 390.5 + (((tickAnim - 60) / 40) * (390.5-(390.5)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = -480 + (((tickAnim - 100) / 35) * (-480-(-480)));
            yy = -52 + (((tickAnim - 100) / 35) * (-52-(-52)));
            zz = 390.5 + (((tickAnim - 100) / 35) * (390.5-(390.5)));
        }
        else if (tickAnim >= 135 && tickAnim < 155) {
            xx = -480 + (((tickAnim - 135) / 20) * (2.0044-(-480)));
            yy = -52 + (((tickAnim - 135) / 20) * (10.02037-(-52)));
            zz = 390.5 + (((tickAnim - 135) / 20) * (-13.33674-(390.5)));
        }
        else if (tickAnim >= 155 && tickAnim < 165) {
            xx = 2.0044 + (((tickAnim - 155) / 10) * (0-(2.0044)));
            yy = 10.02037 + (((tickAnim - 155) / 10) * (0-(10.02037)));
            zz = -13.33674 + (((tickAnim - 155) / 10) * (0-(-13.33674)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 0) / 135) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 135) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 135) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 20) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 135) / 20) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 155) / 10) * (0-(0)));
            yy = -0.725 + (((tickAnim - 155) / 10) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 155) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-146.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-2-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -146.5 + (((tickAnim - 60) / 40) * (-146.5-(-146.5)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-2 + (((tickAnim - 60) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-2)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = -146.5 + (((tickAnim - 100) / 35) * (-146.5-(-146.5)));
            yy = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-2 + (((tickAnim - 100) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-2)));
        }
        else if (tickAnim >= 135 && tickAnim < 155) {
            xx = -146.5 + (((tickAnim - 135) / 20) * (0-(-146.5)));
            yy = 0 + (((tickAnim - 135) / 20) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-2 + (((tickAnim - 135) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-2)));
        }
        else if (tickAnim >= 155 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 155) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 29 + (((tickAnim - 24) / 9) * (42.69-(29)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 42.69 + (((tickAnim - 33) / 8) * (41.25-(42.69)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 61) {
            xx = 41.25 + (((tickAnim - 41) / 20) * (0-(41.25)));
            yy = 0 + (((tickAnim - 41) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-3-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 61) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 40) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-3 + (((tickAnim - 61) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-3)));
        }
        else if (tickAnim >= 101 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 101) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 101) / 35) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-3 + (((tickAnim - 101) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-3)));
        }
        else if (tickAnim >= 136 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 136) / 7) * (61.15-(0)));
            yy = 0 + (((tickAnim - 136) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-3 + (((tickAnim - 136) / 7) * (1.01422-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-3)));
        }
        else if (tickAnim >= 143 && tickAnim < 148) {
            xx = 61.15 + (((tickAnim - 143) / 5) * (52.75-(61.15)));
            yy = 0 + (((tickAnim - 143) / 5) * (0-(0)));
            zz = 1.01422 + (((tickAnim - 143) / 5) * (1.57408-(1.01422)));
        }
        else if (tickAnim >= 148 && tickAnim < 155) {
            xx = 52.75 + (((tickAnim - 148) / 7) * (0-(52.75)));
            yy = 0 + (((tickAnim - 148) / 7) * (0-(0)));
            zz = 1.57408 + (((tickAnim - 148) / 7) * (0-(1.57408)));
        }
        else if (tickAnim >= 155 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 155) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-14.97094-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.3801905914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-8.7418006418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -14.97094 + (((tickAnim - 60) / 40) * (-14.97094-(-14.97094)));
            yy = -0.3801905914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 60) / 40) * (-0.3801905914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(-0.3801905914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            zz = -8.7418006418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5 + (((tickAnim - 60) / 40) * (8.7418006418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5-(-8.7418006418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = -14.97094 + (((tickAnim - 100) / 35) * (-14.97094-(-14.97094)));
            yy = -0.3801905914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 100) / 35) * (-0.3801905914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(-0.3801905914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            zz = 8.7418006418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5 + (((tickAnim - 100) / 35) * (-8.7418006418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5-(8.7418006418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -14.97094 + (((tickAnim - 135) / 30) * (0-(-14.97094)));
            yy = -0.3801905914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 135) / 30) * (0-(-0.3801905914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            zz = -8.7418006418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5 + (((tickAnim - 135) / 30) * (0-(-8.7418006418+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -0.525 + (((tickAnim - 60) / 40) * (0.525-(-0.525)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 0.525 + (((tickAnim - 100) / 35) * (-0.525-(0.525)));
            yy = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 35) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -0.525 + (((tickAnim - 135) / 30) * (0-(-0.525)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (44.08171-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-9.00168-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-13.8622754667+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*1-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 44.08171 + (((tickAnim - 60) / 40) * (44.08171-(44.08171)));
            yy = -9.00168 + (((tickAnim - 60) / 40) * (9.00168-(-9.00168)));
            zz = -13.8622754667+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*1 + (((tickAnim - 60) / 40) * (13.86228-(-13.8622754667+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*1)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 44.08171 + (((tickAnim - 100) / 35) * (44.08171-(44.08171)));
            yy = 9.00168 + (((tickAnim - 100) / 35) * (-9.00168-(9.00168)));
            zz = 13.86228 + (((tickAnim - 100) / 35) * (-13.8622754667+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*1-(13.86228)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 44.08171 + (((tickAnim - 135) / 30) * (0-(44.08171)));
            yy = -9.00168 + (((tickAnim - 135) / 30) * (0-(-9.00168)));
            zz = -13.8622754667+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*1 + (((tickAnim - 135) / 30) * (0-(-13.8622754667+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -0.125 + (((tickAnim - 60) / 40) * (0.125-(-0.125)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 0.125 + (((tickAnim - 100) / 35) * (-0.125-(0.125)));
            yy = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 35) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -0.125 + (((tickAnim - 135) / 30) * (0-(-0.125)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (29.57583-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-8.74919-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-3.88723-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 29.57583 + (((tickAnim - 40) / 20) * (40.35138-(29.57583)));
            yy = -8.74919 + (((tickAnim - 40) / 20) * (2.84709-(-8.74919)));
            zz = -3.88723 + (((tickAnim - 40) / 20) * (-11.2085949173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5-(-3.88723)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 40.35138 + (((tickAnim - 60) / 8) * (40.85243-(40.35138)));
            yy = 2.84709 + (((tickAnim - 60) / 8) * (10.60652-(2.84709)));
            zz = -11.2085949173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5 + (((tickAnim - 60) / 8) * (-1.7396+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5-(-11.2085949173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5)));
        }
        else if (tickAnim >= 68 && tickAnim < 100) {
            xx = 40.85243 + (((tickAnim - 68) / 32) * (40.84273-(40.85243)));
            yy = 10.60652 + (((tickAnim - 68) / 32) * (-14.40836-(10.60652)));
            zz = -1.7396+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5 + (((tickAnim - 68) / 32) * (7.9507454993+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5-(-1.7396+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = 40.84273 + (((tickAnim - 100) / 13) * (41.30744-(40.84273)));
            yy = -14.40836 + (((tickAnim - 100) / 13) * (-17.86093-(-14.40836)));
            zz = 7.9507454993+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5 + (((tickAnim - 100) / 13) * (-1.1984212827+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5-(7.9507454993+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 41.30744 + (((tickAnim - 113) / 22) * (40.35138-(41.30744)));
            yy = -17.86093 + (((tickAnim - 113) / 22) * (2.84709-(-17.86093)));
            zz = -1.1984212827+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5 + (((tickAnim - 113) / 22) * (-11.2085949173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5-(-1.1984212827+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 40.35138 + (((tickAnim - 135) / 30) * (0-(40.35138)));
            yy = 2.84709 + (((tickAnim - 135) / 30) * (0-(2.84709)));
            zz = -11.2085949173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5 + (((tickAnim - 135) / 30) * (0-(-11.2085949173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-1.125-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            yy = 0.5 + (((tickAnim - 60) / 40) * (0.5-(0.5)));
            zz = -1.125 + (((tickAnim - 60) / 40) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            yy = 0.5 + (((tickAnim - 100) / 35) * (0.5-(0.5)));
            zz = -1.125 + (((tickAnim - 100) / 35) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            yy = 0.5 + (((tickAnim - 135) / 30) * (0-(0.5)));
            zz = -1.125 + (((tickAnim - 135) / 30) * (0-(-1.125)));
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
            xx = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5 + (((tickAnim - 60) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 135) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5 + (((tickAnim - 100) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5)));
            yy = 0 + (((tickAnim - 100) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 35) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5 + (((tickAnim - 135) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*1.5)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTupandactylus_imperator entity = (EntityPrehistoricFloraTupandactylus_imperator) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 17.31868 + (((tickAnim - 0) / 6) * (26.91168-(17.31868)));
            yy = -1.21715 + (((tickAnim - 0) / 6) * (-2.27471-(-1.21715)));
            zz = -10.12892 + (((tickAnim - 0) / 6) * (-15.95903-(-10.12892)));
        }
        else if (tickAnim >= 6 && tickAnim < 23) {
            xx = 26.91168 + (((tickAnim - 6) / 17) * (-34.95686-(26.91168)));
            yy = -2.27471 + (((tickAnim - 6) / 17) * (1.78518-(-2.27471)));
            zz = -15.95903 + (((tickAnim - 6) / 17) * (-25.1128+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25-(-15.95903)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -34.95686 + (((tickAnim - 23) / 8) * (-23-(-34.95686)));
            yy = 1.78518 + (((tickAnim - 23) / 8) * (0-(1.78518)));
            zz = -25.1128+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 23) / 8) * (0-(-25.1128+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
        }
        else if (tickAnim >= 31 && tickAnim < 60) {
            xx = -23 + (((tickAnim - 31) / 29) * (17.31868-(-23)));
            yy = 0 + (((tickAnim - 31) / 29) * (-1.21715-(0)));
            zz = 0 + (((tickAnim - 31) / 29) * (-10.12892-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 4.5 + (((tickAnim - 0) / 6) * (6-(4.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 19) {
            xx = 6 + (((tickAnim - 6) / 13) * (26.88-(6)));
            yy = 0 + (((tickAnim - 6) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 13) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 26.88 + (((tickAnim - 19) / 12) * (-13.75-(26.88)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 60) {
            xx = -13.75 + (((tickAnim - 31) / 29) * (4.5-(-13.75)));
            yy = 0 + (((tickAnim - 31) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 6) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 11) * (0.02-(0)));
            zz = 0 + (((tickAnim - 6) / 11) * (-0.525-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0.02 + (((tickAnim - 17) / 6) * (-0.12-(0.02)));
            zz = -0.525 + (((tickAnim - 17) / 6) * (-0.545-(-0.525)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = -0.12 + (((tickAnim - 23) / 8) * (0.2-(-0.12)));
            zz = -0.545 + (((tickAnim - 23) / 8) * (-0.3-(-0.545)));
        }
        else if (tickAnim >= 31 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 31) / 29) * (0-(0)));
            yy = 0.2 + (((tickAnim - 31) / 29) * (0-(0.2)));
            zz = -0.3 + (((tickAnim - 31) / 29) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 31.57946 + (((tickAnim - 0) / 6) * (59.75-(31.57946)));
            yy = 4.18011 + (((tickAnim - 0) / 6) * (0-(4.18011)));
            zz = 0.50837 + (((tickAnim - 0) / 6) * (0-(0.50837)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 59.75 + (((tickAnim - 6) / 6) * (95.05-(59.75)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 95.05 + (((tickAnim - 12) / 5) * (103.19-(95.05)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 103.19 + (((tickAnim - 17) / 9) * (18.45-(103.19)));
            yy = 0 + (((tickAnim - 17) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 9) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 18.45 + (((tickAnim - 26) / 5) * (36.75-(18.45)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 36.75 + (((tickAnim - 31) / 9) * (18.12497-(36.75)));
            yy = 0 + (((tickAnim - 31) / 9) * (1.31375-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0.15977-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 18.12497 + (((tickAnim - 40) / 20) * (31.57946-(18.12497)));
            yy = 1.31375 + (((tickAnim - 40) / 20) * (4.18011-(1.31375)));
            zz = 0.15977 + (((tickAnim - 40) / 20) * (0.50837-(0.15977)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 6) * (0-(-0.225)));
            zz = 1 + (((tickAnim - 0) / 6) * (1.15-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (1.165-(0)));
            zz = 1.15 + (((tickAnim - 6) / 6) * (0.87-(1.15)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 1.165 + (((tickAnim - 12) / 5) * (2.4-(1.165)));
            zz = 0.87 + (((tickAnim - 12) / 5) * (1-(0.87)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 17) / 9) * (0-(0)));
            yy = 2.4 + (((tickAnim - 17) / 9) * (-0.22-(2.4)));
            zz = 1 + (((tickAnim - 17) / 9) * (0.42-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = -0.22 + (((tickAnim - 26) / 5) * (0.775-(-0.22)));
            zz = 0.42 + (((tickAnim - 26) / 5) * (0-(0.42)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = 0.775 + (((tickAnim - 31) / 9) * (0.785-(0.775)));
            zz = 0 + (((tickAnim - 31) / 9) * (0.31-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 40) / 11) * (0-(0)));
            yy = 0.785 + (((tickAnim - 40) / 11) * (0.765-(0.785)));
            zz = 0.31 + (((tickAnim - 40) / 11) * (0.68-(0.31)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            yy = 0.765 + (((tickAnim - 51) / 9) * (-0.225-(0.765)));
            zz = 0.68 + (((tickAnim - 51) / 9) * (1-(0.68)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0.60601 + (((tickAnim - 0) / 25) * (15.88322-(-0.60601)));
            yy = 11.83241 + (((tickAnim - 0) / 25) * (5.84081-(11.83241)));
            zz = 14.16984 + (((tickAnim - 0) / 25) * (-15.70589-(14.16984)));
        }
        else if (tickAnim >= 25 && tickAnim < 46) {
            xx = 15.88322 + (((tickAnim - 25) / 21) * (-10.71529-(15.88322)));
            yy = 5.84081 + (((tickAnim - 25) / 21) * (11.80936-(5.84081)));
            zz = -15.70589 + (((tickAnim - 25) / 21) * (21.25633-(-15.70589)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = -10.71529 + (((tickAnim - 46) / 14) * (-0.60601-(-10.71529)));
            yy = 11.80936 + (((tickAnim - 46) / 14) * (11.83241-(11.80936)));
            zz = 21.25633 + (((tickAnim - 46) / 14) * (14.16984-(21.25633)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-15.56055-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.20956-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (13.0295-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 46) {
            xx = -15.56055 + (((tickAnim - 25) / 21) * (0-(-15.56055)));
            yy = -1.20956 + (((tickAnim - 25) / 21) * (0-(-1.20956)));
            zz = 13.0295 + (((tickAnim - 25) / 21) * (0-(13.0295)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lwmembrane, lwmembrane.rotateAngleX + (float) Math.toRadians(xx), lwmembrane.rotateAngleY + (float) Math.toRadians(yy), lwmembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0.975-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.675-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 46) {
            xx = 0.975 + (((tickAnim - 25) / 21) * (0-(0.975)));
            yy = -1.15 + (((tickAnim - 25) / 21) * (0-(-1.15)));
            zz = 0.675 + (((tickAnim - 25) / 21) * (0-(0.675)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lwmembrane.rotationPointX = this.lwmembrane.rotationPointX + (float)(xx);
        this.lwmembrane.rotationPointY = this.lwmembrane.rotationPointY - (float)(yy);
        this.lwmembrane.rotationPointZ = this.lwmembrane.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 0) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 25) * (0.6-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 46) {
            xx = 1 + (((tickAnim - 25) / 21) * (1-(1)));
            yy = 1 + (((tickAnim - 25) / 21) * (1-(1)));
            zz = 0.6 + (((tickAnim - 25) / 21) * (1-(0.6)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 46) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 46) / 14) * (1-(1)));
            zz = 1 + (((tickAnim - 46) / 14) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lwmembrane.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -9.21585 + (((tickAnim - 0) / 25) * (15-(-9.21585)));
            yy = -12.11173 + (((tickAnim - 0) / 25) * (0-(-12.11173)));
            zz = -21.33907 + (((tickAnim - 0) / 25) * (0-(-21.33907)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 15 + (((tickAnim - 25) / 11) * (-17.5238+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*40-(15)));
            yy = 0 + (((tickAnim - 25) / 11) * (-6.34424-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (-11.17761-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 46) {
            xx = -17.5238+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*40 + (((tickAnim - 36) / 10) * (-18.21585-(-17.5238+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*40)));
            yy = -6.34424 + (((tickAnim - 36) / 10) * (-12.11173-(-6.34424)));
            zz = -11.17761 + (((tickAnim - 36) / 10) * (-21.33907-(-11.17761)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = -18.21585 + (((tickAnim - 46) / 14) * (-9.21585-(-18.21585)));
            yy = -12.11173 + (((tickAnim - 46) / 14) * (-12.11173-(-12.11173)));
            zz = -21.33907 + (((tickAnim - 46) / 14) * (-21.33907-(-21.33907)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0.325-(0)));
            yy = -0.975 + (((tickAnim - 0) / 25) * (-0.725-(-0.975)));
            zz = 0.1 + (((tickAnim - 0) / 25) * (0.275-(0.1)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 0.325 + (((tickAnim - 25) / 11) * (0.1-(0.325)));
            yy = -0.725 + (((tickAnim - 25) / 11) * (-0.085-(-0.725)));
            zz = 0.275 + (((tickAnim - 25) / 11) * (0.18-(0.275)));
        }
        else if (tickAnim >= 36 && tickAnim < 46) {
            xx = 0.1 + (((tickAnim - 36) / 10) * (0-(0.1)));
            yy = -0.085 + (((tickAnim - 36) / 10) * (-0.975-(-0.085)));
            zz = 0.18 + (((tickAnim - 36) / 10) * (0.1-(0.18)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing2.rotationPointX = this.leftwing2.rotationPointX + (float)(xx);
        this.leftwing2.rotationPointY = this.leftwing2.rotationPointY - (float)(yy);
        this.leftwing2.rotationPointZ = this.leftwing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 12.75 + (((tickAnim - 0) / 25) * (7.75-(12.75)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 7.75 + (((tickAnim - 25) / 11) * (19.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*20-(7.75)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 46) {
            xx = 19.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*20 + (((tickAnim - 36) / 10) * (12.75-(19.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*20)));
            yy = 0 + (((tickAnim - 36) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 10) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = 12.75 + (((tickAnim - 46) / 14) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0.025 + (((tickAnim - 0) / 25) * (0-(0.025)));
            zz = 0.225 + (((tickAnim - 0) / 25) * (0-(0.225)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 11) * (-0.59-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0.12-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 36) / 10) * (0-(0)));
            yy = -0.59 + (((tickAnim - 36) / 10) * (-0.45-(-0.59)));
            zz = 0.12 + (((tickAnim - 36) / 10) * (0.225-(0.12)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            yy = -0.45 + (((tickAnim - 46) / 14) * (0.025-(-0.45)));
            zz = 0.225 + (((tickAnim - 46) / 14) * (0.225-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing3.rotationPointX = this.leftwing3.rotationPointX + (float)(xx);
        this.leftwing3.rotationPointY = this.leftwing3.rotationPointY - (float)(yy);
        this.leftwing3.rotationPointZ = this.leftwing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -9.6039 + (((tickAnim - 0) / 13) * (-27.25402-(-9.6039)));
            yy = -1.44321 + (((tickAnim - 0) / 13) * (1.79945-(-1.44321)));
            zz = 5.82287 + (((tickAnim - 0) / 13) * (8.36669-(5.82287)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -27.25402 + (((tickAnim - 13) / 12) * (-73.40413-(-27.25402)));
            yy = 1.79945 + (((tickAnim - 13) / 12) * (5.0421-(1.79945)));
            zz = 8.36669 + (((tickAnim - 13) / 12) * (10.91051-(8.36669)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -73.40413 + (((tickAnim - 25) / 7) * (-57.33436-(-73.40413)));
            yy = 5.0421 + (((tickAnim - 25) / 7) * (3.84247-(5.0421)));
            zz = 10.91051 + (((tickAnim - 25) / 7) * (5.33272-(10.91051)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -57.33436 + (((tickAnim - 32) / 4) * (-73.29449-(-57.33436)));
            yy = 3.84247 + (((tickAnim - 32) / 4) * (3.15697-(3.84247)));
            zz = 5.33272 + (((tickAnim - 32) / 4) * (2.14541-(5.33272)));
        }
        else if (tickAnim >= 36 && tickAnim < 46) {
            xx = -73.29449 + (((tickAnim - 36) / 10) * (11.61132-(-73.29449)));
            yy = 3.15697 + (((tickAnim - 36) / 10) * (-2.60178-(3.15697)));
            zz = 2.14541 + (((tickAnim - 36) / 10) * (12.77081-(2.14541)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = 11.61132 + (((tickAnim - 46) / 14) * (-9.6039-(11.61132)));
            yy = -2.60178 + (((tickAnim - 46) / 14) * (-1.44321-(-2.60178)));
            zz = 12.77081 + (((tickAnim - 46) / 14) * (5.82287-(12.77081)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-0.21-(0)));
            yy = 1.3 + (((tickAnim - 0) / 13) * (0.75-(1.3)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -0.21 + (((tickAnim - 13) / 12) * (-0.425-(-0.21)));
            yy = 0.75 + (((tickAnim - 13) / 12) * (0.625-(0.75)));
            zz = 0.25 + (((tickAnim - 13) / 12) * (0.5-(0.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -0.425 + (((tickAnim - 25) / 7) * (-0.28-(-0.425)));
            yy = 0.625 + (((tickAnim - 25) / 7) * (1.57-(0.625)));
            zz = 0.5 + (((tickAnim - 25) / 7) * (0.33-(0.5)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -0.28 + (((tickAnim - 32) / 4) * (-0.2-(-0.28)));
            yy = 1.57 + (((tickAnim - 32) / 4) * (1.25-(1.57)));
            zz = 0.33 + (((tickAnim - 32) / 4) * (0.24-(0.33)));
        }
        else if (tickAnim >= 36 && tickAnim < 46) {
            xx = -0.2 + (((tickAnim - 36) / 10) * (0-(-0.2)));
            yy = 1.25 + (((tickAnim - 36) / 10) * (-0.75-(1.25)));
            zz = 0.24 + (((tickAnim - 36) / 10) * (0-(0.24)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            yy = -0.75 + (((tickAnim - 46) / 14) * (1.3-(-0.75)));
            zz = 0 + (((tickAnim - 46) / 14) * (0-(0)));
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
            xx = 15.88322 + (((tickAnim - 0) / 21) * (-10.71529-(15.88322)));
            yy = -5.84081 + (((tickAnim - 0) / 21) * (-11.80936-(-5.84081)));
            zz = 15.70589 + (((tickAnim - 0) / 21) * (-21.25633-(15.70589)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = -10.71529 + (((tickAnim - 21) / 39) * (15.88322-(-10.71529)));
            yy = -11.80936 + (((tickAnim - 21) / 39) * (-5.84081-(-11.80936)));
            zz = -21.25633 + (((tickAnim - 21) / 39) * (15.70589-(-21.25633)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -15.56055 + (((tickAnim - 0) / 21) * (0-(-15.56055)));
            yy = 1.20956 + (((tickAnim - 0) / 21) * (0-(1.20956)));
            zz = -13.0295 + (((tickAnim - 0) / 21) * (0-(-13.0295)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 21) / 39) * (-15.56055-(0)));
            yy = 0 + (((tickAnim - 21) / 39) * (1.20956-(0)));
            zz = 0 + (((tickAnim - 21) / 39) * (-13.0295-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lwmembrane2, lwmembrane2.rotateAngleX + (float) Math.toRadians(xx), lwmembrane2.rotateAngleY + (float) Math.toRadians(yy), lwmembrane2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -0.975 + (((tickAnim - 0) / 21) * (0-(-0.975)));
            yy = -1.15 + (((tickAnim - 0) / 21) * (0-(-1.15)));
            zz = 0.675 + (((tickAnim - 0) / 21) * (0-(0.675)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 21) / 39) * (-0.975-(0)));
            yy = 0 + (((tickAnim - 21) / 39) * (-1.15-(0)));
            zz = 0 + (((tickAnim - 21) / 39) * (0.675-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lwmembrane2.rotationPointX = this.lwmembrane2.rotationPointX + (float)(xx);
        this.lwmembrane2.rotationPointY = this.lwmembrane2.rotationPointY - (float)(yy);
        this.lwmembrane2.rotationPointZ = this.lwmembrane2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 1 + (((tickAnim - 0) / 21) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 21) * (1-(1)));
            zz = 0.6 + (((tickAnim - 0) / 21) * (1-(0.6)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 21) / 39) * (1-(1)));
            yy = 1 + (((tickAnim - 21) / 39) * (1-(1)));
            zz = 1 + (((tickAnim - 21) / 39) * (0.6-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lwmembrane2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 15 + (((tickAnim - 0) / 11) * (-3.6988+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-40-(15)));
            yy = 0 + (((tickAnim - 0) / 11) * (6.34424-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (11.17761-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -3.6988+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-40 + (((tickAnim - 11) / 10) * (-18.21585-(-3.6988+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-40)));
            yy = 6.34424 + (((tickAnim - 11) / 10) * (12.11173-(6.34424)));
            zz = 11.17761 + (((tickAnim - 11) / 10) * (21.33907-(11.17761)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = -18.21585 + (((tickAnim - 21) / 39) * (15-(-18.21585)));
            yy = 12.11173 + (((tickAnim - 21) / 39) * (0-(12.11173)));
            zz = 21.33907 + (((tickAnim - 21) / 39) * (0-(21.33907)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0.325 + (((tickAnim - 0) / 11) * (0.1-(0.325)));
            yy = -0.725 + (((tickAnim - 0) / 11) * (-0.085-(-0.725)));
            zz = 0.275 + (((tickAnim - 0) / 11) * (0.18-(0.275)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0.1 + (((tickAnim - 11) / 10) * (0-(0.1)));
            yy = -0.085 + (((tickAnim - 11) / 10) * (-0.975-(-0.085)));
            zz = 0.18 + (((tickAnim - 11) / 10) * (0.1-(0.18)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 21) / 39) * (0.325-(0)));
            yy = -0.975 + (((tickAnim - 21) / 39) * (-0.725-(-0.975)));
            zz = 0.1 + (((tickAnim - 21) / 39) * (0.275-(0.1)));
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
            xx = 7.75 + (((tickAnim - 0) / 11) * (19.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-20-(7.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 19.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-20 + (((tickAnim - 11) / 10) * (12.75-(19.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-20)));
            yy = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = 12.75 + (((tickAnim - 21) / 39) * (7.75-(12.75)));
            yy = 0 + (((tickAnim - 21) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.59-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.12-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            yy = -0.59 + (((tickAnim - 11) / 10) * (-0.45-(-0.59)));
            zz = 0.12 + (((tickAnim - 11) / 10) * (0.225-(0.12)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 21) / 39) * (0-(0)));
            yy = -0.45 + (((tickAnim - 21) / 39) * (0-(-0.45)));
            zz = 0.225 + (((tickAnim - 21) / 39) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing3.rotationPointX = this.rightwing3.rotationPointX + (float)(xx);
        this.rightwing3.rotationPointY = this.rightwing3.rotationPointY - (float)(yy);
        this.rightwing3.rotationPointZ = this.rightwing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -73.40413 + (((tickAnim - 0) / 7) * (-57.33436-(-73.40413)));
            yy = 5.0421 + (((tickAnim - 0) / 7) * (3.84247-(5.0421)));
            zz = 10.91051 + (((tickAnim - 0) / 7) * (5.33272-(10.91051)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -57.33436 + (((tickAnim - 7) / 4) * (-73.29449-(-57.33436)));
            yy = 3.84247 + (((tickAnim - 7) / 4) * (3.15697-(3.84247)));
            zz = 5.33272 + (((tickAnim - 7) / 4) * (2.14541-(5.33272)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -73.29449 + (((tickAnim - 11) / 10) * (8.8961-(-73.29449)));
            yy = 3.15697 + (((tickAnim - 11) / 10) * (1.44321-(3.15697)));
            zz = 2.14541 + (((tickAnim - 11) / 10) * (-5.82287-(2.14541)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = 8.8961 + (((tickAnim - 21) / 10) * (-7.5-(8.8961)));
            yy = 1.44321 + (((tickAnim - 21) / 10) * (0-(1.44321)));
            zz = -5.82287 + (((tickAnim - 21) / 10) * (0-(-5.82287)));
        }
        else if (tickAnim >= 31 && tickAnim < 44) {
            xx = -7.5 + (((tickAnim - 31) / 13) * (-24.87752-(-7.5)));
            yy = 0 + (((tickAnim - 31) / 13) * (2.30496-(0)));
            zz = 0 + (((tickAnim - 31) / 13) * (4.98765-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -24.87752 + (((tickAnim - 44) / 16) * (-73.40413-(-24.87752)));
            yy = 2.30496 + (((tickAnim - 44) / 16) * (5.0421-(2.30496)));
            zz = 4.98765 + (((tickAnim - 44) / 16) * (10.91051-(4.98765)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0.425 + (((tickAnim - 0) / 7) * (0.28-(0.425)));
            yy = 0.625 + (((tickAnim - 0) / 7) * (1.57-(0.625)));
            zz = 0.5 + (((tickAnim - 0) / 7) * (0.33-(0.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0.28 + (((tickAnim - 7) / 4) * (0.2-(0.28)));
            yy = 1.57 + (((tickAnim - 7) / 4) * (1.25-(1.57)));
            zz = 0.33 + (((tickAnim - 7) / 4) * (0.24-(0.33)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0.2 + (((tickAnim - 11) / 10) * (0-(0.2)));
            yy = 1.25 + (((tickAnim - 11) / 10) * (-0.25-(1.25)));
            zz = 0.24 + (((tickAnim - 11) / 10) * (0-(0.24)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 21) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 21) / 10) * (1.225-(-0.25)));
            zz = 0 + (((tickAnim - 21) / 10) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 31) / 29) * (0.425-(0)));
            yy = 1.225 + (((tickAnim - 31) / 29) * (0.625-(1.225)));
            zz = 0 + (((tickAnim - 31) / 29) * (0.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -13.25 + (((tickAnim - 0) / 21) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 21) / 39) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 21) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = -23 + (((tickAnim - 0) / 35) * (26.91168-(-23)));
            yy = 0 + (((tickAnim - 0) / 35) * (2.27471-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (19.98403-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 52) {
            xx = 26.91168 + (((tickAnim - 35) / 17) * (-34.95686-(26.91168)));
            yy = 2.27471 + (((tickAnim - 35) / 17) * (1.78518-(2.27471)));
            zz = 19.98403 + (((tickAnim - 35) / 17) * (31.1378+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-25-(19.98403)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = -34.95686 + (((tickAnim - 52) / 8) * (-23-(-34.95686)));
            yy = 1.78518 + (((tickAnim - 52) / 8) * (0-(1.78518)));
            zz = 31.1378+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-25 + (((tickAnim - 52) / 8) * (0-(31.1378+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = -13.75 + (((tickAnim - 0) / 35) * (6-(-13.75)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 6 + (((tickAnim - 35) / 13) * (26.88-(6)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 26.88 + (((tickAnim - 48) / 12) * (-13.75-(26.88)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 35) * (0-(0.2)));
            zz = -0.3 + (((tickAnim - 0) / 35) * (0-(-0.3)));
        }
        else if (tickAnim >= 35 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 35) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 11) * (0.02-(0)));
            zz = 0 + (((tickAnim - 35) / 11) * (-0.525-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 46) / 6) * (0-(0)));
            yy = 0.02 + (((tickAnim - 46) / 6) * (-0.12-(0.02)));
            zz = -0.525 + (((tickAnim - 46) / 6) * (-0.545-(-0.525)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            yy = -0.12 + (((tickAnim - 52) / 8) * (0.2-(-0.12)));
            zz = -0.545 + (((tickAnim - 52) / 8) * (-0.3-(-0.545)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 36.75 + (((tickAnim - 0) / 7) * (24.71493-(36.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (-3.07072-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-3.46035-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 24.71493 + (((tickAnim - 7) / 7) * (9.92986-(24.71493)));
            yy = -3.07072 + (((tickAnim - 7) / 7) * (-6.14143-(-3.07072)));
            zz = -3.46035 + (((tickAnim - 7) / 7) * (-6.9207-(-3.46035)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 9.92986 + (((tickAnim - 14) / 21) * (59.75-(9.92986)));
            yy = -6.14143 + (((tickAnim - 14) / 21) * (0-(-6.14143)));
            zz = -6.9207 + (((tickAnim - 14) / 21) * (0-(-6.9207)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 59.75 + (((tickAnim - 35) / 6) * (95.05-(59.75)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 95.05 + (((tickAnim - 41) / 5) * (103.19-(95.05)));
            yy = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 103.19 + (((tickAnim - 46) / 9) * (18.45-(103.19)));
            yy = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 9) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 18.45 + (((tickAnim - 55) / 5) * (36.75-(18.45)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.775 + (((tickAnim - 0) / 7) * (0.76-(0.775)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.655-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0.76 + (((tickAnim - 7) / 7) * (0.15-(0.76)));
            zz = 0.655 + (((tickAnim - 7) / 7) * (0.46-(0.655)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 14) / 10) * (0-(0)));
            yy = 0.15 + (((tickAnim - 14) / 10) * (0.08-(0.15)));
            zz = 0.46 + (((tickAnim - 14) / 10) * (1.365-(0.46)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 0.08 + (((tickAnim - 24) / 11) * (0-(0.08)));
            zz = 1.365 + (((tickAnim - 24) / 11) * (1.15-(1.365)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 6) * (1.165-(0)));
            zz = 1.15 + (((tickAnim - 35) / 6) * (0.87-(1.15)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            yy = 1.165 + (((tickAnim - 41) / 5) * (2.4-(1.165)));
            zz = 0.87 + (((tickAnim - 41) / 5) * (1-(0.87)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            yy = 2.4 + (((tickAnim - 46) / 9) * (-0.22-(2.4)));
            zz = 1 + (((tickAnim - 46) / 9) * (0.42-(1)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = -0.22 + (((tickAnim - 55) / 5) * (0.775-(-0.22)));
            zz = 0.42 + (((tickAnim - 55) / 5) * (0-(0.42)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 21) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-30))*1), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-59))*0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-59))*-0.2);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-90))*-2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+50))*2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-130))*3), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+150))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-180))*-2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+190))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-240))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+290))*-2));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-30))*4), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*4));

    }
    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTupandactylus_imperator entity = (EntityPrehistoricFloraTupandactylus_imperator) entitylivingbaseIn;
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
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*-15 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*-15)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-120))*-15-(0)));
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
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-300))*30 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-300))*30)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-340))*30-(0)));
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
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*15 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*15)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-120))*15-(0)));
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

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTupandactylus_imperator e = (EntityPrehistoricFloraTupandactylus_imperator) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body, ((0.2182F)-(0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(body2, ((0.0873F)-(0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((-0.0086F)-(-0.0086F)), ((0.1266F)-(-0.1266F)),((0.0763F)-(-0.0763F)));
        animator.rotate(cube_r10, ((0.0F)-(0.0F)), ((0.1134F)-(-0.1134F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r12, ((0.0218F)-(0.0218F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r13, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r14, ((-0.2618F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r15, ((0.9556F)-(0.9556F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((1.8762F)-(1.8762F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r17, ((2.3998F)-(2.3998F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r18, ((1.1083F)-(1.1083F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r19, ((1.0908F)-(1.0908F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((0.0F)-(0.0F)), ((-0.0349F)-(0.0349F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r20, ((1.309F)-(1.309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r21, ((-0.3927F)-(-0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r22, ((0.3491F)-(0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r23, ((0.9163F)-(0.9163F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r24, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r25, ((-0.7854F)-(-0.7854F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r26, ((0.3491F)-(0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((-0.2182F)-(-0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((0.0F)-(0.0F)), ((-0.0349F)-(0.0349F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((0.0F)-(0.0F)), ((-0.1134F)-(0.1134F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((-0.0086F)-(-0.0086F)), ((-0.1266F)-(0.1266F)),((-0.0763F)-(0.0763F)));
        animator.rotate(cube_r7, ((0.0F)-(0.0F)), ((0.0349F)-(-0.0349F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((-0.2182F)-(-0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((0.0F)-(0.0F)), ((0.0349F)-(-0.0349F)),((0.0F)-(0.0F)));
        animator.rotate(head, ((0.6109F)-(1.1345F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(lefthand, ((-0.1659F)-(3.1416F)), ((-1.0836F)-(0.4363F)),((1.758F)-(0.0F)));
        animator.rotate(leftleg, ((0.8068F)-(0.4394F)), ((0.3073F)-(0.1739F)),((-1.6308F)-(-0.0631F)));
        animator.rotate(leftleg2, ((0.6532F)-(1.0023F)), ((-0.0409F)-(-0.0409F)),((0.0671F)-(0.0671F)));
        animator.rotate(leftleg3, ((-0.6527F)-(-2.2865F)), ((-0.0531F)-(-0.0637F)),((-0.0693F)-(0.1195F)));
        animator.rotate(leftwing, ((0.0852F)-(0.0756F)), ((0.0189F)-(-0.0436F)),((-1.6136F)-(-0.8743F)));
        animator.rotate(leftwing2, ((-0.0865F)-(0.1507F)), ((-0.0114F)-(0.0872F)),((-0.1304F)-(0.7399F)));
        animator.rotate(leftwing3, ((-0.0872F)-(0.3459F)), ((-0.0038F)-(-0.0484F)),((-0.0435F)-(0.0796F)));
        animator.rotate(leftwing4, ((-2.8362F)-(-0.4775F)), ((-0.0038F)-(0.0462F)),((0.0435F)-(0.1645F)));
        animator.rotate(leftwing5, ((0.1742F)-(0.3482F)), ((0.0167F)-(0.0111F)),((-0.0403F)-(-0.0474F)));
        animator.rotate(lw2membrane, ((0.0F)-(0.0F)), ((-0.1571F)-(-0.1571F)),((0.0F)-(0.0F)));
        animator.rotate(lw2membrane2, ((-0.4796F)-(-0.4796F)), ((0.0167F)-(0.0167F)),((0.0403F)-(0.0403F)));
        animator.rotate(lw2membrane3, ((0.0F)-(0.0F)), ((0.1571F)-(0.1571F)),((0.0F)-(0.0F)));
        animator.rotate(lw2membrane4, ((-0.4796F)-(-0.4796F)), ((-0.0167F)-(-0.0167F)),((-0.0403F)-(-0.0403F)));
        animator.rotate(lw3membrane, ((0.0F)-(0.0F)), ((-0.1789F)-(-0.1789F)),((0.0F)-(0.0F)));
        animator.rotate(lw3membrane2, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(lw3membrane3, ((0.0F)-(0.0F)), ((0.1789F)-(0.1789F)),((0.0F)-(0.0F)));
        animator.rotate(lw3membrane4, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(lw4membrane, ((0.0F)-(0.0F)), ((0.0873F)-(0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(lw4membrane2, ((0.0F)-(0.0F)), ((0.0873F)-(0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(lw4membrane3, ((0.0F)-(0.0F)), ((-0.0873F)-(-0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(lw4membrane4, ((0.0F)-(0.0F)), ((-0.0873F)-(-0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(lw5membrane2, ((0.0F)-(0.0F)), ((0.0873F)-(0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(lw5membrane4, ((0.0F)-(0.0F)), ((-0.0873F)-(-0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(lwmembrane, ((-0.145F)-(-0.145F)), ((0.0351F)-(0.0351F)),((0.0636F)-(0.0636F)));
        animator.rotate(lwmembrane2, ((-0.145F)-(-0.145F)), ((-0.0351F)-(-0.0351F)),((-0.0636F)-(-0.0636F)));
        animator.rotate(main, ((-0.3491F)-(-0.7418F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck, ((-0.2182F)-(-0.48F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(righthand, ((-0.1659F)-(3.1416F)), ((1.0836F)-(-0.4363F)),((-1.758F)-(0.0F)));
        animator.rotate(rightleg, ((0.8068F)-(0.4394F)), ((-0.3073F)-(-0.1739F)),((1.6308F)-(0.0631F)));
        animator.rotate(rightleg2, ((0.6532F)-(1.0023F)), ((0.0409F)-(0.0409F)),((-0.0671F)-(-0.0671F)));
        animator.rotate(rightleg3, ((-0.6527F)-(-2.2865F)), ((0.0531F)-(0.0637F)),((0.0693F)-(-0.1195F)));
        animator.rotate(rightwing, ((0.0852F)-(0.0756F)), ((-0.0189F)-(0.0436F)),((1.6136F)-(0.8743F)));
        animator.rotate(rightwing2, ((-0.0865F)-(0.1507F)), ((0.0114F)-(-0.0872F)),((0.1304F)-(-0.7399F)));
        animator.rotate(rightwing3, ((-0.0872F)-(0.3459F)), ((0.0038F)-(0.0484F)),((0.0435F)-(-0.0796F)));
        animator.rotate(rightwing4, ((-2.8362F)-(-0.4775F)), ((0.0038F)-(-0.0462F)),((-0.0435F)-(-0.1645F)));
        animator.rotate(rightwing5, ((0.1742F)-(0.3482F)), ((-0.0167F)-(-0.0111F)),((0.0403F)-(0.0474F)));
        animator.rotate(tail, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(throat, ((-0.48F)-(-0.48F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));




        

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body, -((0.2182F)-(0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(body2, -((0.0873F)-(0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((-0.0086F)-(-0.0086F)), -((0.1266F)-(-0.1266F)),-((0.0763F)-(-0.0763F)));
        animator.rotate(cube_r10, -((0.0F)-(0.0F)), -((0.1134F)-(-0.1134F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r12, -((0.0218F)-(0.0218F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r13, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r14, -((-0.2618F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r15, -((0.9556F)-(0.9556F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((1.8762F)-(1.8762F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r17, -((2.3998F)-(2.3998F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r18, -((1.1083F)-(1.1083F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r19, -((1.0908F)-(1.0908F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((0.0F)-(0.0F)), -((-0.0349F)-(0.0349F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r20, -((1.309F)-(1.309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r21, -((-0.3927F)-(-0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r22, -((0.3491F)-(0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r23, -((0.9163F)-(0.9163F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r24, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r25, -((-0.7854F)-(-0.7854F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r26, -((0.3491F)-(0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((-0.2182F)-(-0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((0.0F)-(0.0F)), -((-0.0349F)-(0.0349F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((0.0F)-(0.0F)), -((-0.1134F)-(0.1134F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((-0.0086F)-(-0.0086F)), -((-0.1266F)-(0.1266F)),-((-0.0763F)-(0.0763F)));
        animator.rotate(cube_r7, -((0.0F)-(0.0F)), -((0.0349F)-(-0.0349F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((-0.2182F)-(-0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((0.0F)-(0.0F)), -((0.0349F)-(-0.0349F)),-((0.0F)-(0.0F)));
        animator.rotate(head, -((0.6109F)-(1.1345F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(lefthand, -((-0.1659F)-(3.1416F)), -((-1.0836F)-(0.4363F)),-((1.758F)-(0.0F)));
        animator.rotate(leftleg, -((0.8068F)-(0.4394F)), -((0.3073F)-(0.1739F)),-((-1.6308F)-(-0.0631F)));
        animator.rotate(leftleg2, -((0.6532F)-(1.0023F)), -((-0.0409F)-(-0.0409F)),-((0.0671F)-(0.0671F)));
        animator.rotate(leftleg3, -((-0.6527F)-(-2.2865F)), -((-0.0531F)-(-0.0637F)),-((-0.0693F)-(0.1195F)));
        animator.rotate(leftwing, -((0.0852F)-(0.0756F)), -((0.0189F)-(-0.0436F)),-((-1.6136F)-(-0.8743F)));
        animator.rotate(leftwing2, -((-0.0865F)-(0.1507F)), -((-0.0114F)-(0.0872F)),-((-0.1304F)-(0.7399F)));
        animator.rotate(leftwing3, -((-0.0872F)-(0.3459F)), -((-0.0038F)-(-0.0484F)),-((-0.0435F)-(0.0796F)));
        animator.rotate(leftwing4, -((-2.8362F)-(-0.4775F)), -((-0.0038F)-(0.0462F)),-((0.0435F)-(0.1645F)));
        animator.rotate(leftwing5, -((0.1742F)-(0.3482F)), -((0.0167F)-(0.0111F)),-((-0.0403F)-(-0.0474F)));
        animator.rotate(lw2membrane, -((0.0F)-(0.0F)), -((-0.1571F)-(-0.1571F)),-((0.0F)-(0.0F)));
        animator.rotate(lw2membrane2, -((-0.4796F)-(-0.4796F)), -((0.0167F)-(0.0167F)),-((0.0403F)-(0.0403F)));
        animator.rotate(lw2membrane3, -((0.0F)-(0.0F)), -((0.1571F)-(0.1571F)),-((0.0F)-(0.0F)));
        animator.rotate(lw2membrane4, -((-0.4796F)-(-0.4796F)), -((-0.0167F)-(-0.0167F)),-((-0.0403F)-(-0.0403F)));
        animator.rotate(lw3membrane, -((0.0F)-(0.0F)), -((-0.1789F)-(-0.1789F)),-((0.0F)-(0.0F)));
        animator.rotate(lw3membrane2, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(lw3membrane3, -((0.0F)-(0.0F)), -((0.1789F)-(0.1789F)),-((0.0F)-(0.0F)));
        animator.rotate(lw3membrane4, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(lw4membrane, -((0.0F)-(0.0F)), -((0.0873F)-(0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(lw4membrane2, -((0.0F)-(0.0F)), -((0.0873F)-(0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(lw4membrane3, -((0.0F)-(0.0F)), -((-0.0873F)-(-0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(lw4membrane4, -((0.0F)-(0.0F)), -((-0.0873F)-(-0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(lw5membrane2, -((0.0F)-(0.0F)), -((0.0873F)-(0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(lw5membrane4, -((0.0F)-(0.0F)), -((-0.0873F)-(-0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(lwmembrane, -((-0.145F)-(-0.145F)), -((0.0351F)-(0.0351F)),-((0.0636F)-(0.0636F)));
        animator.rotate(lwmembrane2, -((-0.145F)-(-0.145F)), -((-0.0351F)-(-0.0351F)),-((-0.0636F)-(-0.0636F)));
        animator.rotate(main, -((-0.3491F)-(-0.7418F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck, -((-0.2182F)-(-0.48F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(righthand, -((-0.1659F)-(3.1416F)), -((1.0836F)-(-0.4363F)),-((-1.758F)-(0.0F)));
        animator.rotate(rightleg, -((0.8068F)-(0.4394F)), -((-0.3073F)-(-0.1739F)),-((1.6308F)-(0.0631F)));
        animator.rotate(rightleg2, -((0.6532F)-(1.0023F)), -((0.0409F)-(0.0409F)),-((-0.0671F)-(-0.0671F)));
        animator.rotate(rightleg3, -((-0.6527F)-(-2.2865F)), -((0.0531F)-(0.0637F)),-((0.0693F)-(-0.1195F)));
        animator.rotate(rightwing, -((0.0852F)-(0.0756F)), -((-0.0189F)-(0.0436F)),-((1.6136F)-(0.8743F)));
        animator.rotate(rightwing2, -((-0.0865F)-(0.1507F)), -((0.0114F)-(-0.0872F)),-((0.1304F)-(-0.7399F)));
        animator.rotate(rightwing3, -((-0.0872F)-(0.3459F)), -((0.0038F)-(0.0484F)),-((0.0435F)-(-0.0796F)));
        animator.rotate(rightwing4, -((-2.8362F)-(-0.4775F)), -((0.0038F)-(-0.0462F)),-((-0.0435F)-(-0.1645F)));
        animator.rotate(rightwing5, -((0.1742F)-(0.3482F)), -((-0.0167F)-(-0.0111F)),-((0.0403F)-(0.0474F)));
        animator.rotate(tail, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(throat, -((-0.48F)-(-0.48F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));



        
        

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
