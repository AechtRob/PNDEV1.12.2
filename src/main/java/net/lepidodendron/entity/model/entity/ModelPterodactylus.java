package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPterodactylus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelPterodactylus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended body1_r1;
    private final AdvancedModelRendererExtended leftleg;
    private final AdvancedModelRendererExtended leftleg2;
    private final AdvancedModelRendererExtended leftleg3;
    private final AdvancedModelRendererExtended leftlegmembrane;
    private final AdvancedModelRendererExtended leftleg_r1;
    private final AdvancedModelRendererExtended rightleg;
    private final AdvancedModelRendererExtended rightleg2;
    private final AdvancedModelRendererExtended rightleg3;
    private final AdvancedModelRendererExtended rightlegmembrane;
    private final AdvancedModelRendererExtended rightleg_r1;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended chest_r1;
    private final AdvancedModelRendererExtended leftwing;
    private final AdvancedModelRendererExtended leftwing2;
    private final AdvancedModelRendererExtended leftwing3;
    private final AdvancedModelRendererExtended leftwing4;
    private final AdvancedModelRendererExtended leftwing5;
    private final AdvancedModelRendererExtended handR2;
    private final AdvancedModelRendererExtended rightwing;
    private final AdvancedModelRendererExtended rightwing2;
    private final AdvancedModelRendererExtended rightwing3;
    private final AdvancedModelRendererExtended rightwing4;
    private final AdvancedModelRendererExtended rightwing5;
    private final AdvancedModelRendererExtended handR3;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended throat;
    private final AdvancedModelRendererExtended cube_r9;

    private ModelAnimator animator;

    public ModelPterodactylus() {
        this.textureWidth = 46;
        this.textureHeight = 46;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 17.0F, 2.0F);


        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, 2.25F, 1.75F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);


        this.body1_r1 = new AdvancedModelRendererExtended(this);
        this.body1_r1.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.body1.addChild(body1_r1);
        this.setRotateAngle(body1_r1, -0.2618F, 0.0F, 0.0F);
        this.body1_r1.cubeList.add(new ModelBox(body1_r1, 33, 26, -1.5F, -0.75F, -1.0F, 3, 2, 2, 0.0F, false));

        this.leftleg = new AdvancedModelRendererExtended(this);
        this.leftleg.setRotationPoint(1.0F, -0.45F, 0.8F);
        this.body1.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.4391F, -0.3715F, -0.6947F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 36, 31, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.leftleg2 = new AdvancedModelRendererExtended(this);
        this.leftleg2.setRotationPoint(0.0276F, 1.6927F, -0.4558F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.3264F, -0.3322F, 0.4417F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 37, -0.5694F, -0.1405F, -0.4998F, 1, 4, 1, 0.0F, false));

        this.leftleg3 = new AdvancedModelRendererExtended(this);
        this.leftleg3.setRotationPoint(-0.0694F, 3.4345F, -0.0498F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.4597F, 0.7739F, -0.1433F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 25, 33, -1.1124F, -0.4472F, -2.507F, 2, 1, 3, 0.0F, false));

        this.leftlegmembrane = new AdvancedModelRendererExtended(this);
        this.leftlegmembrane.setRotationPoint(0.0306F, -1.3655F, 0.4002F);
        this.leftleg2.addChild(leftlegmembrane);
        this.setRotateAngle(leftlegmembrane, -0.0911F, 0.0F, 0.0F);


        this.leftleg_r1 = new AdvancedModelRendererExtended(this);
        this.leftleg_r1.setRotationPoint(0.0F, 3.25F, 0.775F);
        this.leftlegmembrane.addChild(leftleg_r1);
        this.setRotateAngle(leftleg_r1, 0.0873F, 0.0F, 0.0F);
        this.leftleg_r1.cubeList.add(new ModelBox(leftleg_r1, 34, 36, 0.0F, -2.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.rightleg = new AdvancedModelRendererExtended(this);
        this.rightleg.setRotationPoint(-1.0F, -0.45F, 0.8F);
        this.body1.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.4391F, 0.3715F, 0.6947F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 36, 31, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.rightleg2 = new AdvancedModelRendererExtended(this);
        this.rightleg2.setRotationPoint(-0.0276F, 1.6927F, -0.4558F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.3264F, 0.3322F, -0.4417F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 37, -0.4306F, -0.1405F, -0.4998F, 1, 4, 1, 0.0F, true));

        this.rightleg3 = new AdvancedModelRendererExtended(this);
        this.rightleg3.setRotationPoint(0.0694F, 3.4345F, -0.0498F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.4597F, -0.7739F, 0.1433F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 25, 33, -0.8876F, -0.4472F, -2.507F, 2, 1, 3, 0.0F, true));

        this.rightlegmembrane = new AdvancedModelRendererExtended(this);
        this.rightlegmembrane.setRotationPoint(-0.0306F, -1.3655F, 0.4002F);
        this.rightleg2.addChild(rightlegmembrane);
        this.setRotateAngle(rightlegmembrane, -0.0911F, 0.0F, 0.0F);


        this.rightleg_r1 = new AdvancedModelRendererExtended(this);
        this.rightleg_r1.setRotationPoint(0.0F, 3.25F, 0.775F);
        this.rightlegmembrane.addChild(rightleg_r1);
        this.setRotateAngle(rightleg_r1, 0.0873F, 0.0F, 0.0F);
        this.rightleg_r1.cubeList.add(new ModelBox(rightleg_r1, 34, 36, 0.0F, -2.0F, -1.0F, 0, 3, 2, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -1.425F, 1.8F);
        this.body1.addChild(tail);
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 34, 12, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 0.5F, 2.05F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.0892F, 0.0F, 0.0F);


        this.chest_r1 = new AdvancedModelRendererExtended(this);
        this.chest_r1.setRotationPoint(0.0F, -0.5898F, -1.0305F);
        this.chest.addChild(chest_r1);
        this.setRotateAngle(chest_r1, -0.3054F, 0.0F, 0.0F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 16, 0, -2.0F, -0.1F, -3.5F, 4, 3, 5, 0.0F, false));

        this.leftwing = new AdvancedModelRendererExtended(this);
        this.leftwing.setRotationPoint(1.85F, -0.2898F, -4.6305F);
        this.chest.addChild(leftwing);
        this.setRotateAngle(leftwing, -0.3124F, -0.0215F, 0.213F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 10, 16, -0.5F, -0.5F, 0.0F, 4, 1, 4, 0.0F, false));

        this.leftwing2 = new AdvancedModelRendererExtended(this);
        this.leftwing2.setRotationPoint(2.45F, 0.05F, 0.4F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -0.4707F, 0.1588F, -0.5911F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 16, 29, -0.5F, 0.0F, 0.0F, 1, 4, 3, 0.0F, false));

        this.leftwing3 = new AdvancedModelRendererExtended(this);
        this.leftwing3.setRotationPoint(0.05F, 3.9F, -0.1F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, -0.8118F, -0.2253F, 0.1633F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 0, 30, -0.5F, -2.0573F, 0.0608F, 1, 2, 4, 0.0F, false));

        this.leftwing4 = new AdvancedModelRendererExtended(this);
        this.leftwing4.setRotationPoint(-0.05F, -0.0323F, 3.9858F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.6089F, -0.2053F, -0.015F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 10, 10, -0.5F, -2.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.leftwing5 = new AdvancedModelRendererExtended(this);
        this.leftwing5.setRotationPoint(-0.65F, -0.2F, 2.7F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.9993F, 0.011F, 0.1208F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 3, 3, 0.1222F, -1.882F, -0.0728F, 1, 2, 10, 0.003F, false));

        this.handR2 = new AdvancedModelRendererExtended(this);
        this.handR2.setRotationPoint(-0.05F, -0.4573F, 3.6608F);
        this.leftwing3.addChild(handR2);
        this.setRotateAngle(handR2, -1.5272F, 0.0F, 0.0F);
        this.handR2.cubeList.add(new ModelBox(handR2, 23, 38, -0.5F, -0.5F, 0.2F, 1, 1, 2, 0.0F, false));

        this.rightwing = new AdvancedModelRendererExtended(this);
        this.rightwing.setRotationPoint(-1.85F, -0.2898F, -4.6305F);
        this.chest.addChild(rightwing);
        this.setRotateAngle(rightwing, -0.3124F, 0.0215F, -0.213F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 10, 16, -3.5F, -0.5F, 0.0F, 4, 1, 4, 0.0F, true));

        this.rightwing2 = new AdvancedModelRendererExtended(this);
        this.rightwing2.setRotationPoint(-2.45F, 0.05F, 0.4F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -0.4707F, -0.1588F, 0.5911F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 16, 29, -0.5F, 0.0F, 0.0F, 1, 4, 3, 0.0F, true));

        this.rightwing3 = new AdvancedModelRendererExtended(this);
        this.rightwing3.setRotationPoint(-0.05F, 3.9F, -0.1F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, -0.8118F, 0.2253F, -0.1633F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 0, 30, -0.5F, -2.0573F, 0.0608F, 1, 2, 4, 0.0F, true));

        this.rightwing4 = new AdvancedModelRendererExtended(this);
        this.rightwing4.setRotationPoint(0.05F, -0.0323F, 3.9858F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.6089F, 0.2053F, 0.015F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 10, 10, -0.5F, -2.0F, 0.0F, 1, 2, 3, 0.0F, true));

        this.rightwing5 = new AdvancedModelRendererExtended(this);
        this.rightwing5.setRotationPoint(0.65F, -0.2F, 2.7F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.9993F, -0.011F, -0.1208F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 3, 3, -1.1222F, -1.882F, -0.0728F, 1, 2, 10, 0.003F, true));

        this.handR3 = new AdvancedModelRendererExtended(this);
        this.handR3.setRotationPoint(0.05F, -0.4573F, 3.6608F);
        this.rightwing3.addChild(handR3);
        this.setRotateAngle(handR3, -1.5272F, 0.0F, 0.0F);
        this.handR3.cubeList.add(new ModelBox(handR3, 23, 38, -0.5F, -0.5F, 0.2F, 1, 1, 2, 0.0F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -0.4398F, -3.5805F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.6109F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 25, 12, -1.0F, -0.7395F, -4.4772F, 2, 2, 4, -0.01F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, -0.7395F, -3.7272F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 32, 6, -1.0F, 0.0F, -2.75F, 2, 2, 3, -0.02F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.45F, -2.3F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.8727F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 33, 19, -1.0F, -0.616F, -2.567F, 2, 1, 3, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 0.1F, -0.566F, -1.867F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.1F, -0.566F, -1.867F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.384F, -2.567F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 22, -0.5F, -1.0F, -6.9F, 1, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 30, -1.0F, -1.0F, -1.9F, 2, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.7656F, -6.9067F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0791F, -0.0368F, 0.4349F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 26, 0.0F, -0.7769F, -2.5436F, 0, 1, 5, 0.0F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.5F, 0.7656F, -6.9067F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0791F, 0.0368F, -0.4349F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 26, 0.0F, -0.7769F, -2.5436F, 0, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -0.8035F, -1.2079F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 34, 0.0F, 0.8F, 0.5F, 0, 1, 3, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 16, 0.0F, -3.2F, -5.5F, 0, 4, 9, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -0.116F, -1.067F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 16, -0.5F, -0.7F, -1.55F, 1, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 0.3907F, -1.0549F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 0, -1.0F, -0.0068F, -1.537F, 2, 1, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 16, 9, -1.0F, -0.8068F, -1.612F, 2, 1, 2, -0.03F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -0.0068F, -1.512F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 21, -1.0F, 0.0F, -1.9F, 2, 1, 2, -0.012F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, 0.0F, -6.9F, 1, 1, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.5529F, -7.9313F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0852F, 0.0189F, -0.2174F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 19, 0.0F, -0.2481F, -0.4564F, 0, 1, 5, 0.0F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.5F, 0.5529F, -7.9313F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0852F, -0.0189F, 0.2174F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 19, 0.0F, -0.2481F, -0.4564F, 0, 1, 5, 0.0F, false));

        this.throat = new AdvancedModelRendererExtended(this);
        this.throat.setRotationPoint(0.0F, 1.0002F, -2.6988F);
        this.jaw.addChild(throat);


        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 0.493F, 2.6868F);
        this.throat.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3403F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 7, -1.0F, -0.625F, -2.375F, 2, 1, 4, -0.03F, false));

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

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0F;
        this.root.offsetX = 0F;
        this.root.rotateAngleY = (float)Math.toRadians(0);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 1.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
        this.setRotateAngle(body1_r1, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, 0.5633F, -0.0702F, -1.242F);
        this.setRotateAngle(leftleg2, 0.4808F, -0.2184F, 0.1965F);
        this.setRotateAngle(leftleg3, 1.2162F, 0.2407F, 0.2122F);
        this.setRotateAngle(leftlegmembrane, -0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg, 0.5633F, 0.0702F, 1.242F);
        this.setRotateAngle(rightleg2, 0.4808F, 0.2184F, -0.1965F);
        this.setRotateAngle(rightleg3, 1.2162F, -0.2407F, -0.2122F);
        this.setRotateAngle(rightlegmembrane, -0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(chest, -0.0892F, 0.0F, 0.0F);
        this.setRotateAngle(chest_r1, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(leftwing, -0.3044F, -0.0745F, 0.0466F);
        this.setRotateAngle(leftwing2, -0.2245F, -0.0123F, -1.6342F);
        this.setRotateAngle(leftwing3, -1.4832F, -0.0869F, -0.0076F);
        this.setRotateAngle(leftwing4, 0.1685F, -0.1181F, -0.0116F);
        this.setRotateAngle(leftwing5, 0.3065F, -0.0832F, -0.0263F);
        this.setRotateAngle(handR2, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing, -0.3044F, 0.0745F, -0.0466F);
        this.setRotateAngle(rightwing2, -0.2245F, 0.0123F, 1.6342F);
        this.setRotateAngle(rightwing3, -1.4832F, 0.0869F, 0.0076F);
        this.setRotateAngle(rightwing4, 0.1685F, 0.1181F, 0.0116F);
        this.setRotateAngle(rightwing5, 0.3065F, 0.0832F, 0.0263F);
        this.setRotateAngle(handR3, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0791F, -0.0368F, 0.4349F);
        this.setRotateAngle(cube_r3, 0.0791F, 0.0368F, -0.4349F);
        this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0852F, 0.0189F, -0.2174F);
        this.setRotateAngle(cube_r8, 0.0852F, -0.0189F, 0.2174F);
        this.setRotateAngle(cube_r9, -0.3403F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
            this.faceTarget(f3, f4, 8, neck);
            this.faceTarget(f3, f4, 8, neck2);
            this.faceTarget(f3, f4, 4, head);

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
            this.faceTarget(f3, f4, 8, head);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPterodactylus ee = (EntityPrehistoricFloraPterodactylus) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(body1_r1, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg, 0.5633F, -0.0702F, -1.242F);
            this.setRotateAngle(leftleg2, 0.4808F, -0.2184F, 0.1965F);
            this.setRotateAngle(leftleg3, 1.2162F, 0.2407F, 0.2122F);
            this.setRotateAngle(leftlegmembrane, -0.0911F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg_r1, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg, 0.5633F, 0.0702F, 1.242F);
            this.setRotateAngle(rightleg2, 0.4808F, 0.2184F, -0.1965F);
            this.setRotateAngle(rightleg3, 1.2162F, -0.2407F, -0.2122F);
            this.setRotateAngle(rightlegmembrane, -0.0911F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg_r1, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(chest, -0.0892F, 0.0F, 0.0F);
            this.setRotateAngle(chest_r1, -0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing, -0.3044F, -0.0745F, 0.0466F);
            this.setRotateAngle(leftwing2, -0.2245F, -0.0123F, -1.6342F);
            this.setRotateAngle(leftwing3, -1.4832F, -0.0869F, -0.0076F);
            this.setRotateAngle(leftwing4, 0.1685F, -0.1181F, -0.0116F);
            this.setRotateAngle(leftwing5, 0.3065F, -0.0832F, -0.0263F);
            this.setRotateAngle(handR2, -0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing, -0.3044F, 0.0745F, -0.0466F);
            this.setRotateAngle(rightwing2, -0.2245F, 0.0123F, 1.6342F);
            this.setRotateAngle(rightwing3, -1.4832F, 0.0869F, 0.0076F);
            this.setRotateAngle(rightwing4, 0.1685F, 0.1181F, 0.0116F);
            this.setRotateAngle(rightwing5, 0.3065F, 0.0832F, 0.0263F);
            this.setRotateAngle(handR3, -0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(neck, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.8727F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, 0.0791F, -0.0368F, 0.4349F);
            this.setRotateAngle(cube_r3, 0.0791F, 0.0368F, -0.4349F);
            this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.0852F, 0.0189F, -0.2174F);
            this.setRotateAngle(cube_r8, 0.0852F, -0.0189F, 0.2174F);
            this.setRotateAngle(cube_r9, -0.3403F, 0.0F, 0.0F);

        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The model is already reset to default each cycle so no need to do more here
            }
            else {
                //Climb pose
                this.setRotateAngle(root, 0.1745F, 0.0F, 0.0F);
                this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
                this.setRotateAngle(body1_r1, -0.2618F, 0.0F, 0.0F);
                this.setRotateAngle(rightleg, 0.546F, 0.1623F, 1.0927F);
                this.setRotateAngle(rightleg2, 0.427F, 0.3144F, -0.3997F);
                this.setRotateAngle(rightleg3, -0.5943F, -1.0489F, -0.2481F);
                this.setRotateAngle(rightlegmembrane, -0.0911F, 0.0F, 0.0F);
                this.setRotateAngle(rightleg_r1, 0.0873F, 0.0F, 0.0F);
                this.setRotateAngle(leftleg, 0.546F, -0.1623F, -1.0927F);
                this.setRotateAngle(leftleg2, 0.427F, -0.3144F, 0.3997F);
                this.setRotateAngle(leftleg3, -0.5943F, 1.0489F, 0.2481F);
                this.setRotateAngle(leftlegmembrane, -0.0911F, 0.0F, 0.0F);
                this.setRotateAngle(leftleg_r1, 0.0873F, 0.0F, 0.0F);
                this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
                this.setRotateAngle(chest, -0.0892F, 0.0F, 0.0F);
                this.setRotateAngle(chest_r1, -0.3054F, 0.0F, 0.0F);
                this.setRotateAngle(rightwing, -0.4763F, -0.3985F, -0.277F);
                this.setRotateAngle(rightwing2, -0.5549F, -0.2558F, 1.3426F);
                this.setRotateAngle(rightwing3, -1.4703F, -0.1991F, -0.2728F);
                this.setRotateAngle(rightwing4, 1.4338F, 0.1181F, 0.0116F);
                this.setRotateAngle(rightwing5, 1.5177F, 0.077F, -0.1049F);
                this.setRotateAngle(handR3, -0.5976F, -0.2849F, -0.3917F);
                this.setRotateAngle(leftwing, -0.4763F, 0.3985F, 0.277F);
                this.setRotateAngle(leftwing2, -0.5549F, 0.2558F, -1.3426F);
                this.setRotateAngle(leftwing3, -1.4703F, 0.1991F, 0.2728F);
                this.setRotateAngle(leftwing4, 1.4338F, -0.1181F, -0.0116F);
                this.setRotateAngle(leftwing5, 1.5177F, -0.077F, 0.1049F);
                this.setRotateAngle(handR2, -0.5976F, 0.2849F, 0.3917F);
                this.setRotateAngle(neck, -0.2182F, 0.0F, 0.0F);
                this.setRotateAngle(neck2, -0.1309F, 0.0F, 0.0F);
                this.setRotateAngle(head, 0.3927F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r2, 0.0791F, -0.0368F, 0.4349F);
                this.setRotateAngle(cube_r3, 0.0791F, 0.0368F, -0.4349F);
                this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r7, 0.0852F, 0.0189F, -0.2174F);
                this.setRotateAngle(cube_r8, 0.0852F, -0.0189F, 0.2174F);
                this.setRotateAngle(throat, 0.1745F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r9, -0.3403F, 0.0F, 0.0F);
            }
        }

        if (ee.getAttachmentPos() == null ) {
            //if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Flying fast
                    animFlyFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                else { //Flying regular
                    animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            //}
        }
        else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is Walking:
                if (ee.getIsMoving()) {
                    if (ee.getIsFast()) { //Walking fast
                        //animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else { //Walking regular
                        //animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }

            }
            else if (!ee.getHeadCollided()){
                //Climbing
                animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            //animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            //animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            //animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPterodactylus entity = (EntityPrehistoricFloraPterodactylus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 3) * (0.2-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.33-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 3) / 2) * (0-(0.2)));
            zz = -0.33 + (((tickAnim - 3) / 2) * (-0.5-(-0.33)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (-0.75-(0)));
            zz = -0.5 + (((tickAnim - 5) / 10) * (1-(-0.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.75 + (((tickAnim - 15) / 5) * (-0.2-(-0.75)));
            zz = 1 + (((tickAnim - 15) / 5) * (0-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), leftleg.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*2), leftleg.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2));


        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), leftleg2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*2), leftleg2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2));


        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5+2.5), leftleg3.rotateAngleY + (float) Math.toRadians(0), leftleg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), rightleg.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*2), rightleg.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2));


        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), rightleg2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*2), rightleg2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2));


        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5+2.5), rightleg3.rotateAngleY + (float) Math.toRadians(0), rightleg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2), leftwing.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*22+3), leftwing.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*20+5));


        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), leftwing2.rotateAngleY + (float) Math.toRadians(0), leftwing2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5-5));


        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-40))*8+10), leftwing3.rotateAngleY + (float) Math.toRadians(0), leftwing3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-10));


        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5), leftwing4.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-75))*10), leftwing4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*5-10), leftwing5.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*20), leftwing5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2), rightwing.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*22+3), rightwing.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*20+5));


        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), rightwing2.rotateAngleY + (float) Math.toRadians(0), rightwing2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5-5));


        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-40))*8+10), rightwing3.rotateAngleY + (float) Math.toRadians(0), rightwing3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-10));


        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5), rightwing4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-75))*10), rightwing4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*5-10), rightwing5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*20), rightwing5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 8) / 12) * (0-(5)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 11) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 18) / 2) * (0-(-5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animFlyFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPterodactylus entity = (EntityPrehistoricFloraPterodactylus) entitylivingbaseIn;
        int animCycle = 20;
        double speedMultiplier = 2.0;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) (animCycle / speedMultiplier)) * (double) (animCycle / speedMultiplier)) + partialTickTime;
        tickAnim = tickAnim * speedMultiplier;

        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 3) * (0.2-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.33-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 3) / 2) * (0-(0.2)));
            zz = -0.33 + (((tickAnim - 3) / 2) * (-0.5-(-0.33)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (-0.75-(0)));
            zz = -0.5 + (((tickAnim - 5) / 10) * (1-(-0.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.75 + (((tickAnim - 15) / 5) * (-0.2-(-0.75)));
            zz = 1 + (((tickAnim - 15) / 5) * (0-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), leftleg.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*2), leftleg.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2));


        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), leftleg2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*2), leftleg2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2));


        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5+2.5), leftleg3.rotateAngleY + (float) Math.toRadians(0), leftleg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), rightleg.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*2), rightleg.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2));


        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), rightleg2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*2), rightleg2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2));


        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5+2.5), rightleg3.rotateAngleY + (float) Math.toRadians(0), rightleg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2), leftwing.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*22+3), leftwing.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*20+5));


        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), leftwing2.rotateAngleY + (float) Math.toRadians(0), leftwing2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5-5));


        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-40))*8+10), leftwing3.rotateAngleY + (float) Math.toRadians(0), leftwing3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-10));


        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5), leftwing4.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-75))*10), leftwing4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*5-10), leftwing5.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*20), leftwing5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2), rightwing.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*22+3), rightwing.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*20+5));


        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), rightwing2.rotateAngleY + (float) Math.toRadians(0), rightwing2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5-5));


        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-40))*8+10), rightwing3.rotateAngleY + (float) Math.toRadians(0), rightwing3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-10));


        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5), rightwing4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-75))*10), rightwing4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*5-10), rightwing5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*20), rightwing5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 8) / 12) * (0-(5)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 11) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 18) / 2) * (0-(-5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPterodactylus entity = (EntityPrehistoricFloraPterodactylus) entitylivingbaseIn;
        int animCycle = 40;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -2 + (((tickAnim - 0) / 10) * (-2-(-2)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -2 + (((tickAnim - 10) / 10) * (0-(-2)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (2-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 2 + (((tickAnim - 30) / 10) * (-2-(2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 0) / 5) * (0.5-(-0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.5 + (((tickAnim - 5) / 5) * (0-(0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = -0.5 + (((tickAnim - 18) / 7) * (0.75-(-0.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0.75 + (((tickAnim - 25) / 5) * (0-(0.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = -0.5 + (((tickAnim - 38) / 2) * (-0.5-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -24.34 + (((tickAnim - 0) / 14) * (0-(-24.34)));
            yy = 0.7 + (((tickAnim - 0) / 14) * (0-(0.7)));
            zz = 3.08 + (((tickAnim - 0) / 14) * (0-(3.08)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (-58.69056-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (1.6976-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (7.4219-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -58.69056 + (((tickAnim - 20) / 20) * (-24.34-(-58.69056)));
            yy = 1.6976 + (((tickAnim - 20) / 20) * (0.7-(1.6976)));
            zz = 7.4219 + (((tickAnim - 20) / 20) * (3.08-(7.4219)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -17.56 + (((tickAnim - 0) / 14) * (-30-(-17.56)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -30 + (((tickAnim - 14) / 6) * (0-(-30)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (-17.56-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 37.71 + (((tickAnim - 0) / 14) * (31.6085-(37.71)));
            yy = 38.68 + (((tickAnim - 0) / 14) * (9.1655-(38.68)));
            zz = -22.83 + (((tickAnim - 0) / 14) * (-24.6702-(-22.83)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 31.6085 + (((tickAnim - 14) / 6) * (46.32298-(31.6085)));
            yy = 9.1655 + (((tickAnim - 14) / 6) * (80.3556-(9.1655)));
            zz = -24.6702 + (((tickAnim - 14) / 6) * (-20.2332-(-24.6702)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 46.32298 + (((tickAnim - 20) / 20) * (37.71-(46.32298)));
            yy = 80.3556 + (((tickAnim - 20) / 20) * (38.68-(80.3556)));
            zz = -20.2332 + (((tickAnim - 20) / 20) * (-22.83-(-20.2332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = -58.69056 + (((tickAnim - 0) / 34) * (0-(-58.69056)));
            yy = -1.69759 + (((tickAnim - 0) / 34) * (0-(-1.69759)));
            zz = -7.42189 + (((tickAnim - 0) / 34) * (0-(-7.42189)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (-58.69056-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (-1.69759-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (-7.42189-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -30 + (((tickAnim - 34) / 6) * (0-(-30)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 46.32298 + (((tickAnim - 0) / 34) * (31.6085-(46.32298)));
            yy = -80.35555 + (((tickAnim - 0) / 34) * (-9.16551-(-80.35555)));
            zz = 20.23324 + (((tickAnim - 0) / 34) * (24.67017-(20.23324)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 31.6085 + (((tickAnim - 34) / 6) * (46.32298-(31.6085)));
            yy = -9.16551 + (((tickAnim - 34) / 6) * (-80.35555-(-9.16551)));
            zz = 24.67017 + (((tickAnim - 34) / 6) * (20.23324-(24.67017)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlegmembrane, leftlegmembrane.rotateAngleX + (float) Math.toRadians(xx), leftlegmembrane.rotateAngleY + (float) Math.toRadians(yy), leftlegmembrane.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 27.13 + (((tickAnim - 0) / 10) * (40.70129-(27.13)));
            yy = 44.07 + (((tickAnim - 0) / 10) * (66.1105-(44.07)));
            zz = 39.78 + (((tickAnim - 0) / 10) * (59.6737-(39.78)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 40.70129 + (((tickAnim - 10) / 6) * (1.3373-(40.70129)));
            yy = 66.1105 + (((tickAnim - 10) / 6) * (30.4277-(66.1105)));
            zz = 59.6737 + (((tickAnim - 10) / 6) * (42.2246-(59.6737)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 1.3373 + (((tickAnim - 16) / 4) * (0-(1.3373)));
            yy = 30.4277 + (((tickAnim - 16) / 4) * (0-(30.4277)));
            zz = 42.2246 + (((tickAnim - 16) / 4) * (0-(42.2246)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (27.13-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (44.07-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (39.78-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5.67 + (((tickAnim - 0) / 10) * (-11.70638-(-5.67)));
            yy = -6.86 + (((tickAnim - 0) / 10) * (-11.3368-(-6.86)));
            zz = -34.65 + (((tickAnim - 0) / 10) * (-54.3071-(-34.65)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -11.70638 + (((tickAnim - 10) / 6) * (-4.88-(-11.70638)));
            yy = -11.3368 + (((tickAnim - 10) / 6) * (-4.72-(-11.3368)));
            zz = -54.3071 + (((tickAnim - 10) / 6) * (-22.63-(-54.3071)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -4.88 + (((tickAnim - 16) / 4) * (6.40105-(-4.88)));
            yy = -4.72 + (((tickAnim - 16) / 4) * (2.1017-(-4.72)));
            zz = -22.63 + (((tickAnim - 16) / 4) * (4.6682-(-22.63)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 6.40105 + (((tickAnim - 20) / 20) * (-5.67-(6.40105)));
            yy = 2.1017 + (((tickAnim - 20) / 20) * (-6.86-(2.1017)));
            zz = 4.6682 + (((tickAnim - 20) / 20) * (-34.65-(4.6682)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -18.33 + (((tickAnim - 0) / 10) * (-16.67-(-18.33)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -16.67 + (((tickAnim - 10) / 5) * (16.66-(-16.67)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 16.66 + (((tickAnim - 15) / 5) * (0-(16.66)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-20-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -20 + (((tickAnim - 30) / 10) * (-18.33-(-20)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR3, handR3.rotateAngleX + (float) Math.toRadians(xx), handR3.rotateAngleY + (float) Math.toRadians(yy), handR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (40.70129-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-66.11053-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-59.67368-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 40.70129 + (((tickAnim - 30) / 6) * (1.3373-(40.70129)));
            yy = -66.11053 + (((tickAnim - 30) / 6) * (-30.42773-(-66.11053)));
            zz = -59.67368 + (((tickAnim - 30) / 6) * (-42.22459-(-59.67368)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 1.3373 + (((tickAnim - 36) / 4) * (0-(1.3373)));
            yy = -30.42773 + (((tickAnim - 36) / 4) * (0-(-30.42773)));
            zz = -42.22459 + (((tickAnim - 36) / 4) * (0-(-42.22459)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 6.40105 + (((tickAnim - 0) / 30) * (-11.70638-(6.40105)));
            yy = -2.10171 + (((tickAnim - 0) / 30) * (11.33677-(-2.10171)));
            zz = -4.66821 + (((tickAnim - 0) / 30) * (54.3071-(-4.66821)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -11.70638 + (((tickAnim - 30) / 6) * (-4.88-(-11.70638)));
            yy = 11.33677 + (((tickAnim - 30) / 6) * (4.72-(11.33677)));
            zz = 54.3071 + (((tickAnim - 30) / 6) * (22.63-(54.3071)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -4.88 + (((tickAnim - 36) / 4) * (6.40105-(-4.88)));
            yy = 4.72 + (((tickAnim - 36) / 4) * (-2.10171-(4.72)));
            zz = 22.63 + (((tickAnim - 36) / 4) * (-4.66821-(22.63)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (20-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = 20 + (((tickAnim - 10) / 20) * (16.67-(20)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 16.67 + (((tickAnim - 30) / 5) * (-16.66-(16.67)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -16.66 + (((tickAnim - 35) / 5) * (0-(-16.66)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR2, handR2.rotateAngleX + (float) Math.toRadians(xx), handR2.rotateAngleY + (float) Math.toRadians(yy), handR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -4 + (((tickAnim - 13) / 12) * (-5-(-4)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 25) / 10) * (-5-(-5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 35) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = -4 + (((tickAnim - 9) / 10) * (-5-(-4)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 19) / 11) * (-5-(-5)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 30) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 26) / 14) * (0-(10)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingFlyingWalkingBase e = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(root, ((0.2618F)-(0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(body1, ((-0.0456F)-(-0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(body1_r1, ((-0.2618F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftleg, ((0.5633F)-(0.4391F)), ((-0.0702F)-(-0.3715F)),((-1.242F)-(-0.6947F)));
        animator.rotate(leftleg2, ((0.4808F)-(0.3264F)), ((-0.2184F)-(-0.3322F)),((0.1965F)-(0.4417F)));
        animator.rotate(leftleg3, ((1.2162F)-(-0.4597F)), ((0.2407F)-(0.7739F)),((0.2122F)-(-0.1433F)));
        animator.rotate(leftlegmembrane, ((-0.0911F)-(-0.0911F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftleg_r1, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightleg, ((0.5633F)-(0.4391F)), ((0.0702F)-(0.3715F)),((1.242F)-(0.6947F)));
        animator.rotate(rightleg2, ((0.4808F)-(0.3264F)), ((0.2184F)-(0.3322F)),((-0.1965F)-(-0.4417F)));
        animator.rotate(rightleg3, ((1.2162F)-(-0.4597F)), ((-0.2407F)-(-0.7739F)),((-0.2122F)-(0.1433F)));
        animator.rotate(rightlegmembrane, ((-0.0911F)-(-0.0911F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightleg_r1, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail, ((-0.3054F)-(-0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(chest, ((-0.0892F)-(-0.0892F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(chest_r1, ((-0.3054F)-(-0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing, ((-0.3044F)-(-0.3124F)), ((-0.0745F)-(-0.0215F)),((0.0466F)-(0.213F)));
        animator.rotate(leftwing2, ((-0.2245F)-(-0.4707F)), ((-0.0123F)-(0.1588F)),((-1.6342F)-(-0.5911F)));
        animator.rotate(leftwing3, ((-1.4832F)-(-0.8118F)), ((-0.0869F)-(-0.2253F)),((-0.0076F)-(0.1633F)));
        animator.rotate(leftwing4, ((0.1685F)-(1.6089F)), ((-0.1181F)-(-0.2053F)),((-0.0116F)-(-0.015F)));
        animator.rotate(leftwing5, ((0.3065F)-(0.9993F)), ((-0.0832F)-(0.011F)),((-0.0263F)-(0.1208F)));
        animator.rotate(handR2, ((-0.3054F)-(-1.5272F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing, ((-0.3044F)-(-0.3124F)), ((0.0745F)-(0.0215F)),((-0.0466F)-(-0.213F)));
        animator.rotate(rightwing2, ((-0.2245F)-(-0.4707F)), ((0.0123F)-(-0.1588F)),((1.6342F)-(0.5911F)));
        animator.rotate(rightwing3, ((-1.4832F)-(-0.8118F)), ((0.0869F)-(0.2253F)),((0.0076F)-(-0.1633F)));
        animator.rotate(rightwing4, ((0.1685F)-(1.6089F)), ((0.1181F)-(0.2053F)),((0.0116F)-(0.015F)));
        animator.rotate(rightwing5, ((0.3065F)-(0.9993F)), ((0.0832F)-(-0.011F)),((0.0263F)-(-0.1208F)));
        animator.rotate(handR3, ((-0.3054F)-(-1.5272F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck, ((-0.3927F)-(-0.6109F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.3491F)-(0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head, ((0.8727F)-(0.8727F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((0.0791F)-(0.0791F)), ((-0.0368F)-(-0.0368F)),((0.4349F)-(0.4349F)));
        animator.rotate(cube_r3, ((0.0791F)-(0.0791F)), ((0.0368F)-(0.0368F)),((-0.4349F)-(-0.4349F)));
        animator.rotate(cube_r4, ((0.1047F)-(0.1047F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((0.0852F)-(0.0852F)), ((0.0189F)-(0.0189F)),((-0.2174F)-(-0.2174F)));
        animator.rotate(cube_r8, ((0.0852F)-(0.0852F)), ((-0.0189F)-(-0.0189F)),((0.2174F)-(0.2174F)));
        animator.rotate(cube_r9, ((-0.3403F)-(-0.3403F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(root, -((0.2618F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(body1, -((-0.0456F)-(-0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(body1_r1, -((-0.2618F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftleg, -((0.5633F)-(0.4391F)), -((-0.0702F)-(-0.3715F)),-((-1.242F)-(-0.6947F)));
        animator.rotate(leftleg2, -((0.4808F)-(0.3264F)), -((-0.2184F)-(-0.3322F)),-((0.1965F)-(0.4417F)));
        animator.rotate(leftleg3, -((1.2162F)-(-0.4597F)), -((0.2407F)-(0.7739F)),-((0.2122F)-(-0.1433F)));
        animator.rotate(leftlegmembrane, -((-0.0911F)-(-0.0911F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftleg_r1, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightleg, -((0.5633F)-(0.4391F)), -((0.0702F)-(0.3715F)),-((1.242F)-(0.6947F)));
        animator.rotate(rightleg2, -((0.4808F)-(0.3264F)), -((0.2184F)-(0.3322F)),-((-0.1965F)-(-0.4417F)));
        animator.rotate(rightleg3, -((1.2162F)-(-0.4597F)), -((-0.2407F)-(-0.7739F)),-((-0.2122F)-(0.1433F)));
        animator.rotate(rightlegmembrane, -((-0.0911F)-(-0.0911F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightleg_r1, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail, -((-0.3054F)-(-0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(chest, -((-0.0892F)-(-0.0892F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(chest_r1, -((-0.3054F)-(-0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing, -((-0.3044F)-(-0.3124F)), -((-0.0745F)-(-0.0215F)),-((0.0466F)-(0.213F)));
        animator.rotate(leftwing2, -((-0.2245F)-(-0.4707F)), -((-0.0123F)-(0.1588F)),-((-1.6342F)-(-0.5911F)));
        animator.rotate(leftwing3, -((-1.4832F)-(-0.8118F)), -((-0.0869F)-(-0.2253F)),-((-0.0076F)-(0.1633F)));
        animator.rotate(leftwing4, -((0.1685F)-(1.6089F)), -((-0.1181F)-(-0.2053F)),-((-0.0116F)-(-0.015F)));
        animator.rotate(leftwing5, -((0.3065F)-(0.9993F)), -((-0.0832F)-(0.011F)),-((-0.0263F)-(0.1208F)));
        animator.rotate(handR2, -((-0.3054F)-(-1.5272F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing, -((-0.3044F)-(-0.3124F)), -((0.0745F)-(0.0215F)),-((-0.0466F)-(-0.213F)));
        animator.rotate(rightwing2, -((-0.2245F)-(-0.4707F)), -((0.0123F)-(-0.1588F)),-((1.6342F)-(0.5911F)));
        animator.rotate(rightwing3, -((-1.4832F)-(-0.8118F)), -((0.0869F)-(0.2253F)),-((0.0076F)-(-0.1633F)));
        animator.rotate(rightwing4, -((0.1685F)-(1.6089F)), -((0.1181F)-(0.2053F)),-((0.0116F)-(0.015F)));
        animator.rotate(rightwing5, -((0.3065F)-(0.9993F)), -((0.0832F)-(-0.011F)),-((0.0263F)-(-0.1208F)));
        animator.rotate(handR3, -((-0.3054F)-(-1.5272F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck, -((-0.3927F)-(-0.6109F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.3491F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head, -((0.8727F)-(0.8727F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((0.0791F)-(0.0791F)), -((-0.0368F)-(-0.0368F)),-((0.4349F)-(0.4349F)));
        animator.rotate(cube_r3, -((0.0791F)-(0.0791F)), -((0.0368F)-(0.0368F)),-((-0.4349F)-(-0.4349F)));
        animator.rotate(cube_r4, -((0.1047F)-(0.1047F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((0.0852F)-(0.0852F)), -((0.0189F)-(0.0189F)),-((-0.2174F)-(-0.2174F)));
        animator.rotate(cube_r8, -((0.0852F)-(0.0852F)), -((-0.0189F)-(-0.0189F)),-((0.2174F)-(0.2174F)));
        animator.rotate(cube_r9, -((-0.3403F)-(-0.3403F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
