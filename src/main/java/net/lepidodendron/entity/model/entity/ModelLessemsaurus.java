package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLessemsaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelLessemsaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended basin;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended leftleg1;
    private final AdvancedModelRendererExtended leftleg2;
    private final AdvancedModelRendererExtended leftleg3;
    private final AdvancedModelRendererExtended leftleg4;
    private final AdvancedModelRendererExtended toes22;
    private final AdvancedModelRendererExtended rightleg1;
    private final AdvancedModelRendererExtended leftleg;
    private final AdvancedModelRendererExtended rightleg3;
    private final AdvancedModelRendererExtended rightleg4;
    private final AdvancedModelRendererExtended toes2;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended neck4;
    private final AdvancedModelRendererExtended head1;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended head4;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended head5;
    private final AdvancedModelRendererExtended jaw1;
    private final AdvancedModelRendererExtended gums1;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended jaw3;
    private final AdvancedModelRendererExtended jaw4;
    private final AdvancedModelRendererExtended leftarm1;
    private final AdvancedModelRendererExtended leftarm2;
    private final AdvancedModelRendererExtended leftarm3;
    private final AdvancedModelRendererExtended leftarm4;
    private final AdvancedModelRendererExtended thumb1_r1;
    private final AdvancedModelRendererExtended fingers1_r1;
    private final AdvancedModelRendererExtended rightarm5;
    private final AdvancedModelRendererExtended rightarm6;
    private final AdvancedModelRendererExtended rightarm7;
    private final AdvancedModelRendererExtended rightarm8;
    private final AdvancedModelRendererExtended thumb1_r2;
    private final AdvancedModelRendererExtended fingers1_r2;

    private ModelAnimator animator;

    public ModelLessemsaurus() {
        this.textureWidth = 156;
        this.textureHeight = 156;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.basin = new AdvancedModelRendererExtended(this);
        this.basin.setRotationPoint(0.0F, -9.8F, 12.1F);
        this.root.addChild(basin);
        this.setRotateAngle(basin, -0.0456F, 0.0F, 0.0F);
        this.basin.cubeList.add(new ModelBox(basin, 58, 0, -5.0F, -6.0F, 0.0F, 10, 18, 12, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -0.8F, 11.1F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, -0.0456F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 51, -3.1F, -4.8F, -1.1F, 6, 12, 23, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.4F, 20.6F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0456F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 58, 51, -2.5F, -4.0F, 0.0F, 5, 9, 23, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.7F, 21.8F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0456F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 38, 83, -2.1F, -3.0F, 0.0F, 4, 6, 20, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.6F, 19.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0911F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 35, 51, -1.5F, -2.0F, 0.0F, 3, 4, 16, 0.0F, false));

        this.leftleg1 = new AdvancedModelRendererExtended(this);
        this.leftleg1.setRotationPoint(-35.8F, 0.9F, 5.7F);
        this.basin.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.3643F, 0.0F, -0.0873F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 91, 46, 39.3402F, 3.4204F, -3.6959F, 5, 16, 11, 0.0F, false));

        this.leftleg2 = new AdvancedModelRendererExtended(this);
        this.leftleg2.setRotationPoint(0.2F, 13.3F, -2.2F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.9105F, 0.0F, 0.0436F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 51, 39.9495F, 2.0064F, -3.9577F, 4, 14, 7, 0.0F, false));

        this.leftleg3 = new AdvancedModelRendererExtended(this);
        this.leftleg3.setRotationPoint(0.1F, 12.7F, 0.7F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.5918F, 0.0F, 0.0436F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 50, 109, 40.3971F, 0.4003F, -2.7823F, 3, 9, 5, 0.0F, false));

        this.leftleg4 = new AdvancedModelRendererExtended(this);
        this.leftleg4.setRotationPoint(42.0673F, 8.2F, 0.0F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.0911F, -0.3491F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 80, 83, -2.5F, -0.855F, -3.2673F, 5, 3, 5, 0.0F, false));

        this.toes22 = new AdvancedModelRendererExtended(this);
        this.toes22.setRotationPoint(0.0F, 0.2F, -3.1673F);
        this.leftleg4.addChild(toes22);
        this.toes22.cubeList.add(new ModelBox(toes22, 112, 19, -2.5F, -1.055F, -3.0F, 5, 3, 4, -0.01F, false));

        this.rightleg1 = new AdvancedModelRendererExtended(this);
        this.rightleg1.setRotationPoint(-6.2F, 0.9F, 5.7F);
        this.basin.addChild(rightleg1);
        this.setRotateAngle(rightleg1, -0.3643F, 0.0F, 0.0873F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 91, 46, -2.5F, 0.0F, -5.0F, 5, 16, 11, 0.0F, true));

        this.leftleg = new AdvancedModelRendererExtended(this);
        this.leftleg.setRotationPoint(-0.2F, 13.3F, -2.2F);
        this.rightleg1.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.9105F, 0.0F, -0.0436F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 51, -2.0F, 0.0F, -3.5F, 4, 14, 7, 0.0F, true));

        this.rightleg3 = new AdvancedModelRendererExtended(this);
        this.rightleg3.setRotationPoint(-0.1F, 12.7F, 0.7F);
        this.leftleg.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.5918F, 0.0F, -0.0436F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 50, 109, -1.4F, 0.0F, -2.5F, 3, 9, 5, 0.0F, true));

        this.rightleg4 = new AdvancedModelRendererExtended(this);
        this.rightleg4.setRotationPoint(0.0F, 8.2F, 0.0F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.0911F, 0.3491F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 80, 83, -2.4F, -1.3F, -3.0F, 5, 3, 5, 0.0F, true));

        this.toes2 = new AdvancedModelRendererExtended(this);
        this.toes2.setRotationPoint(0.1F, 0.2F, -2.9F);
        this.rightleg4.addChild(toes2);
        this.toes2.cubeList.add(new ModelBox(toes2, 112, 19, -2.5F, -1.5F, -3.0F, 5, 3, 4, -0.01F, true));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 0.6F, 1.2F);
        this.basin.addChild(body);
        this.setRotateAngle(body, 0.0911F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -7.0F, -7.0F, -30.0F, 14, 21, 30, 0.0F, false));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, -2.3F, -29.6F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0911F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 86, -5.5F, -4.5F, -8.0F, 11, 19, 8, 0.0F, false));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, -0.7F, -5.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.48F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 87, 84, -2.5F, -3.1F, -13.0F, 5, 9, 15, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(-0.1F, 0.0F, -13.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 103, 1, -2.0F, -3.0F, -9.0F, 4, 7, 11, 0.01F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -7.8F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3054F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 127, -1.5F, -3.0F, -10.5F, 3, 6, 11, 0.0F, false));

        this.neck4 = new AdvancedModelRendererExtended(this);
        this.neck4.setRotationPoint(0.0F, 0.9F, -8.1F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.3054F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 57, 51, -1.5F, -3.9F, -8.4F, 3, 6, 9, -0.01F, false));

        this.head1 = new AdvancedModelRendererExtended(this);
        this.head1.setRotationPoint(0.0F, -2.6F, -8.4F);
        this.neck4.addChild(head1);
        this.setRotateAngle(head1, 0.0873F, 0.0F, 0.0F);
        this.head1.cubeList.add(new ModelBox(head1, 14, 113, -2.0F, -1.3F, -3.0F, 4, 3, 4, 0.0F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.1F, -0.5F, -3.0F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.0456F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 61, 118, -1.1F, -0.7F, -3.9F, 2, 3, 5, 0.0F, false));

        this.head4 = new AdvancedModelRendererExtended(this);
        this.head4.setRotationPoint(0.0F, -0.2F, -3.4F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.3187F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 15, 51, -0.6F, -0.5F, -3.0F, 1, 2, 3, 0.0F, false));

        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, 1.0F, -3.4F);
        this.head1.addChild(head3);
        this.setRotateAngle(head3, 0.1367F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 83, 92, -1.6F, -1.3F, -4.0F, 3, 2, 5, 0.0F, false));

        this.head5 = new AdvancedModelRendererExtended(this);
        this.head5.setRotationPoint(0.0F, 0.5F, -4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, -0.0911F, 0.0F, 0.0F);
        this.head5.cubeList.add(new ModelBox(head5, 58, 6, -1.0F, -1.8F, -2.1F, 2, 2, 3, 0.0F, false));

        this.jaw1 = new AdvancedModelRendererExtended(this);
        this.jaw1.setRotationPoint(0.1F, 1.7F, 0.6F);
        this.head1.addChild(jaw1);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 66, 97, -2.1F, 0.0F, -3.6F, 4, 2, 4, 0.0F, false));

        this.gums1 = new AdvancedModelRendererExtended(this);
        this.gums1.setRotationPoint(-0.1F, -2.5F, -2.9F);
        this.jaw1.addChild(gums1);
        this.setRotateAngle(gums1, -0.2731F, 0.0F, 0.0F);
        this.gums1.cubeList.add(new ModelBox(gums1, 58, 0, -1.5F, 0.0F, 0.0F, 3, 3, 3, 0.0F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 0.2F, -4.9F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.0911F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 15, 21, -1.6F, -0.1F, -2.2F, 3, 1, 4, 0.0F, false));

        this.jaw3 = new AdvancedModelRendererExtended(this);
        this.jaw3.setRotationPoint(-0.1F, 0.0F, -2.8F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.1367F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 17, 26, -1.0F, -0.3F, -2.3F, 2, 1, 3, 0.0F, false));

        this.jaw4 = new AdvancedModelRendererExtended(this);
        this.jaw4.setRotationPoint(-0.1F, 1.1F, 1.4F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.2065F, 0.0F, 0.0F);
        this.jaw4.cubeList.add(new ModelBox(jaw4, 15, 0, -1.0F, -0.4F, -3.7F, 2, 1, 5, 0.0F, false));

        this.leftarm1 = new AdvancedModelRendererExtended(this);
        this.leftarm1.setRotationPoint(5.5F, 10.2F, -4.8F);
        this.chest.addChild(leftarm1);
        this.setRotateAngle(leftarm1, 0.2618F, 0.0F, -0.1309F);
        this.leftarm1.cubeList.add(new ModelBox(leftarm1, 101, 108, -2.0F, -0.9F, -3.0F, 4, 13, 7, 0.0F, false));

        this.leftarm2 = new AdvancedModelRendererExtended(this);
        this.leftarm2.setRotationPoint(-0.2F, 8.7F, 0.8F);
        this.leftarm1.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.48F, 0.0F, -0.0436F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 32, 109, -1.5F, 0.5F, -2.0F, 3, 10, 6, 0.0F, false));

        this.leftarm3 = new AdvancedModelRendererExtended(this);
        this.leftarm3.setRotationPoint(-1.0F, 10.6F, 0.3F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, -0.1745F, 1.3526F, -0.0436F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 113, 89, -2.021F, -0.8841F, -1.3677F, 4, 5, 4, 0.0F, false));

        this.leftarm4 = new AdvancedModelRendererExtended(this);
        this.leftarm4.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.leftarm3.addChild(leftarm4);
        this.setRotateAngle(leftarm4, 0.0F, 0.0F, -1.4399F);


        this.thumb1_r1 = new AdvancedModelRendererExtended(this);
        this.thumb1_r1.setRotationPoint(0.0F, 0.3819F, -2.0021F);
        this.leftarm4.addChild(thumb1_r1);
        this.setRotateAngle(thumb1_r1, -0.6545F, 0.0F, 0.0F);
        this.thumb1_r1.cubeList.add(new ModelBox(thumb1_r1, 22, 13, -0.9871F, -0.9977F, 0.2691F, 2, 5, 2, -0.01F, false));

        this.fingers1_r1 = new AdvancedModelRendererExtended(this);
        this.fingers1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftarm4.addChild(fingers1_r1);
        this.setRotateAngle(fingers1_r1, 0.0873F, 0.0F, 0.0F);
        this.fingers1_r1.cubeList.add(new ModelBox(fingers1_r1, 0, 113, -0.9871F, 0.4674F, -2.253F, 2, 5, 5, -0.02F, false));

        this.rightarm5 = new AdvancedModelRendererExtended(this);
        this.rightarm5.setRotationPoint(-5.5F, 10.2F, -4.8F);
        this.chest.addChild(rightarm5);
        this.setRotateAngle(rightarm5, 0.2618F, 0.0F, 0.1309F);
        this.rightarm5.cubeList.add(new ModelBox(rightarm5, 101, 108, -2.0F, -0.9F, -3.0F, 4, 13, 7, 0.0F, true));

        this.rightarm6 = new AdvancedModelRendererExtended(this);
        this.rightarm6.setRotationPoint(0.2F, 8.7F, 0.8F);
        this.rightarm5.addChild(rightarm6);
        this.setRotateAngle(rightarm6, -0.48F, 0.0F, 0.0436F);
        this.rightarm6.cubeList.add(new ModelBox(rightarm6, 32, 109, -1.5F, 0.5F, -2.0F, 3, 10, 6, 0.0F, true));

        this.rightarm7 = new AdvancedModelRendererExtended(this);
        this.rightarm7.setRotationPoint(1.0F, 10.6F, 0.3F);
        this.rightarm6.addChild(rightarm7);
        this.setRotateAngle(rightarm7, -0.1745F, -1.3526F, 0.0436F);
        this.rightarm7.cubeList.add(new ModelBox(rightarm7, 113, 89, -1.979F, -0.8841F, -1.3677F, 4, 5, 4, 0.0F, true));

        this.rightarm8 = new AdvancedModelRendererExtended(this);
        this.rightarm8.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.rightarm7.addChild(rightarm8);
        this.setRotateAngle(rightarm8, 0.0F, 0.0F, 1.4399F);


        this.thumb1_r2 = new AdvancedModelRendererExtended(this);
        this.thumb1_r2.setRotationPoint(0.0F, 0.3819F, -2.0021F);
        this.rightarm8.addChild(thumb1_r2);
        this.setRotateAngle(thumb1_r2, -0.6545F, 0.0F, 0.0F);
        this.thumb1_r2.cubeList.add(new ModelBox(thumb1_r2, 22, 13, -1.0129F, -0.9977F, 0.2691F, 2, 5, 2, -0.01F, true));

        this.fingers1_r2 = new AdvancedModelRendererExtended(this);
        this.fingers1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightarm8.addChild(fingers1_r2);
        this.setRotateAngle(fingers1_r2, 0.0873F, 0.0F, 0.0F);
        this.fingers1_r2.cubeList.add(new ModelBox(fingers1_r2, 0, 113, -1.0129F, 0.4674F, -2.253F, 2, 5, 5, -0.02F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5 * 1.00f);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.disableCull();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.neck1.rotateAngleY = (float) Math.toRadians(-15);
        this.neck2.rotateAngleX = (float) Math.toRadians(-5);
        this.neck2.rotateAngleY = (float) Math.toRadians(-10);
        this.neck3.rotateAngleY = (float) Math.toRadians(-5);
        this.neck3.rotateAngleX = (float) Math.toRadians(7.5);
        this.neck4.rotateAngleY = (float) Math.toRadians(-5);
        this.neck4.rotateAngleX = (float) Math.toRadians(10);
        this.head1.rotateAngleX = (float) Math.toRadians(15);
        this.head1.rotateAngleY = (float) Math.toRadians(-10);
        this.jaw1.rotateAngleX = (float) Math.toRadians(35);
        this.neck1.render(0.01F);
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
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.root.offsetY = 0.11F;

        EntityPrehistoricFloraLessemsaurus Lessemsaurus = (EntityPrehistoricFloraLessemsaurus) e;
        float masterSpeed = Lessemsaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 6, neck4);
        this.faceTarget(f3, f4, 4, head1);

        AdvancedModelRendererExtended[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};

        float frontOffset = -0.07F;
        if (Lessemsaurus.getAnimation() == Lessemsaurus.LAY_ANIMATION) {
            this.swing(neck1, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck1, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.leftarm1.offsetY = frontOffset;
            this.rightarm5.offsetY = frontOffset;
            return;
         }

        if (f3 == 0.0F || !Lessemsaurus.getIsMoving()) { //Not moving
            this.swing(neck1, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck1, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            this.leftarm1.offsetY = frontOffset;
            this.rightarm5.offsetY = frontOffset;
            return;
        }

        float speed = masterSpeed / 2.225F;
        if (Lessemsaurus.getIsFast()) {
            speed = speed * 2;
        }

        this.leftarm1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F) + frontOffset;
        this.rightarm5.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F) + frontOffset;
        this.leftleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.5), false, 4, f2, 1.5F);
        this.rightleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.5), false, 1, f2, 1.5F);

        //this.flap(leftarm1, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        //this.flap(rightarm5, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        //this.flap(leftleg1, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        //this.flap(rightleg1, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(leftarm1, speed, 0.30F, true, 5, 0.20F, f2, 1F);
        this.walk(rightarm5, speed, 0.30F, true, 8, 0.20F, f2, 1F);
        this.walk(leftleg1, speed, 0.20F, true, 8, 0.10F, f2, 1F);
        this.walk(rightleg1, speed, 0.20F, true, 5, 0.10F, f2, 1F);

        this.walk(leftarm2, speed, 0.15F, true, 6, 0.10F, f2, 1F);
        this.walk(rightarm6, speed, 0.15F, true, 9, 0.10F, f2, 1F);
        this.walk(leftleg2, speed, 0.125F, true, 9, 0.08F, f2, 1F);
        //Next one is RIGHT leg!
        this.walk(leftleg, speed, 0.125F, true, 6, -0.08F, f2, 1F);

        //this.flap(leftarm2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        //this.flap(rightarm6, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        //this.flap(leftleg2, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        //Next one is RIGHT leg!
        //this.flap(leftleg, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        //no wrist move:
        //this.walk(leftarm3, speed, 0.15F, true, 2, -0.10F, f2, 1F);
        //this.walk(rightarm7, speed, 0.15F, true, 5, -0.10F, f2, 1F);

        this.flap(leftarm4, speed, 0.2F, false, 2.5F, 0.135F, f2, 1F);
        this.flap(rightarm8, speed, -0.2F, false, 5.5F, -0.135F, f2, 1F);

        this.walk(leftleg4, speed, 0.525F, true, 5, -0.45F, f2, 1F);
        this.walk(rightleg4, speed, 0.525F, true, 2, -0.45F, f2, 1F);

        this.walk(toes22, speed, 0.1F, true, 5.5F, 0.065F, f2, 1F);
        this.walk(toes2, speed, 0.1F, true, 2.5F, 0.065F, f2, 1F);

        this.bobExtended(root, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.flap(basin, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(body, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(chest, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
        this.flap(tail1, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);

        this.flap(leftleg1, speed, -0.06F, false, 5.0F,-0.03F, f2, 1.0F);
        this.flap(rightleg1, speed, -0.06F, false, 5.0F,-0.03F, f2, 1.0F);

        this.walk(chest, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck1, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck1, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.root.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(4.0), false, 1.5F, f2, 1);

        this.swing(basin, speed, 0.01F, false, 5.0F,0.005F, f2, 1.0F);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLessemsaurus e = (EntityPrehistoricFloraLessemsaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck4, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck4, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.NOISE_ANIMATION); //20 ticks
        animator.startKeyframe(7);
        animator.rotate(this.neck2, -(float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck3, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck4, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(7);
        animator.startKeyframe(7);
        animator.rotate(this.head1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(7);
        animator.resetKeyframe(7);

        animator.setAnimation(e.ROAR_ANIMATION); //duration 50
        animator.startKeyframe(4);
        animator.rotate(this.neck1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, -(float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, -(float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck4, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(5);
        animator.rotate(this.neck3, -(float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck4, -(float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.neck2, -(float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, -(float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck4, -(float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(8);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks

    }
}
