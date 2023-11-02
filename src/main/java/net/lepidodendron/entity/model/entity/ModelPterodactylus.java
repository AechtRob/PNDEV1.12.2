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
    
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) e;
        if (flier.isReallyFlying() || flier.getAnimation() == flier.UNFLY_ANIMATION) {
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

        } else if (flier.getAttachmentPos() != null) {
            if (flier.getAttachmentFacing() == EnumFacing.UP) {
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

        if (ee.getAttachmentPos() == null ) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Flying fast
                    //animFlyFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                else { //Flying regular
                    //animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
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
