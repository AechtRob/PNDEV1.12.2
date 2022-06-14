package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTiarajudens;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTiarajudens extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended basin1;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended upperleg1;
    private final AdvancedModelRendererExtended leg1;
    private final AdvancedModelRendererExtended feet1;
    private final AdvancedModelRendererExtended upperleg2;
    private final AdvancedModelRendererExtended leg2;
    private final AdvancedModelRendererExtended feet2;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended chest1;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended head1;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended head4;
    private final AdvancedModelRendererExtended fang1;
    private final AdvancedModelRendererExtended fang7_r1;
    private final AdvancedModelRendererExtended fang3_r1;
    private final AdvancedModelRendererExtended upperteeth1;
    private final AdvancedModelRendererExtended jaw1;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended jaw3;
    private final AdvancedModelRendererExtended lowerfang1;
    private final AdvancedModelRendererExtended lowerfang4_r1;
    private final AdvancedModelRendererExtended lowerfang2_r1;
    private final AdvancedModelRendererExtended lowerfang1_r1;
    private final AdvancedModelRendererExtended lowerteeth2;
    private final AdvancedModelRendererExtended jaw4;
    private final AdvancedModelRendererExtended lowerteeth1;
    private final AdvancedModelRendererExtended gums1;
    private final AdvancedModelRendererExtended gums2;
    private final AdvancedModelRendererExtended upperarm1;
    private final AdvancedModelRendererExtended arm1;
    private final AdvancedModelRendererExtended hand1;
    private final AdvancedModelRendererExtended upperarm2;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended hand2;

    private ModelAnimator animator;

    public ModelTiarajudens() {
        this.textureWidth = 192;
        this.textureHeight = 192;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, -2.5F, 1.0F);


        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -4.55F, 11.8F);
        this.root.addChild(body2);
        this.setRotateAngle(body2, -0.3491F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 58, 43, -8.0F, -3.0F, 0.0F, 16, 19, 12, 0.0F, false));

        this.basin1 = new AdvancedModelRendererExtended(this);
        this.basin1.setRotationPoint(0.0F, 0.0F, 10.9F);
        this.body2.addChild(basin1);
        this.setRotateAngle(basin1, -0.2276F, 0.0F, 0.0F);
        this.basin1.cubeList.add(new ModelBox(basin1, 66, 0, -6.5F, -2.0F, 0.0F, 13, 14, 8, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -0.2F, 7.1F);
        this.basin1.addChild(tail1);
        this.setRotateAngle(tail1, -0.4117F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 118, 24, -3.0F, -1.0F, 0.0F, 6, 7, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 1.5F, 5.2F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.4363F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 115, -2.0F, -2.0F, 0.0F, 4, 5, 5, 0.0F, false));

        this.upperleg1 = new AdvancedModelRendererExtended(this);
        this.upperleg1.setRotationPoint(5.8F, 9.1F, 2.1F);
        this.basin1.addChild(upperleg1);
        this.setRotateAngle(upperleg1, 0.6109F, 0.0F, -0.4098F);
        this.upperleg1.cubeList.add(new ModelBox(upperleg1, 28, 96, -3.0F, 0.0F, -3.0F, 6, 10, 8, 0.0F, false));

        this.leg1 = new AdvancedModelRendererExtended(this);
        this.leg1.setRotationPoint(0.0F, 8.3F, -0.3F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.0F, 0.0F, 0.3225F);
        this.leg1.cubeList.add(new ModelBox(leg1, 114, 55, -2.5F, 0.0F, -2.5F, 5, 10, 7, 0.0F, false));

        this.feet1 = new AdvancedModelRendererExtended(this);
        this.feet1.setRotationPoint(0.0F, 9.4F, 1.7F);
        this.leg1.addChild(feet1);
        this.feet1.cubeList.add(new ModelBox(feet1, 108, 0, -3.0F, -2.0F, -7.0F, 6, 4, 9, 0.0F, false));

        this.upperleg2 = new AdvancedModelRendererExtended(this);
        this.upperleg2.setRotationPoint(-5.8F, 9.1F, 2.1F);
        this.basin1.addChild(upperleg2);
        this.setRotateAngle(upperleg2, 0.6109F, 0.0F, 0.4098F);
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 28, 96, -3.0F, 0.0F, -3.0F, 6, 10, 8, 0.0F, true));

        this.leg2 = new AdvancedModelRendererExtended(this);
        this.leg2.setRotationPoint(0.0F, 8.3F, -0.3F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, 0.0F, -0.3225F);
        this.leg2.cubeList.add(new ModelBox(leg2, 114, 55, -2.5F, 0.0F, -2.5F, 5, 10, 7, 0.0F, true));

        this.feet2 = new AdvancedModelRendererExtended(this);
        this.feet2.setRotationPoint(0.0F, 9.4F, 1.7F);
        this.leg2.addChild(feet2);
        this.feet2.cubeList.add(new ModelBox(feet2, 108, 0, -3.0F, -2.0F, -7.0F, 6, 4, 9, 0.0F, true));

        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, -1.25F, 1.75F);
        this.body2.addChild(body1);
        this.setRotateAngle(body1, 0.2997F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -11.0F, -3.842F, -21.3399F, 22, 21, 22, 0.0F, false));

        this.chest1 = new AdvancedModelRendererExtended(this);
        this.chest1.setRotationPoint(0.0F, -0.342F, -20.0399F);
        this.body1.addChild(chest1);
        this.setRotateAngle(chest1, 0.0911F, 0.0F, 0.0F);
        this.chest1.cubeList.add(new ModelBox(chest1, 0, 43, -9.0F, -3.0F, -11.0F, 18, 19, 11, 0.0F, false));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, -0.4F, -7.8F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.2276F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 73, -5.0F, -2.0F, -8.0F, 10, 16, 8, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.5F, -5.4F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 88, 22, -4.0F, -2.0F, -7.0F, 8, 12, 7, 0.0F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, 3.9F, -4.3F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3129F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 50, 109, -3.5F, -6.1149F, -6.2593F, 7, 11, 6, 0.0F, false));

        this.head1 = new AdvancedModelRendererExtended(this);
        this.head1.setRotationPoint(0.0F, -3.0149F, -5.2593F);
        this.neck3.addChild(head1);
        this.setRotateAngle(head1, 0.0511F, 0.0F, 0.0F);
        this.head1.cubeList.add(new ModelBox(head1, 111, 13, -4.5F, -3.0F, -5.0F, 9, 6, 5, 0.0F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, -0.1F, -5.2F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.2276F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 102, 41, -3.0F, -2.0F, -8.0F, 6, 5, 9, 0.0F, false));

        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, 1.1F, -7.6F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1663F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 120, 96, -2.5F, -2.0F, -5.0F, 5, 4, 5, 0.01F, false));

        this.head4 = new AdvancedModelRendererExtended(this);
        this.head4.setRotationPoint(0.0F, -2.55F, -0.8F);
        this.head3.addChild(head4);
        this.setRotateAngle(head4, 0.2574F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 91, 74, -2.0F, -0.5F, -4.0F, 4, 1, 4, 0.0F, false));

        this.fang1 = new AdvancedModelRendererExtended(this);
        this.fang1.setRotationPoint(1.7F, 1.4F, -1.4F);
        this.head3.addChild(fang1);
        this.setRotateAngle(fang1, 0.0911F, 0.0F, 0.0F);
        this.fang1.cubeList.add(new ModelBox(fang1, 16, 0, -0.5F, -0.15F, -0.5F, 1, 3, 1, 0.0F, false));
        this.fang1.cubeList.add(new ModelBox(fang1, 16, 0, -3.9F, -0.15F, -0.5F, 1, 3, 1, 0.0F, true));

        this.fang7_r1 = new AdvancedModelRendererExtended(this);
        this.fang7_r1.setRotationPoint(-3.4F, 1.1F, -1.5F);
        this.fang1.addChild(fang7_r1);
        this.setRotateAngle(fang7_r1, -0.1745F, 0.0F, 0.0F);
        this.fang7_r1.cubeList.add(new ModelBox(fang7_r1, 16, 0, 2.25F, -1.75F, -1.5F, 1, 2, 0, 0.0F, true));
        this.fang7_r1.cubeList.add(new ModelBox(fang7_r1, 16, 0, 0.25F, -1.75F, -1.5F, 1, 2, 0, 0.0F, true));
        this.fang7_r1.cubeList.add(new ModelBox(fang7_r1, 16, 0, -0.5F, -2.5F, -1.5F, 0, 3, 1, 0.0F, true));
        this.fang7_r1.cubeList.add(new ModelBox(fang7_r1, 16, 0, 3.9F, -2.5F, -1.5F, 0, 3, 1, 0.0F, false));

        this.fang3_r1 = new AdvancedModelRendererExtended(this);
        this.fang3_r1.setRotationPoint(-3.4F, 1.1F, -1.5F);
        this.fang1.addChild(fang3_r1);
        this.setRotateAngle(fang3_r1, -0.0436F, 0.0F, 0.0F);
        this.fang3_r1.cubeList.add(new ModelBox(fang3_r1, 16, 0, -0.5F, -2.5F, -0.25F, 0, 3, 1, 0.0F, true));
        this.fang3_r1.cubeList.add(new ModelBox(fang3_r1, 16, 0, 3.9F, -2.5F, -0.25F, 0, 3, 1, 0.0F, false));

        this.upperteeth1 = new AdvancedModelRendererExtended(this);
        this.upperteeth1.setRotationPoint(0.0F, 1.5F, -4.6F);
        this.head2.addChild(upperteeth1);
        this.setRotateAngle(upperteeth1, 0.1367F, 0.0F, 0.0F);
        this.upperteeth1.cubeList.add(new ModelBox(upperteeth1, 59, 74, -2.0F, -0.85F, -3.5F, 4, 3, 4, 0.0F, false));

        this.jaw1 = new AdvancedModelRendererExtended(this);
        this.jaw1.setRotationPoint(0.0F, 2.9F, -0.9F);
        this.head1.addChild(jaw1);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 112, 87, -4.5F, 0.0F, -4.0F, 9, 5, 4, 0.0F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 1.9F, -3.4F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.2276F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 100, 119, -3.0F, -2.0F, -7.0F, 6, 3, 7, 0.0F, false));

        this.jaw3 = new AdvancedModelRendererExtended(this);
        this.jaw3.setRotationPoint(0.0F, -1.0F, -6.3F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.1367F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 0, 0, -2.5F, -1.0F, -6.0F, 5, 3, 6, 0.0F, false));

        this.lowerfang1 = new AdvancedModelRendererExtended(this);
        this.lowerfang1.setRotationPoint(1.7F, -0.8F, -2.6F);
        this.jaw3.addChild(lowerfang1);
        this.setRotateAngle(lowerfang1, -0.0456F, 0.0F, 0.0F);


        this.lowerfang4_r1 = new AdvancedModelRendererExtended(this);
        this.lowerfang4_r1.setRotationPoint(-3.4F, -0.6F, -1.25F);
        this.lowerfang1.addChild(lowerfang4_r1);
        this.setRotateAngle(lowerfang4_r1, 0.1309F, 0.0F, 0.0F);
        this.lowerfang4_r1.cubeList.add(new ModelBox(lowerfang4_r1, 0, 9, -0.25F, -1.25F, -1.75F, 0, 3, 1, 0.0F, true));
        this.lowerfang4_r1.cubeList.add(new ModelBox(lowerfang4_r1, 0, 10, 2.15F, -0.5F, -1.75F, 1, 2, 0, 0.0F, false));
        this.lowerfang4_r1.cubeList.add(new ModelBox(lowerfang4_r1, 0, 10, 0.25F, -0.5F, -1.75F, 1, 2, 0, 0.0F, true));
        this.lowerfang4_r1.cubeList.add(new ModelBox(lowerfang4_r1, 0, 9, 3.65F, -1.25F, -1.75F, 0, 3, 1, 0.0F, false));
        this.lowerfang4_r1.cubeList.add(new ModelBox(lowerfang4_r1, 0, 9, -0.25F, -1.0F, -0.5F, 0, 3, 1, 0.0F, true));
        this.lowerfang4_r1.cubeList.add(new ModelBox(lowerfang4_r1, 0, 9, 3.65F, -1.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.lowerfang2_r1 = new AdvancedModelRendererExtended(this);
        this.lowerfang2_r1.setRotationPoint(-3.9F, -0.6F, 0.0F);
        this.lowerfang1.addChild(lowerfang2_r1);
        this.setRotateAngle(lowerfang2_r1, 0.0F, 0.0F, 0.0436F);
        this.lowerfang2_r1.cubeList.add(new ModelBox(lowerfang2_r1, 0, 9, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, true));

        this.lowerfang1_r1 = new AdvancedModelRendererExtended(this);
        this.lowerfang1_r1.setRotationPoint(0.5F, -0.6F, 0.0F);
        this.lowerfang1.addChild(lowerfang1_r1);
        this.setRotateAngle(lowerfang1_r1, 0.0F, 0.0F, -0.0436F);
        this.lowerfang1_r1.cubeList.add(new ModelBox(lowerfang1_r1, 0, 9, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.lowerteeth2 = new AdvancedModelRendererExtended(this);
        this.lowerteeth2.setRotationPoint(0.0F, -0.3F, -4.3F);
        this.jaw3.addChild(lowerteeth2);
        this.setRotateAngle(lowerteeth2, 0.0911F, 0.0F, 0.0F);


        this.jaw4 = new AdvancedModelRendererExtended(this);
        this.jaw4.setRotationPoint(0.0F, 1.7F, -0.9F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.2416F, 0.0F, 0.0F);
        this.jaw4.cubeList.add(new ModelBox(jaw4, 117, 120, -1.5F, -1.0F, -8.0F, 3, 2, 9, 0.0F, false));

        this.lowerteeth1 = new AdvancedModelRendererExtended(this);
        this.lowerteeth1.setRotationPoint(0.0F, -2.2F, -3.9F);
        this.jaw2.addChild(lowerteeth1);
        this.setRotateAngle(lowerteeth1, -0.4098F, 0.0F, 0.0F);
        this.lowerteeth1.cubeList.add(new ModelBox(lowerteeth1, 28, 73, -2.0F, -0.2F, -3.5F, 4, 3, 4, 0.0F, false));

        this.gums1 = new AdvancedModelRendererExtended(this);
        this.gums1.setRotationPoint(0.0F, 0.0F, 2.4F);
        this.jaw2.addChild(gums1);
        this.setRotateAngle(gums1, -0.1955F, 0.0F, 0.0F);
        this.gums1.cubeList.add(new ModelBox(gums1, 47, 43, -4.0F, -4.0F, -2.0F, 8, 4, 3, 0.0F, false));

        this.gums2 = new AdvancedModelRendererExtended(this);
        this.gums2.setRotationPoint(0.0F, 0.0F, 0.3F);
        this.jaw2.addChild(gums2);
        this.setRotateAngle(gums2, -0.4554F, 0.0F, 0.0F);
        this.gums2.cubeList.add(new ModelBox(gums2, 0, 9, -2.5F, -5.0F, -3.9F, 5, 5, 5, 0.0F, false));

        this.upperarm1 = new AdvancedModelRendererExtended(this);
        this.upperarm1.setRotationPoint(7.0F, 12.0F, -6.6F);
        this.chest1.addChild(upperarm1);
        this.setRotateAngle(upperarm1, -0.0436F, 0.0F, -0.4098F);
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 68, 74, -3.5F, 0.0F, -3.5F, 7, 13, 9, 0.0F, false));

        this.arm1 = new AdvancedModelRendererExtended(this);
        this.arm1.setRotationPoint(0.0F, 11.0F, 0.6F);
        this.upperarm1.addChild(arm1);
        this.setRotateAngle(arm1, 0.0436F, 0.0F, 0.4098F);
        this.arm1.cubeList.add(new ModelBox(arm1, 81, 106, -3.0F, 0.0F, -3.0F, 6, 11, 7, 0.0F, false));

        this.hand1 = new AdvancedModelRendererExtended(this);
        this.hand1.setRotationPoint(0.0F, 9.9F, 1.3F);
        this.arm1.addChild(hand1);
        this.hand1.cubeList.add(new ModelBox(hand1, 100, 74, -3.5F, -2.0F, -7.0F, 7, 4, 9, 0.0F, false));

        this.upperarm2 = new AdvancedModelRendererExtended(this);
        this.upperarm2.setRotationPoint(-7.0F, 12.0F, -6.6F);
        this.chest1.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.1309F, 0.0F, 0.4098F);
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 68, 74, -3.5F, 0.0F, -3.5F, 7, 13, 9, 0.0F, true));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(0.0F, 11.0F, 0.6F);
        this.upperarm2.addChild(arm2);
        this.setRotateAngle(arm2, -0.1309F, 0.0F, -0.4098F);
        this.arm2.cubeList.add(new ModelBox(arm2, 81, 106, -3.0F, 0.0F, -3.0F, 6, 11, 7, 0.0F, true));

        this.hand2 = new AdvancedModelRendererExtended(this);
        this.hand2.setRotationPoint(0.0F, 9.9F, 1.3F);
        this.arm2.addChild(hand2);
        this.hand2.cubeList.add(new ModelBox(hand2, 100, 74, -3.5F, -2.0F, -7.0F, 7, 4, 9, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5 * 0.631f);
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
        this.root.offsetY = 0.5F;
        //this.root.offsetZ = 1.5F;

        EntityPrehistoricFloraTiarajudens Tiarajudens = (EntityPrehistoricFloraTiarajudens) e;
        float masterSpeed = Tiarajudens.getTravelSpeed();

        this.faceTarget(f3, f4, 10, neck1);
        this.faceTarget(f3, f4, 10, neck2);
        this.faceTarget(f3, f4, 10, neck3);
        this.faceTarget(f3, f4, 15, head1);

        AdvancedModelRendererExtended[] Tail = {this.tail1, this.tail2};

        //if (Tiarajudens.getAnimation() == Tiarajudens.LAY_ANIMATION) {
            //this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            //this.chainFlap(Tail, (0.06F*0.9F) * 3, 0.10F, 0.10F, f2, 1F);
            //this.chainSwing(Tail, (0.06F*0.9F) * 2F * 3, 0.05F, 0.06F, f2, 1F);
            //return;
        //}

        if (f3 == 0.0F || !Tiarajudens.getIsMoving()) { //Not moving
            this.swing(neck1, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck1, 0.06F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.6F), 0.20F, 0.2F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);
            this.walk(tail1, (0.06F*0.6F) * 1.5F, -0.10F, false, 0F, 0.1F, f2, 1F);
            return;
        }

        float speed = masterSpeed / 4.5F;
        if (Tiarajudens.getIsFast()) {
            speed = speed * 1.5F;
        }

        //this.root.offsetY = -0.50F;
        this.upperarm2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(2.1), false, 1, f2, 1.5F);;
        this.upperarm1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(2.1), false, 4, f2, 1.5F);;
        this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.6), false, 4, f2, 1.5F);;
        this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.6), false, 1, f2, 1.5F);;

        this.walk(upperarm2, speed, 0.50F, true, 5, 0.30F, f2, 1F);
        this.walk(upperarm1, speed, 0.50F, true, 8, 0.30F, f2, 1F);
        this.walk(upperleg2, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(upperleg1, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(arm2, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(arm1, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(leg2, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(leg1, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.walk(hand2, speed, 0.40F, true, 2, -0.25F, f2, 1F);
        this.walk(hand1, speed, 0.40F, true, 5, -0.25F, f2, 1F);
        this.walk(feet2, speed, 0.3F, true, 5, 0.05F, f2, 1F);
        this.walk(feet1, speed, 0.3F, true, 2, 0.05F, f2, 1F);

        this.bobExtended(body1, speed * 2F, 0.245F, false, 2.5F,  f2, 1F);

        this.flap(body2, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(body1, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(chest1, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);

        this.flap(upperleg1, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(upperleg2, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(upperarm1, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
        this.flap(upperarm2, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(chest1, speed * 2, 0.07F, false, 2.5F,-0.02F, f2, 0.8F);

        this.swing(neck1, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck1, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);
        this.walk(tail1, (speed*0.6F) * 1.5F, -0.10F, false, 0F, 0.1F, f2, 1F);

        this.root.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(7.0), false, 3.25F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTiarajudens e = (EntityPrehistoricFloraTiarajudens) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(7);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.neck1, (float) Math.toRadians(-7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(6);
        animator.resetKeyframe(6);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
