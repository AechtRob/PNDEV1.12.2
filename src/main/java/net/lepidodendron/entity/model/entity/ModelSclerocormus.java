package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSclerocormus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelSclerocormus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended chest1;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended head1;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended head3_r1;
    private final AdvancedModelRendererExtended rostrum1;
    private final AdvancedModelRendererExtended rostrum1_r1;
    private final AdvancedModelRendererExtended rostrum2;
    private final AdvancedModelRendererExtended rostrum3_r1;
    private final AdvancedModelRendererExtended rostrum2_r1;
    private final AdvancedModelRendererExtended jaw1;
    private final AdvancedModelRendererExtended jaw1_r1;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended jaw2_r1;
    private final AdvancedModelRendererExtended lowerrostrum1;
    private final AdvancedModelRendererExtended jaw3;
    private final AdvancedModelRendererExtended jaw3_r1;
    private final AdvancedModelRendererExtended gums;
    private final AdvancedModelRendererExtended frontflipperR;
    private final AdvancedModelRendererExtended flipper12;
    private final AdvancedModelRendererExtended flipper13;
    private final AdvancedModelRendererExtended flipper14;
    private final AdvancedModelRendererExtended frontflipperL;
    private final AdvancedModelRendererExtended flipper3;
    private final AdvancedModelRendererExtended flipper4;
    private final AdvancedModelRendererExtended flipper5;
    private final AdvancedModelRendererExtended basin1;
    private final AdvancedModelRendererExtended basin1_r1;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended fluke2;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended Tail5;
    private final AdvancedModelRendererExtended t2fluke2;
    private final AdvancedModelRendererExtended fluke1;
    private final AdvancedModelRendererExtended backflipperR;
    private final AdvancedModelRendererExtended backflipper12;
    private final AdvancedModelRendererExtended backflipperL;
    private final AdvancedModelRendererExtended backflipper2;

    private ModelAnimator animator;

    public ModelSclerocormus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 20.0F, 6.0F);


        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.root.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 19, -3.0F, -4.75F, -3.5F, 6, 8, 8, 0.0F, false));

        this.chest1 = new AdvancedModelRendererExtended(this);
        this.chest1.setRotationPoint(0.0F, -0.15F, -3.55F);
        this.body1.addChild(chest1);
        this.setRotateAngle(chest1, 0.0456F, 0.0F, 0.0F);
        this.chest1.cubeList.add(new ModelBox(chest1, 0, 56, -2.5F, -3.9305F, -5.7483F, 5, 7, 6, 0.0F, false));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, -1.0805F, -5.8483F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.0456F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 52, 30, -2.0F, -2.4001F, -2.4111F, 4, 6, 4, 0.0F, false));

        this.head1 = new AdvancedModelRendererExtended(this);
        this.head1.setRotationPoint(0.0F, -0.4001F, -2.2611F);
        this.neck1.addChild(head1);
        this.setRotateAngle(head1, 0.0456F, 0.0F, 0.0F);
        this.head1.cubeList.add(new ModelBox(head1, 58, 45, -2.0F, -1.6129F, -3.0647F, 4, 3, 3, 0.001F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, 11.5871F, -3.0647F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.6199F, 0.0F, 0.0F);


        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, 0.9F, -1.0F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.8196F, 0.0F, 0.0F);


        this.head3_r1 = new AdvancedModelRendererExtended(this);
        this.head3_r1.setRotationPoint(0.0F, -11.6601F, 0.1918F);
        this.head3.addChild(head3_r1);
        this.setRotateAngle(head3_r1, -0.0262F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 38, 15, -1.0F, -1.1953F, -4.2474F, 2, 1, 2, 0.0F, false));

        this.rostrum1 = new AdvancedModelRendererExtended(this);
        this.rostrum1.setRotationPoint(0.0F, 0.5F, -2.05F);
        this.head3.addChild(rostrum1);
        this.setRotateAngle(rostrum1, 0.3187F, 0.0F, 0.0F);


        this.rostrum1_r1 = new AdvancedModelRendererExtended(this);
        this.rostrum1_r1.setRotationPoint(0.0F, -12.1601F, 2.2418F);
        this.rostrum1.addChild(rostrum1_r1);
        this.setRotateAngle(rostrum1_r1, -0.2094F, 0.0F, 0.0F);
        this.rostrum1_r1.cubeList.add(new ModelBox(rostrum1_r1, 21, 24, -0.5F, -1.2526F, -1.0824F, 1, 1, 1, 0.0F, false));

        this.rostrum2 = new AdvancedModelRendererExtended(this);
        this.rostrum2.setRotationPoint(0.0F, -0.6F, 0.4F);
        this.rostrum1.addChild(rostrum2);
        this.setRotateAngle(rostrum2, 0.2731F, 0.0F, 0.0F);


        this.rostrum3_r1 = new AdvancedModelRendererExtended(this);
        this.rostrum3_r1.setRotationPoint(0.0F, -11.9256F, 7.3126F);
        this.rostrum2.addChild(rostrum3_r1);
        this.setRotateAngle(rostrum3_r1, 0.0175F, 0.0F, 0.0F);
        this.rostrum3_r1.cubeList.add(new ModelBox(rostrum3_r1, 5, 0, -0.5F, -0.0841F, -1.7827F, 1, 1, 2, -0.02F, false));

        this.rostrum2_r1 = new AdvancedModelRendererExtended(this);
        this.rostrum2_r1.setRotationPoint(0.0F, -11.8774F, 7.1796F);
        this.rostrum2.addChild(rostrum2_r1);
        this.setRotateAngle(rostrum2_r1, -0.2269F, 0.0F, 0.0F);
        this.rostrum2_r1.cubeList.add(new ModelBox(rostrum2_r1, 13, 42, -0.5F, 0.2667F, -2.7053F, 1, 1, 3, -0.01F, false));

        this.jaw1 = new AdvancedModelRendererExtended(this);
        this.jaw1.setRotationPoint(0.0F, 1.2365F, -0.2906F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, -0.1225F, 0.0F, 0.0F);


        this.jaw1_r1 = new AdvancedModelRendererExtended(this);
        this.jaw1_r1.setRotationPoint(0.0F, 0.8102F, -0.4207F);
        this.jaw1.addChild(jaw1_r1);
        this.setRotateAngle(jaw1_r1, -0.0698F, 0.0F, 0.0F);
        this.jaw1_r1.cubeList.add(new ModelBox(jaw1_r1, 20, 0, -2.0F, -0.8594F, -2.5006F, 4, 1, 4, -0.001F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 12.8479F, -3.2796F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.182F, 0.0F, 0.0F);


        this.jaw2_r1 = new AdvancedModelRendererExtended(this);
        this.jaw2_r1.setRotationPoint(0.0F, -13.3521F, 0.2087F);
        this.jaw2.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, -0.0175F, 0.0F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 38, 7, -1.0F, 0.3219F, -3.9541F, 2, 1, 2, -0.01F, false));

        this.lowerrostrum1 = new AdvancedModelRendererExtended(this);
        this.lowerrostrum1.setRotationPoint(0.0F, 0.1043F, -5.0279F);
        this.jaw2.addChild(lowerrostrum1);
        this.setRotateAngle(lowerrostrum1, 0.0935F, 0.0F, 0.0F);
        this.lowerrostrum1.cubeList.add(new ModelBox(lowerrostrum1, 8, 10, -0.5F, -13.0089F, 1.5728F, 1, 1, 1, -0.01F, false));

        this.jaw3 = new AdvancedModelRendererExtended(this);
        this.jaw3.setRotationPoint(0.0F, 0.3507F, -0.0119F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.1745F, 0.0F, 0.0F);


        this.jaw3_r1 = new AdvancedModelRendererExtended(this);
        this.jaw3_r1.setRotationPoint(0.0F, -11.5548F, -5.7425F);
        this.jaw3.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, 0.0873F, 0.0F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 20, 6, -0.5F, -1.0967F, 1.9938F, 1, 1, 4, -0.001F, false));

        this.gums = new AdvancedModelRendererExtended(this);
        this.gums.setRotationPoint(0.0F, 12.9479F, -1.2796F);
        this.jaw1.addChild(gums);
        this.setRotateAngle(gums, -0.4554F, 0.0F, 0.0F);


        this.frontflipperR = new AdvancedModelRendererExtended(this);
        this.frontflipperR.setRotationPoint(-2.65F, 1.8623F, -4.2491F);
        this.chest1.addChild(frontflipperR);
        this.setRotateAngle(frontflipperR, 0.0F, 0.0F, 1.3717F);
        this.frontflipperR.cubeList.add(new ModelBox(frontflipperR, 37, 0, -0.0451F, -0.3486F, -1.15F, 1, 3, 3, 0.0F, false));

        this.flipper12 = new AdvancedModelRendererExtended(this);
        this.flipper12.setRotationPoint(0.4549F, 2.6014F, -0.2F);
        this.frontflipperR.addChild(flipper12);
        this.flipper12.cubeList.add(new ModelBox(flipper12, 0, 19, -0.5025F, -0.1311F, -0.7953F, 1, 3, 2, -0.01F, false));

        this.flipper13 = new AdvancedModelRendererExtended(this);
        this.flipper13.setRotationPoint(0.0F, 12.05F, -0.65F);
        this.flipper12.addChild(flipper13);
        this.flipper13.cubeList.add(new ModelBox(flipper13, 30, 24, 0.0F, -12.0F, 0.0F, 0, 5, 4, 0.0F, false));

        this.flipper14 = new AdvancedModelRendererExtended(this);
        this.flipper14.setRotationPoint(0.4549F, 12.6514F, 0.6F);
        this.frontflipperR.addChild(flipper14);
        this.flipper14.cubeList.add(new ModelBox(flipper14, 36, 31, 0.0F, -12.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.frontflipperL = new AdvancedModelRendererExtended(this);
        this.frontflipperL.setRotationPoint(2.65F, 1.8623F, -4.2491F);
        this.chest1.addChild(frontflipperL);
        this.setRotateAngle(frontflipperL, 0.0F, 0.0F, -1.3717F);
        this.frontflipperL.cubeList.add(new ModelBox(frontflipperL, 37, 0, -0.9549F, -0.3486F, -1.15F, 1, 3, 3, 0.0F, true));

        this.flipper3 = new AdvancedModelRendererExtended(this);
        this.flipper3.setRotationPoint(-0.4549F, 2.6014F, -0.2F);
        this.frontflipperL.addChild(flipper3);
        this.flipper3.cubeList.add(new ModelBox(flipper3, 0, 19, -0.4975F, -0.1311F, -0.7953F, 1, 3, 2, -0.01F, true));

        this.flipper4 = new AdvancedModelRendererExtended(this);
        this.flipper4.setRotationPoint(0.0F, 12.05F, -0.65F);
        this.flipper3.addChild(flipper4);
        this.flipper4.cubeList.add(new ModelBox(flipper4, 30, 24, 0.0F, -12.0F, 0.0F, 0, 5, 4, 0.0F, true));

        this.flipper5 = new AdvancedModelRendererExtended(this);
        this.flipper5.setRotationPoint(-0.4549F, 12.6514F, 0.6F);
        this.frontflipperL.addChild(flipper5);
        this.flipper5.cubeList.add(new ModelBox(flipper5, 36, 31, 0.0F, -12.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.basin1 = new AdvancedModelRendererExtended(this);
        this.basin1.setRotationPoint(0.0F, 11.95F, 3.45F);
        this.body1.addChild(basin1);
        this.setRotateAngle(basin1, -0.0456F, 0.0F, 0.0F);


        this.basin1_r1 = new AdvancedModelRendererExtended(this);
        this.basin1_r1.setRotationPoint(0.0F, 0.05F, -4.45F);
        this.basin1.addChild(basin1_r1);
        this.setRotateAngle(basin1_r1, 0.0175F, 0.0F, 0.0F);
        this.basin1_r1.cubeList.add(new ModelBox(basin1_r1, 37, 48, -2.5F, -16.05F, 4.45F, 5, 7, 6, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.3F, -13.2542F, 5.7803F);
        this.basin1.addChild(tail1);
        this.setRotateAngle(tail1, 0.0524F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 34, 33, -2.3F, -2.1442F, -0.261F, 4, 5, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.0553F, 8.5385F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, -1.8F, -2.2389F, -0.4459F, 3, 5, 13, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.5307F, 12.5514F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 21, 7, -1.3F, -1.7042F, -0.8413F, 2, 4, 12, 0.0F, false));

        this.fluke2 = new AdvancedModelRendererExtended(this);
        this.fluke2.setRotationPoint(0.0F, 10.5065F, 7.9998F);
        this.tail3.addChild(fluke2);
        this.fluke2.cubeList.add(new ModelBox(fluke2, 0, 36, -0.3F, -14.6107F, -8.3411F, 0, 3, 12, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, -0.0213F, 10.8959F);
        this.tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 40, 15, -0.8F, -1.7F, -0.1F, 1, 4, 10, 0.0F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 50, 52, -0.3F, -3.1995F, -0.1228F, 0, 2, 10, 0.0F, false));

        this.Tail5 = new AdvancedModelRendererExtended(this);
        this.Tail5.setRotationPoint(0.0F, 0.4664F, 9.6357F);
        this.Tail4.addChild(Tail5);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 38, 0, -0.8F, -1.6F, -0.2F, 1, 3, 11, 0.0F, false));
        this.Tail5.cubeList.add(new ModelBox(Tail5, 14, 42, -0.3F, -3.599F, -0.2455F, 0, 2, 11, 0.0F, false));

        this.t2fluke2 = new AdvancedModelRendererExtended(this);
        this.t2fluke2.setRotationPoint(0.0F, 11.5289F, 3.5499F);
        this.tail2.addChild(t2fluke2);
        this.t2fluke2.cubeList.add(new ModelBox(t2fluke2, 16, 24, -0.3F, -15.8179F, -3.7959F, 0, 4, 13, 0.0F, false));

        this.fluke1 = new AdvancedModelRendererExtended(this);
        this.fluke1.setRotationPoint(0.0F, 11.7558F, 0.739F);
        this.tail1.addChild(fluke1);
        this.fluke1.cubeList.add(new ModelBox(fluke1, 54, 6, -0.3F, -15.0F, -1.1F, 0, 3, 9, 0.0F, false));

        this.backflipperR = new AdvancedModelRendererExtended(this);
        this.backflipperR.setRotationPoint(-2.45F, -10.3014F, 2.6644F);
        this.basin1.addChild(backflipperR);
        this.setRotateAngle(backflipperR, -0.0413F, -0.1303F, 1.2871F);
        this.backflipperR.cubeList.add(new ModelBox(backflipperR, 0, 36, -0.094F, -0.0385F, -0.4251F, 1, 4, 3, 0.0F, false));

        this.backflipper12 = new AdvancedModelRendererExtended(this);
        this.backflipper12.setRotationPoint(0.656F, 12.8115F, -0.3251F);
        this.backflipperR.addChild(backflipper12);
        this.backflipper12.cubeList.add(new ModelBox(backflipper12, 0, 0, 0.0F, -12.0F, 0.0F, 0, 6, 4, 0.0F, false));

        this.backflipperL = new AdvancedModelRendererExtended(this);
        this.backflipperL.setRotationPoint(2.45F, -10.3014F, 2.6644F);
        this.basin1.addChild(backflipperL);
        this.setRotateAngle(backflipperL, -0.0413F, 0.1303F, -1.2871F);
        this.backflipperL.cubeList.add(new ModelBox(backflipperL, 0, 36, -0.906F, -0.0385F, -0.4251F, 1, 4, 3, 0.0F, true));

        this.backflipper2 = new AdvancedModelRendererExtended(this);
        this.backflipper2.setRotationPoint(-0.656F, 12.8115F, -0.3251F);
        this.backflipperL.addChild(backflipper2);
        this.backflipper2.cubeList.add(new ModelBox(backflipper2, 0, 0, 0.0F, -12.0F, 0.0F, 0, 6, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5 * 0.32F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.jaw1.rotateAngleX = (float) Math.toRadians(10);
        this.root.rotateAngleY = (float) Math.toRadians(10);
        this.root.offsetZ = -0.151F;
        this.root.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.root.offsetY = 1.02F;
        //this.root.offsetZ = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.tail1, this.tail2, this.tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] neckHead = {this.neck1, this.head1};

        float speed = 0.24F;
        EntityPrehistoricFloraSclerocormus ee = (EntityPrehistoricFloraSclerocormus) e;
        if (ee.getIsFast()) {
            speed = speed * 1.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.5F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.585F * still, -1.85, f2, 0.6F * still);
            } else {
                this.chainSwing(fishTail, speed * still, 0.855F * still, -1.55, f2, 0.6F * still);
            }
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.swing(root, speed * 0.5F, 0.002F, true, 0, 0, f2, 0.8F);

            //front left
            this.flap(frontflipperL, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
            this.swing(frontflipperL, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);
            this.walk(frontflipperL, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);
            //front right
            this.flap(frontflipperR, (float) (speed * 0.65), 0.4F, true, 0.8F, 0, f2, 0.5F);
            this.swing(frontflipperR, (float) (speed * 0.65), 0.2F, false, 0, 0, f2, 0.5F);
            this.walk(frontflipperR, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

            this.flap(backflipperL, (float) (speed * 0.65), 0.4F, false, 1.8F, 0, f2, 0.5F);
            this.swing(backflipperL, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);
            this.walk(backflipperL, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

            this.flap(backflipperR, (float) (speed * 0.65), 0.4F, true, 1.8F, 0, f2, 0.5F);
            this.swing(backflipperR, (float) (speed * 0.65), 0.2F, false, 1, 0, f2, 0.5F);
            this.walk(backflipperR, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);
        }
        else {
            //this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.backflipperL.rotateAngleZ = (float)Math.toRadians(-75);
            this.backflipperR.rotateAngleZ = (float)Math.toRadians(75);

            this.chainSwing(fishTail, speed * still * 0.7F, 0.385F * still * 0.7F, -1.85, f2, 0.6F * still * 0.7F);
            this.chainSwing(neckHead, speed * still * 0.7F, 0.285F * still * 0.7F, -1.15, f2, 0.6F * still * 0.7F);

            if (f3 == 0 || !ee.getIsMoving()) {
                this.frontflipperL.rotateAngleZ = (float)Math.toRadians(-85);
                this.frontflipperR.rotateAngleZ = (float)Math.toRadians(85);
                return;
            }

            this.frontflipperL.rotateAngleX = (float) Math.toRadians((-40F * ee.getMoveAngle2()) + 10F);
            this.frontflipperR.rotateAngleX = (float) Math.toRadians((-40F * ee.getMoveAngle2()) + 10F);

            this.swing(root, speed * 0.5F * 0.7F, 0.002F, true, 0, 0, f2, 0.8F * 0.7F);

            if (ee.getMoveAngle() >= 0) {
                this.body1.rotateAngleX = (float) Math.toRadians(-7.5 * ee.getMoveAngle());
                this.chest1.rotateAngleX = (float) Math.toRadians(-5.0 * ee.getMoveAngle());
                this.frontflipperL.rotateAngleZ = (float)Math.toRadians(-85 + (15 * ee.getMoveAngle()));
                this.frontflipperR.rotateAngleZ = (float)Math.toRadians(85 - (15 * ee.getMoveAngle()));
            }
            else {
                this.frontflipperL.rotateAngleZ = (float)Math.toRadians(-85);
                this.frontflipperR.rotateAngleZ = (float)Math.toRadians(85);
            }

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head1, 0,0,-0.2F);
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head1, 0,0,-0.2F);
        animator.rotate(this.head1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

