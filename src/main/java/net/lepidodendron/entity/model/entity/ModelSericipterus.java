package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSericipterus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelSericipterus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended leftleg;
    private final AdvancedModelRendererExtended leftleg2;
    private final AdvancedModelRendererExtended leftfoot;
    private final AdvancedModelRendererExtended leftlegwing;
    private final AdvancedModelRendererExtended leftlegwing2;
    private final AdvancedModelRendererExtended rightleg;
    private final AdvancedModelRendererExtended rightleg2;
    private final AdvancedModelRendererExtended rightfoot;
    private final AdvancedModelRendererExtended rightlegwing;
    private final AdvancedModelRendererExtended rightlegwing2;
    private final AdvancedModelRendererExtended leftwing;
    private final AdvancedModelRendererExtended leftwing2;
    private final AdvancedModelRendererExtended wingmembranebeg2;
    private final AdvancedModelRendererExtended wingmembraneend4;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended leftwing3;
    private final AdvancedModelRendererExtended wingmembranemiddle2;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended leftwing4;
    private final AdvancedModelRendererExtended wingmembraneend2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended lefthand;
    private final AdvancedModelRendererExtended rightwing;
    private final AdvancedModelRendererExtended rightwing2;
    private final AdvancedModelRendererExtended wingmembranebeg3;
    private final AdvancedModelRendererExtended wingmembraneend3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended rightwing3;
    private final AdvancedModelRendererExtended wingmembranemiddle3;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended rightwing4;
    private final AdvancedModelRendererExtended wingmembraneend5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended righthand;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended head4;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended cube_r22;

    private ModelAnimator animator;

    public ModelSericipterus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 12.5F, -5.7F);
        this.root.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 34, 0, -3.5F, -2.0F, -2.0F, 7, 8, 9, 0.0F, false));

        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, 0.3F, 3.2F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, -0.1571F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 45, 20, -2.5F, -2.0F, 3.0F, 5, 7, 5, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -0.075F, 6.8F);
        this.body1.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 55, -1.5F, -1.4545F, 0.001F, 3, 5, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.4455F, 4.601F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, -1.0F, -1.0F, 0.0F, 2, 2, 11, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.075F, 10.4F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0456F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 11, 46, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 8.7F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0456F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 22, 48, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.01F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 8.4F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0456F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 24, 37, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 34, 11, 0.0F, -2.5F, 7.0F, 0, 5, 6, 0.0F, false));

        this.leftleg = new AdvancedModelRendererExtended(this);
        this.leftleg.setRotationPoint(2.0F, 0.55F, 5.4F);
        this.body1.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.0F, 0.0F, -0.288F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 36, 37, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, true));

        this.leftleg2 = new AdvancedModelRendererExtended(this);
        this.leftleg2.setRotationPoint(0.1F, 3.7F, -0.3F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.5323F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 12, 26, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, true));

        this.leftfoot = new AdvancedModelRendererExtended(this);
        this.leftfoot.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.345F, 0.0655F, 0.2035F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 36, 62, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, true));

        this.leftlegwing = new AdvancedModelRendererExtended(this);
        this.leftlegwing.setRotationPoint(0.1F, 0.2F, 0.4F);
        this.leftleg2.addChild(leftlegwing);
        this.leftlegwing.cubeList.add(new ModelBox(leftlegwing, 18, 22, 0.0F, 0.0F, 0.0F, 0, 6, 3, 0.001F, true));

        this.leftlegwing2 = new AdvancedModelRendererExtended(this);
        this.leftlegwing2.setRotationPoint(0.3F, 0.0F, 0.9F);
        this.leftleg.addChild(leftlegwing2);
        this.leftlegwing2.cubeList.add(new ModelBox(leftlegwing2, 0, 0, -0.5F, 0.0F, 0.0F, 1, 4, 3, 0.0F, true));

        this.rightleg = new AdvancedModelRendererExtended(this);
        this.rightleg.setRotationPoint(-2.0F, 0.55F, 5.4F);
        this.body1.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.0F, 0.0F, 0.288F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 36, 37, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.rightleg2 = new AdvancedModelRendererExtended(this);
        this.rightleg2.setRotationPoint(-0.1F, 3.7F, -0.3F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.5323F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 12, 26, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, false));

        this.rightfoot = new AdvancedModelRendererExtended(this);
        this.rightfoot.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.345F, -0.0655F, -0.2035F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 36, 62, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, false));

        this.rightlegwing = new AdvancedModelRendererExtended(this);
        this.rightlegwing.setRotationPoint(-0.1F, 0.2F, 0.4F);
        this.rightleg2.addChild(rightlegwing);
        this.rightlegwing.cubeList.add(new ModelBox(rightlegwing, 18, 22, 0.0F, 0.0F, 0.0F, 0, 6, 3, 0.001F, false));

        this.rightlegwing2 = new AdvancedModelRendererExtended(this);
        this.rightlegwing2.setRotationPoint(-0.3F, 0.0F, 0.9F);
        this.rightleg.addChild(rightlegwing2);
        this.rightlegwing2.cubeList.add(new ModelBox(rightlegwing2, 0, 0, -0.5F, 0.0F, 0.0F, 1, 4, 3, 0.0F, false));

        this.leftwing = new AdvancedModelRendererExtended(this);
        this.leftwing.setRotationPoint(2.1F, -0.2F, -1.6F);
        this.chest.addChild(leftwing);
        this.setRotateAngle(leftwing, -0.0681F, -0.0436F, -0.0393F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 18, 25, -2.0F, -1.0F, -1.0F, 8, 2, 10, 0.0F, true));

        this.leftwing2 = new AdvancedModelRendererExtended(this);
        this.leftwing2.setRotationPoint(5.2F, 0.1F, -0.7F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -0.0497F, 0.1735F, -0.1108F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 16, 56, -0.5F, 0.0F, 0.0F, 1, 12, 3, 0.0F, true));

        this.wingmembranebeg2 = new AdvancedModelRendererExtended(this);
        this.wingmembranebeg2.setRotationPoint(-9.3F, 11.6F, 7.0F);
        this.leftwing2.addChild(wingmembranebeg2);
        this.wingmembranebeg2.cubeList.add(new ModelBox(wingmembranebeg2, 0, 22, 8.8F, -12.6F, -4.0F, 1, 13, 5, 0.0F, true));

        this.wingmembraneend4 = new AdvancedModelRendererExtended(this);
        this.wingmembraneend4.setRotationPoint(8.975F, -6.1F, 4.75F);
        this.wingmembranebeg2.addChild(wingmembraneend4);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.15F, 0.125F, -4.35F);
        this.wingmembraneend4.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1701F, -0.1986F, -0.0162F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 76, -8, 0.1155F, -8.8642F, -1.1665F, 0, 15, 8, 0.001F, false));

        this.leftwing3 = new AdvancedModelRendererExtended(this);
        this.leftwing3.setRotationPoint(0.075F, 11.9F, 0.05F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, -0.0092F, -0.0124F, 0.0687F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 37, 39, -0.5F, -3.0F, 0.0F, 1, 3, 9, 0.0F, true));

        this.wingmembranemiddle2 = new AdvancedModelRendererExtended(this);
        this.wingmembranemiddle2.setRotationPoint(-0.4F, -0.4F, 6.7F);
        this.leftwing3.addChild(wingmembranemiddle2);
        this.wingmembranemiddle2.cubeList.add(new ModelBox(wingmembranemiddle2, 0, 43, -0.1F, -5.575F, -6.7F, 1, 3, 9, -0.01F, true));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.65F, -4.375F, -1.85F);
        this.wingmembranemiddle2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.4033F, -0.0041F, -0.1741F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 77, 13, 0.0848F, -3.8949F, -0.4374F, 0, 8, 7, 0.001F, false));

        this.leftwing4 = new AdvancedModelRendererExtended(this);
        this.leftwing4.setRotationPoint(-0.1F, 0.0F, 8.7F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.1749F, -0.1341F, -0.0178F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 0, 25, -0.5F, -2.0F, 0.0F, 1, 2, 16, 0.0F, true));

        this.wingmembraneend2 = new AdvancedModelRendererExtended(this);
        this.wingmembraneend2.setRotationPoint(-0.3F, -0.4F, 4.0F);
        this.leftwing4.addChild(wingmembraneend2);
        this.wingmembraneend2.cubeList.add(new ModelBox(wingmembraneend2, 16, 6, -0.2F, -4.575F, -4.0F, 1, 3, 16, -0.01F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(1.45F, -4.45F, 1.0F);
        this.wingmembraneend2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1134F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 74, 14, -1.0F, -4.0F, -4.0F, 0, 5, 14, 0.0F, false));

        this.lefthand = new AdvancedModelRendererExtended(this);
        this.lefthand.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.leftwing3.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.1046F, -0.0038F, 0.0784F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 22, 43, -0.5F, -0.5F, 0.2F, 2, 1, 3, 0.0F, true));

        this.rightwing = new AdvancedModelRendererExtended(this);
        this.rightwing.setRotationPoint(-2.1F, -0.2F, -1.6F);
        this.chest.addChild(rightwing);
        this.setRotateAngle(rightwing, -0.0681F, 0.0436F, 0.0393F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 18, 25, -6.0F, -1.0F, -1.0F, 8, 2, 10, 0.0F, false));

        this.rightwing2 = new AdvancedModelRendererExtended(this);
        this.rightwing2.setRotationPoint(-5.2F, 0.1F, -0.7F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -0.0497F, -0.1735F, 0.1108F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 16, 56, -0.5F, 0.0F, 0.0F, 1, 12, 3, 0.0F, false));

        this.wingmembranebeg3 = new AdvancedModelRendererExtended(this);
        this.wingmembranebeg3.setRotationPoint(9.3F, 11.6F, 7.0F);
        this.rightwing2.addChild(wingmembranebeg3);
        this.wingmembranebeg3.cubeList.add(new ModelBox(wingmembranebeg3, 0, 22, -9.8F, -12.6F, -4.0F, 1, 13, 5, 0.0F, false));

        this.wingmembraneend3 = new AdvancedModelRendererExtended(this);
        this.wingmembraneend3.setRotationPoint(-8.975F, -6.1F, 4.75F);
        this.wingmembranebeg3.addChild(wingmembraneend3);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-0.15F, 0.125F, -4.35F);
        this.wingmembraneend3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1701F, 0.1986F, 0.0162F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 76, -8, -0.1155F, -8.8642F, -1.1665F, 0, 15, 8, 0.001F, true));

        this.rightwing3 = new AdvancedModelRendererExtended(this);
        this.rightwing3.setRotationPoint(-0.075F, 11.9F, 0.05F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, -0.0092F, 0.0124F, -0.0687F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 37, 39, -0.5F, -3.0F, 0.0F, 1, 3, 9, 0.0F, false));

        this.wingmembranemiddle3 = new AdvancedModelRendererExtended(this);
        this.wingmembranemiddle3.setRotationPoint(0.4F, -0.4F, 6.7F);
        this.rightwing3.addChild(wingmembranemiddle3);
        this.wingmembranemiddle3.cubeList.add(new ModelBox(wingmembranemiddle3, 0, 43, -0.9F, -5.575F, -6.7F, 1, 3, 9, -0.01F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-0.65F, -4.375F, -1.85F);
        this.wingmembranemiddle3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.4033F, 0.0041F, 0.1741F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 77, 13, -0.0848F, -3.8949F, -0.4374F, 0, 8, 7, 0.001F, true));

        this.rightwing4 = new AdvancedModelRendererExtended(this);
        this.rightwing4.setRotationPoint(0.1F, 0.0F, 8.7F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.1749F, 0.1341F, 0.0178F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 0, 25, -0.5F, -2.0F, 0.0F, 1, 2, 16, 0.0F, false));

        this.wingmembraneend5 = new AdvancedModelRendererExtended(this);
        this.wingmembraneend5.setRotationPoint(0.3F, -0.4F, 4.0F);
        this.rightwing4.addChild(wingmembraneend5);
        this.wingmembraneend5.cubeList.add(new ModelBox(wingmembraneend5, 16, 6, -0.8F, -4.575F, -4.0F, 1, 3, 16, -0.01F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-1.45F, -4.45F, 1.0F);
        this.wingmembraneend5.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1134F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 74, 14, 1.0F, -4.0F, -4.0F, 0, 5, 14, 0.0F, true));

        this.righthand = new AdvancedModelRendererExtended(this);
        this.righthand.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.rightwing3.addChild(righthand);
        this.setRotateAngle(righthand, 0.1046F, 0.0038F, -0.0784F);
        this.righthand.cubeList.add(new ModelBox(righthand, 22, 43, -1.5F, -0.5F, 0.2F, 2, 1, 3, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -1.3F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1309F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 15, 0, -2.0F, -2.0F, -4.0F, 4, 7, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3927F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 42, 51, -1.5F, -1.0F, -4.0F, 3, 6, 5, 0.0F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck2.addChild(head2);
        this.setRotateAngle(head2, 0.5105F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 57, 0, -2.0F, -1.0F, -3.0F, 4, 3, 4, 0.0F, false));

        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.1309F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 48, 32, -1.5F, -2.0F, -5.0F, 3, 2, 7, 0.003F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -4.5F, -2.0F);
        this.head3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, -3.05F, -9.7F, 0, 6, 16, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, -2.1928F, -1.3857F);
        this.head3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1527F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 44, -1.0F, -0.85F, -3.5F, 2, 1, 7, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.head3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 52, 56, -1.5F, 0.0F, 0.0F, 3, 1, 6, 0.0F, false));

        this.head4 = new AdvancedModelRendererExtended(this);
        this.head4.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.head3.addChild(head4);
        this.setRotateAngle(head4, -0.1309F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 18, 31, -1.0F, -1.6427F, -6.9156F, 2, 1, 3, -0.01F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.head4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0843F, 0.0226F, -0.2608F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 9, 0.75F, -0.4231F, -4.0564F, 0, 1, 4, 0.0F, true));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.925F, -0.7677F, -5.2156F);
        this.head4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.1745F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 11, -0.1F, -0.35F, -1.6F, 0, 1, 3, 0.0F, true));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.head4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0843F, -0.0226F, 0.2608F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 9, -0.75F, -0.4231F, -4.0564F, 0, 1, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.head4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 61, 28, -1.0F, -0.5F, -4.1F, 2, 1, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(-0.925F, -0.7677F, -5.2156F);
        this.head4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.1745F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 11, 0.1F, -0.35F, -1.6F, 0, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(-0.001F, -2.0008F, -7.0012F);
        this.head4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.144F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 22, -0.499F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 61, 33, -0.999F, 0.0F, 3.0F, 2, 1, 4, -0.003F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.head2.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 37, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 7, -1.0F, 0.9823F, -14.7156F, 2, 1, 3, -0.01F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.925F, 0.9823F, -13.2156F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.1309F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 6, 11, -0.1F, -0.6F, -1.4F, 0, 1, 3, 0.0F, true));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(-0.925F, 0.9823F, -13.2156F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.1309F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 6, 11, 0.1F, -0.6F, -1.4F, 0, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, 1.3686F, -5.9877F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1091F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 33, 51, -1.5F, -0.45F, -2.0F, 3, 1, 4, -0.01F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(0.0F, 1.5F, -2.5F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1309F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 60, 17, -1.5F, -1.1F, -1.5F, 3, 2, 4, -0.01F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.1309F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 24, 58, -1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 11, 14, -1.5F, 0.0F, -2.5F, 3, 1, 1, -0.001F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(0.9F, -0.0858F, -6.9327F);
        this.jaw2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.043F, 0.0076F, 0.1744F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 8, 9, 0.0F, -0.4995F, -2.0218F, 0, 1, 4, 0.0F, true));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(-0.9F, -0.0858F, -6.9327F);
        this.jaw2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.043F, -0.0076F, -0.1744F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 8, 9, 0.0F, -0.4995F, -2.0218F, 0, 1, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.jaw2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 48, 41, -1.0F, -1.0F, -4.0F, 2, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.root.offsetZ = -0.3F;
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.root.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.7F;
        this.root.offsetX = 0F;
        this.root.rotateAngleY = (float)Math.toRadians(125);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 1.5F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        //this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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

        AdvancedModelRenderer[] tailFull = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};

        float speed = 0.76F;

        //Animations:

        if (flier.isReallyFlying()) { //flying
            this.faceTarget(f3, f4, 8, neck);
            this.faceTarget(f3, f4, 8, neck2);
            this.faceTarget(f3, f4, 4, head2);

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
            this.faceTarget(f3, f4, 8, head2);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSericipterus ee = (EntityPrehistoricFloraSericipterus) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            this.setRotateAngle(body1, -0.1571F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.1701F, -0.1986F, -0.0162F);
            this.setRotateAngle(cube_r10, 0.0843F, 0.0226F, -0.2608F);
            this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.1745F);
            this.setRotateAngle(cube_r12, 0.0843F, -0.0226F, 0.2608F);
            this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.1745F);
            this.setRotateAngle(cube_r15, 0.144F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.1309F);
            this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.1309F);
            this.setRotateAngle(cube_r18, -0.1091F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r19, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, 1.4033F, -0.0041F, -0.1741F);
            this.setRotateAngle(cube_r20, -0.043F, 0.0076F, 0.1744F);
            this.setRotateAngle(cube_r21, -0.043F, -0.0076F, -0.1744F);
            this.setRotateAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.1134F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, -0.1701F, 0.1986F, 0.0162F);
            this.setRotateAngle(cube_r5, 1.4033F, 0.0041F, 0.1741F);
            this.setRotateAngle(cube_r6, -0.1134F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, 0.1527F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(head2, 0.5105F, 0.0F, 0.0F);
            this.setRotateAngle(head3, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(head4, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(jaw2, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(leftfoot, 0.7066F, 0.1162F, 0.3481F);
            this.setRotateAngle(lefthand, -0.01F, -0.0469F, 1.7805F);
            this.setRotateAngle(leftleg, 0.0F, 0.0F, -1.5403F);
            this.setRotateAngle(leftleg2, 0.7941F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing, -0.0681F, -0.0436F, -0.0393F);
            this.setRotateAngle(leftwing2, -0.1742F, -0.0106F, -1.631F);
            this.setRotateAngle(leftwing3, -1.3923F, -0.0124F, 0.0687F);
            this.setRotateAngle(leftwing4, 0.1321F, -0.1341F, -0.0178F);
            this.setRotateAngle(neck, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(rightfoot, 0.7066F, -0.1162F, -0.3481F);
            this.setRotateAngle(righthand, -0.01F, 0.0469F, -1.7805F);
            this.setRotateAngle(rightleg, 0.0F, 0.0F, 1.5403F);
            this.setRotateAngle(rightleg2, 0.7941F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing, -0.0681F, 0.0436F, 0.0393F);
            this.setRotateAngle(rightwing2, -0.1742F, 0.0106F, 1.631F);
            this.setRotateAngle(rightwing3, -1.3923F, 0.0124F, -0.0687F);
            this.setRotateAngle(rightwing4, 0.1321F, 0.1341F, 0.0178F);
            this.setRotateAngle(tail3, 0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(tail4, 0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(tail5, 0.0456F, 0.0F, 0.0F);


        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The model is already reset to default each cycle so no need to do more here
            }
            else {
                //Climb pose

            }
        }

        if (ee.getAttachmentPos() == null) { //set wing membranes to their proper scale for flight
            this.rightwing.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing2.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing3.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing4.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing2.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing3.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing4.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembranebeg2.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembranebeg3.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembraneend2.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembraneend4.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembraneend3.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembraneend5.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembranemiddle2.setScale((float) 1, (float) 1, (float) 1);
            this.wingmembranemiddle3.setScale((float) 1, (float) 1, (float) 1);


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
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The graze anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.PREEN_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSericipterus entity = (EntityPrehistoricFloraSericipterus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-10 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-10)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-0.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*1 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*1)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 1.25 + (((tickAnim - 18) / 22) * (0-(1.25)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 3.75 + (((tickAnim - 18) / 22) * (0-(3.75)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 3.75 + (((tickAnim - 18) / 22) * (0-(3.75)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 3) / 2) * (0-(0.425)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing.rotationPointX = this.leftwing.rotationPointX + (float)(xx);
        this.leftwing.rotationPointY = this.leftwing.rotationPointY - (float)(yy);
        this.leftwing.rotationPointZ = this.leftwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-12.5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-12.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-12.5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.wingmembranemiddle2.setScale((float)1,(float)0,(float)1);


        this.wingmembraneend2.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*7.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*7.5 + (((tickAnim - 5) / 15) * (8.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*7.5)));
            yy = 10 + (((tickAnim - 5) / 15) * (10-(10)));
            zz = 5 + (((tickAnim - 5) / 15) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 8.5 + (((tickAnim - 20) / 5) * (6.25-(8.5)));
            yy = 10 + (((tickAnim - 20) / 5) * (-10-(10)));
            zz = 5 + (((tickAnim - 20) / 5) * (-5-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 6.25 + (((tickAnim - 25) / 10) * (3.25-(6.25)));
            yy = -10 + (((tickAnim - 25) / 10) * (-10-(-10)));
            zz = -5 + (((tickAnim - 25) / 10) * (-5-(-5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 3.25 + (((tickAnim - 35) / 5) * (0-(3.25)));
            yy = -10 + (((tickAnim - 35) / 5) * (0-(-10)));
            zz = -5 + (((tickAnim - 35) / 5) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.5 + (((tickAnim - 5) / 15) * (-12-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.5)));
            yy = 10 + (((tickAnim - 5) / 15) * (10-(10)));
            zz = 5 + (((tickAnim - 5) / 15) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -12 + (((tickAnim - 20) / 5) * (-11.69148-(-12)));
            yy = 10 + (((tickAnim - 20) / 5) * (-7.64497-(10)));
            zz = 5 + (((tickAnim - 20) / 5) * (1.13144-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -11.69148 + (((tickAnim - 25) / 10) * (-11.69148-(-11.69148)));
            yy = -7.64497 + (((tickAnim - 25) / 10) * (-7.64497-(-7.64497)));
            zz = 1.13144 + (((tickAnim - 25) / 10) * (1.13144-(1.13144)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -11.69148 + (((tickAnim - 35) / 5) * (0-(-11.69148)));
            yy = -7.64497 + (((tickAnim - 35) / 5) * (0-(-7.64497)));
            zz = 1.13144 + (((tickAnim - 35) / 5) * (0-(1.13144)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.875-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            yy = -0.4 + (((tickAnim - 5) / 30) * (-0.4-(-0.4)));
            zz = 0.875 + (((tickAnim - 5) / 30) * (0.875-(0.875)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -0.4 + (((tickAnim - 35) / 5) * (0-(-0.4)));
            zz = 0.875 + (((tickAnim - 35) / 5) * (0-(0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 12 + (((tickAnim - 5) / 15) * (14.36-(12)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 14.36 + (((tickAnim - 20) / 5) * (0-(14.36)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(xx), head2.rotateAngleY + (float) Math.toRadians(yy), head2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*2 + (((tickAnim - 5) / 5) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*2)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*2-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*2 + (((tickAnim - 25) / 5) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*2)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.wingmembraneend4.rotationPointX = this.wingmembraneend4.rotationPointX + (float)(0);
        this.wingmembraneend4.rotationPointY = this.wingmembraneend4.rotationPointY - (float)(0);
        this.wingmembraneend4.rotationPointZ = this.wingmembraneend4.rotationPointZ + (float)(-7);
        this.wingmembraneend4.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-15 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-15)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 3) / 2) * (0-(0.425)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing.rotationPointX = this.rightwing.rotationPointX + (float)(xx);
        this.rightwing.rotationPointY = this.rightwing.rotationPointY - (float)(yy);
        this.rightwing.rotationPointZ = this.rightwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*12.5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*12.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*12.5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.wingmembraneend3.rotationPointX = this.wingmembraneend3.rotationPointX + (float)(0);
        this.wingmembraneend3.rotationPointY = this.wingmembraneend3.rotationPointY - (float)(0);
        this.wingmembraneend3.rotationPointZ = this.wingmembraneend3.rotationPointZ + (float)(-7);
        this.wingmembraneend3.setScale((float)0,(float)1,(float)0);


        this.wingmembranemiddle3.setScale((float)1,(float)0,(float)1);


        this.wingmembraneend5.setScale((float)1,(float)0,(float)1);


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSericipterus entity = (EntityPrehistoricFloraSericipterus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 5.5 + (((tickAnim - 7) / 8) * (0-(5.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (15.50798-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.33501-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-2.72953-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 15.50798 + (((tickAnim - 7) / 8) * (0-(15.50798)));
            yy = -0.33501 + (((tickAnim - 7) / 8) * (0-(-0.33501)));
            zz = -2.72953 + (((tickAnim - 7) / 8) * (0-(-2.72953)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.63-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 9.63 + (((tickAnim - 3) / 4) * (3-(9.63)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 3 + (((tickAnim - 7) / 4) * (10.75-(3)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 10.75 + (((tickAnim - 11) / 4) * (0-(10.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(xx), head2.rotateAngleY + (float) Math.toRadians(yy), head2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 13.75 + (((tickAnim - 7) / 4) * (0-(13.75)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSericipterus entity = (EntityPrehistoricFloraSericipterus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 2.5 + (((tickAnim - 3) / 5) * (-2-(2.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2 + (((tickAnim - 8) / 2) * (0-(-2)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 14.25 + (((tickAnim - 3) / 5) * (8.5-(14.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 8.5 + (((tickAnim - 8) / 2) * (0.25-(8.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -25.5 + (((tickAnim - 3) / 5) * (-20-(-25.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 8) / 2) * (0.5-(-20)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(xx), head2.rotateAngleY + (float) Math.toRadians(yy), head2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 8 + (((tickAnim - 3) / 5) * (19.75-(8)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.75 + (((tickAnim - 8) / 2) * (0-(19.75)));
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
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSericipterus entity = (EntityPrehistoricFloraSericipterus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 3.25 + (((tickAnim - 5) / 8) * (-0.75-(3.25)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -0.75 + (((tickAnim - 13) / 8) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 3.5 + (((tickAnim - 5) / 8) * (-3-(3.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -3 + (((tickAnim - 13) / 8) * (0-(-3)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 21) {
            xx = -11.25 + (((tickAnim - 5) / 16) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 5) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(xx), head2.rotateAngleY + (float) Math.toRadians(yy), head2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 4.25 + (((tickAnim - 5) / 8) * (14.25-(4.25)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 14.25 + (((tickAnim - 13) / 3) * (0-(14.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSericipterus entity = (EntityPrehistoricFloraSericipterus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 30) / 30) * (-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 60) / 10) * (-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2-(2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.5 + (((tickAnim - 60) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5 + (((tickAnim - 70) / 10) * (2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (5.7059+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 0) / 30) * (3.0234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20 + (((tickAnim - 0) / 30) * (-3.4734+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 5.7059+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-6.2558+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(5.7059+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 3.0234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-2.9215+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(3.0234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -3.4734+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 30) / 30) * (-3.8722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-3.4734+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -6.2558+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-6.2558+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -2.9215+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(-2.9215+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -3.8722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 60) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20-(-3.8722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing.rotationPointX = this.leftwing.rotationPointX + (float)(xx);
        this.leftwing.rotationPointY = this.leftwing.rotationPointY - (float)(yy);
        this.leftwing.rotationPointZ = this.leftwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.4984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (1.9255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-0.4984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.25 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*0.2105-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-13 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*2.8658-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-13)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 1.9255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(1.9255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*0.2105 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*0.2105)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*2.8658 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*2.8658)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (0.9968+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0007-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.9968+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (-0.4984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(0.9968+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0007 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0007)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-13-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 0) / 30) * (-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5-(-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-9-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-9 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-9)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 70) / 10) * (-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 30) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 0) / 30) * (-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5-(-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5 + (((tickAnim - 30) / 30) * (-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5-(-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5 + (((tickAnim - 60) / 10) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 70) / 10) * (-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(xx), head2.rotateAngleY + (float) Math.toRadians(yy), head2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5.2069 + (((tickAnim - 0) / 30) * (5.3272+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5.2069)));
            yy = -5.833+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 0) / 30) * (-2.468+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-5.833+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 4.3068+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20 + (((tickAnim - 0) / 30) * (7.0544+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(4.3068+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 5.3272+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-5.7484+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(5.3272+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -2.468+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (3.8752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(-2.468+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = 7.0544+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 30) / 30) * (8.8067+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(7.0544+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5.7484+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-5.7484+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 3.8752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(3.8752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 8.8067+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20-(8.8067+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5.2069-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 70) / 10) * (-5.833+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20 + (((tickAnim - 70) / 10) * (4.3068+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing.rotationPointX = this.rightwing.rotationPointX + (float)(xx);
        this.rightwing.rotationPointY = this.rightwing.rotationPointY - (float)(yy);
        this.rightwing.rotationPointZ = this.rightwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.2356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (7.2396+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-0.2356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -4.234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 0) / 30) * (2.3414+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-4.234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 0) / 30) * (-6.2093+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 7.2396+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-1.2684+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(7.2396+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = 2.3414+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (-3.9232+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(2.3414+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = -6.2093+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 30) / 30) * (0.7798+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(-6.2093+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -1.2684+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (0.4986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(-1.2684+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = -3.9232+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-3.9232+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 0.7798+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(0.7798+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.4986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (-0.2356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(0.4986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 70) / 10) * (-4.234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0.05726-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.14-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25 + (((tickAnim - 0) / 30) * (-5.0797+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0.05726 + (((tickAnim - 30) / 30) * (0-(0.05726)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.14 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.14)));
            zz = -5.0797+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 30) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(-5.0797+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));

        

    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSericipterus entity = (EntityPrehistoricFloraSericipterus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278+20))*-4), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+20))*3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+5))*5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278))*0.5);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*4), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-4), body1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));
        this.body1.rotationPointX = this.body1.rotationPointX + (float)(0);
        this.body1.rotationPointY = this.body1.rotationPointY - (float)(0);
        this.body1.rotationPointZ = this.body1.rotationPointZ + (float)(0);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(3.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*2), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-2), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-2), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-2), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17.25 + (((tickAnim - 0) / 4) * (-19.72869-(17.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (-2.93062-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-11.01792-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -19.72869 + (((tickAnim - 4) / 5) * (-27.95446-(-19.72869)));
            yy = -2.93062 + (((tickAnim - 4) / 5) * (-0.82496-(-2.93062)));
            zz = -11.01792 + (((tickAnim - 4) / 5) * (-2.14851-(-11.01792)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = -27.95446 + (((tickAnim - 9) / 16) * (17.25-(-27.95446)));
            yy = -0.82496 + (((tickAnim - 9) / 16) * (0-(-0.82496)));
            zz = -2.14851 + (((tickAnim - 9) / 16) * (0-(-2.14851)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            yy = -0.55 + (((tickAnim - 9) / 16) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-14.56025-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-9.60148-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-10.42836-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -14.56025 + (((tickAnim - 4) / 5) * (-10.5-(-14.56025)));
            yy = -9.60148 + (((tickAnim - 4) / 5) * (0-(-9.60148)));
            zz = -10.42836 + (((tickAnim - 4) / 5) * (0-(-10.42836)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = -10.5 + (((tickAnim - 9) / 16) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.2-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (2.675-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0.2 + (((tickAnim - 4) / 5) * (0-(0.2)));
            yy = 2.675 + (((tickAnim - 4) / 5) * (0.075-(2.675)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            yy = 0.075 + (((tickAnim - 9) / 8) * (0.375-(0.075)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0.375 + (((tickAnim - 17) / 8) * (0-(0.375)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (87.47499-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (8.25711-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (7.44598-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 87.47499 + (((tickAnim - 4) / 3) * (51.40717-(87.47499)));
            yy = 8.25711 + (((tickAnim - 4) / 3) * (-7.84301-(8.25711)));
            zz = 7.44598 + (((tickAnim - 4) / 3) * (23.99552-(7.44598)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 51.40717 + (((tickAnim - 7) / 2) * (42.23088-(51.40717)));
            yy = -7.84301 + (((tickAnim - 7) / 2) * (-12.94455-(-7.84301)));
            zz = 23.99552 + (((tickAnim - 7) / 2) * (0.96834-(23.99552)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 42.23088 + (((tickAnim - 9) / 4) * (28.86562-(42.23088)));
            yy = -12.94455 + (((tickAnim - 9) / 4) * (-10.17401-(-12.94455)));
            zz = 0.96834 + (((tickAnim - 9) / 4) * (4.11653-(0.96834)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 28.86562 + (((tickAnim - 13) / 4) * (19.59655-(28.86562)));
            yy = -10.17401 + (((tickAnim - 13) / 4) * (-6.71085-(-10.17401)));
            zz = 4.11653 + (((tickAnim - 13) / 4) * (8.05177-(4.11653)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 19.59655 + (((tickAnim - 17) / 8) * (0-(19.59655)));
            yy = -6.71085 + (((tickAnim - 17) / 8) * (0-(-6.71085)));
            zz = 8.05177 + (((tickAnim - 17) / 8) * (0-(8.05177)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.475 + (((tickAnim - 0) / 4) * (0-(0.475)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (-0.19-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0.475-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -0.19 + (((tickAnim - 7) / 2) * (0-(-0.19)));
            yy = 0.475 + (((tickAnim - 7) / 2) * (-0.775-(0.475)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.775 + (((tickAnim - 9) / 4) * (0.15-(-0.775)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.15 + (((tickAnim - 13) / 4) * (0.4-(0.15)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (-0.13-(0)));
            yy = 0.4 + (((tickAnim - 17) / 4) * (-0.265-(0.4)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -0.13 + (((tickAnim - 21) / 4) * (0-(-0.13)));
            yy = -0.265 + (((tickAnim - 21) / 4) * (0.475-(-0.265)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -1.3589 + (((tickAnim - 0) / 12) * (10.56049-(-1.3589)));
            yy = 21.40835 + (((tickAnim - 0) / 12) * (-32.52396-(21.40835)));
            zz = 17.92359 + (((tickAnim - 0) / 12) * (-0.25193-(17.92359)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 10.56049 + (((tickAnim - 12) / 7) * (-14.54991-(10.56049)));
            yy = -32.52396 + (((tickAnim - 12) / 7) * (-16.05565-(-32.52396)));
            zz = -0.25193 + (((tickAnim - 12) / 7) * (7.2736+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30-(-0.25193)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -14.54991 + (((tickAnim - 19) / 6) * (-1.3589-(-14.54991)));
            yy = -16.05565 + (((tickAnim - 19) / 6) * (21.40835-(-16.05565)));
            zz = 7.2736+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30 + (((tickAnim - 19) / 6) * (17.92359-(7.2736+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (1.7-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.625-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 1.7 + (((tickAnim - 12) / 13) * (0-(1.7)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0.625 + (((tickAnim - 12) / 13) * (0-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing.rotationPointX = this.leftwing.rotationPointX + (float)(xx);
        this.leftwing.rotationPointY = this.leftwing.rotationPointY - (float)(yy);
        this.leftwing.rotationPointZ = this.leftwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = -19.75 + (((tickAnim - 0) / 12) * (-0.61-(-19.75)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = -0.61 + (((tickAnim - 12) / 7) * (-14.25-(-0.61)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = -14.25 + (((tickAnim - 19) / 6) * (-19.75-(-14.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 7 + (((tickAnim - 0) / 12) * (-8.75-(7)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -8.75 + (((tickAnim - 12) / 7) * (-1.25-(-8.75)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -1.25 + (((tickAnim - 19) / 6) * (7-(-1.25)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0.175 + (((tickAnim - 0) / 25) * (0.175-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing3.rotationPointX = this.leftwing3.rotationPointX + (float)(xx);
        this.leftwing3.rotationPointY = this.leftwing3.rotationPointY - (float)(yy);
        this.leftwing3.rotationPointZ = this.leftwing3.rotationPointZ + (float)(zz);



        this.wingmembranemiddle2.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 4 + (((tickAnim - 0) / 12) * (22.25-(4)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 22.25 + (((tickAnim - 12) / 7) * (12.75-(22.25)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 12.75 + (((tickAnim - 19) / 6) * (4-(12.75)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));



        this.wingmembraneend2.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-3.25-(0)));
            yy = -1.75 + (((tickAnim - 0) / 12) * (15.5-(-1.75)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -3.25 + (((tickAnim - 12) / 7) * (-2.14763-(-3.25)));
            yy = 15.5 + (((tickAnim - 12) / 7) * (11.64358-(15.5)));
            zz = 0 + (((tickAnim - 12) / 7) * (58.40192-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -2.14763 + (((tickAnim - 19) / 6) * (0-(-2.14763)));
            yy = 11.64358 + (((tickAnim - 19) / 6) * (-1.75-(11.64358)));
            zz = 58.40192 + (((tickAnim - 19) / 6) * (0-(58.40192)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.85 + (((tickAnim - 0) / 6) * (0.69-(0.85)));
            yy = 0.525 + (((tickAnim - 0) / 6) * (1.165-(0.525)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0.69 + (((tickAnim - 6) / 6) * (0.52-(0.69)));
            yy = 1.165 + (((tickAnim - 6) / 6) * (-0.045-(1.165)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0.52 + (((tickAnim - 12) / 7) * (0.3-(0.52)));
            yy = -0.045 + (((tickAnim - 12) / 7) * (-0.2-(-0.045)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0.3 + (((tickAnim - 19) / 6) * (0.85-(0.3)));
            yy = -0.2 + (((tickAnim - 19) / 6) * (0.525-(-0.2)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278+30))*7), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0.7);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-80))*5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.2);


        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278))*-5), head2.rotateAngleY + (float) Math.toRadians(0), head2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -27.94323 + (((tickAnim - 0) / 11) * (17.25-(-27.94323)));
            yy = 1.16766 + (((tickAnim - 0) / 11) * (0-(1.16766)));
            zz = 1.60563 + (((tickAnim - 0) / 11) * (0-(1.60563)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 17.25 + (((tickAnim - 11) / 6) * (-23.79295-(17.25)));
            yy = 0 + (((tickAnim - 11) / 6) * (3.6981-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (10.42386-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -23.79295 + (((tickAnim - 17) / 5) * (-44.45446-(-23.79295)));
            yy = 3.6981 + (((tickAnim - 17) / 5) * (-0.82496-(3.6981)));
            zz = 10.42386 + (((tickAnim - 17) / 5) * (-2.14851-(10.42386)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -44.45446 + (((tickAnim - 22) / 3) * (-27.94323-(-44.45446)));
            yy = -0.82496 + (((tickAnim - 22) / 3) * (1.16766-(-0.82496)));
            zz = -2.14851 + (((tickAnim - 22) / 3) * (1.60563-(-2.14851)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.55 + (((tickAnim - 0) / 11) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(xx);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(yy);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -10.51122 + (((tickAnim - 0) / 11) * (0-(-10.51122)));
            yy = 0.68392 + (((tickAnim - 0) / 11) * (0-(0.68392)));
            zz = -1.87947 + (((tickAnim - 0) / 11) * (0-(-1.87947)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (-3.30111-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (-7.27848-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (9.29417-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -3.30111 + (((tickAnim - 17) / 5) * (13.74688-(-3.30111)));
            yy = -7.27848 + (((tickAnim - 17) / 5) * (-2.44753-(-7.27848)));
            zz = 9.29417 + (((tickAnim - 17) / 5) * (9.46796-(9.29417)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 13.74688 + (((tickAnim - 22) / 3) * (-10.51122-(13.74688)));
            yy = -2.44753 + (((tickAnim - 22) / 3) * (0.68392-(-2.44753)));
            zz = 9.46796 + (((tickAnim - 22) / 3) * (-1.87947-(9.46796)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 11) * (0-(0.075)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (1.425-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (-0.525-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 1.425 + (((tickAnim - 17) / 5) * (0-(1.425)));
            zz = -0.525 + (((tickAnim - 17) / 5) * (0-(-0.525)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0.075-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 41.93313 + (((tickAnim - 0) / 5) * (12.59065-(41.93313)));
            yy = 5.07892 + (((tickAnim - 0) / 5) * (1.0692-(5.07892)));
            zz = -4.20677 + (((tickAnim - 0) / 5) * (-4.96531-(-4.20677)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 12.59065 + (((tickAnim - 5) / 6) * (0-(12.59065)));
            yy = 1.0692 + (((tickAnim - 5) / 6) * (0-(1.0692)));
            zz = -4.96531 + (((tickAnim - 5) / 6) * (0-(-4.96531)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (50.08562-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (0.75485-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (-10.26378-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 50.08562 + (((tickAnim - 17) / 2) * (58.36552-(50.08562)));
            yy = 0.75485 + (((tickAnim - 17) / 2) * (-1.26737-(0.75485)));
            zz = -10.26378 + (((tickAnim - 17) / 2) * (-10.61447-(-10.26378)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 58.36552 + (((tickAnim - 19) / 3) * (41.81634-(58.36552)));
            yy = -1.26737 + (((tickAnim - 19) / 3) * (5.33435-(-1.26737)));
            zz = -10.61447 + (((tickAnim - 19) / 3) * (-15.95176-(-10.61447)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 41.81634 + (((tickAnim - 22) / 3) * (41.93313-(41.81634)));
            yy = 5.33435 + (((tickAnim - 22) / 3) * (5.07892-(5.33435)));
            zz = -15.95176 + (((tickAnim - 22) / 3) * (-4.20677-(-15.95176)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.21-(0)));
            yy = -0.775 + (((tickAnim - 0) / 3) * (0.405-(-0.775)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.21 + (((tickAnim - 3) / 2) * (0.15-(0.21)));
            yy = 0.405 + (((tickAnim - 3) / 2) * (0.06-(0.405)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.15 + (((tickAnim - 5) / 3) * (0.21-(0.15)));
            yy = 0.06 + (((tickAnim - 5) / 3) * (0.03-(0.06)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0.21 + (((tickAnim - 8) / 3) * (0-(0.21)));
            yy = 0.03 + (((tickAnim - 8) / 3) * (0-(0.03)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0.325-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0.325 + (((tickAnim - 19) / 3) * (0.45-(0.325)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.45 + (((tickAnim - 22) / 3) * (-0.775-(0.45)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);



        this.wingmembraneend4.rotationPointX = this.wingmembraneend4.rotationPointX + (float)(0);
        this.wingmembraneend4.rotationPointY = this.wingmembraneend4.rotationPointY - (float)(0);
        this.wingmembraneend4.rotationPointZ = this.wingmembraneend4.rotationPointZ + (float)(-6);
        this.wingmembraneend4.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 5.75 + (((tickAnim - 0) / 6) * (-12.7612-(5.75)));
            yy = 24.5 + (((tickAnim - 0) / 6) * (15.08787-(24.5)));
            zz = 0 + (((tickAnim - 0) / 6) * (16.0651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*30-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -12.7612 + (((tickAnim - 6) / 6) * (-1.3589-(-12.7612)));
            yy = 15.08787 + (((tickAnim - 6) / 6) * (-21.4083-(15.08787)));
            zz = 16.0651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*30 + (((tickAnim - 6) / 6) * (-17.9236-(16.0651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*30)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -1.3589 + (((tickAnim - 12) / 13) * (5.75-(-1.3589)));
            yy = -21.4083 + (((tickAnim - 12) / 13) * (24.5-(-21.4083)));
            zz = -17.9236 + (((tickAnim - 12) / 13) * (0-(-17.9236)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -1.75 + (((tickAnim - 0) / 12) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0.8 + (((tickAnim - 0) / 12) * (0-(0.8)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0.8-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing.rotationPointX = this.rightwing.rotationPointX + (float)(xx);
        this.rightwing.rotationPointY = this.rightwing.rotationPointY - (float)(yy);
        this.rightwing.rotationPointZ = this.rightwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -4.25 + (((tickAnim - 0) / 12) * (0-(-4.25)));
            zz = 0 + (((tickAnim - 0) / 12) * (19.75-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (-4.25-(0)));
            zz = 19.75 + (((tickAnim - 12) / 13) * (0-(19.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.wingmembraneend3.rotationPointX = this.wingmembraneend3.rotationPointX + (float)(0);
        this.wingmembraneend3.rotationPointY = this.wingmembraneend3.rotationPointY - (float)(0);
        this.wingmembraneend3.rotationPointZ = this.wingmembraneend3.rotationPointZ + (float)(-5.775);
        this.wingmembraneend3.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -1.75 + (((tickAnim - 8) / 4) * (7-(-1.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 7 + (((tickAnim - 12) / 13) * (0-(7)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.175-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0.175 + (((tickAnim - 12) / 13) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing3.rotationPointX = this.rightwing3.rotationPointX + (float)(xx);
        this.rightwing3.rotationPointY = this.rightwing3.rotationPointY - (float)(yy);
        this.rightwing3.rotationPointZ = this.rightwing3.rotationPointZ + (float)(zz);



        this.wingmembranemiddle3.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 11 + (((tickAnim - 0) / 12) * (4-(11)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 4 + (((tickAnim - 12) / 13) * (11-(4)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0.05 + (((tickAnim - 0) / 25) * (-0.05-(-0.05)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing4.rotationPointX = this.rightwing4.rotationPointX + (float)(xx);
        this.rightwing4.rotationPointY = this.rightwing4.rotationPointY - (float)(yy);
        this.rightwing4.rotationPointZ = this.rightwing4.rotationPointZ + (float)(zz);



        this.wingmembraneend5.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.51645-(0)));
            yy = -10.25 + (((tickAnim - 0) / 8) * (-14.08199-(-10.25)));
            zz = 0 + (((tickAnim - 0) / 8) * (-59.69663-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 1.51645 + (((tickAnim - 8) / 4) * (0.20649-(1.51645)));
            yy = -14.08199 + (((tickAnim - 8) / 4) * (-10.2456-(-14.08199)));
            zz = -59.69663 + (((tickAnim - 8) / 4) * (-0.57322-(-59.69663)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0.20649 + (((tickAnim - 12) / 6) * (-8.0948-(0.20649)));
            yy = -10.2456 + (((tickAnim - 12) / 6) * (-10.65986-(-10.2456)));
            zz = -0.57322 + (((tickAnim - 12) / 6) * (9.7612-(-0.57322)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -8.0948 + (((tickAnim - 18) / 7) * (0-(-8.0948)));
            yy = -10.65986 + (((tickAnim - 18) / 7) * (-10.25-(-10.65986)));
            zz = 9.7612 + (((tickAnim - 18) / 7) * (0-(9.7612)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.55-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0.55 + (((tickAnim - 12) / 6) * (1.4-(0.55)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 1.4 + (((tickAnim - 18) / 7) * (0-(1.4)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);



    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingFlyingWalkingBase e = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body1, -((-0.1571F)-(-0.1571F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((-0.1701F)-(-0.1701F)), -((-0.1986F)-(-0.1986F)),-((-0.0162F)-(-0.0162F)));
        animator.rotate(cube_r10, -((0.0843F)-(0.0843F)), -((0.0226F)-(0.0226F)),-((-0.2608F)-(-0.2608F)));
        animator.rotate(cube_r11, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.1745F)-(-0.1745F)));
        animator.rotate(cube_r12, -((0.0843F)-(0.0843F)), -((-0.0226F)-(-0.0226F)),-((0.2608F)-(0.2608F)));
        animator.rotate(cube_r13, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r14, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.1745F)-(0.1745F)));
        animator.rotate(cube_r15, -((0.144F)-(0.144F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.1309F)-(0.1309F)));
        animator.rotate(cube_r17, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.1309F)-(-0.1309F)));
        animator.rotate(cube_r18, -((-0.1091F)-(-0.1091F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r19, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((1.4033F)-(1.4033F)), -((-0.0041F)-(-0.0041F)),-((-0.1741F)-(-0.1741F)));
        animator.rotate(cube_r20, -((-0.043F)-(-0.043F)), -((0.0076F)-(0.0076F)),-((0.1744F)-(0.1744F)));
        animator.rotate(cube_r21, -((-0.043F)-(-0.043F)), -((-0.0076F)-(-0.0076F)),-((-0.1744F)-(-0.1744F)));
        animator.rotate(cube_r22, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((-0.1134F)-(-0.1134F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((-0.1701F)-(-0.1701F)), -((0.1986F)-(0.1986F)),-((0.0162F)-(0.0162F)));
        animator.rotate(cube_r5, -((1.4033F)-(1.4033F)), -((0.0041F)-(0.0041F)),-((0.1741F)-(0.1741F)));
        animator.rotate(cube_r6, -((-0.1134F)-(-0.1134F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((0.1527F)-(0.1527F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head2, -((0.5105F)-(0.5105F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head3, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head4, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw2, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftfoot, -((0.7066F)-(-0.345F)), -((0.1162F)-(0.0655F)),-((0.3481F)-(0.2035F)));
        animator.rotate(lefthand, -((-0.01F)-(0.1046F)), -((-0.0469F)-(-0.0038F)),-((1.7805F)-(0.0784F)));
        animator.rotate(leftleg, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-1.5403F)-(-0.288F)));
        animator.rotate(leftleg2, -((0.7941F)-(0.5323F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing, -((-0.0681F)-(-0.0681F)), -((-0.0436F)-(-0.0436F)),-((-0.0393F)-(-0.0393F)));
        animator.rotate(leftwing2, -((-0.1742F)-(-0.0497F)), -((-0.0106F)-(0.1735F)),-((-1.631F)-(-0.1108F)));
        animator.rotate(leftwing3, -((-1.3923F)-(-0.0092F)), -((-0.0124F)-(-0.0124F)),-((0.0687F)-(0.0687F)));
        animator.rotate(leftwing4, -((0.1321F)-(1.1749F)), -((-0.1341F)-(-0.1341F)),-((-0.0178F)-(-0.0178F)));
        animator.rotate(neck, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.3927F)-(-0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightfoot, -((0.7066F)-(-0.345F)), -((-0.1162F)-(-0.0655F)),-((-0.3481F)-(-0.2035F)));
        animator.rotate(righthand, -((-0.01F)-(0.1046F)), -((0.0469F)-(0.0038F)),-((-1.7805F)-(-0.0784F)));
        animator.rotate(rightleg, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((1.5403F)-(0.288F)));
        animator.rotate(rightleg2, -((0.7941F)-(0.5323F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing, -((-0.0681F)-(-0.0681F)), -((0.0436F)-(0.0436F)),-((0.0393F)-(0.0393F)));
        animator.rotate(rightwing2, -((-0.1742F)-(-0.0497F)), -((0.0106F)-(-0.1735F)),-((1.631F)-(0.1108F)));
        animator.rotate(rightwing3, -((-1.3923F)-(-0.0092F)), -((0.0124F)-(0.0124F)),-((-0.0687F)-(-0.0687F)));
        animator.rotate(rightwing4, -((0.1321F)-(1.1749F)), -((0.1341F)-(0.1341F)),-((0.0178F)-(0.0178F)));
        animator.rotate(tail3, -((0.0456F)-(0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail4, -((0.0456F)-(0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail5, -((0.0456F)-(0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body1, ((-0.1571F)-(-0.1571F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((-0.1701F)-(-0.1701F)), ((-0.1986F)-(-0.1986F)),((-0.0162F)-(-0.0162F)));
        animator.rotate(cube_r10, ((0.0843F)-(0.0843F)), ((0.0226F)-(0.0226F)),((-0.2608F)-(-0.2608F)));
        animator.rotate(cube_r11, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.1745F)-(-0.1745F)));
        animator.rotate(cube_r12, ((0.0843F)-(0.0843F)), ((-0.0226F)-(-0.0226F)),((0.2608F)-(0.2608F)));
        animator.rotate(cube_r13, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r14, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.1745F)-(0.1745F)));
        animator.rotate(cube_r15, ((0.144F)-(0.144F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.1309F)-(0.1309F)));
        animator.rotate(cube_r17, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.1309F)-(-0.1309F)));
        animator.rotate(cube_r18, ((-0.1091F)-(-0.1091F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r19, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((1.4033F)-(1.4033F)), ((-0.0041F)-(-0.0041F)),((-0.1741F)-(-0.1741F)));
        animator.rotate(cube_r20, ((-0.043F)-(-0.043F)), ((0.0076F)-(0.0076F)),((0.1744F)-(0.1744F)));
        animator.rotate(cube_r21, ((-0.043F)-(-0.043F)), ((-0.0076F)-(-0.0076F)),((-0.1744F)-(-0.1744F)));
        animator.rotate(cube_r22, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((-0.1134F)-(-0.1134F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((-0.1701F)-(-0.1701F)), ((0.1986F)-(0.1986F)),((0.0162F)-(0.0162F)));
        animator.rotate(cube_r5, ((1.4033F)-(1.4033F)), ((0.0041F)-(0.0041F)),((0.1741F)-(0.1741F)));
        animator.rotate(cube_r6, ((-0.1134F)-(-0.1134F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((0.1527F)-(0.1527F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head2, ((0.5105F)-(0.5105F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head3, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head4, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw2, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftfoot, ((0.7066F)-(-0.345F)), ((0.1162F)-(0.0655F)),((0.3481F)-(0.2035F)));
        animator.rotate(lefthand, ((-0.01F)-(0.1046F)), ((-0.0469F)-(-0.0038F)),((1.7805F)-(0.0784F)));
        animator.rotate(leftleg, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-1.5403F)-(-0.288F)));
        animator.rotate(leftleg2, ((0.7941F)-(0.5323F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing, ((-0.0681F)-(-0.0681F)), ((-0.0436F)-(-0.0436F)),((-0.0393F)-(-0.0393F)));
        animator.rotate(leftwing2, ((-0.1742F)-(-0.0497F)), ((-0.0106F)-(0.1735F)),((-1.631F)-(-0.1108F)));
        animator.rotate(leftwing3, ((-1.3923F)-(-0.0092F)), ((-0.0124F)-(-0.0124F)),((0.0687F)-(0.0687F)));
        animator.rotate(leftwing4, ((0.1321F)-(1.1749F)), ((-0.1341F)-(-0.1341F)),((-0.0178F)-(-0.0178F)));
        animator.rotate(neck, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.3927F)-(-0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightfoot, ((0.7066F)-(-0.345F)), ((-0.1162F)-(-0.0655F)),((-0.3481F)-(-0.2035F)));
        animator.rotate(righthand, ((-0.01F)-(0.1046F)), ((0.0469F)-(0.0038F)),((-1.7805F)-(-0.0784F)));
        animator.rotate(rightleg, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((1.5403F)-(0.288F)));
        animator.rotate(rightleg2, ((0.7941F)-(0.5323F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing, ((-0.0681F)-(-0.0681F)), ((0.0436F)-(0.0436F)),((0.0393F)-(0.0393F)));
        animator.rotate(rightwing2, ((-0.1742F)-(-0.0497F)), ((0.0106F)-(-0.1735F)),((1.631F)-(0.1108F)));
        animator.rotate(rightwing3, ((-1.3923F)-(-0.0092F)), ((0.0124F)-(0.0124F)),((-0.0687F)-(-0.0687F)));
        animator.rotate(rightwing4, ((0.1321F)-(1.1749F)), ((0.1341F)-(0.1341F)),((0.0178F)-(0.0178F)));
        animator.rotate(tail3, ((0.0456F)-(0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail4, ((0.0456F)-(0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail5, ((0.0456F)-(0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
