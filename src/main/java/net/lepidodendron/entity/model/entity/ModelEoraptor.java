package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEoraptor;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelEoraptor extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended basin;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended head1;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended head4;
    private final AdvancedModelRendererExtended teeth1;
    private final AdvancedModelRendererExtended teeth2;
    private final AdvancedModelRendererExtended jaw1;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended jaw3;
    private final AdvancedModelRendererExtended teeth3;
    private final AdvancedModelRendererExtended teeth21;
    private final AdvancedModelRendererExtended gums;
    private final AdvancedModelRendererExtended crest;
    private final AdvancedModelRendererExtended feather5;
    private final AdvancedModelRendererExtended feather4;
    private final AdvancedModelRendererExtended upperarm1;
    private final AdvancedModelRendererExtended arm1;
    private final AdvancedModelRendererExtended hand1;
    private final AdvancedModelRendererExtended armfeather1;
    private final AdvancedModelRendererExtended upperarm2;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended hand2;
    private final AdvancedModelRendererExtended armfeather2;
    private final AdvancedModelRendererExtended feather1;
    private final AdvancedModelRendererExtended feather2;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended feathers9;
    private final AdvancedModelRendererExtended feathers6;
    private final AdvancedModelRendererExtended upperleg1;
    private final AdvancedModelRendererExtended leg1;
    private final AdvancedModelRendererExtended feet1;
    private final AdvancedModelRendererExtended toe1;
    private final AdvancedModelRendererExtended upperleg2;
    private final AdvancedModelRendererExtended leg2;
    private final AdvancedModelRendererExtended feet2;
    private final AdvancedModelRendererExtended toe2;
    private final AdvancedModelRendererExtended feathers3;

    private ModelAnimator animator;

    public ModelEoraptor() {
        this.textureWidth = 120;
        this.textureHeight = 135;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.basin = new AdvancedModelRendererExtended(this);
        this.basin.setRotationPoint(0.0F, -1.7F, -1.4F);
        this.root.addChild(basin);
        this.basin.cubeList.add(new ModelBox(basin, 51, 1, -2.5F, 0.0F, 0.0F, 5, 8, 8, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 4.1F, 0.0F);
        this.basin.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 22, 5, -3.0F, -4.5F, -14.0F, 6, 9, 14, 0.0F, false));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, -0.6F, -12.6F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 0, -2.5F, -3.5F, -4.0F, 5, 7, 4, 0.0F, false));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, -0.6F, -2.5F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2731F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 85, 3, -2.0F, -2.0F, -6.0F, 4, 4, 6, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.1F, -4.5F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.5009F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 95, 17, -1.5F, -2.0F, -5.0F, 3, 4, 5, 0.0F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, -0.1F, -3.9F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.2731F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 77, 19, -1.0F, -2.0F, -4.0F, 2, 4, 4, 0.0F, false));

        this.head1 = new AdvancedModelRendererExtended(this);
        this.head1.setRotationPoint(0.0F, -1.1F, -3.4F);
        this.neck3.addChild(head1);
        this.setRotateAngle(head1, 0.5918F, 0.0F, -0.0115F);
        this.head1.cubeList.add(new ModelBox(head1, 77, 39, -1.5F, -1.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, 1.0F, -3.7F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.0456F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 77, 49, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, -1.4F, 0.6F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.1367F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 90, 42, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.head4 = new AdvancedModelRendererExtended(this);
        this.head4.setRotationPoint(0.0F, 0.2F, -3.8F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, -1.8213F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 93, 52, -0.5F, 0.0F, -1.2F, 1, 1, 2, 0.0F, false));

        this.teeth1 = new AdvancedModelRendererExtended(this);
        this.teeth1.setRotationPoint(0.5F, 0.4F, -2.1F);
        this.head2.addChild(teeth1);
        this.setRotateAngle(teeth1, -0.0456F, 0.1367F, 0.0F);
        this.teeth1.cubeList.add(new ModelBox(teeth1, 0, 12, 0.0F, 0.0F, -2.5F, 0, 1, 5, 0.0F, false));

        this.teeth2 = new AdvancedModelRendererExtended(this);
        this.teeth2.setRotationPoint(-0.5F, 0.4F, -2.1F);
        this.head2.addChild(teeth2);
        this.setRotateAngle(teeth2, -0.0456F, -0.1367F, 0.0F);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 0, 12, 0.0F, 0.0F, -2.5F, 0, 1, 5, 0.0F, false));

        this.jaw1 = new AdvancedModelRendererExtended(this);
        this.jaw1.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.head1.addChild(jaw1);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 75, 65, -1.5F, 0.0F, -4.0F, 3, 1, 4, -0.01F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 0.5F, -3.8F);
        this.jaw1.addChild(jaw2);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 75, 73, -1.0F, -0.5F, -3.0F, 2, 1, 3, -0.01F, false));

        this.jaw3 = new AdvancedModelRendererExtended(this);
        this.jaw3.setRotationPoint(0.0F, 0.0F, -2.6F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.0456F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 75, 79, -0.5F, -0.5F, -2.0F, 1, 1, 2, -0.01F, false));

        this.teeth3 = new AdvancedModelRendererExtended(this);
        this.teeth3.setRotationPoint(0.5F, 0.1F, -1.9F);
        this.jaw2.addChild(teeth3);
        this.setRotateAngle(teeth3, -0.0911F, 0.1367F, 0.0F);
        this.teeth3.cubeList.add(new ModelBox(teeth3, 0, 12, 0.0F, -1.0F, -2.5F, 0, 1, 5, 0.0F, false));

        this.teeth21 = new AdvancedModelRendererExtended(this);
        this.teeth21.setRotationPoint(-0.5F, 0.1F, -1.9F);
        this.jaw2.addChild(teeth21);
        this.setRotateAngle(teeth21, -0.0456F, -0.1367F, 0.0F);
        this.teeth21.cubeList.add(new ModelBox(teeth21, 0, 12, 0.0F, -1.0F, -2.5F, 0, 1, 5, 0.0F, false));

        this.gums = new AdvancedModelRendererExtended(this);
        this.gums.setRotationPoint(0.0F, 0.3F, -1.4F);
        this.jaw1.addChild(gums);
        this.setRotateAngle(gums, -0.1367F, 0.0F, 0.0F);
        this.gums.cubeList.add(new ModelBox(gums, 105, 58, -1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F, false));

        this.crest = new AdvancedModelRendererExtended(this);
        this.crest.setRotationPoint(0.0F, -1.4F, -2.5F);
        this.neck3.addChild(crest);
        this.setRotateAngle(crest, 0.0911F, 0.0F, 0.0F);
        this.crest.cubeList.add(new ModelBox(crest, 2, 35, 0.0F, -2.0F, -2.5F, 0, 4, 6, 0.0F, false));

        this.feather5 = new AdvancedModelRendererExtended(this);
        this.feather5.setRotationPoint(0.0F, 1.7F, -2.0F);
        this.neck2.addChild(feather5);
        this.feather5.cubeList.add(new ModelBox(feather5, 22, 60, -1.0F, 0.0F, -2.5F, 2, 1, 5, 0.0F, false));

        this.feather4 = new AdvancedModelRendererExtended(this);
        this.feather4.setRotationPoint(0.0F, 2.0F, -2.9F);
        this.neck1.addChild(feather4);
        this.feather4.cubeList.add(new ModelBox(feather4, 21, 70, -1.5F, 0.0F, -3.0F, 3, 1, 6, 0.0F, false));

        this.upperarm1 = new AdvancedModelRendererExtended(this);
        this.upperarm1.setRotationPoint(2.4F, 2.6F, -2.4F);
        this.chest.addChild(upperarm1);
        this.setRotateAngle(upperarm1, 0.6109F, 0.1367F, 0.0F);
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 53, 50, -1.0F, 0.0F, -1.0F, 2, 5, 3, 0.0F, false));

        this.arm1 = new AdvancedModelRendererExtended(this);
        this.arm1.setRotationPoint(0.0F, 4.2F, 0.7F);
        this.upperarm1.addChild(arm1);
        this.setRotateAngle(arm1, -0.8517F, 0.0F, 0.0F);
        this.arm1.cubeList.add(new ModelBox(arm1, 52, 61, -1.2F, 0.0F, -1.5F, 2, 5, 3, 0.0F, false));

        this.hand1 = new AdvancedModelRendererExtended(this);
        this.hand1.setRotationPoint(0.0F, 4.8F, 0.0F);
        this.arm1.addChild(hand1);
        this.setRotateAngle(hand1, 0.0F, 0.0F, 0.2731F);
        this.hand1.cubeList.add(new ModelBox(hand1, 52, 72, -0.5F, 0.0F, -1.5F, 1, 5, 3, 0.0F, false));

        this.armfeather1 = new AdvancedModelRendererExtended(this);
        this.armfeather1.setRotationPoint(0.7F, 2.5F, 0.0F);
        this.arm1.addChild(armfeather1);


        this.upperarm2 = new AdvancedModelRendererExtended(this);
        this.upperarm2.setRotationPoint(-2.4F, 2.6F, -2.4F);
        this.chest.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.6109F, -0.1367F, 0.0F);
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 40, 50, -1.0F, 0.0F, -1.0F, 2, 5, 3, 0.0F, false));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(0.3F, 4.2F, 0.7F);
        this.upperarm2.addChild(arm2);
        this.setRotateAngle(arm2, -0.8517F, 0.0F, 0.0F);
        this.arm2.cubeList.add(new ModelBox(arm2, 40, 61, -1.2F, 0.0F, -1.5F, 2, 5, 3, 0.0F, false));

        this.hand2 = new AdvancedModelRendererExtended(this);
        this.hand2.setRotationPoint(-0.4F, 4.6F, 0.0F);
        this.arm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.0F, 0.0F, -0.2731F);
        this.hand2.cubeList.add(new ModelBox(hand2, 40, 72, -0.5F, 0.0F, -1.5F, 1, 5, 3, 0.0F, false));

        this.armfeather2 = new AdvancedModelRendererExtended(this);
        this.armfeather2.setRotationPoint(-0.1F, 2.5F, 0.0F);
        this.arm2.addChild(armfeather2);


        this.feather1 = new AdvancedModelRendererExtended(this);
        this.feather1.setRotationPoint(0.0F, 3.3F, -1.6F);
        this.chest.addChild(feather1);
        this.feather1.cubeList.add(new ModelBox(feather1, 90, 65, -2.0F, 0.0F, -2.0F, 4, 2, 4, 0.0F, false));

        this.feather2 = new AdvancedModelRendererExtended(this);
        this.feather2.setRotationPoint(0.0F, 4.3F, 0.0F);
        this.body.addChild(feather2);
        this.feather2.cubeList.add(new ModelBox(feather2, 12, 81, -2.5F, 0.0F, -14.0F, 5, 2, 14, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, 3.4F, 6.9F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, -0.0122F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 19, -2.0F, -3.0F, 0.0F, 4, 5, 12, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.6F, 10.8F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0456F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 51, 19, -1.5F, -2.0F, 0.0F, 3, 4, 13, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.3F, 12.8F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0911F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 31, -1.0F, -2.0F, 0.0F, 2, 3, 13, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.6F, 11.6F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1367F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 4, 40, -0.5F, -1.0F, 0.0F, 1, 2, 14, 0.0F, false));

        this.feathers9 = new AdvancedModelRendererExtended(this);
        this.feathers9.setRotationPoint(0.0F, -0.6F, 0.2F);
        this.tail4.addChild(feathers9);
        this.feathers9.cubeList.add(new ModelBox(feathers9, 50, 99, -0.5F, -0.4F, 13.7413F, 1, 1, 6, 0.0F, false));

        this.feathers6 = new AdvancedModelRendererExtended(this);
        this.feathers6.setRotationPoint(0.0F, 1.2F, 5.9F);
        this.tail1.addChild(feathers6);
        this.feathers6.cubeList.add(new ModelBox(feathers6, 54, 83, -1.5F, 0.0F, -6.0F, 3, 2, 12, 0.0F, false));

        this.upperleg1 = new AdvancedModelRendererExtended(this);
        this.upperleg1.setRotationPoint(2.5F, 2.4F, 3.8F);
        this.basin.addChild(upperleg1);
        this.setRotateAngle(upperleg1, -0.4554F, 0.0F, 0.0F);
        this.upperleg1.cubeList.add(new ModelBox(upperleg1, 0, 59, -1.5F, 0.0F, -2.5F, 3, 10, 6, 0.0F, false));

        this.leg1 = new AdvancedModelRendererExtended(this);
        this.leg1.setRotationPoint(0.0F, 8.3F, -0.7F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.8652F, 0.0F, 0.0F);
        this.leg1.cubeList.add(new ModelBox(leg1, 0, 78, -1.0F, 0.0F, -2.0F, 2, 10, 4, 0.0F, false));

        this.feet1 = new AdvancedModelRendererExtended(this);
        this.feet1.setRotationPoint(-0.1F, 8.7F, 0.4F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, -0.5463F, 0.0F, 0.0F);
        this.feet1.cubeList.add(new ModelBox(feet1, 0, 95, -1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F, false));

        this.toe1 = new AdvancedModelRendererExtended(this);
        this.toe1.setRotationPoint(0.0F, 6.2F, 0.2F);
        this.feet1.addChild(toe1);
        this.setRotateAngle(toe1, 0.1367F, 0.0F, 0.0F);
        this.toe1.cubeList.add(new ModelBox(toe1, 0, 108, -1.5F, -1.0F, -5.0F, 3, 2, 6, 0.0F, false));

        this.upperleg2 = new AdvancedModelRendererExtended(this);
        this.upperleg2.setRotationPoint(-2.5F, 2.4F, 3.8F);
        this.basin.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.4554F, 0.0F, 0.0F);
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 0, 59, -1.5F, 0.0F, -2.5F, 3, 10, 6, 0.0F, false));

        this.leg2 = new AdvancedModelRendererExtended(this);
        this.leg2.setRotationPoint(0.0F, 8.3F, -0.7F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.8652F, 0.0F, 0.0F);
        this.leg2.cubeList.add(new ModelBox(leg2, 0, 78, -1.0F, 0.0F, -2.0F, 2, 10, 4, 0.0F, false));

        this.feet2 = new AdvancedModelRendererExtended(this);
        this.feet2.setRotationPoint(0.2F, 8.7F, 0.4F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, -0.5463F, 0.0F, 0.0F);
        this.feet2.cubeList.add(new ModelBox(feet2, 0, 95, -1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F, false));

        this.toe2 = new AdvancedModelRendererExtended(this);
        this.toe2.setRotationPoint(0.0F, 6.2F, 0.2F);
        this.feet2.addChild(toe2);
        this.setRotateAngle(toe2, 0.1367F, 0.0F, 0.0F);
        this.toe2.cubeList.add(new ModelBox(toe2, 0, 108, -1.5F, -1.0F, -5.0F, 3, 2, 6, 0.0F, false));

        this.feathers3 = new AdvancedModelRendererExtended(this);
        this.feathers3.setRotationPoint(0.0F, 7.9F, 3.8F);
        this.basin.addChild(feathers3);
        this.feathers3.cubeList.add(new ModelBox(feathers3, 38, 84, -2.0F, 0.0F, -4.0F, 4, 1, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5 * 0.295f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.jaw1.rotateAngleX = (float) Math.toRadians(23);
        this.body.render(0.01F);
        GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.root.offsetY = 1.08F;
        //this.root.offsetZ = 0.2F;

        EntityPrehistoricFloraEoraptor Eoraptor = (EntityPrehistoricFloraEoraptor) e;
        float masterSpeed = Eoraptor.getTravelSpeed();

        this.faceTarget(f3, f4, 10, neck1);
        this.faceTarget(f3, f4, 10, neck2);
        this.faceTarget(f3, f4, 10, neck3);
        this.faceTarget(f3, f4, 10, head1);

        //float speed = 0.2F;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head1};

        AdvancedModelRenderer[] ArmL = {this.upperarm1, this.arm1};
        AdvancedModelRenderer[] ArmR = {this.upperarm2, this.arm2};

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Eoraptor.getAnimation() == Eoraptor.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff


            return;
        }
        
        if (!Eoraptor.isReallyInWater()) {

            if (f3 == 0.0F || !Eoraptor.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.75F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.75F, 0.12F, f2, 1F);

                return;
           }

            if (Eoraptor.getIsFast()) { //Running
                float speed = masterSpeed / 2F;
                //this.root.offsetY = 0.75F;
                this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 3, f2, 1.5F);
                this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);


                //---
                this.walk(upperleg1, speed, 0.32F, true, 8.0F, 0.25F, f2, 1.0F);
                this.walk(upperleg2, speed, 0.32F, true, 5.0F, 0.25F, f2, 1.0F);

                this.walk(leg1, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(leg2, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(feet1, speed, -0.16F, false, 4.0F, 0.04F, f2, 1F);
                this.walk(feet2, speed, -0.16F, false, 1.0F, 0.04F, f2, 1F);

                this.walk(toe1, speed, 0.25F, true, 7.0F, -0.135F, f2, 1F);
                this.walk(toe2, speed, 0.25F, true, 4.0F, -0.135F, f2, 1F);

                this.bobExtended(root, speed * 2F, 0.43F, false, 3.5F, f2, 1F);

                this.bobExtended(leg1, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(leg2, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(basin, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(body, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(chest, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(neck1, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);

                this.flap(upperleg1, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(upperleg2, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(body, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(chest, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.root.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

                //---


                this.walk(neck1, speed * 4, -0.05F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(neck2, speed * 4, -0.01F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(neck3, speed * 4, 0.01F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(head1, speed * 4, 0.05F, false, 2.5F, 0F, f2, 0.5F);

                this.chainWave(Tail, (speed * 1.2F), 0.125F, 0.5F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 4F, 0.05F, 0.12F, f2, 1F);

            }
            else { //Walking
                float speed = masterSpeed / 1.50F;
                //this.root.offsetY = 0.815F;
                this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 3, f2, 1.5F);
                this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);

                this.walk(upperleg1, speed, 0.32F, true, 8.0F, 0.25F, f2, 1.0F);
                this.walk(upperleg2, speed, 0.32F, true, 5.0F, 0.25F, f2, 1.0F);

                this.walk(leg1, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(leg2, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(feet1, speed, -0.16F, false, 4.0F, 0.04F, f2, 1F);
                this.walk(feet2, speed, -0.16F, false, 1.0F, 0.04F, f2, 1F);

                this.walk(toe1, speed, 0.25F, true, 7.0F, -0.135F, f2, 1F);
                this.walk(toe2, speed, 0.25F, true, 4.0F, -0.135F, f2, 1F);

                this.bobExtended(root, speed * 2F, 0.43F, false, 3.5F, f2, 1F);

                this.bobExtended(leg1, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(leg2, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(basin, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(body, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(chest, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(neck1, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);

                this.flap(upperleg1, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(upperleg2, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(body, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(chest, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(neck1, speed * 0.5F, -0.05F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(neck2, speed * 0.5F, -0.05F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(neck3, speed * 0.5F, 0.05F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(head1, speed * 0.5F, 0.05F * 2.25F, false, 2.5F, 0F, f2, 0.9F);

                this.chainWave(Tail, (speed * 0.5F), 0.125F * 0.75F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.5F) * 4F, 0.05F * 0.75F, 0.12F, f2, 1F);

                this.root.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

            }
        }
        else {
            //Swimming pose:
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water
            return;
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEoraptor e = (EntityPrehistoricFloraEoraptor) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.basin, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg2, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.basin, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg2, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.basin, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg2, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.basin, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg2, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.basin, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg2, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(head1, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw1, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(head1, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw1, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(head1, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw1, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);
    }
}
