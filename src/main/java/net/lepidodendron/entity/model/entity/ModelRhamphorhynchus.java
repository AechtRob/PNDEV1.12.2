package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraRhamphorhynchus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelRhamphorhynchus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended tail6;
    private final AdvancedModelRendererExtended upperlegright;
    private final AdvancedModelRendererExtended lowerlegright;
    private final AdvancedModelRendererExtended footright;
    private final AdvancedModelRendererExtended legwing4;
    private final AdvancedModelRendererExtended legwing5;
    private final AdvancedModelRendererExtended upperlegleft;
    private final AdvancedModelRendererExtended lowerlegleft;
    private final AdvancedModelRendererExtended footleft;
    private final AdvancedModelRendererExtended legwing2;
    private final AdvancedModelRendererExtended legwing3;
    private final AdvancedModelRendererExtended wingleft1;
    private final AdvancedModelRendererExtended wingleft2;
    private final AdvancedModelRendererExtended wingleft3;
    private final AdvancedModelRendererExtended wingleft4;
    private final AdvancedModelRendererExtended handleft;
    private final AdvancedModelRendererExtended wingright1;
    private final AdvancedModelRendererExtended wingright2;
    private final AdvancedModelRendererExtended wingright3;
    private final AdvancedModelRendererExtended wingright4;
    private final AdvancedModelRendererExtended handright;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended head4;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended jaw3;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;

    private ModelAnimator animator;

    public ModelRhamphorhynchus() {

        this.textureWidth = 88;
        this.textureHeight = 68;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 12.5F, -5.7F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.0456F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 27, 48, -3.5F, -2.0F, -2.0F, 7, 6, 6, 0.0F, false));

        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, 0.3F, 3.2F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 44, 15, -2.5F, -2.0F, 0.0F, 5, 5, 8, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, 0.3F, 7.1F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.0456F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 44, 29, -1.5F, -1.5F, 0.0F, 3, 3, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.1F, 6.6F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0456F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 48, -1.0F, -1.0F, 0.0F, 2, 2, 11, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 10.4F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0456F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 46, 53, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.7F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0456F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 57, 48, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 7.4F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0456F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 57, 58, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.tail6 = new AdvancedModelRendererExtended(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 24, 0.0F, -2.5F, -5.0F, 0, 5, 8, 0.0F, false));

        this.upperlegright = new AdvancedModelRendererExtended(this);
        this.upperlegright.setRotationPoint(-2.0F, 0.55F, 6.4F);
        this.body1.addChild(upperlegright);
        this.setRotateAngle(upperlegright, -0.3643F, 0.0F, 0.5009F);
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 0, 0, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.lowerlegright = new AdvancedModelRendererExtended(this);
        this.lowerlegright.setRotationPoint(-0.1F, 3.7F, -0.3F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 0.7741F, 0.0F, -0.5463F);
        this.lowerlegright.cubeList.add(new ModelBox(lowerlegright, 0, 23, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, false));

        this.footright = new AdvancedModelRendererExtended(this);
        this.footright.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, -0.4098F, 0.5918F, -0.2276F);
        this.footright.cubeList.add(new ModelBox(footright, 63, 15, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, false));

        this.legwing4 = new AdvancedModelRendererExtended(this);
        this.legwing4.setRotationPoint(-0.1F, 0.2F, 0.4F);
        this.lowerlegright.addChild(legwing4);
        this.setRotateAngle(legwing4, -0.0911F, 0.0F, 0.0F);
        this.legwing4.cubeList.add(new ModelBox(legwing4, 34, 32, 0.0F, 0.0F, 0.0F, 0, 6, 2, 0.001F, false));

        this.legwing5 = new AdvancedModelRendererExtended(this);
        this.legwing5.setRotationPoint(-0.3F, 0.0F, 0.9F);
        this.upperlegright.addChild(legwing5);
        this.legwing5.cubeList.add(new ModelBox(legwing5, 13, 0, -0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

        this.upperlegleft = new AdvancedModelRendererExtended(this);
        this.upperlegleft.setRotationPoint(2.0F, 0.55F, 6.4F);
        this.body1.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, -0.3643F, 0.0F, -0.5009F);
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 0, 0, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, true));

        this.lowerlegleft = new AdvancedModelRendererExtended(this);
        this.lowerlegleft.setRotationPoint(0.1F, 3.7F, -0.3F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 0.7741F, 0.0F, 0.5463F);
        this.lowerlegleft.cubeList.add(new ModelBox(lowerlegleft, 0, 23, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, true));

        this.footleft = new AdvancedModelRendererExtended(this);
        this.footleft.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, -0.4098F, -0.5918F, 0.2276F);
        this.footleft.cubeList.add(new ModelBox(footleft, 63, 15, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, true));

        this.legwing2 = new AdvancedModelRendererExtended(this);
        this.legwing2.setRotationPoint(0.1F, 0.2F, 0.4F);
        this.lowerlegleft.addChild(legwing2);
        this.setRotateAngle(legwing2, -0.0911F, 0.0F, 0.0F);
        this.legwing2.cubeList.add(new ModelBox(legwing2, 34, 32, 0.0F, 0.0F, 0.0F, 0, 6, 2, 0.001F, true));

        this.legwing3 = new AdvancedModelRendererExtended(this);
        this.legwing3.setRotationPoint(0.3F, 0.0F, 0.9F);
        this.upperlegleft.addChild(legwing3);
        this.legwing3.cubeList.add(new ModelBox(legwing3, 13, 0, -0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F, true));

        this.wingleft1 = new AdvancedModelRendererExtended(this);
        this.wingleft1.setRotationPoint(2.1F, -0.2F, -1.6F);
        this.chest.addChild(wingleft1);
        this.setRotateAngle(wingleft1, 0.0F, 0.182F, -0.0911F);
        this.wingleft1.cubeList.add(new ModelBox(wingleft1, 44, 0, -2.0F, -1.0F, 0.0F, 10, 2, 12, 0.0F, true));

        this.wingleft2 = new AdvancedModelRendererExtended(this);
        this.wingleft2.setRotationPoint(7.7F, 0.1F, 0.3F);
        this.wingleft1.addChild(wingleft2);
        this.setRotateAngle(wingleft2, 0.0F, 0.0F, -0.0456F);
        this.wingleft2.cubeList.add(new ModelBox(wingleft2, 0, 0, -0.5F, 0.0F, 0.0F, 1, 12, 10, 0.0F, true));

        this.wingleft3 = new AdvancedModelRendererExtended(this);
        this.wingleft3.setRotationPoint(0.1F, 12.0F, 0.3F);
        this.wingleft2.addChild(wingleft3);
        this.setRotateAngle(wingleft3, 0.0F, 0.0F, 0.0911F);
        this.wingleft3.cubeList.add(new ModelBox(wingleft3, 12, 12, -0.5F, -8.0F, 0.0F, 1, 8, 11, 0.0F, true));

        this.wingleft4 = new AdvancedModelRendererExtended(this);
        this.wingleft4.setRotationPoint(-0.1F, 0.0F, 10.7F);
        this.wingleft3.addChild(wingleft4);
        this.setRotateAngle(wingleft4, 1.1629F, 0.0F, 0.0F);
        this.wingleft4.cubeList.add(new ModelBox(wingleft4, 0, 0, -0.5F, -6.0F, 0.0F, 1, 6, 41, 0.0F, true));

        this.handleft = new AdvancedModelRendererExtended(this);
        this.handleft.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.wingleft3.addChild(handleft);
        this.setRotateAngle(handleft, 0.0F, 0.6374F, 0.0456F);
        this.handleft.cubeList.add(new ModelBox(handleft, 40, 63, -1.5F, -0.5F, 0.2F, 3, 1, 3, 0.0F, true));

        this.wingright1 = new AdvancedModelRendererExtended(this);
        this.wingright1.setRotationPoint(-2.1F, -0.2F, -1.6F);
        this.chest.addChild(wingright1);
        this.setRotateAngle(wingright1, 0.0F, -0.182F, 0.0911F);
        this.wingright1.cubeList.add(new ModelBox(wingright1, 44, 0, -8.0F, -1.0F, 0.0F, 10, 2, 12, 0.0F, false));

        this.wingright2 = new AdvancedModelRendererExtended(this);
        this.wingright2.setRotationPoint(-7.7F, 0.1F, 0.3F);
        this.wingright1.addChild(wingright2);
        this.setRotateAngle(wingright2, 0.0F, 0.0F, 0.0456F);
        this.wingright2.cubeList.add(new ModelBox(wingright2, 0, 0, -0.5F, 0.0F, 0.0F, 1, 12, 10, 0.0F, false));

        this.wingright3 = new AdvancedModelRendererExtended(this);
        this.wingright3.setRotationPoint(-0.1F, 12.0F, 0.3F);
        this.wingright2.addChild(wingright3);
        this.setRotateAngle(wingright3, 0.0F, 0.0F, -0.0911F);
        this.wingright3.cubeList.add(new ModelBox(wingright3, 12, 12, -0.5F, -8.0F, 0.0F, 1, 8, 11, 0.0F, false));

        this.wingright4 = new AdvancedModelRendererExtended(this);
        this.wingright4.setRotationPoint(0.1F, 0.0F, 10.7F);
        this.wingright3.addChild(wingright4);
        this.setRotateAngle(wingright4, 1.1629F, 0.0F, 0.0F);
        this.wingright4.cubeList.add(new ModelBox(wingright4, 0, 0, -0.5F, -6.0F, 0.0F, 1, 6, 41, 0.0F, false));

        this.handright = new AdvancedModelRendererExtended(this);
        this.handright.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.wingright3.addChild(handright);
        this.setRotateAngle(handright, 0.0F, -0.6374F, -0.0456F);
        this.handright.cubeList.add(new ModelBox(handright, 40, 63, -1.5F, -0.5F, 0.2F, 3, 1, 3, 0.0F, false));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, 0.5F, -1.3F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.1309F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 17, 32, -2.0F, -2.0F, -4.0F, 4, 4, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 26, 10, -1.5F, -1.0F, -4.0F, 3, 4, 4, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.48F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 23, 61, -2.0F, -1.0F, -3.0F, 4, 3, 4, 0.0F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, 0.1745F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 13, 0, -1.0F, -1.0F, -7.5F, 2, 1, 8, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 26, 0, -1.5F, -2.0F, -2.5F, 3, 2, 4, 0.002F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -7.5F);
        this.head2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 19, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(1.0F, 0.0F, -3.75F);
        this.head2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, -0.48F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 10, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.0F, -3.75F);
        this.head2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.48F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 10, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(1.0F, 0.0F, -6.0F);
        this.head2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, -0.829F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 23, 0.0F, -0.5F, -1.0F, 0, 2, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.0F, -6.0F);
        this.head2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.829F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 23, 0.0F, -0.5F, -1.0F, 0, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(1.5F, 0.0F, -1.25F);
        this.head2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, -0.48F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 27, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-1.5F, 0.0F, -1.25F);
        this.head2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.48F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 27, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, -2.95F, 0.525F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.2379F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 48, 48, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.001F, false));
        this.head3.cubeList.add(new ModelBox(head3, 0, 38, -1.5F, 0.0F, -3.3F, 3, 1, 1, 0.0F, false));

        this.head4 = new AdvancedModelRendererExtended(this);
        this.head4.setRotationPoint(0.0F, 0.0F, -3.2F);
        this.head3.addChild(head4);
        this.head4.cubeList.add(new ModelBox(head4, 58, 29, -1.0F, 0.0F, -5.05F, 2, 1, 5, -0.001F, false));
        this.head4.cubeList.add(new ModelBox(head4, 44, 29, -1.0F, 0.0F, -1.1F, 2, 2, 1, -0.002F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 16, 48, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3272F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 62, -1.5F, -3.0F, 0.0F, 3, 3, 3, 0.001F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.1745F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 44, 0, -1.0F, 0.0F, -5.0F, 2, 1, 3, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 26, 19, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 0, 7, -1.5F, 0.0F, -2.5F, 3, 1, 1, -0.001F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(1.0F, 0.0F, -2.75F);
        this.jaw2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -2.618F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 5, 27, 0.0F, 0.0F, -0.75F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-1.0F, 0.0F, -2.75F);
        this.jaw2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 2.618F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 27, 0.0F, 0.0F, -0.75F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.jaw2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -2.618F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 32, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.jaw2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 2.618F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 32, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.jaw3 = new AdvancedModelRendererExtended(this);
        this.jaw3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.3927F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 44, 5, -1.0F, 0.0F, -2.0F, 2, 1, 2, -0.001F, false));
        this.jaw3.cubeList.add(new ModelBox(jaw3, 34, 7, -1.0F, 0.0F, -2.75F, 2, 1, 1, -0.002F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, 1.0F, -2.75F);
        this.jaw3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.48F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 38, -0.5F, -1.0F, -2.5F, 1, 1, 1, -0.001F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 44, 15, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(1.0F, 0.0F, -1.75F);
        this.jaw3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.5672F, 0.0F, -2.4435F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 5, 23, 0.0F, -0.5F, -1.0F, 0, 2, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(-1.0F, 0.0F, -1.75F);
        this.jaw3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5672F, 0.0F, 2.4435F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 5, 23, 0.0F, -0.5F, -1.0F, 0, 2, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.jaw3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1745F, 0.0F, -2.618F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 0, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.jaw3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 2.618F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 0, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(chest, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.6F, -0.0F, -0.2F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(wingleft1, -0.0F, 0.4F, -0.4F);
        this.setRotateAngle(wingleft2, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(wingleft3, -1.3F, 0.0F, 0.5F);
        this.setRotateAngle(wingleft4, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(handleft, 0.0F,-0.0F, 1.5F);
        this.setRotateAngle(wingright1, 0.0F, -0.4F, 0.4F);
        this.setRotateAngle(wingright2, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(wingright3, -1.3F, 0.0F, -0.5F);
        this.setRotateAngle(wingright4, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(handright, 0.0F,0.0F, 0.0F);
        this.upperlegleft.setScale(0,0,0);
        this.upperlegright.setScale(0,0,0);
        this.upperlegleft.scaleChildren = true;
        this.upperlegright.scaleChildren = true;
        this.upperlegleft.setScale(1,1,1);
        this.upperlegright.setScale(1,1,1);
        this.root.offsetY = -0.15F;
        this.root.offsetX = 0.0F;
        this.root.offsetZ = -0.24F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(chest, -0.08F, 0.0F, 0.0F);
        this.setRotateAngle(body1, -0.05F, 0.1F, 0.0F);
        this.setRotateAngle(neck1, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.3F, -0.05F, 0.0F);
        this.setRotateAngle(head, 0.6F, -0.1F, -0.2F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.05F, 0.05F, 0.0F);
        this.setRotateAngle(tail4, 0.05F, 0.05F, 0.0F);
        this.setRotateAngle(tail5, 0.05F, 0.05F, 0.0F);
        this.setRotateAngle(upperlegright, -0.3F, 0.0F, 0.4F);
        this.setRotateAngle(lowerlegright, 0.0F, 0.0F, -0.4F);
        this.setRotateAngle(upperlegleft, 0.5F, 0.0F, -0.4F);
        this.setRotateAngle(footright, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(wingleft1, 0.0F, 0.28F, 0.0F);
        this.setRotateAngle(wingleft2, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(wingleft3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(wingleft4, 1.1F, 0.0F, 0.0F);
        this.setRotateAngle(wingright1, -0.05F, 0.28F, 0.08F);
        this.setRotateAngle(wingright2, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(wingright3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(wingright4, 0.9F, 0.0F, 0.0F);
        this.root.offsetY = 0.03F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {
        this.setRotateAngle(chest, 0.0F, 0.0F, -0.3F);
        this.setRotateAngle(body1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.2F, 0.05F, 0.0F);
        this.setRotateAngle(head, 0.6F, 0.1F, 0.2F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegright, 0.4F, 0.0F, 1.3F);
        this.setRotateAngle(lowerlegright, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(footright, 0.9F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegleft, 0.4F, 0.0F, -1.3F);
        this.setRotateAngle(lowerlegleft, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(footleft, 0.9F, 0.0F, 0.0F);
        this.setRotateAngle(wingleft1, -0.0F, 0.0F, -0.4F);
        this.setRotateAngle(wingleft2, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(wingleft3, -1.5F, 0.0F, 0.5F);
        this.setRotateAngle(wingleft4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(handleft, 0.0F,-0.0F, 1.5F);
        this.setRotateAngle(wingright1, 0.0F, 0.0F, 0.4F);
        this.setRotateAngle(wingright2, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(wingright3, -1.5F, 0.0F, -0.5F);
        this.setRotateAngle(wingright4, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(handright, 0.0F,0.0F, 1.5F);
        this.root.offsetY = -0.0F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.5F;
        this.root.offsetX = 0F;
        this.root.rotateAngleY = (float)Math.toRadians(130);
        this.root.rotateAngleX = (float)Math.toRadians(10);
        this.root.rotateAngleZ = (float)Math.toRadians(2);
        this.root.scaleChildren = true;
        float scaler = 0.65F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(chest, 0.0F, 0.0F, -0.3F);
        this.setRotateAngle(body1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.2F, 0.05F, 0.0F);
        this.setRotateAngle(head, 0.6F, 0.1F, 0.2F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegright, 0.4F, 0.0F, 1.3F);
        this.setRotateAngle(lowerlegright, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(footright, 0.9F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegleft, 0.4F, 0.0F, -1.3F);
        this.setRotateAngle(lowerlegleft, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(footleft, 0.9F, 0.0F, 0.0F);
        this.setRotateAngle(wingleft1, -0.0F, 0.0F, -0.4F);
        this.setRotateAngle(wingleft2, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(wingleft3, -1.5F, 0.0F, 0.5F);
        this.setRotateAngle(wingleft4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(handleft, 0.0F,-0.0F, 1.5F);
        this.setRotateAngle(wingright1, 0.0F, 0.0F, 0.4F);
        this.setRotateAngle(wingright2, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(wingright3, -1.5F, 0.0F, -0.5F);
        this.setRotateAngle(wingright4, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(handright, 0.0F,0.0F, 1.5F);
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
        if (flier.isReallyFlying() || flier.getAnimation() == flier.UNFLY_ANIMATION) {
            //flight pose

        } else if (flier.getAttachmentPos() != null) {
            if (flier.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The model is already reset to default each cycle so no need to do more here
            }
            else {
                //Climb pose

            }
        }

        AdvancedModelRenderer[] tailFull = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};

        float speed = 0.48F;

        //Animations:

        if (flier.isReallyFlying()) { //flying
            this.faceTarget(f3, f4, 8, neck1);
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
            this.faceTarget(f3, f4, 12, neck1);
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
        EntityPrehistoricFloraRhamphorhynchus ee = (EntityPrehistoricFloraRhamphorhynchus) entitylivingbaseIn;

        if (ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //Special case here as we don't have the models done properly :/
            this.setRotateAngle(chest, 0.1143F, 0.0F, 0.0421F);
            this.setRotateAngle(body1, 0.0037F, 0.0F, -0.0309F);
            this.setRotateAngle(tail1, -0.2963F, 0.0212F, -0.0421F);
            this.setRotateAngle(tail2, -0.0414F, -0.0212F, 0.0113F);
            this.setRotateAngle(tail3, -0.035F, -0.0424F, 0.0309F);
            this.setRotateAngle(tail4, -0.0187F, 0.0F, 0.0F);
            this.setRotateAngle(tail5, -0.035F, 0.0F, 0.0F);
            this.setRotateAngle(upperlegright, 0.3753F, 0.2484F, 1.3667F);
            this.setRotateAngle(lowerlegright, 0.501F, 0.0F, -0.0227F);
            this.setRotateAngle(footright, 1.3355F, -0.4554F, -0.0094F);
            this.setRotateAngle(legwing4, -0.0911F, 0.0F, 0.0F);
            this.setRotateAngle(upperlegleft, 0.3753F, -0.2484F, -1.3667F);
            this.setRotateAngle(lowerlegleft, 0.501F, 0.0F, 0.0227F);
            this.setRotateAngle(footleft, 1.3355F, 0.4554F, 0.0094F);
            this.setRotateAngle(legwing2, -0.0911F, 0.0F, 0.0F);
            this.setRotateAngle(wingleft1, -0.0762F, 0.0542F, -0.5594F);
            this.setRotateAngle(wingleft2, 0.03F, -0.0046F, -1.4427F);
            this.setRotateAngle(wingleft3, -1.5708F, 0.001F, 0.5418F);
            this.setRotateAngle(wingleft4, 0.203F, -0.1731F, 0.0F);
            this.setRotateAngle(handleft, 0.0F, 0.0265F, 1.5727F);
            this.setRotateAngle(wingright1, -0.0762F, -0.0542F, 0.5594F);
            this.setRotateAngle(wingright2, -0.051F, 0.0724F, 1.442F);
            this.setRotateAngle(wingright3, -1.5708F, -0.001F, -0.5418F);
            this.setRotateAngle(wingright4, 0.203F, 0.1731F, 0.0F);
            this.setRotateAngle(handright, 0.0F, -0.0265F, -1.5727F);
            this.setRotateAngle(neck1, 0.0034F, 0.0F, -0.0113F);
            this.setRotateAngle(neck2, -0.1599F, 0.0F, -0.0421F);
            this.setRotateAngle(head, 0.3018F, 0.0F, 0.0309F);
            this.setRotateAngle(head2, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, -0.3491F, 0.0F, -0.48F);
            this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.48F);
            this.setRotateAngle(cube_r4, -0.1745F, 0.0F, -0.829F);
            this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.829F);
            this.setRotateAngle(cube_r6, -0.1745F, 0.0F, -0.48F);
            this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.48F);
            this.setRotateAngle(head3, 0.2379F, 0.0F, 0.0F);
            this.setRotateAngle(jaw, 0.0171F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, -0.3272F, 0.0F, 0.0F);
            this.setRotateAngle(jaw2, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, 0.0F, 0.0F, -2.618F);
            this.setRotateAngle(cube_r10, 0.0F, 0.0F, 2.618F);
            this.setRotateAngle(cube_r11, 0.0F, 0.0F, -2.618F);
            this.setRotateAngle(cube_r12, 0.0F, 0.0F, 2.618F);
            this.setRotateAngle(jaw3, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, -0.48F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r14, -0.5672F, 0.0F, -2.4435F);
            this.setRotateAngle(cube_r15, -0.5672F, 0.0F, 2.4435F);
            this.setRotateAngle(cube_r16, -0.1745F, 0.0F, -2.618F);
            this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 2.618F);
        }
        else if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            //Already baked into the animations based on the default pose for this model
        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The model is already reset to default each cycle so no need to do more here
            }
            else {
                //Climb pose
                //Rhampho does not climb
            }
        }

        if (ee.getAttachmentPos() == null && ee.getAnimation() != ee.FLY_ANIMATION) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Flying fast
                    animFlyFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                else { //Flying regular
                    animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
            else { //Flying regular but stright upwards
                animFlyFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is Walking:
                if (ee.getIsMoving()) {
                    if (ee.getIsFast()) { //Walking fast
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else { //Walking regular
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }

            }
            else if (!ee.getHeadCollided()){
                //Climbing
                //animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                //Rhampho does not climb
            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.PREEN_ANIMATION) { //The noise anim
            animPreen(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The noise anim
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRhamphorhynchus entity = (EntityPrehistoricFloraRhamphorhynchus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 5) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 4) / 6) * (0-(-15)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -30 + (((tickAnim - 3) / 4) * (0-(-30)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 25 + (((tickAnim - 3) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
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


    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRhamphorhynchus entity = (EntityPrehistoricFloraRhamphorhynchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (20-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 7) / 13) * (0-(20)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 20 + (((tickAnim - 5) / 5) * (10-(20)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 10) / 10) * (0-(10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 20 + (((tickAnim - 6) / 10) * (-20-(20)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 16) / 4) * (0-(-20)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 25 + (((tickAnim - 4) / 3) * (25-(25)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 25 + (((tickAnim - 7) / 2) * (0-(25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRhamphorhynchus entity = (EntityPrehistoricFloraRhamphorhynchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -23.75 + (((tickAnim - 4) / 3) * (-10-(-23.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -10 + (((tickAnim - 7) / 8) * (0-(-10)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (6.67-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 6.67 + (((tickAnim - 4) / 6) * (10-(6.67)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 10) / 5) * (0-(10)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 20 + (((tickAnim - 6) / 5) * (-10-(20)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -10 + (((tickAnim - 11) / 4) * (0-(-10)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 25 + (((tickAnim - 4) / 3) * (25-(25)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 25 + (((tickAnim - 7) / 2) * (0-(25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRhamphorhynchus entity = (EntityPrehistoricFloraRhamphorhynchus) entitylivingbaseIn;

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
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 30) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 60) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
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
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5)));
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
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 0) / 30) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5 + (((tickAnim - 30) / 30) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5 + (((tickAnim - 60) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 70) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
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
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
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
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 0) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5 + (((tickAnim - 30) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5 + (((tickAnim - 60) / 10) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 70) / 10) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2 + (((tickAnim - 0) / 30) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2 + (((tickAnim - 30) / 30) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2 + (((tickAnim - 60) / 10) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2 + (((tickAnim - 70) / 10) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 0) / 30) * (45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            zz = 50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10 + (((tickAnim - 0) / 30) * (50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10-(50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 30) / 30) * (45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10 + (((tickAnim - 30) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10)));
            zz = 50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10 + (((tickAnim - 30) / 30) * (50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10-(50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 60) / 10) * (45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10)));
            zz = 50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10 + (((tickAnim - 60) / 10) * (50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10-(50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 70) / 10) * (45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            zz = 50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10 + (((tickAnim - 70) / 10) * (50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10-(50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 0) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 30 + (((tickAnim - 0) / 30) * (30-(30)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 30) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 30 + (((tickAnim - 30) / 30) * (30-(30)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 60) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 30 + (((tickAnim - 60) / 10) * (30-(30)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 70) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 30 + (((tickAnim - 70) / 10) * (30-(30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 100 + (((tickAnim - 0) / 30) * (100-(100)));
            yy = -60 + (((tickAnim - 0) / 30) * (-60-(-60)));
            zz = 12.5 + (((tickAnim - 0) / 30) * (12.5-(12.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 100 + (((tickAnim - 30) / 30) * (100-(100)));
            yy = -60 + (((tickAnim - 30) / 30) * (-60-(-60)));
            zz = 12.5 + (((tickAnim - 30) / 30) * (12.5-(12.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 100 + (((tickAnim - 60) / 10) * (100-(100)));
            yy = -60 + (((tickAnim - 60) / 10) * (-60-(-60)));
            zz = 12.5 + (((tickAnim - 60) / 10) * (12.5-(12.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 100 + (((tickAnim - 70) / 10) * (100-(100)));
            yy = -60 + (((tickAnim - 70) / 10) * (-60-(-60)));
            zz = 12.5 + (((tickAnim - 70) / 10) * (12.5-(12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 0) / 30) * (45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 0) / 30) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 30) / 30) * (45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 30) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 30) / 30) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 60) / 10) * (45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 60) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 60) / 10) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 70) / 10) * (45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 70) / 10) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 0) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = -30 + (((tickAnim - 0) / 30) * (-30-(-30)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 30) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = -30 + (((tickAnim - 30) / 30) * (-30-(-30)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 60) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = -30 + (((tickAnim - 60) / 10) * (-30-(-30)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 70) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = -30 + (((tickAnim - 70) / 10) * (-30-(-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 100 + (((tickAnim - 0) / 30) * (100-(100)));
            yy = 60 + (((tickAnim - 0) / 30) * (60-(60)));
            zz = -12.5 + (((tickAnim - 0) / 30) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 100 + (((tickAnim - 30) / 30) * (100-(100)));
            yy = 60 + (((tickAnim - 30) / 30) * (60-(60)));
            zz = -12.5 + (((tickAnim - 30) / 30) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 100 + (((tickAnim - 60) / 10) * (100-(100)));
            yy = 60 + (((tickAnim - 60) / 10) * (60-(60)));
            zz = -12.5 + (((tickAnim - 60) / 10) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 100 + (((tickAnim - 70) / 10) * (100-(100)));
            yy = 60 + (((tickAnim - 70) / 10) * (60-(60)));
            zz = -12.5 + (((tickAnim - 70) / 10) * (-12.5-(-12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20 + (((tickAnim - 0) / 30) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 30) / 30) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 60) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.wingleft1.rotationPointX = this.wingleft1.rotationPointX + (float)(xx);
        this.wingleft1.rotationPointY = this.wingleft1.rotationPointY - (float)(yy);
        this.wingleft1.rotationPointZ = this.wingleft1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.4984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-0.4984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.25 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.25)));
            zz = -85.0415+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 0) / 30) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(-85.0415+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 30) / 30) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (0.9968+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0007-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 60) / 10) * (-84.9127+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.9968+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (-0.4984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(0.9968+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0007 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0007)));
            zz = -84.9127+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 70) / 10) * (-85.0415+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(-84.9127+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -90 + (((tickAnim - 0) / 30) * (-90-(-90)));
            yy = 0 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -90 + (((tickAnim - 30) / 30) * (-90-(-90)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 30) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -90 + (((tickAnim - 60) / 10) * (-90-(-90)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -90 + (((tickAnim - 70) / 10) * (-90-(-90)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft3, wingleft3.rotateAngleX + (float) Math.toRadians(xx), wingleft3.rotateAngleY + (float) Math.toRadians(yy), wingleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -55 + (((tickAnim - 0) / 30) * (-55-(-55)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -55 + (((tickAnim - 30) / 30) * (-55-(-55)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -55 + (((tickAnim - 60) / 10) * (-55-(-55)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -55 + (((tickAnim - 70) / 10) * (-55-(-55)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(xx), wingleft4.rotateAngleY + (float) Math.toRadians(yy), wingleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -35 + (((tickAnim - 0) / 30) * (-35-(-35)));
            zz = 87.5 + (((tickAnim - 0) / 30) * (87.5-(87.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = -35 + (((tickAnim - 30) / 30) * (-35-(-35)));
            zz = 87.5 + (((tickAnim - 30) / 30) * (87.5-(87.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = -35 + (((tickAnim - 60) / 10) * (-35-(-35)));
            zz = 87.5 + (((tickAnim - 60) / 10) * (87.5-(87.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = -35 + (((tickAnim - 70) / 10) * (-35-(-35)));
            zz = 87.5 + (((tickAnim - 70) / 10) * (87.5-(87.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20 + (((tickAnim - 0) / 30) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 30) / 30) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.wingright1.rotationPointX = this.wingright1.rotationPointX + (float)(xx);
        this.wingright1.rotationPointY = this.wingright1.rotationPointY - (float)(yy);
        this.wingright1.rotationPointZ = this.wingright1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 0) / 30) * (85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 30) / 30) * (85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 60) / 10) * (85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 70) / 10) * (85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -90 + (((tickAnim - 0) / 30) * (-90-(-90)));
            yy = 0 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -90 + (((tickAnim - 30) / 30) * (-90-(-90)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 30) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -90 + (((tickAnim - 60) / 10) * (-90-(-90)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -90 + (((tickAnim - 70) / 10) * (-90-(-90)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright3, wingright3.rotateAngleX + (float) Math.toRadians(xx), wingright3.rotateAngleY + (float) Math.toRadians(yy), wingright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -55 + (((tickAnim - 0) / 30) * (-55-(-55)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -55 + (((tickAnim - 30) / 30) * (-55-(-55)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -55 + (((tickAnim - 60) / 10) * (-55-(-55)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -55 + (((tickAnim - 70) / 10) * (-55-(-55)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(xx), wingright4.rotateAngleY + (float) Math.toRadians(yy), wingright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 35 + (((tickAnim - 0) / 30) * (35-(35)));
            zz = -87.5 + (((tickAnim - 0) / 30) * (-87.5-(-87.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 35 + (((tickAnim - 30) / 30) * (35-(35)));
            zz = -87.5 + (((tickAnim - 30) / 30) * (-87.5-(-87.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 35 + (((tickAnim - 60) / 10) * (35-(35)));
            zz = -87.5 + (((tickAnim - 60) / 10) * (-87.5-(-87.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 35 + (((tickAnim - 70) / 10) * (35-(35)));
            zz = -87.5 + (((tickAnim - 70) / 10) * (-87.5-(-87.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animFlyFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRhamphorhynchus entity = (EntityPrehistoricFloraRhamphorhynchus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*2.5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-0.5);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-2.5), body1.rotateAngleY + (float) Math.toRadians(0), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*-2.5));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-5), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-2.5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-2.5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-2.5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-2.5), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*2.5));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*5), upperlegright.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5), upperlegright.rotateAngleZ + (float) Math.toRadians(50+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*10));


        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*-5), lowerlegright.rotateAngleY + (float) Math.toRadians(0), lowerlegright.rotateAngleZ + (float) Math.toRadians(30));


        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(100), footright.rotateAngleY + (float) Math.toRadians(-60), footright.rotateAngleZ + (float) Math.toRadians(12.5));


        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*5), upperlegleft.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), upperlegleft.rotateAngleZ + (float) Math.toRadians(-50+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-10));


        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*-5), lowerlegleft.rotateAngleY + (float) Math.toRadians(0), lowerlegleft.rotateAngleZ + (float) Math.toRadians(-30));


        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(100), footleft.rotateAngleY + (float) Math.toRadians(60), footleft.rotateAngleZ + (float) Math.toRadians(-12.5));


        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+75))*-10), wingleft1.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+105))*-5), wingleft1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-30));
        this.wingleft1.rotationPointX = this.wingleft1.rotationPointX + (float)(0);
        this.wingleft1.rotationPointY = this.wingleft1.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*0.5);
        this.wingleft1.rotationPointZ = this.wingleft1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.2493+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 5) * (1.95525-(-0.2493+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = -85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 0) / 5) * (-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 1.95525 + (((tickAnim - 5) / 4) * (2.7507+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(1.95525)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 5) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = -85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 5) / 4) * (-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 2.7507+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 9) / 9) * (6.2507+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(2.7507+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 9) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = -85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 9) / 9) * (-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else if (tickAnim >= 18 && tickAnim < 48) {
            xx = 6.2507+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 18) / 30) * (0.63726-(6.2507+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 18) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = -85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 18) / 30) * (-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else if (tickAnim >= 48 && tickAnim < 68) {
            xx = 0.63726 + (((tickAnim - 48) / 20) * (0.01476-(0.63726)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 48) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = -85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 48) / 20) * (-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 0.01476 + (((tickAnim - 68) / 7) * (-0.40802-(0.01476)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 68) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = -85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 68) / 7) * (-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -0.40802 + (((tickAnim - 75) / 3) * (-1.33444-(-0.40802)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 75) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = -85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 75) / 3) * (-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = -1.33444 + (((tickAnim - 78) / 2) * (-0.2493+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(-1.33444)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75 + (((tickAnim - 78) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.75)));
            zz = -85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20 + (((tickAnim - 78) / 2) * (-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20-(-85.0187+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(wingleft3, wingleft3.rotateAngleX + (float) Math.toRadians(-85), wingleft3.rotateAngleY + (float) Math.toRadians(0), wingleft3.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*-25));


        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(-55), wingleft4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*10), wingleft4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(0), handleft.rotateAngleY + (float) Math.toRadians(-35), handleft.rotateAngleZ + (float) Math.toRadians(87.5));


        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+75))*-10), wingright1.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+105))*5), wingright1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*30));
        this.wingright1.rotationPointX = this.wingright1.rotationPointX + (float)(0);
        this.wingright1.rotationPointY = this.wingright1.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*0.5);
        this.wingright1.rotationPointZ = this.wingright1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.5055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 5) * (1.98681-(0.5055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -3.4977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 0) / 5) * (4.2474+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-3.4977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 85.122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 0) / 5) * (85.3923+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(85.122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 1.98681 + (((tickAnim - 5) / 4) * (3.2555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(1.98681)));
            yy = 4.2474+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 5) / 4) * (-3.4977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(4.2474+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 85.3923+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 5) / 4) * (85.122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(85.3923+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 3.2555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 9) / 6) * (3.2266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(3.2555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -3.4977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 9) / 6) * (2.5439+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-3.4977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 85.122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 9) / 6) * (85.509+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(85.122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 3.2266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 15) / 7) * (3.1725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(3.2266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 2.5439+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 15) / 7) * (-3.6523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(2.5439+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 85.509+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 15) / 7) * (84.6888+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(85.509+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 3.1725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 22) / 4) * (3.1736+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(3.1725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -3.6523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 22) / 4) * (4.0977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-3.6523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 84.6888+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 22) / 4) * (84.6764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(84.6888+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 3.1736+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 26) / 6) * (3.0927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(3.1736+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 4.0977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 26) / 6) * (-3.5868+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(4.0977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 84.6764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 26) / 6) * (83.6673+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(84.6764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 3.0927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 32) / 4) * (3.0927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(3.0927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -3.5868+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 32) / 4) * (4.6632+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-3.5868+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 83.6673+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 32) / 4) * (83.6653+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(83.6673+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 3.0927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 36) / 5) * (4.5074+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(3.0927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 4.6632+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 36) / 5) * (-5.034+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(4.6632+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 83.6653+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 36) / 5) * (82.6456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(83.6653+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 41 && tickAnim < 47) {
            xx = 4.5074+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 41) / 6) * (3.0118+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(4.5074+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -5.034+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 41) / 6) * (3.5375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-5.034+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 82.6456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 41) / 6) * (82.5616+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(82.6456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = 3.0118+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 47) / 5) * (2.9424+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(3.0118+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 3.5375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 47) / 5) * (-4.6457+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(3.5375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 82.5616+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 47) / 5) * (81.5109+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(82.5616+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 52 && tickAnim < 57) {
            xx = 2.9424+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 52) / 5) * (2.9593+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(2.9424+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -4.6457+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 52) / 5) * (3.3519+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-4.6457+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 81.5109+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 52) / 5) * (81.3177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(81.5109+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 57 && tickAnim < 61) {
            xx = 2.9593+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 57) / 4) * (2.9115+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(2.9593+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 3.3519+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 57) / 4) * (-6.7153+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(3.3519+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 81.3177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 57) / 4) * (80.4095+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(81.3177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = 2.9115+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 61) / 5) * (2.9113+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(2.9115+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -6.7153+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 61) / 5) * (5.8699+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-6.7153+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 80.4095+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 61) / 5) * (80.6007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(80.4095+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 66 && tickAnim < 70) {
            xx = 2.9113+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 66) / 4) * (2.8652+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(2.9113+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 5.8699+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 66) / 4) * (-4.3672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(5.8699+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 80.6007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 66) / 4) * (80.0829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(80.6007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 2.8652+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 70) / 5) * (2.8318+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(2.8652+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = -4.3672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 70) / 5) * (3.2856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-4.3672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 80.0829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 70) / 5) * (80.6032+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(80.0829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 2.8318+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 75) / 5) * (0.5055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(2.8318+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 3.2856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 75) / 5) * (-3.4977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(3.2856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 80.6032+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20 + (((tickAnim - 75) / 5) * (85.122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20-(80.6032+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(wingright3, wingright3.rotateAngleX + (float) Math.toRadians(-85), wingright3.rotateAngleY + (float) Math.toRadians(0), wingright3.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*25));


        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(-55), wingright4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-10), wingright4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(0), handright.rotateAngleY + (float) Math.toRadians(35), handright.rotateAngleZ + (float) Math.toRadians(-87.5));

    }


    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRhamphorhynchus entity = (EntityPrehistoricFloraRhamphorhynchus) entitylivingbaseIn;

        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*10), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*2.5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-0.5);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-2);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+120))*-10), body1.rotateAngleY + (float) Math.toRadians(0), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-10), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*-2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*5), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-2.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-180))*5), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-180))*-2.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-5), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-240))*5), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-210))*-2.5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-10), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-10), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*10), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));















        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 25 + (((tickAnim - 0) / 2) * (10-(25)));
            yy = -2.5 + (((tickAnim - 0) / 2) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 2) / 1) * (-15-(10)));
            yy = -2.5 + (((tickAnim - 2) / 1) * (5-(-2.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (-7.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15 + (((tickAnim - 3) / 2) * (-30-(-15)));
            yy = 5 + (((tickAnim - 3) / 2) * (5-(5)));
            zz = -7.5 + (((tickAnim - 3) / 2) * (-5-(-7.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -30 + (((tickAnim - 5) / 1) * (0-(-30)));
            yy = 5 + (((tickAnim - 5) / 1) * (5-(5)));
            zz = -5 + (((tickAnim - 5) / 1) * (-7.5-(-5)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (15-(0)));
            yy = 5 + (((tickAnim - 6) / 1) * (0-(5)));
            zz = -7.5 + (((tickAnim - 6) / 1) * (-2.5-(-7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 7) / 1) * (27.5-(15)));
            yy = 0 + (((tickAnim - 7) / 1) * (-1.25-(0)));
            zz = -2.5 + (((tickAnim - 7) / 1) * (-1.25-(-2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 27.5 + (((tickAnim - 8) / 0) * (40-(27.5)));
            yy = -1.25 + (((tickAnim - 8) / 0) * (-2.5-(-1.25)));
            zz = -1.25 + (((tickAnim - 8) / 0) * (0-(-1.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 8) / 2) * (25-(40)));
            yy = -2.5 + (((tickAnim - 8) / 2) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 2) * (1-(0.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 2) / 1) * (1-(1)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 3) / 2) * (0-(1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 6) / 1) * (0.5-(0.25)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 7) / 1) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.25 + (((tickAnim - 8) / 0) * (0-(0.25)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegright.rotationPointX = this.upperlegright.rotationPointX + (float)(xx);
        this.upperlegright.rotationPointY = this.upperlegright.rotationPointY - (float)(yy);
        this.upperlegright.rotationPointZ = this.upperlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.5 + (((tickAnim - 0) / 2) * (20-(7.5)));
            yy = -5 + (((tickAnim - 0) / 2) * (2.5-(-5)));
            zz = 12.5 + (((tickAnim - 0) / 2) * (12.5-(12.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 20 + (((tickAnim - 2) / 1) * (27.5-(20)));
            yy = 2.5 + (((tickAnim - 2) / 1) * (2.5-(2.5)));
            zz = 12.5 + (((tickAnim - 2) / 1) * (12.5-(12.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27.5 + (((tickAnim - 3) / 2) * (25-(27.5)));
            yy = 2.5 + (((tickAnim - 3) / 2) * (5-(2.5)));
            zz = 12.5 + (((tickAnim - 3) / 2) * (12.5-(12.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 25 + (((tickAnim - 5) / 1) * (-25-(25)));
            yy = 5 + (((tickAnim - 5) / 1) * (2.5-(5)));
            zz = 12.5 + (((tickAnim - 5) / 1) * (17.5-(12.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -25 + (((tickAnim - 6) / 1) * (-20-(-25)));
            yy = 2.5 + (((tickAnim - 6) / 1) * (0-(2.5)));
            zz = 17.5 + (((tickAnim - 6) / 1) * (12.5-(17.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 7) / 1) * (-20-(-20)));
            yy = 0 + (((tickAnim - 7) / 1) * (-2.5-(0)));
            zz = 12.5 + (((tickAnim - 7) / 1) * (12.5-(12.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 8) / 0) * (-25-(-20)));
            yy = -2.5 + (((tickAnim - 8) / 0) * (-5-(-2.5)));
            zz = 12.5 + (((tickAnim - 8) / 0) * (12.5-(12.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -25 + (((tickAnim - 8) / 2) * (7.5-(-25)));
            yy = -5 + (((tickAnim - 8) / 2) * (-5-(-5)));
            zz = 12.5 + (((tickAnim - 8) / 2) * (12.5-(12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 47.5 + (((tickAnim - 0) / 2) * (10-(47.5)));
            yy = -42.5 + (((tickAnim - 0) / 2) * (-42.5-(-42.5)));
            zz = 7.5 + (((tickAnim - 0) / 2) * (7.5-(7.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 2) / 1) * (-2.5-(10)));
            yy = -42.5 + (((tickAnim - 2) / 1) * (-32.5-(-42.5)));
            zz = 7.5 + (((tickAnim - 2) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 3) / 2) * (30-(-2.5)));
            yy = -32.5 + (((tickAnim - 3) / 2) * (-32.5-(-32.5)));
            zz = 7.5 + (((tickAnim - 3) / 2) * (7.5-(7.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 30 + (((tickAnim - 5) / 1) * (32.5-(30)));
            yy = -32.5 + (((tickAnim - 5) / 1) * (-37.5-(-32.5)));
            zz = 7.5 + (((tickAnim - 5) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 32.5 + (((tickAnim - 6) / 1) * (10-(32.5)));
            yy = -37.5 + (((tickAnim - 6) / 1) * (-40-(-37.5)));
            zz = 7.5 + (((tickAnim - 6) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 7) / 1) * (-2.5-(10)));
            yy = -40 + (((tickAnim - 7) / 1) * (-41.25-(-40)));
            zz = 7.5 + (((tickAnim - 7) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 8) / 0) * (10-(-2.5)));
            yy = -41.25 + (((tickAnim - 8) / 0) * (-42.5-(-41.25)));
            zz = 7.5 + (((tickAnim - 8) / 0) * (7.5-(7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 8) / 2) * (47.5-(10)));
            yy = -42.5 + (((tickAnim - 8) / 2) * (-42.5-(-42.5)));
            zz = 7.5 + (((tickAnim - 8) / 2) * (7.5-(7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 40 + (((tickAnim - 0) / 2) * (25-(40)));
            yy = 2.5 + (((tickAnim - 0) / 2) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 25 + (((tickAnim - 2) / 1) * (10-(25)));
            yy = 2.5 + (((tickAnim - 2) / 1) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10 + (((tickAnim - 3) / 2) * (-15-(10)));
            yy = 2.5 + (((tickAnim - 3) / 2) * (-5-(2.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (7.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -15 + (((tickAnim - 5) / 2) * (-30-(-15)));
            yy = -5 + (((tickAnim - 5) / 2) * (-5-(-5)));
            zz = 7.5 + (((tickAnim - 5) / 2) * (5-(7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -30 + (((tickAnim - 7) / 1) * (0-(-30)));
            yy = -5 + (((tickAnim - 7) / 1) * (-5-(-5)));
            zz = 5 + (((tickAnim - 7) / 1) * (7.5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (15-(0)));
            yy = -5 + (((tickAnim - 8) / 0) * (0-(-5)));
            zz = 7.5 + (((tickAnim - 8) / 0) * (2.5-(7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 15 + (((tickAnim - 8) / 1) * (27.5-(15)));
            yy = 0 + (((tickAnim - 8) / 1) * (1.25-(0)));
            zz = 2.5 + (((tickAnim - 8) / 1) * (1.25-(2.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 27.5 + (((tickAnim - 9) / 1) * (40-(27.5)));
            yy = 1.25 + (((tickAnim - 9) / 1) * (2.5-(1.25)));
            zz = 1.25 + (((tickAnim - 9) / 1) * (0-(1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 2) / 1) * (1-(0.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 3) / 2) * (1-(1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 2) * (0-(1)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.25-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.25 + (((tickAnim - 8) / 0) * (0.5-(0.25)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 1) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 9) / 1) * (0-(0.25)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegleft.rotationPointX = this.upperlegleft.rotationPointX + (float)(xx);
        this.upperlegleft.rotationPointY = this.upperlegleft.rotationPointY - (float)(yy);
        this.upperlegleft.rotationPointZ = this.upperlegleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -25 + (((tickAnim - 0) / 2) * (7.5-(-25)));
            yy = 5 + (((tickAnim - 0) / 2) * (5-(5)));
            zz = -12.5 + (((tickAnim - 0) / 2) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 7.5 + (((tickAnim - 2) / 1) * (20-(7.5)));
            yy = 5 + (((tickAnim - 2) / 1) * (-2.5-(5)));
            zz = -12.5 + (((tickAnim - 2) / 1) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20 + (((tickAnim - 3) / 2) * (27.5-(20)));
            yy = -2.5 + (((tickAnim - 3) / 2) * (-2.5-(-2.5)));
            zz = -12.5 + (((tickAnim - 3) / 2) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 27.5 + (((tickAnim - 5) / 2) * (25-(27.5)));
            yy = -2.5 + (((tickAnim - 5) / 2) * (-5-(-2.5)));
            zz = -12.5 + (((tickAnim - 5) / 2) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 7) / 1) * (-25-(25)));
            yy = -5 + (((tickAnim - 7) / 1) * (-2.5-(-5)));
            zz = -12.5 + (((tickAnim - 7) / 1) * (-17.5-(-12.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -25 + (((tickAnim - 8) / 0) * (-20-(-25)));
            yy = -2.5 + (((tickAnim - 8) / 0) * (0-(-2.5)));
            zz = -17.5 + (((tickAnim - 8) / 0) * (-12.5-(-17.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -20 + (((tickAnim - 8) / 1) * (-20-(-20)));
            yy = 0 + (((tickAnim - 8) / 1) * (2.5-(0)));
            zz = -12.5 + (((tickAnim - 8) / 1) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 9) / 1) * (-25-(-20)));
            yy = 2.5 + (((tickAnim - 9) / 1) * (5-(2.5)));
            zz = -12.5 + (((tickAnim - 9) / 1) * (-12.5-(-12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (47.5-(0)));
            yy = 42.5 + (((tickAnim - 0) / 2) * (42.5-(42.5)));
            zz = -7.5 + (((tickAnim - 0) / 2) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 47.5 + (((tickAnim - 2) / 1) * (10-(47.5)));
            yy = 42.5 + (((tickAnim - 2) / 1) * (42.5-(42.5)));
            zz = -7.5 + (((tickAnim - 2) / 1) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10 + (((tickAnim - 3) / 2) * (-2.5-(10)));
            yy = 42.5 + (((tickAnim - 3) / 2) * (32.5-(42.5)));
            zz = -7.5 + (((tickAnim - 3) / 2) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -2.5 + (((tickAnim - 5) / 2) * (30-(-2.5)));
            yy = 32.5 + (((tickAnim - 5) / 2) * (32.5-(32.5)));
            zz = -7.5 + (((tickAnim - 5) / 2) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 30 + (((tickAnim - 7) / 1) * (32.5-(30)));
            yy = 32.5 + (((tickAnim - 7) / 1) * (37.5-(32.5)));
            zz = -7.5 + (((tickAnim - 7) / 1) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 32.5 + (((tickAnim - 8) / 0) * (10-(32.5)));
            yy = 37.5 + (((tickAnim - 8) / 0) * (40-(37.5)));
            zz = -7.5 + (((tickAnim - 8) / 0) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 10 + (((tickAnim - 8) / 1) * (-2.5-(10)));
            yy = 40 + (((tickAnim - 8) / 1) * (41.25-(40)));
            zz = -7.5 + (((tickAnim - 8) / 1) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 9) / 1) * (0-(-2.5)));
            yy = 41.25 + (((tickAnim - 9) / 1) * (42.5-(41.25)));
            zz = -7.5 + (((tickAnim - 9) / 1) * (-7.5-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -10 + (((tickAnim - 0) / 1) * (-10-(-10)));
            yy = -1.25 + (((tickAnim - 0) / 1) * (-15-(-1.25)));
            zz = 7.5 + (((tickAnim - 0) / 1) * (0-(7.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -10 + (((tickAnim - 1) / 1) * (0-(-10)));
            yy = -15 + (((tickAnim - 1) / 1) * (-20-(-15)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (7.5-(0)));
            yy = -20 + (((tickAnim - 2) / 1) * (-25-(-20)));
            zz = 0 + (((tickAnim - 2) / 1) * (10-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 7.5 + (((tickAnim - 3) / 1) * (7.5-(7.5)));
            yy = -25 + (((tickAnim - 3) / 1) * (-32.5-(-25)));
            zz = 10 + (((tickAnim - 3) / 1) * (7.5-(10)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 7.5 + (((tickAnim - 4) / 2) * (5-(7.5)));
            yy = -32.5 + (((tickAnim - 4) / 2) * (-20-(-32.5)));
            zz = 7.5 + (((tickAnim - 4) / 2) * (-10-(7.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 6) / 2) * (0-(5)));
            yy = -20 + (((tickAnim - 6) / 2) * (5-(-20)));
            zz = -10 + (((tickAnim - 6) / 2) * (-10-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (-15-(0)));
            yy = 5 + (((tickAnim - 8) / 1) * (12.5-(5)));
            zz = -10 + (((tickAnim - 8) / 1) * (22.5-(-10)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 9) / 1) * (-10-(-15)));
            yy = 12.5 + (((tickAnim - 9) / 1) * (-1.25-(12.5)));
            zz = 22.5 + (((tickAnim - 9) / 1) * (7.5-(22.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 1) * (-0.25-(0.25)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.5-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 1) / 1) * (0-(-0.25)));
            zz = 0.5 + (((tickAnim - 1) / 1) * (0.5-(0.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 2) / 1) * (0.5-(0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 1) * (0-(0.5)));
            zz = 0.5 + (((tickAnim - 3) / 1) * (0.5-(0.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 4) / 2) * (-0.5-(0.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 6) / 2) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 6) / 2) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 1) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 8) / 1) * (0-(-0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 9) / 1) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingleft1.rotationPointX = this.wingleft1.rotationPointX + (float)(xx);
        this.wingleft1.rotationPointY = this.wingleft1.rotationPointY - (float)(yy);
        this.wingleft1.rotationPointZ = this.wingleft1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.5 + (((tickAnim - 0) / 1) * (0-(0.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = -11.25 + (((tickAnim - 0) / 1) * (-2.5-(-11.25)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (2.5-(0)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 1) / 1) * (-5-(-2.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 2) / 1) * (-20-(-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.5 + (((tickAnim - 3) / 1) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (5-(0)));
            zz = -20 + (((tickAnim - 3) / 1) * (-22.5-(-20)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 2.5 + (((tickAnim - 4) / 2) * (0.5-(2.5)));
            yy = 5 + (((tickAnim - 4) / 2) * (0-(5)));
            zz = -22.5 + (((tickAnim - 4) / 2) * (-7.5-(-22.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.5 + (((tickAnim - 6) / 2) * (0.75-(0.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = -7.5 + (((tickAnim - 6) / 2) * (-10-(-7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.75 + (((tickAnim - 8) / 1) * (-0.25-(0.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = -10 + (((tickAnim - 8) / 1) * (-30-(-10)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -0.25 + (((tickAnim - 9) / 1) * (0.5-(-0.25)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = -30 + (((tickAnim - 9) / 1) * (-11.25-(-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 7.5 + (((tickAnim - 0) / 1) * (10-(7.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 10 + (((tickAnim - 1) / 1) * (2.5-(10)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (0-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (2.5-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 2.5 + (((tickAnim - 4) / 2) * (0-(2.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.5 + (((tickAnim - 8) / 1) * (10-(2.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 9) / 1) * (7.5-(10)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(xx), wingleft4.rotateAngleY + (float) Math.toRadians(yy), wingleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 17.5 + (((tickAnim - 0) / 1) * (15-(17.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 15 + (((tickAnim - 0) / 1) * (10-(15)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 15 + (((tickAnim - 1) / 1) * (-2.5-(15)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 10 + (((tickAnim - 1) / 1) * (-2.5-(10)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -2.5 + (((tickAnim - 2) / 1) * (-15-(-2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 2) / 1) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -15 + (((tickAnim - 3) / 1) * (-15-(-15)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 3) / 1) * (7.5-(-2.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -15 + (((tickAnim - 4) / 2) * (-10-(-15)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 7.5 + (((tickAnim - 4) / 2) * (15-(7.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 6) / 2) * (-10-(-10)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 15 + (((tickAnim - 6) / 2) * (27.5-(15)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -10 + (((tickAnim - 8) / 1) * (27.5-(-10)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 27.5 + (((tickAnim - 8) / 1) * (25-(27.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 27.5 + (((tickAnim - 9) / 1) * (17.5-(27.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 25 + (((tickAnim - 9) / 1) * (15-(25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -15 + (((tickAnim - 0) / 1) * (-10-(-15)));
            yy = -12.5 + (((tickAnim - 0) / 1) * (1.25-(-12.5)));
            zz = -22.5 + (((tickAnim - 0) / 1) * (-7.5-(-22.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -10 + (((tickAnim - 1) / 1) * (-10-(-10)));
            yy = 1.25 + (((tickAnim - 1) / 1) * (15-(1.25)));
            zz = -7.5 + (((tickAnim - 1) / 1) * (0-(-7.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 2) / 1) * (0-(-10)));
            yy = 15 + (((tickAnim - 2) / 1) * (20-(15)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (7.5-(0)));
            yy = 20 + (((tickAnim - 3) / 0) * (25-(20)));
            zz = 0 + (((tickAnim - 3) / 0) * (-10-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.5 + (((tickAnim - 3) / 2) * (7.5-(7.5)));
            yy = 25 + (((tickAnim - 3) / 2) * (32.5-(25)));
            zz = -10 + (((tickAnim - 3) / 2) * (-7.5-(-10)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 7.5 + (((tickAnim - 5) / 2) * (5-(7.5)));
            yy = 32.5 + (((tickAnim - 5) / 2) * (20-(32.5)));
            zz = -7.5 + (((tickAnim - 5) / 2) * (10-(-7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 5 + (((tickAnim - 7) / 2) * (0-(5)));
            yy = 20 + (((tickAnim - 7) / 2) * (-5-(20)));
            zz = 10 + (((tickAnim - 7) / 2) * (10-(10)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (-15-(0)));
            yy = -5 + (((tickAnim - 9) / 1) * (-12.5-(-5)));
            zz = 10 + (((tickAnim - 9) / 1) * (-22.5-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 1) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 1) / 1) * (-0.25-(0.25)));
            zz = 0 + (((tickAnim - 1) / 1) * (0.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 2) / 1) * (0-(-0.25)));
            zz = 0.5 + (((tickAnim - 2) / 1) * (0.5-(0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 3) / 0) * (0.5-(0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 2) * (0-(0.5)));
            zz = 0.5 + (((tickAnim - 3) / 2) * (0.5-(0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 5) / 2) * (-0.5-(0.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 7) / 2) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 7) / 2) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 9) / 1) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 9) / 1) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingright1.rotationPointX = this.wingright1.rotationPointX + (float)(xx);
        this.wingright1.rotationPointY = this.wingright1.rotationPointY - (float)(yy);
        this.wingright1.rotationPointZ = this.wingright1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.5 + (((tickAnim - 0) / 1) * (1.25-(0.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 30 + (((tickAnim - 0) / 1) * (11.25-(30)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 1.25 + (((tickAnim - 1) / 1) * (0-(1.25)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 11.25 + (((tickAnim - 1) / 1) * (2.5-(11.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (2.5-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 2.5 + (((tickAnim - 2) / 1) * (5-(2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 3) / 0) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 5 + (((tickAnim - 3) / 0) * (20-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.5 + (((tickAnim - 3) / 2) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (-5-(0)));
            zz = 20 + (((tickAnim - 3) / 2) * (22.5-(20)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 2.5 + (((tickAnim - 5) / 2) * (0.75-(2.5)));
            yy = -5 + (((tickAnim - 5) / 2) * (0-(-5)));
            zz = 22.5 + (((tickAnim - 5) / 2) * (7.5-(22.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0.75 + (((tickAnim - 7) / 2) * (0-(0.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 7.5 + (((tickAnim - 7) / 2) * (10-(7.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0.5-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 10 + (((tickAnim - 9) / 1) * (30-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 10 + (((tickAnim - 0) / 1) * (7.5-(10)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 7.5 + (((tickAnim - 1) / 1) * (10-(7.5)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 2) / 1) * (2.5-(10)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 3) / 0) * (0-(2.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 2.5 + (((tickAnim - 5) / 2) * (0-(2.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 9) / 1) * (10-(2.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(xx), wingright4.rotateAngleY + (float) Math.toRadians(yy), wingright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 27.5 + (((tickAnim - 0) / 1) * (17.5-(27.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = -25 + (((tickAnim - 0) / 1) * (-15-(-25)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 17.5 + (((tickAnim - 1) / 1) * (15-(17.5)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = -15 + (((tickAnim - 1) / 1) * (-10-(-15)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 2) / 1) * (-2.5-(15)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -10 + (((tickAnim - 2) / 1) * (2.5-(-10)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -2.5 + (((tickAnim - 3) / 0) * (-15-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 2.5 + (((tickAnim - 3) / 0) * (2.5-(2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15 + (((tickAnim - 3) / 2) * (-15-(-15)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 2.5 + (((tickAnim - 3) / 2) * (-7.5-(2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -15 + (((tickAnim - 5) / 2) * (-10-(-15)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = -7.5 + (((tickAnim - 5) / 2) * (-15-(-7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -10 + (((tickAnim - 7) / 2) * (-10-(-10)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = -15 + (((tickAnim - 7) / 2) * (-27.5-(-15)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 9) / 1) * (27.5-(-10)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = -27.5 + (((tickAnim - 9) / 1) * (-25-(-27.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRhamphorhynchus entity = (EntityPrehistoricFloraRhamphorhynchus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*10), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5));

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (1.5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.5 + (((tickAnim - 10) / 3) * (2.2-(1.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 2.2 + (((tickAnim - 13) / 2) * (2-(2.2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1 + (((tickAnim - 13) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 2 + (((tickAnim - 15) / 5) * (0-(2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1 + (((tickAnim - 15) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1 + (((tickAnim - 20) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (1.5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1 + (((tickAnim - 28) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 1.5 + (((tickAnim - 30) / 3) * (2.2-(1.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1 + (((tickAnim - 30) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 2.2 + (((tickAnim - 33) / 2) * (2-(2.2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1 + (((tickAnim - 33) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 2 + (((tickAnim - 35) / 5) * (0-(2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1 + (((tickAnim - 35) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);



        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*10), body1.rotateAngleY + (float) Math.toRadians(0), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2.5));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*5), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*10), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-210))*5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-240))*5), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*5), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-10), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-10), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*10), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));















        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25 + (((tickAnim - 0) / 3) * (10-(25)));
            yy = -2.5 + (((tickAnim - 0) / 3) * (-2.5-(-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 3) / 1) * (-15-(10)));
            yy = -2.5 + (((tickAnim - 3) / 1) * (5-(-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 3) / 1) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -15 + (((tickAnim - 4) / 3) * (-35-(-15)));
            yy = 5 + (((tickAnim - 4) / 3) * (5-(5)));
            zz = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 4) / 3) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -35 + (((tickAnim - 7) / 1) * (-5-(-35)));
            yy = 5 + (((tickAnim - 7) / 1) * (5-(5)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 7) / 1) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 8) / 5) * (20-(-5)));
            yy = 5 + (((tickAnim - 8) / 5) * (0-(5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 8) / 5) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 20 + (((tickAnim - 13) / 5) * (40-(20)));
            yy = 0 + (((tickAnim - 13) / 5) * (-2.5-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 13) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 40 + (((tickAnim - 18) / 2) * (25-(40)));
            yy = -2.5 + (((tickAnim - 18) / 2) * (-2.5-(-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 18) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 25 + (((tickAnim - 20) / 3) * (10-(25)));
            yy = -2.5 + (((tickAnim - 20) / 3) * (-2.5-(-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 20) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 10 + (((tickAnim - 23) / 1) * (-15-(10)));
            yy = -2.5 + (((tickAnim - 23) / 1) * (5-(-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 23) / 1) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -15 + (((tickAnim - 24) / 3) * (-35-(-15)));
            yy = 5 + (((tickAnim - 24) / 3) * (5-(5)));
            zz = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 24) / 3) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -35 + (((tickAnim - 27) / 1) * (-5-(-35)));
            yy = 5 + (((tickAnim - 27) / 1) * (5-(5)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 27) / 1) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 28) / 5) * (20-(-5)));
            yy = 5 + (((tickAnim - 28) / 5) * (0-(5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 28) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 20 + (((tickAnim - 33) / 5) * (40-(20)));
            yy = 0 + (((tickAnim - 33) / 5) * (-2.5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 33) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 40 + (((tickAnim - 38) / 2) * (25-(40)));
            yy = -2.5 + (((tickAnim - 38) / 2) * (-2.5-(-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 38) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 3) * (1-(0.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 3) / 1) * (1-(1)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 4) / 3) * (0-(1)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 5) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 20) / 3) * (1-(0.5)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 23) / 1) * (1-(1)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 24) / 3) * (0-(1)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegright.rotationPointX = this.upperlegright.rotationPointX + (float)(xx);
        this.upperlegright.rotationPointY = this.upperlegright.rotationPointY - (float)(yy);
        this.upperlegright.rotationPointZ = this.upperlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.5 + (((tickAnim - 0) / 3) * (20-(7.5)));
            yy = -5 + (((tickAnim - 0) / 3) * (2.5-(-5)));
            zz = 12.5 + (((tickAnim - 0) / 3) * (12.5-(12.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 20 + (((tickAnim - 3) / 1) * (40-(20)));
            yy = 2.5 + (((tickAnim - 3) / 1) * (2.5-(2.5)));
            zz = 12.5 + (((tickAnim - 3) / 1) * (12.5-(12.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 40 + (((tickAnim - 4) / 3) * (25-(40)));
            yy = 2.5 + (((tickAnim - 4) / 3) * (5-(2.5)));
            zz = 12.5 + (((tickAnim - 4) / 3) * (12.5-(12.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 7) / 1) * (-15-(25)));
            yy = 5 + (((tickAnim - 7) / 1) * (2.5-(5)));
            zz = 12.5 + (((tickAnim - 7) / 1) * (17.5-(12.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -15 + (((tickAnim - 8) / 5) * (2.5-(-15)));
            yy = 2.5 + (((tickAnim - 8) / 5) * (0-(2.5)));
            zz = 17.5 + (((tickAnim - 8) / 5) * (12.5-(17.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 13) / 5) * (-25-(2.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (-5-(0)));
            zz = 12.5 + (((tickAnim - 13) / 5) * (12.5-(12.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -25 + (((tickAnim - 18) / 2) * (7.5-(-25)));
            yy = -5 + (((tickAnim - 18) / 2) * (-5-(-5)));
            zz = 12.5 + (((tickAnim - 18) / 2) * (12.5-(12.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 7.5 + (((tickAnim - 20) / 3) * (20-(7.5)));
            yy = -5 + (((tickAnim - 20) / 3) * (2.5-(-5)));
            zz = 12.5 + (((tickAnim - 20) / 3) * (12.5-(12.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 20 + (((tickAnim - 23) / 1) * (40-(20)));
            yy = 2.5 + (((tickAnim - 23) / 1) * (2.5-(2.5)));
            zz = 12.5 + (((tickAnim - 23) / 1) * (12.5-(12.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 40 + (((tickAnim - 24) / 3) * (25-(40)));
            yy = 2.5 + (((tickAnim - 24) / 3) * (5-(2.5)));
            zz = 12.5 + (((tickAnim - 24) / 3) * (12.5-(12.5)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 25 + (((tickAnim - 27) / 1) * (-15-(25)));
            yy = 5 + (((tickAnim - 27) / 1) * (2.5-(5)));
            zz = 12.5 + (((tickAnim - 27) / 1) * (17.5-(12.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -15 + (((tickAnim - 28) / 5) * (2.5-(-15)));
            yy = 2.5 + (((tickAnim - 28) / 5) * (0-(2.5)));
            zz = 17.5 + (((tickAnim - 28) / 5) * (12.5-(17.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 2.5 + (((tickAnim - 33) / 5) * (-25-(2.5)));
            yy = 0 + (((tickAnim - 33) / 5) * (-5-(0)));
            zz = 12.5 + (((tickAnim - 33) / 5) * (12.5-(12.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -25 + (((tickAnim - 38) / 2) * (7.5-(-25)));
            yy = -5 + (((tickAnim - 38) / 2) * (-5-(-5)));
            zz = 12.5 + (((tickAnim - 38) / 2) * (12.5-(12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 47.5 + (((tickAnim - 0) / 3) * (10-(47.5)));
            yy = -42.5 + (((tickAnim - 0) / 3) * (-42.5-(-42.5)));
            zz = 7.5 + (((tickAnim - 0) / 3) * (7.5-(7.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 3) / 1) * (-2.5-(10)));
            yy = -42.5 + (((tickAnim - 3) / 1) * (-32.5-(-42.5)));
            zz = 7.5 + (((tickAnim - 3) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -2.5 + (((tickAnim - 4) / 3) * (30-(-2.5)));
            yy = -32.5 + (((tickAnim - 4) / 3) * (-32.5-(-32.5)));
            zz = 7.5 + (((tickAnim - 4) / 3) * (7.5-(7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 30 + (((tickAnim - 7) / 1) * (35-(30)));
            yy = -32.5 + (((tickAnim - 7) / 1) * (-37.5-(-32.5)));
            zz = 7.5 + (((tickAnim - 7) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 35 + (((tickAnim - 8) / 5) * (10-(35)));
            yy = -37.5 + (((tickAnim - 8) / 5) * (-40-(-37.5)));
            zz = 7.5 + (((tickAnim - 8) / 5) * (7.5-(7.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 10 + (((tickAnim - 13) / 3) * (7.5-(10)));
            yy = -40 + (((tickAnim - 13) / 3) * (-41.25-(-40)));
            zz = 7.5 + (((tickAnim - 13) / 3) * (7.5-(7.5)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 16) / 2) * (10-(7.5)));
            yy = -41.25 + (((tickAnim - 16) / 2) * (-42.5-(-41.25)));
            zz = 7.5 + (((tickAnim - 16) / 2) * (7.5-(7.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 18) / 2) * (47.5-(10)));
            yy = -42.5 + (((tickAnim - 18) / 2) * (-42.5-(-42.5)));
            zz = 7.5 + (((tickAnim - 18) / 2) * (7.5-(7.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 47.5 + (((tickAnim - 20) / 3) * (10-(47.5)));
            yy = -42.5 + (((tickAnim - 20) / 3) * (-42.5-(-42.5)));
            zz = 7.5 + (((tickAnim - 20) / 3) * (7.5-(7.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 10 + (((tickAnim - 23) / 1) * (-2.5-(10)));
            yy = -42.5 + (((tickAnim - 23) / 1) * (-32.5-(-42.5)));
            zz = 7.5 + (((tickAnim - 23) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -2.5 + (((tickAnim - 24) / 3) * (30-(-2.5)));
            yy = -32.5 + (((tickAnim - 24) / 3) * (-32.5-(-32.5)));
            zz = 7.5 + (((tickAnim - 24) / 3) * (7.5-(7.5)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 30 + (((tickAnim - 27) / 1) * (35-(30)));
            yy = -32.5 + (((tickAnim - 27) / 1) * (-37.5-(-32.5)));
            zz = 7.5 + (((tickAnim - 27) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 35 + (((tickAnim - 28) / 5) * (10-(35)));
            yy = -37.5 + (((tickAnim - 28) / 5) * (-40-(-37.5)));
            zz = 7.5 + (((tickAnim - 28) / 5) * (7.5-(7.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 10 + (((tickAnim - 33) / 3) * (-2.5-(10)));
            yy = -40 + (((tickAnim - 33) / 3) * (-41.25-(-40)));
            zz = 7.5 + (((tickAnim - 33) / 3) * (7.5-(7.5)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -2.5 + (((tickAnim - 36) / 2) * (10-(-2.5)));
            yy = -41.25 + (((tickAnim - 36) / 2) * (-42.5-(-41.25)));
            zz = 7.5 + (((tickAnim - 36) / 2) * (7.5-(7.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 38) / 2) * (47.5-(10)));
            yy = -42.5 + (((tickAnim - 38) / 2) * (-42.5-(-42.5)));
            zz = 7.5 + (((tickAnim - 38) / 2) * (7.5-(7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 40 + (((tickAnim - 0) / 3) * (25-(40)));
            yy = 2.5 + (((tickAnim - 0) / 3) * (2.5-(2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 25 + (((tickAnim - 3) / 1) * (10-(25)));
            yy = 2.5 + (((tickAnim - 3) / 1) * (2.5-(2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 3) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 10 + (((tickAnim - 4) / 3) * (-15-(10)));
            yy = 2.5 + (((tickAnim - 4) / 3) * (-5-(2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 4) / 3) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 7) / 1) * (-30-(-15)));
            yy = -5 + (((tickAnim - 7) / 1) * (-5-(-5)));
            zz = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 7) / 1) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -30 + (((tickAnim - 8) / 2) * (5-(-30)));
            yy = -5 + (((tickAnim - 8) / 2) * (-5-(-5)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 8) / 2) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 5 + (((tickAnim - 10) / 5) * (20-(5)));
            yy = -5 + (((tickAnim - 10) / 5) * (0-(-5)));
            zz = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 15) / 5) * (40-(20)));
            yy = 0 + (((tickAnim - 15) / 5) * (2.5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 15) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 40 + (((tickAnim - 20) / 3) * (25-(40)));
            yy = 2.5 + (((tickAnim - 20) / 3) * (2.5-(2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 20) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 25 + (((tickAnim - 23) / 1) * (10-(25)));
            yy = 2.5 + (((tickAnim - 23) / 1) * (2.5-(2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 23) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 10 + (((tickAnim - 24) / 3) * (-15-(10)));
            yy = 2.5 + (((tickAnim - 24) / 3) * (-5-(2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 24) / 3) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -15 + (((tickAnim - 27) / 1) * (-30-(-15)));
            yy = -5 + (((tickAnim - 27) / 1) * (-5-(-5)));
            zz = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 27) / 1) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -30 + (((tickAnim - 28) / 2) * (5-(-30)));
            yy = -5 + (((tickAnim - 28) / 2) * (-5-(-5)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 28) / 2) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 30) / 5) * (20-(5)));
            yy = -5 + (((tickAnim - 30) / 5) * (0-(-5)));
            zz = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 30) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 20 + (((tickAnim - 35) / 5) * (40-(20)));
            yy = 0 + (((tickAnim - 35) / 5) * (2.5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 35) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 1) * (1-(0.5)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 4) / 3) * (1-(1)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 7) / 1) * (0-(1)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 15) / 5) * (0-(0.25)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 23) / 1) * (1-(0.5)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 24) / 3) * (1-(1)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 27) / 1) * (0-(1)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
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
        this.upperlegleft.rotationPointX = this.upperlegleft.rotationPointX + (float)(xx);
        this.upperlegleft.rotationPointY = this.upperlegleft.rotationPointY - (float)(yy);
        this.upperlegleft.rotationPointZ = this.upperlegleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -25 + (((tickAnim - 0) / 3) * (7.5-(-25)));
            yy = 5 + (((tickAnim - 0) / 3) * (5-(5)));
            zz = -12.5 + (((tickAnim - 0) / 3) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 7.5 + (((tickAnim - 3) / 1) * (20-(7.5)));
            yy = 5 + (((tickAnim - 3) / 1) * (-2.5-(5)));
            zz = -12.5 + (((tickAnim - 3) / 1) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 20 + (((tickAnim - 4) / 3) * (40-(20)));
            yy = -2.5 + (((tickAnim - 4) / 3) * (-2.5-(-2.5)));
            zz = -12.5 + (((tickAnim - 4) / 3) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 40 + (((tickAnim - 7) / 1) * (25-(40)));
            yy = -2.5 + (((tickAnim - 7) / 1) * (-5-(-2.5)));
            zz = -12.5 + (((tickAnim - 7) / 1) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 8) / 2) * (-15-(25)));
            yy = -5 + (((tickAnim - 8) / 2) * (-2.5-(-5)));
            zz = -12.5 + (((tickAnim - 8) / 2) * (-17.5-(-12.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -15 + (((tickAnim - 10) / 5) * (2.5-(-15)));
            yy = -2.5 + (((tickAnim - 10) / 5) * (0-(-2.5)));
            zz = -17.5 + (((tickAnim - 10) / 5) * (-12.5-(-17.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 15) / 5) * (-25-(2.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (5-(0)));
            zz = -12.5 + (((tickAnim - 15) / 5) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -25 + (((tickAnim - 20) / 3) * (7.5-(-25)));
            yy = 5 + (((tickAnim - 20) / 3) * (5-(5)));
            zz = -12.5 + (((tickAnim - 20) / 3) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 7.5 + (((tickAnim - 23) / 1) * (20-(7.5)));
            yy = 5 + (((tickAnim - 23) / 1) * (-2.5-(5)));
            zz = -12.5 + (((tickAnim - 23) / 1) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 20 + (((tickAnim - 24) / 3) * (40-(20)));
            yy = -2.5 + (((tickAnim - 24) / 3) * (-2.5-(-2.5)));
            zz = -12.5 + (((tickAnim - 24) / 3) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 40 + (((tickAnim - 27) / 1) * (25-(40)));
            yy = -2.5 + (((tickAnim - 27) / 1) * (-5-(-2.5)));
            zz = -12.5 + (((tickAnim - 27) / 1) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 25 + (((tickAnim - 28) / 2) * (-15-(25)));
            yy = -5 + (((tickAnim - 28) / 2) * (-2.5-(-5)));
            zz = -12.5 + (((tickAnim - 28) / 2) * (-17.5-(-12.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -15 + (((tickAnim - 30) / 5) * (2.5-(-15)));
            yy = -2.5 + (((tickAnim - 30) / 5) * (0-(-2.5)));
            zz = -17.5 + (((tickAnim - 30) / 5) * (-12.5-(-17.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 35) / 5) * (-25-(2.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (5-(0)));
            zz = -12.5 + (((tickAnim - 35) / 5) * (-12.5-(-12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 0) / 3) * (47.5-(10)));
            yy = 42.5 + (((tickAnim - 0) / 3) * (42.5-(42.5)));
            zz = -7.5 + (((tickAnim - 0) / 3) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 47.5 + (((tickAnim - 3) / 1) * (10-(47.5)));
            yy = 42.5 + (((tickAnim - 3) / 1) * (42.5-(42.5)));
            zz = -7.5 + (((tickAnim - 3) / 1) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 10 + (((tickAnim - 4) / 3) * (-2.5-(10)));
            yy = 42.5 + (((tickAnim - 4) / 3) * (32.5-(42.5)));
            zz = -7.5 + (((tickAnim - 4) / 3) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 7) / 1) * (30-(-2.5)));
            yy = 32.5 + (((tickAnim - 7) / 1) * (32.5-(32.5)));
            zz = -7.5 + (((tickAnim - 7) / 1) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 30 + (((tickAnim - 8) / 2) * (35-(30)));
            yy = 32.5 + (((tickAnim - 8) / 2) * (37.5-(32.5)));
            zz = -7.5 + (((tickAnim - 8) / 2) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 35 + (((tickAnim - 10) / 5) * (10-(35)));
            yy = 37.5 + (((tickAnim - 10) / 5) * (40-(37.5)));
            zz = -7.5 + (((tickAnim - 10) / 5) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 15) / 3) * (-2.5-(10)));
            yy = 40 + (((tickAnim - 15) / 3) * (41.25-(40)));
            zz = -7.5 + (((tickAnim - 15) / 3) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 18) / 2) * (10-(-2.5)));
            yy = 41.25 + (((tickAnim - 18) / 2) * (42.5-(41.25)));
            zz = -7.5 + (((tickAnim - 18) / 2) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 10 + (((tickAnim - 20) / 3) * (47.5-(10)));
            yy = 42.5 + (((tickAnim - 20) / 3) * (42.5-(42.5)));
            zz = -7.5 + (((tickAnim - 20) / 3) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 47.5 + (((tickAnim - 23) / 1) * (10-(47.5)));
            yy = 42.5 + (((tickAnim - 23) / 1) * (42.5-(42.5)));
            zz = -7.5 + (((tickAnim - 23) / 1) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 10 + (((tickAnim - 24) / 3) * (-2.5-(10)));
            yy = 42.5 + (((tickAnim - 24) / 3) * (32.5-(42.5)));
            zz = -7.5 + (((tickAnim - 24) / 3) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -2.5 + (((tickAnim - 27) / 1) * (30-(-2.5)));
            yy = 32.5 + (((tickAnim - 27) / 1) * (32.5-(32.5)));
            zz = -7.5 + (((tickAnim - 27) / 1) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 30 + (((tickAnim - 28) / 2) * (35-(30)));
            yy = 32.5 + (((tickAnim - 28) / 2) * (37.5-(32.5)));
            zz = -7.5 + (((tickAnim - 28) / 2) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 35 + (((tickAnim - 30) / 5) * (10-(35)));
            yy = 37.5 + (((tickAnim - 30) / 5) * (40-(37.5)));
            zz = -7.5 + (((tickAnim - 30) / 5) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 10 + (((tickAnim - 35) / 3) * (-2.5-(10)));
            yy = 40 + (((tickAnim - 35) / 3) * (41.25-(40)));
            zz = -7.5 + (((tickAnim - 35) / 3) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 38) / 2) * (10-(-2.5)));
            yy = 41.25 + (((tickAnim - 38) / 2) * (42.5-(41.25)));
            zz = -7.5 + (((tickAnim - 38) / 2) * (-7.5-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15 + (((tickAnim - 0) / 3) * (-10-(-15)));
            yy = 12.5 + (((tickAnim - 0) / 3) * (-1.25-(12.5)));
            zz = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 0) / 3) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 3) / 2) * (-10-(-10)));
            yy = -1.25 + (((tickAnim - 3) / 2) * (-15-(-1.25)));
            zz = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 3) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 5) / 3) * (0-(-10)));
            yy = -15 + (((tickAnim - 5) / 3) * (-20-(-15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 5) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (7.5-(0)));
            yy = -20 + (((tickAnim - 8) / 5) * (-25-(-20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 8) / 5) * (27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 13) / 2) * (7.5-(7.5)));
            yy = -25 + (((tickAnim - 13) / 2) * (-15-(-25)));
            zz = 27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 13) / 2) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 15) / 3) * (0-(7.5)));
            yy = -15 + (((tickAnim - 15) / 3) * (5-(-15)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 15) / 3) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-17.8912-(0)));
            yy = 5 + (((tickAnim - 18) / 2) * (10.37324-(5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 18) / 2) * (7.2488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -17.8912 + (((tickAnim - 20) / 3) * (-10-(-17.8912)));
            yy = 10.37324 + (((tickAnim - 20) / 3) * (-1.25-(10.37324)));
            zz = 7.2488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 20) / 3) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(7.2488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -10 + (((tickAnim - 23) / 2) * (-10-(-10)));
            yy = -1.25 + (((tickAnim - 23) / 2) * (-15-(-1.25)));
            zz = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 23) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -10 + (((tickAnim - 25) / 3) * (0-(-10)));
            yy = -15 + (((tickAnim - 25) / 3) * (-20-(-15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 25) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (7.5-(0)));
            yy = -20 + (((tickAnim - 28) / 5) * (-25-(-20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 28) / 5) * (27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 7.5 + (((tickAnim - 33) / 2) * (7.5-(7.5)));
            yy = -25 + (((tickAnim - 33) / 2) * (-15-(-25)));
            zz = 27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 33) / 2) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 7.5 + (((tickAnim - 35) / 3) * (0-(7.5)));
            yy = -15 + (((tickAnim - 35) / 3) * (5-(-15)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 35) / 3) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (-15-(0)));
            yy = 5 + (((tickAnim - 38) / 2) * (12.5-(5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 38) / 2) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 3) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 2) * (-0.2-(0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 5) / 3) * (0-(-0.2)));
            zz = 0.5 + (((tickAnim - 5) / 3) * (0.5-(0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0.5 + (((tickAnim - 8) / 5) * (0.5-(0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0.5 + (((tickAnim - 13) / 2) * (0.5-(0.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 15) / 3) * (-0.5-(0.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 18) / 2) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 18) / 2) * (0-(-0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 20) / 3) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 23) / 2) * (-0.2-(0.25)));
            zz = 0 + (((tickAnim - 23) / 2) * (0.5-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 25) / 3) * (0-(-0.2)));
            zz = 0.5 + (((tickAnim - 25) / 3) * (0.5-(0.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0.5 + (((tickAnim - 28) / 5) * (0.5-(0.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0.5 + (((tickAnim - 33) / 2) * (0.5-(0.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 35) / 3) * (-0.5-(0.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 38) / 2) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 38) / 2) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingleft1.rotationPointX = this.wingleft1.rotationPointX + (float)(xx);
        this.wingleft1.rotationPointY = this.wingleft1.rotationPointY - (float)(yy);
        this.wingleft1.rotationPointZ = this.wingleft1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.5 + (((tickAnim - 0) / 3) * (0.25-(0.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -25 + (((tickAnim - 0) / 3) * (-11.25-(-25)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.25 + (((tickAnim - 3) / 2) * (0.75-(0.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -11.25 + (((tickAnim - 3) / 2) * (-2.5-(-11.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.75 + (((tickAnim - 5) / 3) * (2.5-(0.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -2.5 + (((tickAnim - 5) / 3) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 2.5 + (((tickAnim - 8) / 5) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = -2.5 + (((tickAnim - 8) / 5) * (-40-(-2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.5 + (((tickAnim - 13) / 2) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -40 + (((tickAnim - 13) / 2) * (-10-(-40)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 15) / 3) * (0.75-(2.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 15) / 3) * (-10-(-10)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.75 + (((tickAnim - 18) / 2) * (9-(0.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -10 + (((tickAnim - 18) / 2) * (-25-(-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 9 + (((tickAnim - 20) / 3) * (0.75-(9)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = -25 + (((tickAnim - 20) / 3) * (-11.25-(-25)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0.75 + (((tickAnim - 23) / 2) * (1-(0.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = -11.25 + (((tickAnim - 23) / 2) * (-2.5-(-11.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 25) / 3) * (2.5-(1)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = -2.5 + (((tickAnim - 25) / 3) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 2.5 + (((tickAnim - 28) / 5) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = -2.5 + (((tickAnim - 28) / 5) * (-40-(-2.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.5 + (((tickAnim - 33) / 2) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = -40 + (((tickAnim - 33) / 2) * (-10-(-40)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 2.5 + (((tickAnim - 35) / 3) * (0.5-(2.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 35) / 3) * (-10-(-10)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.5 + (((tickAnim - 38) / 2) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = -10 + (((tickAnim - 38) / 2) * (-25-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 0) / 3) * (5-(10)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 3) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 5) / 3) * (5-(10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 8) / 5) * (5-(5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 5 + (((tickAnim - 13) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 15) / 3) * (5-(10)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 18) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 10 + (((tickAnim - 20) / 3) * (5-(10)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 5 + (((tickAnim - 23) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 25) / 3) * (5-(10)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 28) / 5) * (5-(5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 33) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 10 + (((tickAnim - 35) / 3) * (5-(10)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 38) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(xx), wingleft4.rotateAngleY + (float) Math.toRadians(yy), wingleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.5 + (((tickAnim - 0) / 3) * (17.5-(22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 22.5 + (((tickAnim - 0) / 3) * (15-(22.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 17.5 + (((tickAnim - 3) / 2) * (15-(17.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 15 + (((tickAnim - 3) / 2) * (10-(15)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 5) / 3) * (-2.5-(15)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 10 + (((tickAnim - 5) / 3) * (-2.5-(10)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -2.5 + (((tickAnim - 8) / 5) * (-12.5-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = -2.5 + (((tickAnim - 8) / 5) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -12.5 + (((tickAnim - 13) / 2) * (-10-(-12.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -2.5 + (((tickAnim - 13) / 2) * (27.5-(-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 15) / 3) * (-10-(-10)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 27.5 + (((tickAnim - 15) / 3) * (27.5-(27.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 18) / 2) * (22.5-(-10)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 27.5 + (((tickAnim - 18) / 2) * (22.5-(27.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 22.5 + (((tickAnim - 20) / 3) * (17.5-(22.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 22.5 + (((tickAnim - 20) / 3) * (15-(22.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 17.5 + (((tickAnim - 23) / 2) * (15-(17.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 15 + (((tickAnim - 23) / 2) * (10-(15)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 25) / 3) * (-2.5-(15)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 10 + (((tickAnim - 25) / 3) * (-2.5-(10)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -2.5 + (((tickAnim - 28) / 5) * (-12.5-(-2.5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = -2.5 + (((tickAnim - 28) / 5) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -12.5 + (((tickAnim - 33) / 2) * (-10-(-12.5)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = -2.5 + (((tickAnim - 33) / 2) * (27.5-(-2.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -10 + (((tickAnim - 35) / 3) * (-10-(-10)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 27.5 + (((tickAnim - 35) / 3) * (27.5-(27.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 38) / 2) * (22.5-(-10)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 27.5 + (((tickAnim - 38) / 2) * (22.5-(27.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15 + (((tickAnim - 0) / 3) * (-10-(-15)));
            yy = -12.5 + (((tickAnim - 0) / 3) * (1.25-(-12.5)));
            zz = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 0) / 3) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 3) / 2) * (-10-(-10)));
            yy = 1.25 + (((tickAnim - 3) / 2) * (15-(1.25)));
            zz = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 3) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 5) / 3) * (0-(-10)));
            yy = 15 + (((tickAnim - 5) / 3) * (20-(15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 5) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (7.5-(0)));
            yy = 20 + (((tickAnim - 8) / 5) * (25-(20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 8) / 5) * (-27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 13) / 2) * (7.5-(7.5)));
            yy = 25 + (((tickAnim - 13) / 2) * (15-(25)));
            zz = -27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 13) / 2) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 15) / 3) * (0-(7.5)));
            yy = 15 + (((tickAnim - 15) / 3) * (-5-(15)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 15) / 3) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-15-(0)));
            yy = -5 + (((tickAnim - 18) / 2) * (-12.5-(-5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 18) / 2) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -15 + (((tickAnim - 20) / 3) * (-10-(-15)));
            yy = -12.5 + (((tickAnim - 20) / 3) * (1.25-(-12.5)));
            zz = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 20) / 3) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -10 + (((tickAnim - 23) / 2) * (-10-(-10)));
            yy = 1.25 + (((tickAnim - 23) / 2) * (15-(1.25)));
            zz = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 23) / 2) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -10 + (((tickAnim - 25) / 3) * (0-(-10)));
            yy = 15 + (((tickAnim - 25) / 3) * (20-(15)));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 25) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (7.5-(0)));
            yy = 20 + (((tickAnim - 28) / 5) * (25-(20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 28) / 5) * (-27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 7.5 + (((tickAnim - 33) / 2) * (7.5-(7.5)));
            yy = 25 + (((tickAnim - 33) / 2) * (15-(25)));
            zz = -27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 33) / 2) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 7.5 + (((tickAnim - 35) / 3) * (0-(7.5)));
            yy = 15 + (((tickAnim - 35) / 3) * (-5-(15)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 35) / 3) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (-15-(0)));
            yy = -5 + (((tickAnim - 38) / 2) * (-12.5-(-5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 38) / 2) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 3) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 2) * (-0.2-(0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 5) / 3) * (0-(-0.2)));
            zz = 0.5 + (((tickAnim - 5) / 3) * (0.5-(0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0.5 + (((tickAnim - 8) / 5) * (0.5-(0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0.5 + (((tickAnim - 13) / 2) * (0.5-(0.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 15) / 3) * (-0.5-(0.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 18) / 2) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 18) / 2) * (0-(-0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 20) / 3) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 23) / 2) * (-0.2-(0.25)));
            zz = 0 + (((tickAnim - 23) / 2) * (0.5-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 25) / 3) * (0-(-0.2)));
            zz = 0.5 + (((tickAnim - 25) / 3) * (0.5-(0.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0.5 + (((tickAnim - 28) / 5) * (0.5-(0.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0.5 + (((tickAnim - 33) / 2) * (0.5-(0.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 35) / 3) * (-0.5-(0.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 38) / 2) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 38) / 2) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingright1.rotationPointX = this.wingright1.rotationPointX + (float)(xx);
        this.wingright1.rotationPointY = this.wingright1.rotationPointY - (float)(yy);
        this.wingright1.rotationPointZ = this.wingright1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1.25-(1)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 25 + (((tickAnim - 0) / 3) * (11.25-(25)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.25 + (((tickAnim - 3) / 2) * (1.5-(1.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 11.25 + (((tickAnim - 3) / 2) * (2.5-(11.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1.5 + (((tickAnim - 5) / 3) * (2.5-(1.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 2.5 + (((tickAnim - 5) / 3) * (2.5-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 2.5 + (((tickAnim - 8) / 5) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 2.5 + (((tickAnim - 8) / 5) * (40-(2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.5 + (((tickAnim - 13) / 2) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 40 + (((tickAnim - 13) / 2) * (10-(40)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 15) / 3) * (1.25-(2.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 10 + (((tickAnim - 15) / 3) * (10-(10)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1.25 + (((tickAnim - 18) / 2) * (-1.49857-(1.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0.06542-(0)));
            zz = 10 + (((tickAnim - 18) / 2) * (27.49914-(10)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -1.49857 + (((tickAnim - 20) / 3) * (0.25-(-1.49857)));
            yy = 0.06542 + (((tickAnim - 20) / 3) * (0-(0.06542)));
            zz = 27.49914 + (((tickAnim - 20) / 3) * (11.25-(27.49914)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0.25 + (((tickAnim - 23) / 2) * (0.9962-(0.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (-0.08715-(0)));
            zz = 11.25 + (((tickAnim - 23) / 2) * (7.49924-(11.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0.9962 + (((tickAnim - 25) / 3) * (2.5-(0.9962)));
            yy = -0.08715 + (((tickAnim - 25) / 3) * (0-(-0.08715)));
            zz = 7.49924 + (((tickAnim - 25) / 3) * (2.5-(7.49924)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 2.5 + (((tickAnim - 28) / 5) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 2.5 + (((tickAnim - 28) / 5) * (40-(2.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.5 + (((tickAnim - 33) / 2) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 40 + (((tickAnim - 33) / 2) * (10-(40)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 2.5 + (((tickAnim - 35) / 3) * (0.75-(2.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 10 + (((tickAnim - 35) / 3) * (10-(10)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.75 + (((tickAnim - 38) / 2) * (1-(0.75)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 38) / 2) * (25-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 0) / 3) * (5-(10)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 3) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 5) / 3) * (5-(10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 8) / 5) * (5-(5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 5 + (((tickAnim - 13) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 15) / 3) * (5-(10)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 18) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 10 + (((tickAnim - 20) / 3) * (5-(10)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 5 + (((tickAnim - 23) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 25) / 3) * (5-(10)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 28) / 5) * (5-(5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 33) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 10 + (((tickAnim - 35) / 3) * (5-(10)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 38) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(xx), wingright4.rotateAngleY + (float) Math.toRadians(yy), wingright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.5 + (((tickAnim - 0) / 3) * (17.5-(22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -22.5 + (((tickAnim - 0) / 3) * (-15-(-22.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 17.5 + (((tickAnim - 3) / 2) * (15-(17.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -15 + (((tickAnim - 3) / 2) * (-10-(-15)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 5) / 3) * (-2.5-(15)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 5) / 3) * (2.5-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -2.5 + (((tickAnim - 8) / 5) * (-12.5-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 2.5 + (((tickAnim - 8) / 5) * (2.5-(2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -12.5 + (((tickAnim - 13) / 2) * (-10-(-12.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 2.5 + (((tickAnim - 13) / 2) * (-27.5-(2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 15) / 3) * (-10-(-10)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = -27.5 + (((tickAnim - 15) / 3) * (-27.5-(-27.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 18) / 2) * (22.5-(-10)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -27.5 + (((tickAnim - 18) / 2) * (-22.5-(-27.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 22.5 + (((tickAnim - 20) / 3) * (17.5-(22.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = -22.5 + (((tickAnim - 20) / 3) * (-15-(-22.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 17.5 + (((tickAnim - 23) / 2) * (15-(17.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = -15 + (((tickAnim - 23) / 2) * (-10-(-15)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 25) / 3) * (-2.5-(15)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 25) / 3) * (2.5-(-10)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -2.5 + (((tickAnim - 28) / 5) * (-12.5-(-2.5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 2.5 + (((tickAnim - 28) / 5) * (2.5-(2.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -12.5 + (((tickAnim - 33) / 2) * (-10-(-12.5)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 2.5 + (((tickAnim - 33) / 2) * (-27.5-(2.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -10 + (((tickAnim - 35) / 3) * (-10-(-10)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = -27.5 + (((tickAnim - 35) / 3) * (-27.5-(-27.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 38) / 2) * (22.5-(-10)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = -27.5 + (((tickAnim - 38) / 2) * (-22.5-(-27.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));



    }

    public void animPreen(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRhamphorhynchus entity = (EntityPrehistoricFloraRhamphorhynchus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5 + (((tickAnim - 10) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 40) / 5) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 20) / 5) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-22.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5 + (((tickAnim - 25) / 15) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-20 + (((tickAnim - 25) / 15) * (-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-22.5 + (((tickAnim - 25) / 15) * (-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-22.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5 + (((tickAnim - 40) / 5) * (0-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5)));
            yy = -20 + (((tickAnim - 40) / 5) * (0-(-20)));
            zz = -30 + (((tickAnim - 40) / 5) * (0-(-30)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*20)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*20 + (((tickAnim - 20) / 5) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*20)));
            yy = 0 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-25-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-60))*5 + (((tickAnim - 25) / 15) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*5-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-25 + (((tickAnim - 25) / 15) * (-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 25) / 15) * (-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*5 + (((tickAnim - 40) / 5) * (0-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*5)));
            yy = -15 + (((tickAnim - 40) / 5) * (0-(-15)));
            zz = -15 + (((tickAnim - 40) / 5) * (0-(-15)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15 + (((tickAnim - 20) / 5) * (27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15)));
            yy = 0 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5 + (((tickAnim - 25) / 15) * (27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+120))*5-(27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15 + (((tickAnim - 25) / 15) * (-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 25) / 15) * (-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+120))*5 + (((tickAnim - 40) / 5) * (0-(27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+120))*5)));
            yy = -15 + (((tickAnim - 40) / 5) * (0-(-15)));
            zz = -10 + (((tickAnim - 40) / 5) * (0-(-10)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10 + (((tickAnim - 25) / 15) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10 + (((tickAnim - 40) / 5) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 10) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 40) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 10) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 40) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*5-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*-5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+120))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*5 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*-5 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+120))*10 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+120))*10)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10 + (((tickAnim - 13) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*10 + (((tickAnim - 13) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10 + (((tickAnim - 13) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-10 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*10 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-5 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*0.25-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*0.25 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*0.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+60))*5 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+60))*5)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*0.5 + (((tickAnim - 13) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1.9468-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*0.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-20 + (((tickAnim - 13) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-20.9481-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-20)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1.9468 + (((tickAnim - 25) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*1.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1.9468)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-20.9481 + (((tickAnim - 25) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-20.9481)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*1.5 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*1.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-30 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-30)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (2.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -5 + (((tickAnim - 40) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 2.5 + (((tickAnim - 40) / 5) * (0-(2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft3, wingleft3.rotateAngleX + (float) Math.toRadians(xx), wingleft3.rotateAngleY + (float) Math.toRadians(yy), wingleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 10) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 40) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRhamphorhynchus entity = (EntityPrehistoricFloraRhamphorhynchus) entitylivingbaseIn;

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
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-30 + (((tickAnim - 5) / 15) * (-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-30)));
            yy = 10 + (((tickAnim - 5) / 15) * (10-(10)));
            zz = 5 + (((tickAnim - 5) / 15) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -30 + (((tickAnim - 20) / 5) * (-40-(-30)));
            yy = 10 + (((tickAnim - 20) / 5) * (-10-(10)));
            zz = 5 + (((tickAnim - 20) / 5) * (-5-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -40 + (((tickAnim - 25) / 10) * (-40-(-40)));
            yy = -10 + (((tickAnim - 25) / 10) * (-10-(-10)));
            zz = -5 + (((tickAnim - 25) / 10) * (-5-(-5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -40 + (((tickAnim - 35) / 5) * (0-(-40)));
            yy = -10 + (((tickAnim - 35) / 5) * (0-(-10)));
            zz = -5 + (((tickAnim - 35) / 5) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-20 + (((tickAnim - 5) / 15) * (-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-20)));
            yy = 10 + (((tickAnim - 5) / 15) * (10-(10)));
            zz = 5 + (((tickAnim - 5) / 15) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -20 + (((tickAnim - 20) / 5) * (10-(-20)));
            yy = 10 + (((tickAnim - 20) / 5) * (-10-(10)));
            zz = 5 + (((tickAnim - 20) / 5) * (-5-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 25) / 10) * (10-(10)));
            yy = -10 + (((tickAnim - 25) / 10) * (-10-(-10)));
            zz = -5 + (((tickAnim - 25) / 10) * (-5-(-5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 35) / 5) * (0-(10)));
            yy = -10 + (((tickAnim - 35) / 5) * (0-(-10)));
            zz = -5 + (((tickAnim - 35) / 5) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*30 + (((tickAnim - 5) / 15) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*30)));
            yy = 15 + (((tickAnim - 5) / 15) * (15-(15)));
            zz = 5 + (((tickAnim - 5) / 15) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3 + (((tickAnim - 20) / 5) * (40-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3)));
            yy = 15 + (((tickAnim - 20) / 5) * (-15-(15)));
            zz = 5 + (((tickAnim - 20) / 5) * (-10-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 40 + (((tickAnim - 25) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3-(40)));
            yy = -15 + (((tickAnim - 25) / 10) * (-15-(-15)));
            zz = -10 + (((tickAnim - 25) / 10) * (-10-(-10)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3 + (((tickAnim - 35) / 5) * (0-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3)));
            yy = -15 + (((tickAnim - 35) / 5) * (0-(-15)));
            zz = -10 + (((tickAnim - 35) / 5) * (0-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3 + (((tickAnim - 5) / 5) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3 + (((tickAnim - 25) / 5) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3)));
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
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
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
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
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
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingFlyingWalkingBase e = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body1, ((0.0037F)-(-0.0456F)), ((0.0F)-(0.0F)),((-0.0309F)-(0.0F)));
        animator.rotate(chest, ((0.1143F)-(-0.0456F)), ((0.0F)-(0.0F)),((0.0421F)-(0.0F)));
        animator.rotate(cube_r1, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((2.618F)-(2.618F)));
        animator.rotate(cube_r11, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-2.618F)-(-2.618F)));
        animator.rotate(cube_r12, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((2.618F)-(2.618F)));
        animator.rotate(cube_r13, ((-0.48F)-(-0.48F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r14, ((-0.5672F)-(-0.5672F)), ((0.0F)-(0.0F)),((-2.4435F)-(-2.4435F)));
        animator.rotate(cube_r15, ((-0.5672F)-(-0.5672F)), ((0.0F)-(0.0F)),((2.4435F)-(2.4435F)));
        animator.rotate(cube_r16, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((-2.618F)-(-2.618F)));
        animator.rotate(cube_r17, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((2.618F)-(2.618F)));
        animator.rotate(cube_r2, ((-0.3491F)-(-0.3491F)), ((0.0F)-(0.0F)),((-0.48F)-(-0.48F)));
        animator.rotate(cube_r3, ((-0.3491F)-(-0.3491F)), ((0.0F)-(0.0F)),((0.48F)-(0.48F)));
        animator.rotate(cube_r4, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((-0.829F)-(-0.829F)));
        animator.rotate(cube_r5, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.829F)-(0.829F)));
        animator.rotate(cube_r6, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((-0.48F)-(-0.48F)));
        animator.rotate(cube_r7, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.48F)-(0.48F)));
        animator.rotate(cube_r8, ((-0.3272F)-(-0.3272F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-2.618F)-(-2.618F)));
        animator.rotate(footleft, ((1.3355F)-(-0.4098F)), ((0.4554F)-(-0.5918F)),((0.0094F)-(0.2276F)));
        animator.rotate(footright, ((1.3355F)-(-0.4098F)), ((-0.4554F)-(0.5918F)),((-0.0094F)-(-0.2276F)));
        animator.rotate(handleft, ((0.0F)-(0.0F)), ((0.0265F)-(0.6374F)),((1.5727F)-(0.0456F)));
        animator.rotate(handright, ((0.0F)-(0.0F)), ((-0.0265F)-(-0.6374F)),((-1.5727F)-(-0.0456F)));
        animator.rotate(head, ((0.3018F)-(0.48F)), ((0.0F)-(0.0F)),((0.0309F)-(0.0F)));
        animator.rotate(head2, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head3, ((0.2379F)-(0.2379F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw, ((0.0171F)-(0.00F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw2, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw3, ((0.3927F)-(0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(legwing2, ((-0.0911F)-(-0.0911F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(legwing4, ((-0.0911F)-(-0.0911F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(lowerlegleft, ((0.501F)-(0.7741F)), ((0.0F)-(0.0F)),((0.0227F)-(0.5463F)));
        animator.rotate(lowerlegright, ((0.501F)-(0.7741F)), ((0.0F)-(0.0F)),((-0.0227F)-(-0.5463F)));
        animator.rotate(neck1, ((0.0034F)-(-0.1309F)), ((0.0F)-(0.0F)),((-0.0113F)-(0.0F)));
        animator.rotate(neck2, ((-0.1599F)-(-0.2618F)), ((0.0F)-(0.0F)),((-0.0421F)-(0.0F)));
        animator.rotate(tail1, ((-0.2963F)-(-0.0456F)), ((0.0212F)-(0.0F)),((-0.0421F)-(0.0F)));
        animator.rotate(tail2, ((-0.0414F)-(0.0456F)), ((-0.0212F)-(0.0F)),((0.0113F)-(0.0F)));
        animator.rotate(tail3, ((-0.035F)-(0.0456F)), ((-0.0424F)-(0.0F)),((0.0309F)-(0.0F)));
        animator.rotate(tail4, ((-0.0187F)-(0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail5, ((-0.035F)-(0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(upperlegleft, ((0.3753F)-(-0.3643F)), ((-0.2484F)-(0.0F)),((-1.3667F)-(-0.5009F)));
        animator.rotate(upperlegright, ((0.3753F)-(-0.3643F)), ((0.2484F)-(0.0F)),((1.3667F)-(0.5009F)));
        animator.rotate(wingleft1, ((-0.0762F)-(0.0F)), ((0.0542F)-(0.182F)),((-0.5594F)-(-0.0911F)));
        animator.rotate(wingleft2, ((0.03F)-(0.0F)), ((-0.0046F)-(0.0F)),((-1.4427F)-(-0.0456F)));
        animator.rotate(wingleft3, ((-1.5708F)-(0.0F)), ((0.001F)-(0.0F)),((0.5418F)-(0.0911F)));
        animator.rotate(wingleft4, ((0.203F)-(1.1629F)), ((-0.1731F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(wingright1, ((-0.0762F)-(0.0F)), ((-0.0542F)-(-0.182F)),((0.5594F)-(0.0911F)));
        animator.rotate(wingright2, ((-0.051F)-(0.0F)), ((0.0724F)-(0.0F)),((1.442F)-(0.0456F)));
        animator.rotate(wingright3, ((-1.5708F)-(0.0F)), ((-0.001F)-(0.0F)),((-0.5418F)-(-0.0911F)));
        animator.rotate(wingright4, ((0.203F)-(1.1629F)), ((0.1731F)-(0.0F)),((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body1, -((0.0037F)-(-0.0456F)), -((0.0F)-(0.0F)),-((-0.0309F)-(0.0F)));
        animator.rotate(chest, -((0.1143F)-(-0.0456F)), -((0.0F)-(0.0F)),-((0.0421F)-(0.0F)));
        animator.rotate(cube_r1, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((2.618F)-(2.618F)));
        animator.rotate(cube_r11, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-2.618F)-(-2.618F)));
        animator.rotate(cube_r12, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((2.618F)-(2.618F)));
        animator.rotate(cube_r13, -((-0.48F)-(-0.48F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r14, -((-0.5672F)-(-0.5672F)), -((0.0F)-(0.0F)),-((-2.4435F)-(-2.4435F)));
        animator.rotate(cube_r15, -((-0.5672F)-(-0.5672F)), -((0.0F)-(0.0F)),-((2.4435F)-(2.4435F)));
        animator.rotate(cube_r16, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((-2.618F)-(-2.618F)));
        animator.rotate(cube_r17, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((2.618F)-(2.618F)));
        animator.rotate(cube_r2, -((-0.3491F)-(-0.3491F)), -((0.0F)-(0.0F)),-((-0.48F)-(-0.48F)));
        animator.rotate(cube_r3, -((-0.3491F)-(-0.3491F)), -((0.0F)-(0.0F)),-((0.48F)-(0.48F)));
        animator.rotate(cube_r4, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((-0.829F)-(-0.829F)));
        animator.rotate(cube_r5, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.829F)-(0.829F)));
        animator.rotate(cube_r6, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((-0.48F)-(-0.48F)));
        animator.rotate(cube_r7, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.48F)-(0.48F)));
        animator.rotate(cube_r8, -((-0.3272F)-(-0.3272F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-2.618F)-(-2.618F)));
        animator.rotate(footleft, -((1.3355F)-(-0.4098F)), -((0.4554F)-(-0.5918F)),-((0.0094F)-(0.2276F)));
        animator.rotate(footright, -((1.3355F)-(-0.4098F)), -((-0.4554F)-(0.5918F)),-((-0.0094F)-(-0.2276F)));
        animator.rotate(handleft, -((0.0F)-(0.0F)), -((0.0265F)-(0.6374F)),-((1.5727F)-(0.0456F)));
        animator.rotate(handright, -((0.0F)-(0.0F)), -((-0.0265F)-(-0.6374F)),-((-1.5727F)-(-0.0456F)));
        animator.rotate(head, -((0.3018F)-(0.48F)), -((0.0F)-(0.0F)),-((0.0309F)-(0.0F)));
        animator.rotate(head2, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head3, -((0.2379F)-(0.2379F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw, -((0.0171F)-(0.00F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw2, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw3, -((0.3927F)-(0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(legwing2, -((-0.0911F)-(-0.0911F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(legwing4, -((-0.0911F)-(-0.0911F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(lowerlegleft, -((0.501F)-(0.7741F)), -((0.0F)-(0.0F)),-((0.0227F)-(0.5463F)));
        animator.rotate(lowerlegright, -((0.501F)-(0.7741F)), -((0.0F)-(0.0F)),-((-0.0227F)-(-0.5463F)));
        animator.rotate(neck1, -((0.0034F)-(-0.1309F)), -((0.0F)-(0.0F)),-((-0.0113F)-(0.0F)));
        animator.rotate(neck2, -((-0.1599F)-(-0.2618F)), -((0.0F)-(0.0F)),-((-0.0421F)-(0.0F)));
        animator.rotate(tail1, -((-0.2963F)-(-0.0456F)), -((0.0212F)-(0.0F)),-((-0.0421F)-(0.0F)));
        animator.rotate(tail2, -((-0.0414F)-(0.0456F)), -((-0.0212F)-(0.0F)),-((0.0113F)-(0.0F)));
        animator.rotate(tail3, -((-0.035F)-(0.0456F)), -((-0.0424F)-(0.0F)),-((0.0309F)-(0.0F)));
        animator.rotate(tail4, -((-0.0187F)-(0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail5, -((-0.035F)-(0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(upperlegleft, -((0.3753F)-(-0.3643F)), -((-0.2484F)-(0.0F)),-((-1.3667F)-(-0.5009F)));
        animator.rotate(upperlegright, -((0.3753F)-(-0.3643F)), -((0.2484F)-(0.0F)),-((1.3667F)-(0.5009F)));
        animator.rotate(wingleft1, -((-0.0762F)-(0.0F)), -((0.0542F)-(0.182F)),-((-0.5594F)-(-0.0911F)));
        animator.rotate(wingleft2, -((0.03F)-(0.0F)), -((-0.0046F)-(0.0F)),-((-1.4427F)-(-0.0456F)));
        animator.rotate(wingleft3, -((-1.5708F)-(0.0F)), -((0.001F)-(0.0F)),-((0.5418F)-(0.0911F)));
        animator.rotate(wingleft4, -((0.203F)-(1.1629F)), -((-0.1731F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(wingright1, -((-0.0762F)-(0.0F)), -((-0.0542F)-(-0.182F)),-((0.5594F)-(0.0911F)));
        animator.rotate(wingright2, -((-0.051F)-(0.0F)), -((0.0724F)-(0.0F)),-((1.442F)-(0.0456F)));
        animator.rotate(wingright3, -((-1.5708F)-(0.0F)), -((-0.001F)-(0.0F)),-((-0.5418F)-(-0.0911F)));
        animator.rotate(wingright4, -((0.203F)-(1.1629F)), -((0.1731F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
