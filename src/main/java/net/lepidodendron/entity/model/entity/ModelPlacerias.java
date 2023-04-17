package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPlacerias;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelPlacerias extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended chest1;
    private final AdvancedModelRendererExtended upperarm2;
    private final AdvancedModelRendererExtended lowerarm2;
    private final AdvancedModelRendererExtended hand2;
    private final AdvancedModelRendererExtended upperarm1;
    private final AdvancedModelRendererExtended lowerarm1;
    private final AdvancedModelRendererExtended hand1;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended head1;
    private final AdvancedModelRendererExtended neck2_r1;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended beak1;
    private final AdvancedModelRendererExtended beak1_r1;
    private final AdvancedModelRendererExtended beak2;
    private final AdvancedModelRendererExtended beak3;
    private final AdvancedModelRendererExtended beak4;
    private final AdvancedModelRendererExtended tusk1;
    private final AdvancedModelRendererExtended tusk2_r1;
    private final AdvancedModelRendererExtended fronttusk1;
    private final AdvancedModelRendererExtended tusk2;
    private final AdvancedModelRendererExtended tusk3_r1;
    private final AdvancedModelRendererExtended fronttusk2;
    private final AdvancedModelRendererExtended jaw1;
    private final AdvancedModelRendererExtended lowerbeak1;
    private final AdvancedModelRendererExtended lowerbeak2;
    private final AdvancedModelRendererExtended gums2;
    private final AdvancedModelRendererExtended gums1;
    private final AdvancedModelRendererExtended basin1;
    private final AdvancedModelRendererExtended upperleg2;
    private final AdvancedModelRendererExtended leg2;
    private final AdvancedModelRendererExtended feet2;
    private final AdvancedModelRendererExtended upperleg1;
    private final AdvancedModelRendererExtended leg1;
    private final AdvancedModelRendererExtended feet1;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;

    private ModelAnimator animator;

    public ModelPlacerias() {
        this.textureWidth = 165;
        this.textureHeight = 155;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, -2.4F, 0.0F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -10.0F, -3.5F, -8.0F, 20, 19, 17, 0.0F, false));

        this.chest1 = new AdvancedModelRendererExtended(this);
        this.chest1.setRotationPoint(0.0F, -1.2F, -5.9F);
        this.body1.addChild(chest1);
        this.setRotateAngle(chest1, 0.0449F, 0.0F, 0.0F);
        this.chest1.cubeList.add(new ModelBox(chest1, 75, 0, -7.5F, -2.0F, -10.0F, 15, 17, 10, 0.0F, false));

        this.upperarm2 = new AdvancedModelRendererExtended(this);
        this.upperarm2.setRotationPoint(-5.5F, 12.4F, -5.3F);
        this.chest1.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.2731F, 0.0F, 0.6374F);
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 0, 81, -3.0F, 0.0F, -3.0F, 6, 9, 7, 0.0F, false));

        this.lowerarm2 = new AdvancedModelRendererExtended(this);
        this.lowerarm2.setRotationPoint(0.1F, 6.9F, 0.6F);
        this.upperarm2.addChild(lowerarm2);
        this.setRotateAngle(lowerarm2, -0.2731F, 0.0F, -0.6597F);
        this.lowerarm2.cubeList.add(new ModelBox(lowerarm2, 0, 98, -3.0F, 0.0F, -3.5F, 6, 9, 7, 0.0F, false));

        this.hand2 = new AdvancedModelRendererExtended(this);
        this.hand2.setRotationPoint(0.0F, 8.5F, 1.4F);
        this.lowerarm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.0449F, 0.0F, 0.0F);
        this.hand2.cubeList.add(new ModelBox(hand2, 0, 115, -4.0F, -2.0F, -8.0F, 8, 4, 9, 0.0F, false));

        this.upperarm1 = new AdvancedModelRendererExtended(this);
        this.upperarm1.setRotationPoint(5.5F, 12.4F, -5.3F);
        this.chest1.addChild(upperarm1);
        this.setRotateAngle(upperarm1, 0.2731F, 0.0F, -0.6374F);
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 30, 81, -3.0F, 0.0F, -3.0F, 6, 9, 7, 0.0F, false));

        this.lowerarm1 = new AdvancedModelRendererExtended(this);
        this.lowerarm1.setRotationPoint(0.1F, 6.9F, 0.6F);
        this.upperarm1.addChild(lowerarm1);
        this.setRotateAngle(lowerarm1, -0.2731F, 0.0F, 0.6597F);
        this.lowerarm1.cubeList.add(new ModelBox(lowerarm1, 30, 98, -3.0F, 0.0F, -3.5F, 6, 9, 7, 0.0F, false));

        this.hand1 = new AdvancedModelRendererExtended(this);
        this.hand1.setRotationPoint(0.0F, 8.5F, 1.4F);
        this.lowerarm1.addChild(hand1);
        this.setRotateAngle(hand1, 0.0449F, 0.0F, 0.0F);
        this.hand1.cubeList.add(new ModelBox(hand1, 26, 120, -4.0F, -2.0F, -8.0F, 8, 4, 9, 0.0F, false));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, 5.6F, -9.0F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.0911F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 114, 16, -4.9F, -7.0F, -9.0F, 10, 15, 12, 0.0F, false));

        this.head1 = new AdvancedModelRendererExtended(this);
        this.head1.setRotationPoint(0.0F, 0.3F, -8.6F);
        this.neck1.addChild(head1);
        this.setRotateAngle(head1, 0.6109F, 0.0F, 0.0F);
        this.head1.cubeList.add(new ModelBox(head1, 80, 35, -6.0F, -8.2665F, -4.7239F, 12, 14, 9, 0.0F, false));

        this.neck2_r1 = new AdvancedModelRendererExtended(this);
        this.neck2_r1.setRotationPoint(0.0F, 21.7F, 23.5F);
        this.head1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, -0.5236F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 135, 111, -4.9F, -2.75F, -31.9F, 10, 3, 3, -0.01F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, -0.4665F, -4.3239F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, -0.1796F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 79, 59, -4.5F, -6.8F, -5.0F, 9, 9, 6, 0.01F, false));

        this.beak1 = new AdvancedModelRendererExtended(this);
        this.beak1.setRotationPoint(0.0F, 0.9F, -6.0F);
        this.head2.addChild(beak1);
        this.setRotateAngle(beak1, -0.0897F, 0.0F, 0.0F);


        this.beak1_r1 = new AdvancedModelRendererExtended(this);
        this.beak1_r1.setRotationPoint(0.0F, 2.2F, -5.4F);
        this.beak1.addChild(beak1_r1);
        this.setRotateAngle(beak1_r1, -0.1571F, 0.0F, 0.0F);
        this.beak1_r1.cubeList.add(new ModelBox(beak1_r1, 123, 84, -3.5F, -3.2F, 0.4F, 7, 3, 5, 0.0F, false));

        this.beak2 = new AdvancedModelRendererExtended(this);
        this.beak2.setRotationPoint(0.0F, -5.1F, 2.7F);
        this.beak1.addChild(beak2);
        this.setRotateAngle(beak2, 0.3142F, 0.0F, 0.0F);
        this.beak2.cubeList.add(new ModelBox(beak2, 118, 54, -2.5F, -3.0F, -6.0F, 5, 7, 5, 0.01F, false));

        this.beak3 = new AdvancedModelRendererExtended(this);
        this.beak3.setRotationPoint(0.0F, -1.4F, -4.5F);
        this.beak2.addChild(beak3);
        this.setRotateAngle(beak3, 0.7629F, 0.0F, 0.0F);
        this.beak3.cubeList.add(new ModelBox(beak3, 31, 70, -2.0F, -2.0F, -6.0F, 4, 4, 6, 0.0F, false));

        this.beak4 = new AdvancedModelRendererExtended(this);
        this.beak4.setRotationPoint(0.0F, 1.2F, -4.4F);
        this.beak3.addChild(beak4);
        this.setRotateAngle(beak4, -0.8196F, 0.0F, 0.0F);
        this.beak4.cubeList.add(new ModelBox(beak4, 15, 67, -3.0F, -1.0F, -4.0F, 6, 4, 4, 0.01F, false));

        this.tusk1 = new AdvancedModelRendererExtended(this);
        this.tusk1.setRotationPoint(1.9F, -0.7F, 0.9F);
        this.beak1.addChild(tusk1);
        this.setRotateAngle(tusk1, -1.0221F, -0.0822F, 2.5756F);
        this.tusk1.cubeList.add(new ModelBox(tusk1, 3, 70, -1.4F, -2.1F, -6.0F, 2, 3, 6, 0.0F, false));

        this.tusk2_r1 = new AdvancedModelRendererExtended(this);
        this.tusk2_r1.setRotationPoint(-1.2F, 0.7F, -3.2F);
        this.tusk1.addChild(tusk2_r1);
        this.setRotateAngle(tusk2_r1, -1.1219F, 0.1321F, -0.1458F);
        this.tusk2_r1.cubeList.add(new ModelBox(tusk2_r1, 3, 73, 0.2F, -0.7F, -1.0F, 2, 3, 3, -0.01F, false));

        this.fronttusk1 = new AdvancedModelRendererExtended(this);
        this.fronttusk1.setRotationPoint(-0.7F, -0.4F, -5.1F);
        this.tusk1.addChild(fronttusk1);
        this.setRotateAngle(fronttusk1, 0.3336F, 0.253F, 0.0157F);
        this.fronttusk1.cubeList.add(new ModelBox(fronttusk1, 23, 76, -0.3F, -0.9F, -3.1F, 1, 2, 5, 0.0F, false));

        this.tusk2 = new AdvancedModelRendererExtended(this);
        this.tusk2.setRotationPoint(-1.9F, -0.7F, 0.9F);
        this.beak1.addChild(tusk2);
        this.setRotateAngle(tusk2, -1.0221F, 0.0822F, -2.5756F);
        this.tusk2.cubeList.add(new ModelBox(tusk2, 3, 70, -0.6F, -2.1F, -6.0F, 2, 3, 6, 0.0F, true));

        this.tusk3_r1 = new AdvancedModelRendererExtended(this);
        this.tusk3_r1.setRotationPoint(1.2F, 0.7F, -3.2F);
        this.tusk2.addChild(tusk3_r1);
        this.setRotateAngle(tusk3_r1, -1.1219F, -0.1321F, 0.1458F);
        this.tusk3_r1.cubeList.add(new ModelBox(tusk3_r1, 3, 73, -2.2F, -0.7F, -1.0F, 2, 3, 3, -0.01F, true));

        this.fronttusk2 = new AdvancedModelRendererExtended(this);
        this.fronttusk2.setRotationPoint(0.7F, -0.4F, -5.1F);
        this.tusk2.addChild(fronttusk2);
        this.setRotateAngle(fronttusk2, 0.3336F, -0.253F, -0.0157F);
        this.fronttusk2.cubeList.add(new ModelBox(fronttusk2, 23, 76, -0.7F, -0.9F, -3.1F, 1, 2, 5, 0.0F, true));

        this.jaw1 = new AdvancedModelRendererExtended(this);
        this.jaw1.setRotationPoint(0.0F, 2.1F, 1.0F);
        this.head2.addChild(jaw1);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 104, 69, -4.5F, 0.0F, -6.0F, 9, 4, 6, 0.0F, false));

        this.lowerbeak1 = new AdvancedModelRendererExtended(this);
        this.lowerbeak1.setRotationPoint(0.0F, 2.5F, -5.8F);
        this.jaw1.addChild(lowerbeak1);
        this.setRotateAngle(lowerbeak1, -0.0461F, 0.0F, 0.0F);
        this.lowerbeak1.cubeList.add(new ModelBox(lowerbeak1, 130, 75, -3.0F, -1.5F, -5.0F, 6, 3, 5, 0.0F, false));

        this.lowerbeak2 = new AdvancedModelRendererExtended(this);
        this.lowerbeak2.setRotationPoint(0.0F, 0.0F, -4.7F);
        this.lowerbeak1.addChild(lowerbeak2);
        this.lowerbeak2.cubeList.add(new ModelBox(lowerbeak2, 129, 69, -2.5F, -1.0F, -3.0F, 5, 2, 3, 0.0F, false));

        this.gums2 = new AdvancedModelRendererExtended(this);
        this.gums2.setRotationPoint(0.0F, 0.5F, -1.9F);
        this.lowerbeak1.addChild(gums2);
        this.setRotateAngle(gums2, -0.2244F, 0.0F, 0.0F);
        this.gums2.cubeList.add(new ModelBox(gums2, 143, 58, -2.5F, -8.0F, -0.75F, 5, 8, 5, 0.0F, false));

        this.gums1 = new AdvancedModelRendererExtended(this);
        this.gums1.setRotationPoint(0.0F, 1.5F, -3.9F);
        this.jaw1.addChild(gums1);
        this.setRotateAngle(gums1, -0.5386F, 0.0F, 0.0F);
        this.gums1.cubeList.add(new ModelBox(gums1, 134, 44, -4.0F, -8.0F, -2.5F, 8, 8, 5, 0.0F, false));

        this.basin1 = new AdvancedModelRendererExtended(this);
        this.basin1.setRotationPoint(0.0F, -0.7F, 7.6F);
        this.body1.addChild(basin1);
        this.setRotateAngle(basin1, -0.0911F, 0.0F, 0.0F);
        this.basin1.cubeList.add(new ModelBox(basin1, 0, 37, -7.5F, -2.0F, 0.0F, 15, 16, 12, 0.0F, false));

        this.upperleg2 = new AdvancedModelRendererExtended(this);
        this.upperleg2.setRotationPoint(-5.5F, 5.1F, 6.9F);
        this.basin1.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.2276F, 0.0F, 0.2731F);
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 57, 76, -3.0F, 0.0F, -5.0F, 6, 12, 10, 0.0F, false));

        this.leg2 = new AdvancedModelRendererExtended(this);
        this.leg2.setRotationPoint(-0.5F, 9.7F, -0.4F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.3643F, 0.0911F, -0.2731F);
        this.leg2.cubeList.add(new ModelBox(leg2, 57, 99, -2.5F, 0.0F, -4.5F, 5, 11, 9, 0.0F, false));

        this.feet2 = new AdvancedModelRendererExtended(this);
        this.feet2.setRotationPoint(0.0F, 10.4F, 0.0F);
        this.leg2.addChild(feet2);
        this.feet2.cubeList.add(new ModelBox(feet2, 90, 127, -4.0F, -2.0F, -8.0F, 8, 4, 12, 0.0F, false));

        this.upperleg1 = new AdvancedModelRendererExtended(this);
        this.upperleg1.setRotationPoint(5.5F, 5.1F, 6.9F);
        this.basin1.addChild(upperleg1);
        this.setRotateAngle(upperleg1, -0.2276F, 0.0F, -0.2731F);
        this.upperleg1.cubeList.add(new ModelBox(upperleg1, 90, 80, -3.0F, -0.2F, -5.0F, 6, 12, 10, 0.0F, false));

        this.leg1 = new AdvancedModelRendererExtended(this);
        this.leg1.setRotationPoint(0.5F, 9.5F, -0.4F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.3643F, -0.0911F, 0.2731F);
        this.leg1.cubeList.add(new ModelBox(leg1, 92, 103, -2.5F, 0.2F, -4.5F, 5, 11, 9, 0.0F, false));

        this.feet1 = new AdvancedModelRendererExtended(this);
        this.feet1.setRotationPoint(0.0F, 10.4F, 0.0F);
        this.leg1.addChild(feet1);
        this.feet1.cubeList.add(new ModelBox(feet1, 61, 122, -4.0F, -1.8F, -8.0F, 8, 4, 12, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, 2.4F, 11.1F);
        this.basin1.addChild(tail1);
        this.setRotateAngle(tail1, -0.5918F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 46, 57, -3.5F, -2.5F, -1.0F, 7, 9, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 1.4F, 7.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.3643F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 55, 44, -2.5F, -3.0F, 0.0F, 5, 6, 6, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.jaw1.rotateAngleX = (float) Math.toRadians(23);
        this.neck1.offsetY = -0.05F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body1, -0.0456F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(chest1, 0.0449F, 0.0F, 0.0F);
        this.setRotateAngle(upperarm2, -0.1632F, 0.0F, 0.6374F);
        this.setRotateAngle(lowerarm2, -0.4477F, 0.0F, -0.6597F);
        this.setRotateAngle(hand2, 0.5423F, 0.0F, 0.0F);
        this.setRotateAngle(upperarm1, 0.884F, 0.0F, -0.6374F);
        this.setRotateAngle(lowerarm1, -0.8404F, 0.0F, 0.6597F);
        this.setRotateAngle(hand1, 0.3939F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.3965F, 0.0F, 0.0F);
        this.setRotateAngle(head1, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(neck2_r1, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(head2, -0.1796F, 0.0F, 0.0F);
        this.setRotateAngle(beak1, -0.0897F, 0.0F, 0.0F);
        this.setRotateAngle(beak1_r1, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(beak2, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(beak3, 0.7629F, 0.0F, 0.0F);
        this.setRotateAngle(beak4, -0.8196F, 0.0F, 0.0F);
        this.setRotateAngle(tusk1, -1.0221F, -0.0822F, 2.5756F);
        this.setRotateAngle(tusk2_r1, -1.1219F, 0.1321F, -0.1458F);
        this.setRotateAngle(fronttusk1, 0.3336F, 0.253F, 0.0157F);
        this.setRotateAngle(tusk2, -1.0221F, 0.0822F, -2.5756F);
        this.setRotateAngle(tusk3_r1, -1.1219F, -0.1321F, 0.1458F);
        this.setRotateAngle(fronttusk2, 0.3336F, -0.253F, -0.0157F);
        this.setRotateAngle(jaw1, 0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(lowerbeak1, -0.0461F, 0.0F, 0.0F);
        this.setRotateAngle(gums2, -0.2244F, 0.0F, 0.0F);
        this.setRotateAngle(gums1, -0.5386F, 0.0F, 0.0F);
        this.setRotateAngle(basin1, -0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(upperleg2, -0.3149F, 0.0F, 0.2731F);
        this.setRotateAngle(leg2, 0.4515F, 0.0911F, -0.2731F);
        this.setRotateAngle(upperleg1, 0.296F, 0.0F, -0.2731F);
        this.setRotateAngle(leg1, 0.626F, -0.0911F, 0.2731F);
        this.setRotateAngle(feet1, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.5918F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.3643F, 0.0F, 0.0F);
        this.root.offsetY = -0.057F;
        this.root.render(0.01F);
        resetToDefaultPose();
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
        this.root.offsetY = 0F;

        EntityPrehistoricFloraPlacerias Placerias = (EntityPrehistoricFloraPlacerias) e;
        float masterSpeed = Placerias.getTravelSpeed();

        //float masterSpeed = 0;

        this.faceTarget(f3, f4, 2, neck1);
        this.faceTarget(f3, f4, 4, head1);

        AdvancedModelRendererExtended[] Tail = {this.tail1, this.tail2};

        if (Placerias.getAnimation() == Placerias.LAY_ANIMATION) {
            this.swing(neck1, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck1, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);

            return;
         }

        if (f3 == 0.0F || !Placerias.getIsMoving()) { //Not moving
            this.swing(neck1, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck1, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
         }

        float speed = masterSpeed / 2.225F;
        if (Placerias.getIsFast()) {
            speed = speed * 2;
        }

        this.upperarm1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.upperarm2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(upperarm1, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(upperarm2, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(upperleg1, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(upperleg2, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(upperarm1, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(upperarm2, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(upperleg1, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(upperleg2, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(lowerarm1, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(lowerarm2, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(leg1, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(leg2, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(lowerarm1, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(lowerarm2, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(leg1, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(leg2, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(hand1, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(hand2, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(feet1, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(feet2, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(root, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.flap(basin1, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(root, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(chest1, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(chest1, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck1, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck1, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.root.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPlacerias e = (EntityPrehistoricFloraPlacerias) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.body1, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest1, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerarm1, (float) Math.toRadians(-12.2), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerarm2, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.body1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck1, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(3);
        animator.rotate(this.neck1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks

    }
}
